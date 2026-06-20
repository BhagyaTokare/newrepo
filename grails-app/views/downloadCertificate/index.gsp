
<%@ page import="com.hiideals.form.DownloadCertificate" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'downloadCertificate.label', default: 'DownloadCertificate')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-downloadCertificate" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-downloadCertificate" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="phoneNo" title="${message(code: 'downloadCertificate.phoneNo.label', default: 'Phone Number')}" />
					
						<g:sortableColumn property="downloadDate" title="${message(code: 'downloadCertificate.downloadDate.label', default: 'Download Date')}" />
					
						<th><g:message code="downloadCertificate.internationalCertificate.label" default="International Certificate" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${downloadCertificateInstanceList}" status="i" var="downloadCertificateInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${downloadCertificateInstance.id}">${fieldValue(bean: downloadCertificateInstance, field: "phoneNo")}</g:link></td>
					
						<td><g:formatDate date="${downloadCertificateInstance.downloadDate}" /></td>
					
						<td>${fieldValue(bean: downloadCertificateInstance, field: "internationalCertificate")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${downloadCertificateInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
