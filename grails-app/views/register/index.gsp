<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>The Membership Development & Public Image Seminar</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="apple-touch-icon" href="../assetss/images/favicon.png">
<link rel="shortcut icon" href="../assetss/images/favicon.png">

<link rel="stylesheet" href="../assetss/css/normalize.css">
<link rel="stylesheet" href="../assetss/css/bootstrap.min.css">
<link rel="stylesheet" href="../assetss/css/font-awesome.min.css">
<link rel="stylesheet" href="../assetss/css/themify-icons.css">
<link rel="stylesheet" href="../assetss/css/flag-icon.min.css">
<link rel="stylesheet" href="../assetss/css/cs-skin-elastic.css">
<!-- <link rel="stylesheet" href="../assetss/css/bootstrap-select.less"> -->
<link rel="stylesheet" href="../assetss/scss/style.css">
<link rel="shortcut icon" href="assets1/global/img/Kvfsu.png" />
</head>
<body class="bg-dark">
	<div class="sufee-login d-flex align-content-center flex-wrap">
		<div class="container">
			<div class="login-content">
				<div class="login-logo">
					<a href="#"> <img class="align-content"
						src="../assetss/images/logowithname.jpg" alt="">
					</a>
				</div>
				<div class="login-form">
					<div class="align-content-center"
						style="text-align: center; border-bottom: 1px dotted #949393; padding-bottom: 16px; font-family: 'Comic Sans MS', cursive, sans-serif; margin-bottom: 10px; color: #1188d0">
						<h2>Signup to the application</h2>
						<g:if test='${flash.message}'>

							<p style="color: red">
								<strong> ${flash.emailverify}
								</strong>
							</p>
						</g:if>
						<form id="signupForm" method="post" action="register/createUser"
							class="m-login__form m-form">
							<p style="color: #32c5d2; font-size: 20px; text-align: center">
								<b>SIGN UP</b>
							</p>
							<p style="color: red">
								<strong> ${flash.email}
								</strong>
							</p>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<input type="text" id="username" name="username"
											regex="/^[a-zA-Z](?!.*  )(?!.*  )[a-zA-Z0-9 _\-\@]{4,40}$/"
											class="form-control" placeholder="Your username" value=""
											required="" /> <span
											class="glyphicon glyphicon-envelope form-control-feedback"></span>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<input type="text" id="phoneno" name="phoneno" min=10 max=10
											class="form-control" placeholder="Your Phonenumber" value=""
											required="" /> <span
											class="glyphicon glyphicon-envelope form-control-feedback"></span>
									</div>
								</div>
								<div class="col-md-6">

									<div class="form-group">
										<input type="email" name="email" class="form-control"
											placeholder="Your e-mail" value="" required="" /> <span
											class="glyphicon glyphicon-envelope form-control-feedback"></span>
									</div>
								</div>
							</div>


							<div class="row">
								<div class="col-md-6">

									<div class="form-group">
										<input type="password" name="password" class="form-control"
											placeholder="password" id="password"
											value="${userInstance?.password}" required="" /> <span
											class="glyphicon glyphicon-lock form-control-feedback"></span>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<input type="password" id="confirm_password"
											name="re-password" class="form-control"
											placeholder="Repeat password"
											value="${userInstance?.confirmpassword}" /> <span
											id='message'></span>
									</div>
								</div>
							</div>


							<br>

							<button class="btn btn-success btn-flat m-b-30 m-t-30"
								type="submit">Sign Up</button>


							<g:link controller="login" action="auth" style="color:white">Back</g:link>


							<p style="text-align: center">
								&copy; 2020 All Rights Reserved By <a
									href="https://sequrotechnologies.com/" target="_blank">https://sequrotechnologies.com/</a>
							</p>

						</form>

					</div>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		$('#password, #confirm_password').on('keyup', function() {
			if ($('#password').val() == $('#confirm_password').val()) {
				$('#message').html('Matching').css('color', 'green');
			} else
				$('#message').html('Not Matching').css('color', 'red');
		});
	</script>


	<script src="../assetss/js/vendor/jquery-2.1.4.min.js"></script>
	<script src="../assetss/js/popper.min.js"></script>
	<script src="../assetss/js/plugins.js"></script>
	<script src="../assetss/js/main.js"></script>
	<script>
		$('[id="username"]').on('change', function() {
			var input = $('#username');
			input.val(input.val().replace(/ +(?= )/g, function(str) {
				return '';
			})); //trim multiple spaces

		});
	</script>
	<script type="text/javascript">
		$("#signupForm").validate({
			rules : {
				login : {
					required : true,
					minlength : 2
				},
				password : {
					required : true,
					minlength : 8
				},
				're-password' : {
					required : true,
					minlength : 8,
					equalTo : "#password"
				},
				email : {
					required : true,
					email : true
				},
				username : {
					required : true,
					minlength : 5,
					maxlength : 40

				}
			}
		});

		$.validator.addMethod("regex", function(value, element, regstring) {
			// fast exit on empty optional
			if (this.optional(element)) {
				return true;
			}

			var regParts = regstring.match(/^\/(.*?)\/([gim]*)$/);
			if (regParts) {
				// the parsed pattern had delimiters and modifiers. handle them. 
				var regexp = new RegExp(regParts[1], regParts[2]);
			} else {
				// we got pattern string without delimiters
				var regexp = new RegExp(regstring);
			}

			return regexp.test(value);
		}, "Please enter the characters between 5 to 40.");
	</script>

	<script>
		(function(i, s, o, g, r, a, m) {
			i['GoogleAnalyticsObject'] = r;
			i[r] = i[r] || function() {
				(i[r].q = i[r].q || []).push(arguments)
			}, i[r].l = 1 * new Date();
			a = s.createElement(o), m = s.getElementsByTagName(o)[0];
			a.async = 1;
			a.src = g;
			m.parentNode.insertBefore(a, m)
		})(window, document, 'script',
				'https://www.google-analytics.com/analytics.js', 'ga');
		ga('create', 'UA-104333473-1', 'auto');
		ga('send', 'pageview');
	</script>

</body>
</html>