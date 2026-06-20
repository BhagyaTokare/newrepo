import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pragati_internationalCertificateshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/internationalCertificate/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
expressionOut.print(internationalCertificateInstance?.firstName.toUpperCase())
printHtmlPart(4)
expressionOut.print(internationalCertificateInstance?.regNo)
printHtmlPart(5)
expressionOut.print(internationalCertificateInstance?.club)
printHtmlPart(6)
expressionOut.print(internationalCertificateInstance?.firstName.toUpperCase())
printHtmlPart(7)
expressionOut.print(internationalCertificateInstance?.regNo)
printHtmlPart(8)
expressionOut.print(internationalCertificateInstance?.club)
printHtmlPart(9)
})
invokeTag('captureHead','sitemesh',160,[:],1)
printHtmlPart(10)
createTagBody(1, {->
printHtmlPart(11)
expressionOut.print(internationalCertificateInstance?.firstName)
printHtmlPart(12)
expressionOut.print(internationalCertificateInstance?.club)
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',201,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1724712205685L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
