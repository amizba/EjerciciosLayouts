/*Utiliza el layout FlowLayout para organizar los componentes en una fila, y cuando 
 * el espacio se agota, los componentes se desplazarán a la siguiente fila.
 */
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Layouts
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package lay;

import javax.swing.*;
import java.awt.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        for (int i = 1; i <= 10; i++) {
            frame.add(new JButton("Botón " + i));
        }

        frame.pack();
        frame.setVisible(true);
    }
}