package clases;
/**
 * Clase heredada de persona,Pregunta al estudiante sobre el color del semaforo.
 * @author entornos
 * @version 2.0
 * @since 1.5
 */

public class Profesor  extends Persona{
    	public Profesor() {}				// Constructor
/**
 * Metodo que hace una pregunta al estudiante sobre el color
 * @return Color del ordenador del estudiante
 */
	// Hace la pregunta al estudiante sobre el color
    	public String preguntacolor(){

		return obcol();
    	}

    private String obcol() {
        Estudiante alumno = new Estudiante();
        String colorRec = alumno.pregColor();
        return colorRec;
    }
}
