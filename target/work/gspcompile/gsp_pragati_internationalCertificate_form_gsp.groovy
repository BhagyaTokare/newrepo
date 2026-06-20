import com.hiideals.form.InternationalCertificate
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pragati_internationalCertificate_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/internationalCertificate/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(internationalCertificateInstance?.lastName)
printHtmlPart(1)
expressionOut.print(internationalCertificateInstance?.firstName)
printHtmlPart(2)
expressionOut.print(internationalCertificateInstance?.clubMembershipNo)
printHtmlPart(3)
expressionOut.print(internationalCertificateInstance?.districtCode)
printHtmlPart(4)
expressionOut.print(internationalCertificateInstance?.zone)
printHtmlPart(5)
expressionOut.print(internationalCertificateInstance?.club)
printHtmlPart(6)
expressionOut.print(internationalCertificateInstance?.phoneNo)
printHtmlPart(7)
invokeTag('fieldError','g',60,['bean':(internationalCertificateInstance),'field':("phoneNo"),'style':("color: red;")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1724713627986L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
