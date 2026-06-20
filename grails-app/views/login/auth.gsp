<!DOCTYPE html>

<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
<meta charset="utf-8" />
<title>Pragati</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta content="The Membership Development & Public Image Seminar" name="description" />
<meta content="" name="author" />
<!-- BEGIN GLOBAL MANDATORY STYLES -->

<%--<link
	href="../assets1/global/plugins/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets1/global/plugins/simple-line-icons/simple-line-icons.min.css"
	rel="stylesheet" type="text/css" />
<link href="../assets1/global/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets1/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css"
	rel="stylesheet" type="text/css" />
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<link href="../assets1/global/plugins/select2/css/select2.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets1/global/plugins/select2/css/select2-bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL STYLES -->
<link href="../assets1/global/css/components-rounded.min.css"
	rel="stylesheet" id="style_components" type="text/css" />
<link href="../assets1/global/css/plugins.min.css" rel="stylesheet"
	type="text/css" />
<!-- END THEME GLOBAL STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link href="../assets1/pages/css/login.min.css" rel="stylesheet"
	type="text/css" />
<!-- END PAGE LEVEL STYLES -->
<!-- BEGIN THEME LAYOUT STYLES -->
<!-- END THEME LAYOUT STYLES -->

--%><!-- END HEAD -->
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>

<style>
 

    .btn-center {
      position: absolute;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
    }
    .heading{
     position: absolute;
      top: 30%;
      left: 50%;
      font-weight:bold;
      text-align:center;
      transform: translate(-50%, -50%);
    }
    
     .developed{
     position: absolute;
      top: 95%;
      left: 50%;
      color:white;
   
      text-align:center;
      justify-content:center;
      transform: translate(-50%, -50%);
     }
   
      @keyframes fadeInOut {
      0% { opacity: 0; }
      50% { opacity: 1; }
      100% { opacity: 0; }
    }

    .animated-text {
      animation: fadeInOut 6s linear infinite;
    }
</style>
</head>
<body class=" login">

	 <div>
	
	 	<!--  <h1 class="heading animated-text"><span class="typewriter2">Run4Road Safety Bidar</span><br/> Earn a Run4Road Safety Certificate Today!</h1>  
	    <img src="../images/Bghome.png" class="img-fluid" alt="Responsive Image" style="width:100%;height:800px;">   
	   		-->
	   		 
	   		<g:link controller="downloadCertificate" action="create"> 
	   		<button class="btn btn-primary btn-center" style="background-color: #00008B;font-size: 25px;font-weight:bold;border:2px solid black;">Download Certificate</button></g:link>
	   		    
	   		
	</div>

	
<!-- BEGIN LOGO -->

	<!-- END LOGO -->
	<!-- BEGIN LOGIN -->
	<%--<div class="content">
	

		
		<g:if test="${flash.message}">
			<div class="alert alert-warning" id="mydiv">
				<div class="text-center uppercase" style="color: #000;"
					role="status">
					<b> ${flash.message}
					</b>
				</div>
			</div>
		</g:if>
		<!-- BEGIN LOGIN FORM -->
		<form class="login-form" action='${postUrl}' method='POST'
			autocomplete='off' id="text">
			<h3 class="form-title font-green">Login</h3>
			<div class="form-group">
				<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
				<label class="control-label visible-ie8 visible-ie9">Username</label>
				<input class="form-control form-control-solid placeholder-no-fix"
					type="text" autocomplete="off" placeholder="Username"
					name='j_username' id='username' />
					
			</div>
			<div class="form-group">
				<label class="control-label visible-ie8 visible-ie9">Password</label>
				<input class="form-control form-control-solid placeholder-no-fix"
					type="password" autocomplete="off" placeholder="Password"
					name='j_password' id='password' />
			</div>
			<div class="form-actions">
				<button type="submit" id="submit" class="btn green uppercase"
					style="background-color: #1740c2 !important; border-color: #86cd92 !important;"
					value='${message(code: "springSecurity.login.button")}'>
					Login</button>
			</div>

			<div class="create-account"
				style="background-color: #0c0c0c !important;">
				<p>
					<a href="javascript:;" id="register-btn" class="uppercase"
						style="font-size: 16px; color: #ffd600;">Register Here</a>
				</p>
			</div>



		</form>
		
		
		
		<!-- END LOGIN FORM -->
		<!-- BEGIN FORGOT PASSWORD FORM -->


		<form class="forget-form" action="index.html" method="post">
			<h3 class="font-green">Forget Password ?</h3>
			<p>Enter your e-mail address below to reset your password.</p>
			<div class="form-group">
				<input class="form-control placeholder-no-fix" type="text"
					autocomplete="off" placeholder="Email" name="email" />
			</div>
			<div class="form-actions">
				<button type="button" id="back-btn" class="btn green btn-outline">Back</button>
				<button type="submit" class="btn btn-success uppercase pull-right">Submit</button>
			</div>
		</form>
		
		
		<!-- END FORGOT PASSWORD FORM -->
		<!-- BEGIN REGISTRATION FORM -->
		<g:form class="register-form" controller="commanUsers"
			enctype="multipart/form-data" name="validateip">
			<h3 class="font-green">Registration</h3>

			<div class="form-group">
				<label class="control-label visible-ie8 visible-ie9">User
					Name</label>

				<g:if test="${params?.action !="adminEdit"}">
					<g:textField name="username" class="form-control"
						placeholder="Username" value="${usersInstance?.username}"
						required="true" />
				</g:if>
				<g:else>
					<input name="username" class="form-control" placeholder="User Name"
						type="text" value="${usersInstance?.username}" />
				</g:else>

			</div>
			<div class="form-group">
				<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
				<label class="control-label visible-ie8 visible-ie9">Password</label>
				<g:if test="${params?.action !="adminEdit"}">
					<input name="password" class="form-control" type="password"
						value="${usersInstance?.password}" required="true"
						placeholder="Password" />
				</g:if>
				<g:else>
					<input name="password" class="form-control" type="password"
						value="${usersInstance?.password}" placeholder="Password" />
				</g:else>

			</div>
			<div class="form-group">
				<label class="control-label visible-ie8 visible-ie9">Phone
					No</label> <input name="phoneNo" class="form-control"
					value="${usersInstance?.phoneNo}" required="true" type="text"
					placeholder="Mobile No" pattern="[6789][0-9]{9}" />
			</div>
			<div class="form-group">
				<label class="control-label visible-ie8 visible-ie9">Email
					id </label> <input name=email class="form-control "
					value="${usersInstance?.address?.email}" type="text"
					placeholder="Email Id"
					pattern="[a-zA-Z0-9.-_]{1,}@[a-zA-Z.-]{2,}[.]{1}[a-zA-Z]{2,}"
					required />
			</div>


			<div class="form-group">
				<label class="control-label visible-ie8 visible-ie9">City</label> <input
					name="city" value="${usersInstance?.address?.city}"
					class="form-control " placeholder="City" type="text" />
			</div>

			<div class="form-group">
				<label class="control-label visible-ie8 visible-ie9">State </label>
				<input name="state" value="${usersInstance?.address?.state}"
					class="form-control " placeholder="State " type="text" />
			</div>
			<g:if test="${params?.action !="adminEdit"}">
				<div class="form-group">
					<label class="control-label visible-ie8 visible-ie9">Country
					</label> <input name="country" class="form-control " placeholder="Country "
						value="India" readonly="" type="text" />
				</div>
				<div class="form-group" style="display: none;">
					<label class="control-label visible-ie8 visible-ie9">Upload
						Image</label> <input type="file" class="form-control "
						placeholder="Student Contact Number" name="file_1" value=""
						placeholder="Upload Image name">
				</div>
				<label class="mt-checkbox mt-checkbox-outline"> <input
					type="checkbox" name="tnc" data-toggle="modal"
					data-target="#exampleModalLong" /> I agree to the Terms and
					Conditions mentioned by .<span></span>
				</label>
				<div id="register_tnc_error"></div>

				<div class="form-group margin-top-20 margin-bottom-20">
					<div class="g-recaptcha"
						data-sitekey="6Lel4Z4UAAAAAOa8LO1Q9mqKRUiMYl_00o5mXJrR"
						required="required"></div>

				</div>
				<div class="form-actions">
					<button type="button" id="register-back-btn"
						class="btn green btn-outline">Back to Login</button>

					<g:actionSubmit action="SaveCommanUsers"
						class="btn btn-success uppercase pull-right"
						style="background-color: #1740c2 !important; border-color: #86cd92 !important;"
						value="Submit"></g:actionSubmit>
					
				<button type="submit" id="register-submit-btn"
					class="btn btn-success uppercase pull-right">Submit</button>
			
				</div>
			</g:if>
			<g:else>
				<div class="col-md-3">
					<label>Upload Image</label> <input type="file"
						class="form-control " placeholder="Student Contact Number"
						name="file_1" value="">
				</div>
				<br>
				<g:hiddenField name="userListid" value="${usersInstance?.id}" />
				<g:actionSubmit action="updateCommanUsers" class="btn btn-primary"
					value="Update Details"></g:actionSubmit>
			</g:else>
		</g:form>





		<!-- END REGISTRATION FORM -->
	</div>
	
	
	

	<!-- Modal -->
	


	--%><!--[if lt IE 9]>
<script src="../assets1/global/plugins/respond.min.js"></script>
<script src="../assets1/global/plugins/excanvas.min.js"></script> 
<script src="../assets1/global/plugins/ie8.fix.min.js"></script> 
<![endif]-->
	<!-- BEGIN CORE PLUGINS -->
	<script src="../assets1/global/plugins/jquery.min.js"
		type="text/javascript"></script>
	<script src="../assets1/global/plugins/bootstrap/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script src="../assets1/global/plugins/js.cookie.min.js"
		type="text/javascript"></script>
	<script
		src="../assets1/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"
		type="text/javascript"></script>
	<script src="../assets1/global/plugins/jquery.blockui.min.js"
		type="text/javascript"></script>
	<script
		src="../assets1/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"
		type="text/javascript"></script>
	<!-- END CORE PLUGINS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script
		src="../assets1/global/plugins/jquery-validation/js/jquery.validate.min.js"
		type="text/javascript"></script>
	<script
		src="../assets1/global/plugins/jquery-validation/js/additional-methods.min.js"
		type="text/javascript"></script>
	<script src="../assets1/global/plugins/select2/js/select2.full.min.js"
		type="text/javascript"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN THEME GLOBAL SCRIPTS -->
	<script src="../assets1/global/scripts/app.min.js"
		type="text/javascript"></script>
	<!-- END THEME GLOBAL SCRIPTS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<script src="../assets1/pages/scripts/login.min.js"
		type="text/javascript"></script>
	<script src="https://www.google.com/recaptcha/api.js" async defer></script>
	<!-- END PAGE LEVEL SCRIPTS -->
	<!-- BEGIN THEME LAYOUT SCRIPTS -->
	<!-- END THEME LAYOUT SCRIPTS -->
	<script>
		$(document).ready(function() {
			$('#clickmewow').click(function() {
				$('#radio1003').attr('checked', 'checked');
			});
		})
	</script>
	<script>
		document.getElementById("text").addEventListener("keyup", function(e) {
			if (e.keyCode === 13) {
				document.getElementById("submit").click();
			}
		});
		document.getElementById("submit").onclick = function() {
			document.getElementById("submit").click();
		}
	</script>

</body>

</html>