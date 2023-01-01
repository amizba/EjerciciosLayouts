/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Layouts
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1_Layout extends JFrame  implements ActionListener {

    JButton boton1, boton2, boton3, boton4;
    FlowLayout miFlowLayout;

    public Ejercicio1_Layout() {

        //Instancia un objeto FlowLayout object alineado al centro y con una separacion de 3px en horizonal y vertical
        miFlowLayout = new FlowLayout(FlowLayout.CENTER,4,4);

        //Uso este FlowLayout para que sea el controlador de posicionamiento de mi objeto JFrame
        setLayout(miFlowLayout);

        //Creo 5 botones y los añado a mi objeto JFrame
        boton1 = new JButton("Botón 1");
        boton2 = new JButton("Botón 2");
        boton3 = new JButton("Botón 3");
        boton4 = new JButton("Botón 4");
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);

        //Añado los botones al ActionListener
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);

        //Configurar y mostrar JFrame
        initPantalla();
    }

    private void initPantalla() {

        setTitle("Ejercicio 1"); //Título del JFrame
        setSize(250,150); //Dimensiones del JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }

    public static void main(String[] args) {
        new Ejercicio1_Layout();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Al hacer clic en un botón, añado 5px de espacio horizontal y vertical entre botones
        miFlowLayout.setHgap(miFlowLayout.getHgap() + 6);
        miFlowLayout.setVgap(miFlowLayout.getVgap() + 6);
        //Fijo el nuevo layout al formulario
        setLayout(miFlowLayout);
        //Valido el formulario para asegurarme de que se actualiza en pantalla
        validate();
    }
}
