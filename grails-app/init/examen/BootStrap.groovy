package examen

class BootStrap {

    def init = { servletContext ->
    	def rolAdmin = new Rol(authority: 'ROLE_ADMIN').save()
    	def rolUsuario = new Rol(authority: 'ROLE_USUARIO').save()

    	def usuAdmin = new Usuarios(username: 'admin', password: 'admin').save()
    	def usuSis = new Usuarios(username: 'usuario', password: 'usuario').save()

    	UsuariosRol.create usuAdmin, rolAdmin
    	UsuariosRol.create usuSis, rolUsuario

    	UsuariosRol.withSession {
    		it.flush()
    		it.clear()
    	}
    }
    def destroy = {
    }
}
