/*Utiliza el layout BorderLayout para organizar los componentes en cinco regiones 
 * diferentes: norte, sur, este, oeste y centro.
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

public class Ejercicio1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("Norte"), BorderLayout.NORTH);
        frame.add(new JButton("Sur"), BorderLayout.SOUTH);
        frame.add(new JButton("Este"), BorderLayout.EAST);
        frame.add(new JButton("Oeste"), BorderLayout.WEST);
        frame.add(new JButton("Centro"), BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
