import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pragati_commanUsers_adminFORM_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/commanUsers/_adminFORM.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (flash.message)) {
printHtmlPart(1)
expressionOut.print(flash.message)
printHtmlPart(2)
}
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(hasErrors(bean: usersInstance, field: 'username', 'error'))
printHtmlPart(5)
invokeTag('message','g',24,['code':("user.username.label"),'default':("Username")],-1)
printHtmlPart(6)
if(true && (params?.action !="adminEdit")) {
printHtmlPart(7)
invokeTag('textField','g',30,['name':("username"),'class':("form-control spinner input-circle"),'value':(usersInstance?.username),'required':("true")],-1)
printHtmlPart(8)
}
else {
printHtmlPart(9)
expressionOut.print(usersInstance?.username)
printHtmlPart(10)
}
printHtmlPart(11)
expressionOut.print(hasErrors(bean: usersInstance, field: 'password', 'error'))
printHtmlPart(12)
invokeTag('message','g',43,['code':("user.password.label"),'default':("Password")],-1)
printHtmlPart(6)
if(true && (params?.action !="adminEdit")) {
printHtmlPart(7)
invokeTag('textField','g',49,['name':("password"),'class':("form-control spinner input-circle"),'value':(usersInstance?.password),'required':("true")],-1)
printHtmlPart(8)
}
else {
printHtmlPart(13)
expressionOut.print(usersInstance?.password)
printHtmlPart(10)
}
printHtmlPart(14)
expressionOut.print(hasErrors(bean: usersInstance, field: 'phoneNo', 'error'))
printHtmlPart(15)
invokeTag('message','g',63,['code':("user.phoneNo.label"),'default':("Phone No")],-1)
printHtmlPart(6)
invokeTag('textField','g',69,['name':("phoneNo"),'class':("form-control spinner input-circle"),'value':(usersInstance?.phoneNo),'required':("true")],-1)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: usersInstance, field: 'pinCode', 'error'))
printHtmlPart(17)
invokeTag('textField','g',78,['name':("pinCode"),'class':("form-control spinner input-circle"),'value':(usersInstance?.address?.pinCode)],-1)
printHtmlPart(18)
invokeTag('textField','g',86,['name':("hsno"),'value':(usersInstance?.address?.hsno),'class':("form-control spinner input-circle")],-1)
printHtmlPart(19)
invokeTag('textField','g',95,['name':("street"),'value':(usersInstance?.address?.street),'class':("form-control spinner input-circle")],-1)
printHtmlPart(20)
invokeTag('textField','g',99,['name':("city"),'value':(usersInstance?.address?.city),'class':("form-control spinner input-circle")],-1)
printHtmlPart(21)
invokeTag('textField','g',104,['name':("state"),'value':(usersInstance?.address?.state),'class':("form-control spinner input-circle")],-1)
printHtmlPart(22)
if(true && (params?.action !="adminEdit")) {
printHtmlPart(23)
invokeTag('textField','g',112,['name':("country"),'class':("form-control spinner input-circle")],-1)
printHtmlPart(24)
invokeTag('actionSubmit','g',128,['action':("SaveCommanUsers"),'class':("btn btn-primary"),'value':("Save Details")],-1)
printHtmlPart(25)
}
else {
printHtmlPart(26)
invokeTag('hiddenField','g',137,['name':("userListid"),'value':(usersInstance?.id)],-1)
printHtmlPart(27)
invokeTag('actionSubmit','g',141,['action':("updateCommanUsers"),'class':("btn btn-primary"),'value':("Update Details")],-1)
printHtmlPart(25)
}
printHtmlPart(28)
})
invokeTag('form','g',142,['controller':("commanUsers"),'enctype':("multipart/form-data"),'name':("validateip"),'class':("horizontal-form")],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1675768012000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
