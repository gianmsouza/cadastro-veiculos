package veiculo;

import javax.swing.JOptionPane;

//Gian Marcel de Souza
public class VeicExistException extends Exception{
	
	public VeicExistException() {
		JOptionPane.showMessageDialog(null, "Placa já informada!");
	}
}
