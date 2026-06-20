import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pragati_mainPageindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/mainPage/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',28,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',29,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',29,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',108,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('username','sec',125,[:],-1)
printHtmlPart(6)
invokeTag('render','g',126,['template':("/shared/staticheader")],-1)
printHtmlPart(7)
if(true && (flash.email)) {
printHtmlPart(8)
expressionOut.print(flash.email)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (flash.emailverify)) {
printHtmlPart(11)
expressionOut.print(flash.emailverify)
printHtmlPart(12)
}
printHtmlPart(13)
expressionOut.print(userInstance?.password)
printHtmlPart(14)
expressionOut.print(userInstance?.confirmpassword)
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('link','g',223,['controller':("login"),'action':("auth"),'style':("color:white")],2)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',421,['class':("c-layout-header-fixed c-layout-header-mobile-fixed")],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1724131008000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
