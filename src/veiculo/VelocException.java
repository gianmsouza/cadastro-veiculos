package veiculo;

import javax.swing.JOptionPane;

//Gian Marcel de Souza
public class VelocException extends Exception{
	
	public VelocException() {		
		JOptionPane.showMessageDialog(null, "A velocidade está fora dos limites brasileiros");
	}
}