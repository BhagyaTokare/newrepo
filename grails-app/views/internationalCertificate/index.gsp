
<%@ page import="com.hiideals.form.InternationalCertificate" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'internationalCertificate.label', default: 'InternationalCertificate')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-internationalCertificate" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-internationalCertificate" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="firstName" title="${message(code: 'internationalCertificate.firstName.label', default: 'First Name')}" />
					
						<g:sortableColumn property="lastName" title="${message(code: 'internationalCertificate.lastName.label', default: 'Last Name')}" />
					
						<g:sortableColumn property="phoneNo" title="${message(code: 'internationalCertificate.phoneNo.label', default: 'Phone No')}" />
					
						<g:sortableColumn property="state" title="${message(code: 'internationalCertificate.state.label', default: 'State')}" />
					
						<g:sortableColumn property="district" title="${message(code: 'internationalCertificate.district.label', default: 'District')}" />
					
						<g:sortableColumn property="city" title="${message(code: 'internationalCertificate.city.label', default: 'City')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${internationalCertificateInstanceList}" status="i" var="internationalCertificateInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${internationalCertificateInstance.id}">${fieldValue(bean: internationalCertificateInstance, field: "firstName")}</g:link></td>
					
						<td>${fieldValue(bean: internationalCertificateInstance, field: "lastName")}</td>
					
						<td>${fieldValue(bean: internationalCertificateInstance, field: "phoneNo")}</td>
					
						<td>${fieldValue(bean: internationalCertificateInstance, field: "state")}</td>
					
						<td>${fieldValue(bean: internationalCertificateInstance, field: "district")}</td>
					
						<td>${fieldValue(bean: internationalCertificateInstance, field: "city")}</td>
					
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
