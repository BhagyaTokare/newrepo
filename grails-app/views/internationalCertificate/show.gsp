
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main">
    <title>Pragati</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/2.5.1/jspdf.umd.min.js"></script> <!-- Include jsPDF library -->
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
        .pbutton {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 10vh;
            margin-top: 200px;
        }
        @media (max-width: 768px) {
            .usernamed {
                position: absolute;
                top: 320px;
                left: 50%;
                transform: translateX(-50%);
                font-size: 20px !important;
                text-transform: uppercase !important;
            }
            .bg-image {
                height: 670px; /* Adjust the height as needed */
            }
        }
        @media (max-width: 480px) {
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
        .center-div {
            display: flex;
            justify-content: center;
            align-items: center;
        }
    </style>
</head>
<body>
<div style="display:none;">
    <img src="./images/pragati.png" class="img-fluid" alt="Responsive Image" style="width:100%;height:800px;">
    <p class="usernamed">
        Rtn. ${internationalCertificateInstance?.firstName},
        ${internationalCertificateInstance?.club}
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
                <path d="M10.97 4.97a.235.235 0 0 0-.02.022L7.477 9.417 5.384 7.323a.75.75 0 0 0-1.06 1.06L6.97 11.03a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 0 0-1.071-1.05z" />
            </svg>
        </div>
        <div class="text-center">
            <h1>Thank You !</h1>
            <p>Keep participating in such noble causes! and Join Our feedback fiesta! Your insights can make our services even better! &nbsp;<a href="https://goo.gl/maps/rjSA4gh4fUB4zxXWA" target="blank"> Review Us</a></p>
            <p>If you didn't receive the certificate, WhatsApp us at <h4> 9141555444 </h4></p>
            <p>Feedback-o-meter: ⭐⭐⭐⭐⭐</p>
            <p><span style="color:red;">Note:</span> If you face any difficulty while downloading your certificate (especially iPhone users), please try downloading your certificates from desktops/laptops.</p>
        </div>
    </div>
</div>

<div class="container">
    <footer class="py-3 my-4 nav justify-content-center border-top">
        <h6 class="developed">Developed-By: <a href="https://hiideals.com/" target="blank">Hi-Ideals</a></h6>
    </footer>
</div>

<g:if test="${internationalCertificateInstance.pdfLink}">
    <p>
        PDF Certificate: <a href="${createLink(controller: 'internationalCertificate', action: 'downloadPdf', id: internationalCertificateInstance.id)}">${internationalCertificateInstance.pdfLink}</a>
    </p>
</g:if>
<script>
window.onload = function() {
    function downloadCertificate() {
        const { jsPDF } = window.jspdf;
        const doc = new jsPDF({
            orientation: 'landscape',
            unit: 'mm',
            format: 'a4'
        });

        // Load the image asynchronously and then add it to the PDF
        const img = new Image();
        img.src = "images/pragati.png";
        img.onload = function() {
            doc.addImage(img, 'PNG', 0, 0, 297, 210);

            // Add and center the First Name
            const firstName = "Rtn. ${internationalCertificateInstance?.firstName.toUpperCase()}";
            doc.setFontSize(25);
            doc.setFont("Roboto", "bold");

            const firstNameWidth = doc.getTextWidth(firstName);
            const firstNameX = (297 - firstNameWidth) / 2; // Center horizontally on A4 landscape (297mm wide)
            doc.text(firstName, firstNameX, 100);

            // Add and center the Club Name
            const club = "${internationalCertificateInstance?.club}";
            doc.setFontSize(22);
            doc.setTextColor(183, 137, 66); // Yellow gold

            const clubWidth = doc.getTextWidth(club);
            const clubX = (297 - clubWidth) / 2; // Center horizontally on A4 landscape (297mm wide)
            doc.text(club, clubX, 109);

            // Add the Registration Number (no need to center as it's a fixed position)
            doc.setFontSize(15);
            doc.text("${internationalCertificateInstance?.regNo}", 241, 53.5);

            doc.save('${internationalCertificateInstance?.firstName}.pdf');
        };
    }

    downloadCertificate();
};


</script>

</body>
</html>
