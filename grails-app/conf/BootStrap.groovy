import com.springapp.SecRole
import com.springapp.SecUser
import com.springapp.SecUserSecRole

class BootStrap {

	def init = { servletContext ->

		def superadminRole = SecRole.findByAuthority('ROLE_SUPERADMIN') ?: new SecRole(authority: 'ROLE_SUPERADMIN').save(flush: true)
		def adminRole = SecRole.findByAuthority('ROLE_ADMIN') ?: new SecRole(authority: 'ROLE_ADMIN').save(flush: true)
		def userRole = SecRole.findByAuthority('ROLE_USER') ?: new SecRole(authority: 'ROLE_USER').save(flush: true)
		def commanusersRole = SecRole.findByAuthority('ROLE_COMMANUSERS') ?: new SecRole(authority: 'ROLE_COMMANUSERS').save(flush: true)

		def superadmin = SecUser.findByUsername("superadmin") ?: new SecUser(username: 'superadmin', password: 'EnD0MeT@!T!S').save(flush: true)
		def admin = SecUser.findByUsername("admin") ?: new SecUser(username: 'admin', password: '@dminENd0MEtRIT!S ').save(flush: true)
		def user = SecUser.findByUsername("user")?: new SecUser(username: 'user', password: 'UserENDOMETRITIS ').save(flush: true)
		def commanUsers = SecUser.findByUsername("commanusers")?: new SecUser(username: 'commanusers', password: 'CommanUsersENDOMETRITIS ').save(flush: true)

		if(!admin.authorities.contains(adminRole)){
			SecUserSecRole.create(admin,adminRole)
		}
		if(!user.authorities.contains(userRole)){
			SecUserSecRole.create(user,userRole)
		}
		if(!commanUsers.authorities.contains(commanusersRole)){
			SecUserSecRole.create(commanUsers,commanusersRole)
		}
		if(!superadmin.authorities.contains(superadminRole)){
			SecUserSecRole.create(superadmin,superadminRole)
		}
	}
	def destroy = {
	}
}
