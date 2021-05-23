package principal;
import java.util.Random;
/**Esta clase simula el comportamiento de un semaforo el color devuelto es
 * aleatorio.
 * 
 * @author entornos
 * @version 2.0
 * @since 1.5
 * @see  a href= https://docs.oracle.com/javase/7/docs/api/java/util/Random.html clase
 */

public class Ordenador {
    public Ordenador() {}
    /**
     * Metodo devuelve un valor aleatorio entre rojo amarillo y verde
     * @return Color de semaforo
     */
    
    
    public String color(){
    	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(3);
        return switch (randomInt) {
            case 0 -> "rojo";
            case 1 -> "amarillo";
            default -> "verde";
        };
    }
}
