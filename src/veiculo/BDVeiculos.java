package veiculo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Gian Marcel de Souza
public class BDVeiculos {
	
	private File txtPasseio; 
	private File txtCarga;
	private File txtTemp; 
	
	private List<Passeio> BDPass;
	private List<Carga> BDCarg;
	private boolean placaExistente = false;
	
	private BufferedWriter buffWriter;
	private BufferedReader buffRead;
	
	public BDVeiculos() {
		txtPasseio = new File("bd-passeio.txt");
		txtCarga = new File("bd-carga.txt");
		txtTemp = new File("temp.txt");
	
		BDPass = new ArrayList<Passeio>();
		BDCarg = new ArrayList<Carga>();
		
		populaArrayVeiculo();
		populaArrayCarga();
	}

	public List<Passeio> getBDPass() {
		return BDPass;
	}

	public void setBDPasseio(List<Passeio> bDPass) {
		BDPass = bDPass;
	}

	public List<Carga> getBDCarg() {
		return BDCarg;
	}

	public void setBDCarg(List<Carga> bDCarg) {
		BDCarg = bDCarg;
	}

	public void inserirVeiculoPasseioArray(Passeio passeio) {	
		
		String registro = passeio.getPlaca() + ";" + passeio.getQtdePassageiros() + ";" +
				passeio.getMarca() + ";" + passeio.getModelo() + ";" + passeio.getCor() + ";" + 
				passeio.getQtdeRodas() + ";" + passeio.getVelocMax() + ";" +
				passeio.getMotor().getQtdePist() + ";" + passeio.getMotor().getPotencia();
		
		try {
			buffWriter = new BufferedWriter(new FileWriter(txtPasseio, true));			
			
			buffWriter.write(registro);
			buffWriter.newLine();
			
			buffWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao inserir!");			
		}
	}
	
	public void inserirVeiculoCargaArray(Carga carga) {		
		
		String registro = carga.getPlaca() + ";" + carga.getTara() + ";" +
				carga.getCargMax() + ";" + carga.getMarca() + ";" + carga.getModelo() + ";" + 
				carga.getCor() + ";" + carga.getQtdeRodas() + ";" +
				carga.getVelocMax() + ";" + carga.getMotor().getQtdePist() + ";" + carga.getMotor().getPotencia();
		
		try {
			buffWriter = new BufferedWriter(new FileWriter(txtCarga, true));			
			
			buffWriter.write(registro);
			buffWriter.newLine();
			
			buffWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao inserir!");			
		}
	}
	
	public void excluirVeiculoPasseioArray(Passeio passeio) {		
		
		try {
			buffRead = new BufferedReader(new FileReader(txtPasseio));
			
			String linha = buffRead.readLine();
			
			buffWriter = new BufferedWriter(new FileWriter(txtTemp, true));
			
			while (linha != null) {
				String veicPasseio[] = linha.split(";");
				
				if (!veicPasseio[0].equalsIgnoreCase(passeio.getPlaca())) {					
					buffWriter.write(linha);
					buffWriter.newLine();
					
					linha = buffRead.readLine();					
				} else {
					linha = buffRead.readLine();
				}
			}			
			
			buffWriter.close();
			buffRead.close();				
			
			txtPasseio.delete();
			txtTemp.renameTo(txtPasseio);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void excluirTodosVeiculoPasseio() {
		
		txtPasseio.delete();
		
		try {
			buffWriter = new BufferedWriter(new FileWriter(txtPasseio, true));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void excluirTodosVeiculoCarga() {
		
		txtCarga.delete();
		
		try {
			buffWriter = new BufferedWriter(new FileWriter(txtCarga, true));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void excluirVeiculoCargaArray(Carga carga) {		
		
		try {
			buffRead = new BufferedReader(new FileReader(txtCarga));
			
			String linha = buffRead.readLine();
			
			buffWriter = new BufferedWriter(new FileWriter(txtTemp, true));
			
			while (linha != null) {
				String veicCarga[] = linha.split(";");
				
				if (!veicCarga[0].equalsIgnoreCase(carga.getPlaca())) {					
					buffWriter.write(linha);
					buffWriter.newLine();
					
					linha = buffRead.readLine();					
				} else {
					linha = buffRead.readLine();
				}
			}			
			
			buffWriter.close();
			buffRead.close();				
			
			txtCarga.delete();
			txtTemp.renameTo(txtCarga);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean placaExistentePasseio(Passeio p2) throws VeicExistException {

		placaExistente = false;

		for (Passeio p : getBDPass()) {
			if (p != null) {
				if (p.getPlaca().equals(p2.getPlaca())) {
					placaExistente = true;
				}
			}
		}

		return placaExistente;
	}
	
	public boolean placaExistenteCarga(Carga c2) throws VeicExistException {

		placaExistente = false;

		for (Carga c : getBDCarg()) {
			if (c != null) {
				if (c.getPlaca().equals(c2.getPlaca())) {
					placaExistente = true;
				}
			}
		}

		return placaExistente;
	}
	
	public void populaArrayVeiculo() {		
		
		BDPass = new ArrayList<Passeio>();
		
		try {
			
			if (!txtPasseio.exists()) {
				txtPasseio.createNewFile();
			}
			
			buffRead = new BufferedReader(new FileReader(txtPasseio));
			
			String linha = buffRead.readLine();
			
			while (linha != null) {
				
				Passeio p = new Passeio();
				
				String veicPasseio[] = linha.split(";");
				
				p.setPlaca(veicPasseio[0]);
				p.setQtdePassageiros(Integer.parseInt(veicPasseio[1]));
				p.setMarca(veicPasseio[2]);
				p.setModelo(veicPasseio[3]);
				p.setCor(veicPasseio[4]);
				p.setQtdeRodas(Integer.parseInt(veicPasseio[5]));
				p.setVelocMax(Integer.parseInt(veicPasseio[6]));
				p.getMotor().setQtdePist(Integer.parseInt(veicPasseio[7]));
				p.getMotor().setPotencia(Integer.parseInt(veicPasseio[8]));
				
				BDPass.add(p);
				
				linha = buffRead.readLine();
			}
			
			buffRead.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void populaArrayCarga() {		
		
		BDCarg = new ArrayList<Carga>();
		
		try {
			
			if (!txtCarga.exists()) {
				txtCarga.createNewFile();
			}
			
			buffRead = new BufferedReader(new FileReader(txtCarga));
			
			String linha = buffRead.readLine();
			
			while (linha != null) {
				
				Carga c = new Carga();
				
				String veicCarga[] = linha.split(";");
				
				c.setPlaca(veicCarga[0]);
				c.setTara(Integer.parseInt(veicCarga[1]));
				c.setCargMax(Integer.parseInt(veicCarga[2]));
				c.setMarca(veicCarga[3]);
				c.setModelo(veicCarga[4]);
				c.setCor(veicCarga[5]);
				c.setQtdeRodas(Integer.parseInt(veicCarga[6]));
				c.setVelocMax(Integer.parseInt(veicCarga[7]));
				c.getMotor().setQtdePist(Integer.parseInt(veicCarga[8]));
				c.getMotor().setPotencia(Integer.parseInt(veicCarga[9]));
				
				BDCarg.add(c);
				
				linha = buffRead.readLine();
			}
			
			buffRead.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
