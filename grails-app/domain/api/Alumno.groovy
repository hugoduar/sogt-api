package api
import grails.rest.Resource

@Resource(uri="/alumnos", formats=['json', 'xml'])
class Alumno {
	String nombre
	Usuario username
	Integer boleta
	String foto
    static constraints = {
    }
}
