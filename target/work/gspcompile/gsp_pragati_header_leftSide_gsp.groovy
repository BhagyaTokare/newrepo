import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pragati_header_leftSide_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/header/_leftSide.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createClosureForHtmlPart(1, 1)
invokeTag('link','g',12,['controller':("superadmin"),'action':("indexx"),'class':("nav-link nav-toggle")],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
createClosureForHtmlPart(4, 2)
invokeTag('link','g',27,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],2)
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('link','g',31,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],2)
printHtmlPart(7)
})
invokeTag('ifAnyGranted','sec',34,['roles':("ROLE_SUPERADMIN")],1)
printHtmlPart(8)
createTagBody(1, {->
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',47,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],2)
printHtmlPart(5)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',51,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',67,['controller':("department"),'action':("create"),'class':("nav-link ")],2)
printHtmlPart(5)
createClosureForHtmlPart(14, 2)
invokeTag('link','g',71,['controller':("department"),'action':("index"),'class':("nav-link ")],2)
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('link','g',86,['controller':("filledPost"),'action':("create"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],2)
printHtmlPart(5)
createClosureForHtmlPart(17, 2)
invokeTag('link','g',90,['controller':("filledPost"),'action':("index"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],2)
printHtmlPart(5)
createClosureForHtmlPart(18, 2)
invokeTag('link','g',94,['controller':("filledPost"),'action':("indexnonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],2)
printHtmlPart(19)
createClosureForHtmlPart(20, 2)
invokeTag('link','g',99,['controller':("filledPost"),'action':("transferteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],2)
printHtmlPart(19)
createClosureForHtmlPart(21, 2)
invokeTag('link','g',105,['controller':("filledPost"),'action':("transfernonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],2)
printHtmlPart(22)
createClosureForHtmlPart(23, 2)
invokeTag('link','g',115,['controller':("filledPost"),'action':("searchByDept"),'class':("nav-link ")],2)
printHtmlPart(19)
createClosureForHtmlPart(24, 2)
invokeTag('link','g',120,['controller':("filledPost"),'action':("searchByCollage"),'class':("nav-link ")],2)
printHtmlPart(25)
createClosureForHtmlPart(26, 2)
invokeTag('link','g',132,['controller':("transferPost"),'action':("transferList"),'class':("nav-link ")],2)
printHtmlPart(27)
createClosureForHtmlPart(28, 2)
invokeTag('link','g',147,['controller':("transferPost"),'action':("searchByDept"),'class':("nav-link ")],2)
printHtmlPart(29)
})
invokeTag('ifAnyGranted','sec',148,['roles':("ROLE_ADMIN")],1)
printHtmlPart(30)
createClosureForHtmlPart(31, 1)
invokeTag('link','g',182,['controller':("superadmin"),'action':("indexx"),'class':("nav-link nav-toggle")],1)
printHtmlPart(32)
createTagBody(1, {->
printHtmlPart(33)
createClosureForHtmlPart(34, 2)
invokeTag('link','g',191,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],2)
printHtmlPart(35)
createClosureForHtmlPart(36, 2)
invokeTag('link','g',196,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],2)
printHtmlPart(37)
})
invokeTag('ifAnyGranted','sec',197,['roles':("ROLE_SUPERADMIN")],1)
printHtmlPart(38)
createTagBody(1, {->
printHtmlPart(39)
createClosureForHtmlPart(40, 2)
invokeTag('link','g',207,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],2)
printHtmlPart(35)
createClosureForHtmlPart(36, 2)
invokeTag('link','g',212,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],2)
printHtmlPart(41)
createClosureForHtmlPart(42, 2)
invokeTag('link','g',223,['controller':("filledPost"),'action':("create"),'class':("nav-link ")],2)
printHtmlPart(35)
createClosureForHtmlPart(36, 2)
invokeTag('link','g',228,['controller':("filledPost"),'action':("index"),'class':("nav-link ")],2)
printHtmlPart(35)
createClosureForHtmlPart(36, 2)
invokeTag('link','g',232,['controller':("filledPost"),'action':("searchByDept"),'class':("nav-link ")],2)
printHtmlPart(43)
})
invokeTag('ifAnyGranted','sec',237,['roles':("ROLE_ADMIN")],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1675768336000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
