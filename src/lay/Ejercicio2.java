/*Utiliza el layout GridLayout para organizar los componentes en una cuadr�cula con 
 * un n�mero espec�fico de filas y columnas.
 */
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Layouts
*
* @author Amparo Izquierdo Ba�ez
* @mail amizba@gmail.com
*/
package lay;

import javax.swing.*;
import java.awt.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 3));

        for (int i = 1; i <= 9; i++) {
            frame.add(new JButton("Bot�n " + i));
        }

        frame.pack();
        frame.setVisible(true);
    }
}