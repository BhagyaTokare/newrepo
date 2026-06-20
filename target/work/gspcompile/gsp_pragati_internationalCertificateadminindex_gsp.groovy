import com.hiideals.form.InternationalCertificate
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pragati_internationalCertificateadminindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/internationalCertificate/adminindex.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'InternationalCertificate.label', default: 'InternationalCertificate'))],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('message','g',13,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(3)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(4)
invokeTag('message','g',17,['code':("default.home.label")],-1)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('message','g',19,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(7)
})
invokeTag('link','g',20,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',25,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',40,['property':("lastName"),'title':(message(code: 'InternationalCertificate.lastName.label', default: 'Title'))],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',42,['property':("firstName"),'title':(message(code: 'InternationalCertificate.firstName.label', default: 'First Name'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',45,['property':("email"),'title':(message(code: 'InternationalCertificate.email.label', default: 'email'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',48,['property':("phoneNo"),'title':(message(code: 'InternationalCertificate.phoneNo.label', default: 'Phone No'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',51,['property':("state"),'title':(message(code: 'InternationalCertificate.state.label', default: 'state'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',54,['property':("district"),'title':(message(code: 'InternationalCertificate.district.label', default: 'district'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',57,['property':("city"),'title':(message(code: 'InternationalCertificate.city.label', default: 'city'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',60,['property':("Certificates"),'title':(message(code: 'InternationalCertificate.Certificates.label', default: 'Certificates'))],-1)
printHtmlPart(15)
loop:{
int i = 0
for( internationalCertificateInstance in (formdet) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(18)
expressionOut.print(fieldValue(bean: internationalCertificateInstance, field: "lastName"))
printHtmlPart(19)
})
invokeTag('link','g',73,['action':("show"),'id':(internationalCertificateInstance.id)],3)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: internationalCertificateInstance, field: "firstName"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: internationalCertificateInstance, field: "email"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: internationalCertificateInstance, field: "phoneNo"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: internationalCertificateInstance, field: "state"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: internationalCertificateInstance, field: "district"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: internationalCertificateInstance, field: "city"))
printHtmlPart(23)
createClosureForHtmlPart(24, 3)
invokeTag('link','g',102,['action':("report"),'resource':(internationalCertificateInstance)],3)
printHtmlPart(25)
i++
}
}
printHtmlPart(26)
invokeTag('paginate','g',111,['total':(internationalCertificateInstanceCount ?: 0)],-1)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',114,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1687585748000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
