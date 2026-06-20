<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main">
    <title>Pragati</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  
    <style>
        .bg-image {
            background-image: url(images/pragati.png);
            width: 100%;
            height: 1800px;
            background-repeat: no-repeat;
            background-position: center;
            background-size: cover;
        }

        .usernamed {
            position: absolute;
            top: 840px;
            font-size: 16px !important;
            text-transform: uppercase !important;
            left: 50%;
            transform: translateX(-50%);
        }
        .pbutton{
            display: flex;
            justify-content: center;
            align-items: center;
            height: 10vh;
            margin-top:200px; 
        }

        @media (max-width: 768px) {
            /* Adjust the positioning and font size for smaller screens */
            .usernamed {
                position: absolute;
                top: 320px;
                left: 50%;
                transform: translateX(-50%);
                font-size: 20px !important;
                text-transform: uppercase !important;
            }
        }

        @media (max-width: 480px) {
            /* Further adjustments for even smaller screens */
            .usernamed {
                position: absolute;
                top: 330px;
                left: 50%;
                transform: translateX(-50%);
                font-size: 15px !important;
                font-weight: bold !important;
                text-transform: uppercase !important;
            }

            .pbutton {
                display: flex;
                text-align: center;
                justify-content: center;
            }
        }

        @media (max-width: 768px) {
            .bg-image {
                height: 670px; /* Adjust the height as needed */
            }
        }
        
          .center-div {
            display: flex;
            justify-content: center;
            align-items:center;
           
          }
         
    </style>

    
<script>
function downloadCertificate(names) {
    var canvas = document.createElement("canvas");
    var mmToPx = 3.7795275591; // 1mm = 3.7795275591px
    var a4Width = 297 * mmToPx; // A4 width in landscape
    var a4Height = 210 * mmToPx; // A4 height in landscape
    canvas.width = a4Width;
    canvas.height = a4Height;

    var ctx = canvas.getContext("2d");

    var bgImage = new Image();
    bgImage.onload = function() {
        var imageAspectRatio = bgImage.width / bgImage.height;
        var canvasAspectRatio = a4Width / a4Height;
        var renderableWidth, renderableHeight, xStart, yStart;

        if (imageAspectRatio < canvasAspectRatio) {
            renderableHeight = a4Height;
            renderableWidth = bgImage.width * (renderableHeight / bgImage.height);
            xStart = (a4Width - renderableWidth) / 2;
            yStart = 0;
        } else if (imageAspectRatio > canvasAspectRatio) {
            renderableWidth = a4Width;
            renderableHeight = bgImage.height * (renderableWidth / bgImage.width);
            xStart = 0;
            yStart = (a4Height - renderableHeight) / 2;
        } else {
            renderableHeight = a4Height;
            renderableWidth = a4Width;
            xStart = 0;
            yStart = 0;
        }

        ctx.drawImage(bgImage, xStart, yStart, renderableWidth, renderableHeight);
        
        // Set font and style for the combined "Rtn." and First Name
        ctx.fillStyle = "#00008B"; // Hex code for dark blue
        ctx.font = "bold 30px 'Roboto'";

        var firstName = "${downloadCertificateInstance?.internationalCertificate?.firstName.toUpperCase()}";
        var combinedText = "Rtn. " + firstName;

        var combinedTextWidth = ctx.measureText(combinedText).width;
        var textX = (a4Width - combinedTextWidth) / 2;  // Centering the combined text

        ctx.fillText(combinedText, textX, 100 * mmToPx);  // Adjusted y-position for the combined text

        // Set font and style for Registration Number
        ctx.font = "bold 15px Arial";
        var regNo = "${downloadCertificateInstance?.internationalCertificate?.regNo}";
        ctx.fillText(regNo, 241 * mmToPx, 53.5 * mmToPx);  // Adjusted position for registration number

        // Set font and style for Club
        var club = "${downloadCertificateInstance?.internationalCertificate?.club}";
        ctx.fillStyle = "#b78942"; // Hex code for yellow gold
        ctx.font = "bold 22px 'Roboto'";
        textWidth = ctx.measureText(club).width;
        textX = (a4Width - textWidth) / 2;  // Centering the club name
        ctx.fillText(club, textX, 109 * mmToPx);  // Adjusted y-position for the club

        var link = document.createElement('a');
        link.href = canvas.toDataURL();
        link.download = 'certificate.png';
        link.click();
    };
    bgImage.src = "images/pragati.png";  // Ensure this path is correct
}

var names = [
    { text: "${downloadCertificateInstance?.internationalCertificate?.firstName.toUpperCase()}", position: { x: 105, y: 145 } },
    { text: "${downloadCertificateInstance?.internationalCertificate?.regNo}", position: { x: 235, y: 58 } },
    { text: "${downloadCertificateInstance?.internationalCertificate?.club}", position: { x: 105, y: 165 } }
];
downloadCertificate(names);

</script>

</head>
<body>

<div style="display:none;">
    <img src="./images/pragati.png" class="img-fluid" alt="Responsive Image" style="width:100%;height:800px;">   
    <p class="usernamed">
    Rtn.${downloadCertificateInstance?.internationalCertificate?.firstName},
        ${downloadCertificateInstance?.internationalCertificate?.club}
    </p> 
</div>

<div class="center-div">
    <img src="./images/logo.png" class="img-fluid" alt="Responsive Image" style="margin:40px;"/>
</div>
<div class="vh-75 d-flex justify-content-center align-items-center">
    <div class="card col-md-4 bg-white shadow-md p-5">
        <div class="mb-4 text-center">
            <svg xmlns="http://www.w3.org/2000/svg" class="text-success" width="75" height="75"
                fill="currentColor" class="bi bi-check-circle" viewBox="0 0 16 16">
                <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z" />
                <path
                    d="M10.97 4.97a.235.235 0 0 0-.02.022L7.477 9.417 5.384 7.323a.75.75 0 0 0-1.06 1.06L6.97 11.03a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 0 0-1.071-1.05z" />
            </svg>
        </div>
        <div class="text-center">
            <h1>Thank You !</h1>
            <p>Keep participating in such noble causes! and Join Our feedback fiesta! Your insights can make our services even better! &nbsp;<a href="https://goo.gl/maps/rjSA4gh4fUB4zxXWA" target="blank"> Review Us</a></p>
            <p>If you didn't receive certificate WhatsApp us <h4> 9141555444 </h4> </p>
            <p></p>
            <p>Feedback-o-meter: ⭐⭐⭐⭐⭐</p>
            <p><span style="color:red;">Note:</span> If you face any difficulty while downloading your certificate (especially iPhone users), then please try downloading your certificates from desktops/laptops.</p>
        </div>
    </div>
</div>

<div class="container">
    <footer class="py-3 my-4 nav justify-content-center border-top ">
        <h6 class="developed">Developed-By: <a href="https://hiideals.com/" target="blank">Hi-Ideals</a></h6>
    </footer>
</div>

</body>
</html>

 