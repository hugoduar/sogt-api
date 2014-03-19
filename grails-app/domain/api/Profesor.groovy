package api
import grails.rest.Resource

@Resource(uri="/profesores", formats=['json', 'xml'])
class Profesor {
	String nombre
	Usuario username
	Integer matricula
	String foto
    static constraints = {
    }
}
