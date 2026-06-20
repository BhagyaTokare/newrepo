<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'downloadCertificate.label', default: 'DownloadCertificate')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
	
	 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
	
	<style>
	
	.labeltext{
	position: absolute;
      top: 65%;
      left: 48.5%;
      transform: translate(-50%, -50%);
	}
	.note{
		position: absolute;
      top: 80%;
      left: 50%;
      transform: translate(-50%, -50%);
	}
	.mblnumber{
	position: absolute;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
	}
	   .btn-center {
      position: absolute;
      top: 60%;
      left: 50%;
      transform: translate(-50%, -50%);
    }
    .center-div {
    display: flex;
    justify-content: center;
  }
	</style>
	</head>
	<body>
	
	
	<div>
	
	 	<!--  <h1 class="heading animated-text"><span class="typewriter2">Run4Road Safety Bidar</span><br/> Earn a Run4Road Safety Certificate Today!</h1> 
	    <img src="" class="img-fluid" alt="Responsive Image" style="width:100%;height:800px;">   
	   		 -->
	   		    
	</div>
	 <div class="center-div">
 <img src="images/headback1.png" class="img-fluid" alt="Responsive Image" style="border-radius:3px;width:100%;"  />
</div>
					  
		<div class="nav" role="navigation">
		<!--  	<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
			</ul> -->
		</div>
		<div id="create-downloadCertificate" class="content scaffold-create" role="main"><%--
			<h1><g:message code="default.create.label" args="[entityName]" /></h1>
			--%><g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${downloadCertificateInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${downloadCertificateInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form url="[resource:downloadCertificateInstance, action:'save']" >
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
					<g:submitButton name="create" class="btn btn-primary btn-center save" style="background-color: #00008B;font-size: 25px;font-weight:bold;border:2px solid black;"   value="${message(code: 'default.button.download.label', default: 'Download Certificate')}" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
