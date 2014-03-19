package api
import grails.rest.Resource

@Resource(uri="/usuarios", formats=['json', 'xml'])
class Usuario {
	String username
	String password
    static constraints = {
    }
}
