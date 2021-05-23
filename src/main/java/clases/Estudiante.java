package clases;

import principal.Ordenador;
/**
 * Clase heredada de persona.Pregunta al ordenador sobre el color que tiene el semaforo.
 * @author entornos
 * @version 2.0
 * @since 1.5
 * */
 
public class Estudiante extends Persona{
    /**
     * @return the i_Curso
     */
    public int getI_Curso() {
        return i_Curso;
    }
    /**
     * @param i_Curso the i_Curso to set
     */
    public void setI_Curso(int i_Curso) {
        this.i_Curso = i_Curso;
    }
	// Incluye un metodo de clase que se une a los heredados
	private int i_Curso;
    	public Estudiante() {
		i_Edad=25;
		s_Nombre = "Luis";
		i_Curso = 1;         
        /**
         * Metodo que imprime los valores 
         * a_Nombre
         * i_Curso
         * edad
         */
         
	}
	public void presentarse(){
	System.out.println("Soy " + s_Nombre + __ALUMNO_DE_ + Integer.toString(getI_Curso()) + " y 	tengo una edad de: " + Integer.toString(i_Edad));	
    	}
    private static final String __ALUMNO_DE_ = " Alumno de ";
	public String pregColor(){
		presentarse();
		Ordenador mipc = new Ordenador();
        	return mipc.color();
    	}
}
