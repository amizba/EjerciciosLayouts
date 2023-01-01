/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Layouts
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio3_Layout {

	public static void main(String[] args) {
		
		MarcoCalculadora mimarco = new MarcoCalculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		

	}

}
class MarcoCalculadora extends JFrame {
	
	public MarcoCalculadora() {
		
		setTitle("Calculadora");
		
		setBounds(500, 300, 450, 300);
		
		LaminaCalculadora milamina = new LaminaCalculadora();
		
		add(milamina);
		
		
	}
}
class LaminaCalculadora extends JPanel {
	
	public LaminaCalculadora() {
		
		principio=true;
		
		setLayout(new BorderLayout());
		
		display =new JButton("0");
		
		display.setEnabled(false);
		
		add(display, BorderLayout.NORTH);
		
		milamina2 = new JPanel();
		
		milamina2.setLayout(new GridLayout(4, 4));
		
		ActionListener insertar = new insertaNumero();
		
		ActionListener operacion = new clOperaciones();
		
		agregarBotones("7", insertar);
		
		agregarBotones("8", insertar);
		
		agregarBotones("9", insertar);
		
		agregarBotones("/", operacion);
		
		agregarBotones("4", insertar);
		
		agregarBotones("5", insertar);
		
		agregarBotones("6", insertar);
		
		agregarBotones("*", operacion);
		
		agregarBotones("1", insertar);
		
		agregarBotones("2", insertar);
		
		agregarBotones("3", insertar);
		
		agregarBotones("-", operacion);
		
		agregarBotones("0", insertar);
		
		agregarBotones(".", operacion);
		
		agregarBotones("+", operacion);
		
		agregarBotones("=", operacion);
		
		add(milamina2, BorderLayout.CENTER);
		
		ultimaAccion = "+";
	}
	
	private void agregarBotones (String tit, ActionListener oyente) {
		
		JButton boton = new JButton(tit);
		
		boton.addActionListener(oyente);
		
		milamina2.add(boton);
	}
	
	private class insertaNumero implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String entrada = e.getActionCommand();
			
			if(principio) {
				
				display.setText(" ");
				
				principio=false;
			}
			
			display.setText(display.getText()+entrada);
			
		}
		
		
	}
	
	private class clOperaciones implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String operador=e.getActionCommand();
			
			calcular(Double.parseDouble(display.getText()));
			
			ultimaAccion=operador;
			
			principio=true;

		}
		public void calcular(double x) {
			
			if(ultimaAccion.equals("+")) {
				
				resultado+=x;
			}else if(ultimaAccion.equals("-")) {
				
				resultado-=x;
			}else if(ultimaAccion.equals("*")) {
				
				resultado*=x;
			}else if(ultimaAccion.equals("/")) {
				
				resultado/=x;
			}
			
			display.setText(" "+resultado);
			
		}
		
	}
	
	
	private JPanel milamina2;
	
	private JButton display;
	
	private boolean principio;
	
	private double resultado;
	
	private String ultimaAccion;
}

