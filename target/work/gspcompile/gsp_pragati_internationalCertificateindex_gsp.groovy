import com.hiideals.form.InternationalCertificate
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pragati_internationalCertificateindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/internationalCertificate/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'internationalCertificate.label', default: 'InternationalCertificate'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("firstName"),'title':(message(code: 'internationalCertificate.firstName.label', default: 'First Name'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("lastName"),'title':(message(code: 'internationalCertificate.lastName.label', default: 'Last Name'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("phoneNo"),'title':(message(code: 'internationalCertificate.phoneNo.label', default: 'Phone No'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',33,['property':("state"),'title':(message(code: 'internationalCertificate.state.label', default: 'State'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',35,['property':("district"),'title':(message(code: 'internationalCertificate.district.label', default: 'District'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',37,['property':("city"),'title':(message(code: 'internationalCertificate.city.label', default: 'City'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( internationalCertificateInstance in (internationalCertificateInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: internationalCertificateInstance, field: "firstName"))
})
invokeTag('link','g',45,['action':("show"),'id':(internationalCertificateInstance.id)],3)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: internationalCertificateInstance, field: "lastName"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: internationalCertificateInstance, field: "phoneNo"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: internationalCertificateInstance, field: "state"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: internationalCertificateInstance, field: "district"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: internationalCertificateInstance, field: "city"))
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',62,['total':(internationalCertificateInstanceCount ?: 0)],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1687261484000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
