<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  
  <style>
    .bg-image {
      background-image: url(1.png);
      width: 100%;
      height: 1800px;
      background-repeat: no-repeat;
      background-position: center;
      background-size: cover;
    }

    .username {
      position: absolute;
      top: 760px;
      left: 460px;
      font-size: 45px !important;
      text-transform: uppercase !important;
    }

    @media (max-width: 768px) {
      /* Adjust the positioning and font size for smaller screens */
      .username {
        position: absolute;
        top: 280px;
        left: 120px;
        font-size: 25px !important;
        
      }
    }

    @media (max-width: 480px) {
      /* Further adjustments for even smaller screens PRINT PREIVIEW PERFECT*/ 
      .username {
        position: absolute;
        top: 270px;
        left: 110px;
        font-size: 25px !important;
       
      }
    }

    @media (max-width: 768px) {
      .bg-image {
        height: 670px; /* Adjust the height as needed */
      }
    }
    
    .pbutton{
margin-left: 400px;
    width:250px;
    height:50px;
    margin:50px;
    }
    
   
    
    
  </style>

  <script>
	function printCertificate() {
		window.print();

	}
</script>
 
</head>
<body>
 
  <div class="bg-image" >
    <h1 class="username">
			${formdet?.firstName}
		</h1>
  </div>
  <div class="pbutton">
 <a href="./certificate.html"><button onclick="printCertificate()" type="button" class="btn btn-danger btn-lg px-4 gap-3" style="border:2px solid black;font-weight: bold;">Print Certificate</button></a>    
  
</div>

</body>
</html>

