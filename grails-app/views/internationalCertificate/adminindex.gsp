
<%@ page import="com.hiideals.form.InternationalCertificate"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'InternationalCertificate.label', default: 'InternationalCertificate')}" />
<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
	<a href="#list-certificate" class="skip" tabindex="-1"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div class="nav" role="navigation">
		<ul>
			<li><a class="home" href="${createLink(uri: '/')}"><g:message
						code="default.home.label" /></a></li>
			<li><g:link class="create" action="create">
					<g:message code="default.new.label" args="[entityName]" />
				</g:link></li>
		</ul>
	</div>
	<div id="list-certificate" class="content scaffold-list" role="main">
		<h1>
			<g:message code="default.list.label" args="[entityName]" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<table>
			<thead>
				<tr>

					


					<g:sortableColumn property="lastName"
						title="${message(code: 'InternationalCertificate.lastName.label', default: 'Title')}" />
					<g:sortableColumn property="firstName"
						title="${message(code: 'InternationalCertificate.firstName.label', default: 'First Name')}" />

					<g:sortableColumn property="email"
						title="${message(code: 'InternationalCertificate.email.label', default: 'email')}" />

					<g:sortableColumn property="phoneNo"
						title="${message(code: 'InternationalCertificate.phoneNo.label', default: 'Phone No')}" />

					<g:sortableColumn property="state"
						title="${message(code: 'InternationalCertificate.state.label', default: 'state')}" />

					<g:sortableColumn property="district"
						title="${message(code: 'InternationalCertificate.district.label', default: 'district')}" />

					<g:sortableColumn property="city"
						title="${message(code: 'InternationalCertificate.city.label', default: 'city')}" />
					
					<g:sortableColumn property="Certificates"
						title="${message(code: 'InternationalCertificate.Certificates.label', default: 'Certificates')}" />

				</tr>
			</thead>
			<tbody>
				<g:each in="${formdet}" status="i"
					var="internationalCertificateInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td><g:link action="show"
								id="${internationalCertificateInstance.id}">
								${fieldValue(bean: internationalCertificateInstance, field: "lastName")}
								
							</g:link></td>

						<td>
							${fieldValue(bean: internationalCertificateInstance, field: "firstName")}
						</td>
						
						<td>
							${fieldValue(bean: internationalCertificateInstance, field: "email")}
						</td>

						<td>
							${fieldValue(bean: internationalCertificateInstance, field: "phoneNo")}
						</td>

						<td>
							${fieldValue(bean: internationalCertificateInstance, field: "state")}
						</td>

						<td>
							${fieldValue(bean: internationalCertificateInstance, field: "district")}
						</td>
						
						<td>
							${fieldValue(bean: internationalCertificateInstance, field: "city")}
						</td>

						<td><g:link action="report"
								resource="${internationalCertificateInstance}">
								<span class="label label-sm label-success"><b>Certificates</b></span>
							</g:link></td>



					</tr>
				</g:each>
			</tbody>
		</table>
		<div class="pagination">
			<g:paginate total="${internationalCertificateInstanceCount ?: 0}" />
		</div>
	</div>
</body>
</html>
