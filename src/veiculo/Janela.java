package veiculo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

//Gian Marcel de Souza
public class Janela {

	private BDVeiculos bd = new BDVeiculos();

	private JFrame janelaPrincipal = new JFrame();
	private JFrame janImpressaoExclusaoTodosPasseio = new JFrame();
	private JFrame janOperacoesPasseio = new JFrame();
	private JFrame janCadastroPasseio = new JFrame();
	private JFrame janConsultaExcluiPasseio = new JFrame();
	
	private JFrame janImpressaoExclusaoTodosCarga = new JFrame();
	private JFrame janOperacoesCarga = new JFrame();
	private JFrame janCadastroCarga = new JFrame();
	private JFrame janConsultaExcluiCarga = new JFrame();
	
	private JTextField qtdePassageirosPasseio = new JTextField();
	private JTextField placaPasseio = new JTextField();
	private JTextField marcaPasseio = new JTextField();
	private JTextField modeloPasseio = new JTextField();
	private JTextField corPasseio = new JTextField();
	private JTextField qtdeRodasPasseio = new JTextField();
	private JTextField velocMaximaPasseio = new JTextField();
	private JTextField qtdePistoesPasseio = new JTextField();
	private JTextField potenciaPasseio = new JTextField();
	
	private JTextField taraCarga = new JTextField();
	private JTextField cargaMaximaCarga = new JTextField();
	private JTextField placaCarga = new JTextField();
	private JTextField marcaCarga = new JTextField();
	private JTextField modeloCarga = new JTextField();
	private JTextField corCarga = new JTextField();
	private JTextField qtdeRodasCarga = new JTextField();
	private JTextField velocMaximaCarga = new JTextField();
	private JTextField qtdePistoesCarga = new JTextField();
	private JTextField potenciaCarga = new JTextField();

	private JTable tablePasseio;
	private DefaultTableModel modelPasseio;	
	private JTable tableCarga;
	private DefaultTableModel modelCarga;

	public void criaJanPrincipal() {

		janelaPrincipal = new JFrame();
		janelaPrincipal.setVisible(true);
		janelaPrincipal.setTitle("Gestão de Veículos");
		janelaPrincipal.setBounds(100, 100, 290, 130);
		janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaPrincipal.getContentPane().setLayout(null);
		janelaPrincipal.setLocationRelativeTo(null);

		JButton btAbrirOperacoesPasseio = new JButton("");
		btAbrirOperacoesPasseio.setBackground(new Color(30, 144, 255));
		btAbrirOperacoesPasseio.setBounds(38, 15, 89, 23);
		janelaPrincipal.getContentPane().add(btAbrirOperacoesPasseio);

		JButton btnAbrirOperacoesCarga = new JButton("");
		btnAbrirOperacoesCarga.setBackground(new Color(34, 139, 34));
		btnAbrirOperacoesCarga.setBounds(38, 50, 89, 23);
		janelaPrincipal.getContentPane().add(btnAbrirOperacoesCarga);

		JLabel lblPasseio = new JLabel("Passeio");
		lblPasseio.setBounds(137, 19, 46, 14);
		janelaPrincipal.getContentPane().add(lblPasseio);

		JLabel lblCarga = new JLabel("Carga");
		lblCarga.setBounds(137, 54, 46, 14);
		janelaPrincipal.getContentPane().add(lblCarga);

		btAbrirOperacoesPasseio.addActionListener(new BtAbrirJanelaOperacoesPasseio());
		btnAbrirOperacoesCarga.addActionListener(new BtAbrirJanelaOperacoesCarga());
	}

	private void criaJanelaOperacoesPasseio() {
		
		janOperacoesPasseio = new JFrame();
		janOperacoesPasseio.setBounds(100, 100, 296, 196);
		janOperacoesPasseio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janOperacoesPasseio.getContentPane().setLayout(null);
		janOperacoesPasseio.setLocationRelativeTo(null);
		janOperacoesPasseio.setTitle("Veículos de Passeio");
		janOperacoesPasseio.setVisible(true);

		JButton btnAbrirCadastroPasseio = new JButton("");
		btnAbrirCadastroPasseio.setBackground(new Color(30, 144, 255));
		btnAbrirCadastroPasseio.setBounds(10, 11, 89, 23);
		janOperacoesPasseio.getContentPane().add(btnAbrirCadastroPasseio);

		JLabel lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setBounds(109, 15, 75, 14);
		janOperacoesPasseio.getContentPane().add(lblCadastrar);

		JButton btnConsultarExcluirPlacaPasseio = new JButton("");
		btnConsultarExcluirPlacaPasseio.setBackground(new Color(30, 144, 255));
		btnConsultarExcluirPlacaPasseio.setBounds(10, 45, 89, 23);
		janOperacoesPasseio.getContentPane().add(btnConsultarExcluirPlacaPasseio);

		JLabel lblConsultarExcluirPlacaPasseio = new JLabel("Consultar/Excluir pela Placa");
		lblConsultarExcluirPlacaPasseio.setBounds(109, 49, 176, 14);
		janOperacoesPasseio.getContentPane().add(lblConsultarExcluirPlacaPasseio);

		JButton btImprimirExcluirTodosPasseio = new JButton("");
		btImprimirExcluirTodosPasseio.setBackground(new Color(30, 144, 255));
		btImprimirExcluirTodosPasseio.setBounds(10, 79, 89, 23);
		janOperacoesPasseio.getContentPane().add(btImprimirExcluirTodosPasseio);

		JLabel lblImprimirExcluirTodosPasseio = new JLabel("Imprimir/Excluir Todos");
		lblImprimirExcluirTodosPasseio.setBounds(109, 83, 136, 14);
		janOperacoesPasseio.getContentPane().add(lblImprimirExcluirTodosPasseio);

		JButton btnVoltarTelaInicial = new JButton("");
		btnVoltarTelaInicial.setBackground(new Color(220, 20, 60));
		btnVoltarTelaInicial.setBounds(10, 113, 89, 23);
		janOperacoesPasseio.getContentPane().add(btnVoltarTelaInicial);

		JLabel lblVoltarTelaInicial = new JLabel("Sair");
		lblVoltarTelaInicial.setBounds(110, 117, 46, 14);
		janOperacoesPasseio.getContentPane().add(lblVoltarTelaInicial);

		btnAbrirCadastroPasseio.addActionListener(new BtAbrirJanelaCadastroPasseio());
		btnConsultarExcluirPlacaPasseio.addActionListener(new BtAbrirJanelaConsultarExcluirPasseio());
		btImprimirExcluirTodosPasseio.addActionListener(new BtAbrirJanelaImprimirExcluirTodosPasseio());
		btnVoltarTelaInicial.addActionListener(new BtAbrirJanelaInicial());
	}

	private void criaJanelaCadastroPasseio() {

		janCadastroPasseio = new JFrame();
		janCadastroPasseio.setBounds(100, 100, 353, 405);
		janCadastroPasseio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janCadastroPasseio.getContentPane().setLayout(null);
		janCadastroPasseio.setVisible(true);
		janCadastroPasseio.setTitle("Cadastro de Passeio");
		janCadastroPasseio.setLocationRelativeTo(null);

		JLabel lblQtdePassageiros = new JLabel("Qtde Passageiros:");
		lblQtdePassageiros.setBounds(10, 13, 125, 14);
		janCadastroPasseio.getContentPane().add(lblQtdePassageiros);

		qtdePassageirosPasseio = new JTextField();
		qtdePassageirosPasseio.setBounds(145, 10, 169, 20);
		janCadastroPasseio.getContentPane().add(qtdePassageirosPasseio);
		qtdePassageirosPasseio.setColumns(10);

		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(10, 49, 46, 14);
		janCadastroPasseio.getContentPane().add(lblPlaca);

		placaPasseio = new JTextField();
		placaPasseio.setBounds(145, 46, 169, 20);
		janCadastroPasseio.getContentPane().add(placaPasseio);
		placaPasseio.setColumns(10);

		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 85, 46, 14);
		janCadastroPasseio.getContentPane().add(lblMarca);

		marcaPasseio = new JTextField();
		marcaPasseio.setBounds(145, 82, 169, 20);
		janCadastroPasseio.getContentPane().add(marcaPasseio);
		marcaPasseio.setColumns(10);

		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(10, 121, 46, 14);
		janCadastroPasseio.getContentPane().add(lblModelo);

		modeloPasseio = new JTextField();
		modeloPasseio.setBounds(145, 118, 169, 20);
		janCadastroPasseio.getContentPane().add(modeloPasseio);
		modeloPasseio.setColumns(10);

		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(10, 157, 46, 14);
		janCadastroPasseio.getContentPane().add(lblCor);

		corPasseio = new JTextField();
		corPasseio.setBounds(145, 154, 169, 20);
		janCadastroPasseio.getContentPane().add(corPasseio);
		corPasseio.setColumns(10);

		JLabel lblQtdeRodas = new JLabel("Qtde Rodas:");
		lblQtdeRodas.setBounds(10, 193, 125, 14);
		janCadastroPasseio.getContentPane().add(lblQtdeRodas);

		qtdeRodasPasseio = new JTextField();
		qtdeRodasPasseio.setBounds(145, 190, 169, 20);
		janCadastroPasseio.getContentPane().add(qtdeRodasPasseio);
		qtdeRodasPasseio.setColumns(10);

		JLabel lblVelocMaxima = new JLabel("Veloc M\u00E1xima:");
		lblVelocMaxima.setBounds(10, 229, 114, 14);
		janCadastroPasseio.getContentPane().add(lblVelocMaxima);

		velocMaximaPasseio = new JTextField();
		velocMaximaPasseio.setBounds(145, 226, 169, 20);
		janCadastroPasseio.getContentPane().add(velocMaximaPasseio);
		velocMaximaPasseio.setColumns(10);

		JLabel lblQtdePistoes = new JLabel("Qtde Pist\u00F5es:");
		lblQtdePistoes.setBounds(10, 265, 125, 14);
		janCadastroPasseio.getContentPane().add(lblQtdePistoes);

		qtdePistoesPasseio = new JTextField();
		qtdePistoesPasseio.setBounds(145, 262, 169, 20);
		janCadastroPasseio.getContentPane().add(qtdePistoesPasseio);
		qtdePistoesPasseio.setColumns(10);

		JLabel lblPotencia = new JLabel("Pot\u00EAncia:");
		lblPotencia.setBounds(10, 301, 101, 14);
		janCadastroPasseio.getContentPane().add(lblPotencia);

		potenciaPasseio = new JTextField();
		potenciaPasseio.setBounds(145, 298, 169, 20);
		janCadastroPasseio.getContentPane().add(potenciaPasseio);
		potenciaPasseio.setColumns(10);

		JButton btCadastrarPasseio = new JButton("Cadastrar");
		btCadastrarPasseio.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btCadastrarPasseio.setBounds(10, 331, 81, 23);
		janCadastroPasseio.getContentPane().add(btCadastrarPasseio);

		JButton btLimparPasseio = new JButton("Limpar");
		btLimparPasseio.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btLimparPasseio.setBounds(101, 331, 69, 23);
		janCadastroPasseio.getContentPane().add(btLimparPasseio);

		JButton btNovoPasseio = new JButton("Novo");
		btNovoPasseio.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btNovoPasseio.setBounds(180, 331, 69, 23);
		janCadastroPasseio.getContentPane().add(btNovoPasseio);

		JButton btVoltarTelaOperacoesPasseio = new JButton("Sair");
		btVoltarTelaOperacoesPasseio.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btVoltarTelaOperacoesPasseio.setBounds(260, 331, 54, 23);
		janCadastroPasseio.getContentPane().add(btVoltarTelaOperacoesPasseio);

		btVoltarTelaOperacoesPasseio.addActionListener(new BtAbrirJanelaOperacoesPasseio());
		btCadastrarPasseio.addActionListener(new BtCadastrarPasseio());
		btLimparPasseio.addActionListener(new BtLimparCamposCadastroPasseio());
	}

	private void criaJanelaConsultaExcluiPasseio() {

		janConsultaExcluiPasseio = new JFrame();
		janConsultaExcluiPasseio.setBounds(100, 100, 353, 405);
		janConsultaExcluiPasseio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janConsultaExcluiPasseio.getContentPane().setLayout(null);
		janConsultaExcluiPasseio.setVisible(true);
		janConsultaExcluiPasseio.setTitle("Consultar/Excluir pela placa");
		janConsultaExcluiPasseio.setLocationRelativeTo(null);

		JLabel lblQtdePassageiros = new JLabel("Qtde Passageiros:");
		lblQtdePassageiros.setBounds(10, 49, 125, 14);
		janConsultaExcluiPasseio.getContentPane().add(lblQtdePassageiros);

		qtdePassageirosPasseio = new JTextField();
		qtdePassageirosPasseio.setBounds(145, 46, 169, 20);
		janConsultaExcluiPasseio.getContentPane().add(qtdePassageirosPasseio);
		qtdePassageirosPasseio.setColumns(10);

		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(10, 13, 46, 14);
		janConsultaExcluiPasseio.getContentPane().add(lblPlaca);

		placaPasseio = new JTextField();
		placaPasseio.setBounds(145, 10, 169, 20);
		janConsultaExcluiPasseio.getContentPane().add(placaPasseio);
		placaPasseio.setColumns(10);

		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 85, 46, 14);
		janConsultaExcluiPasseio.getContentPane().add(lblMarca);

		marcaPasseio = new JTextField();
		marcaPasseio.setBounds(145, 82, 169, 20);
		janConsultaExcluiPasseio.getContentPane().add(marcaPasseio);
		marcaPasseio.setColumns(10);

		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(10, 121, 46, 14);
		janConsultaExcluiPasseio.getContentPane().add(lblModelo);

		modeloPasseio = new JTextField();
		modeloPasseio.setBounds(145, 118, 169, 20);
		janConsultaExcluiPasseio.getContentPane().add(modeloPasseio);
		modeloPasseio.setColumns(10);

		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(10, 157, 46, 14);
		janConsultaExcluiPasseio.getContentPane().add(lblCor);

		corPasseio = new JTextField();
		corPasseio.setBounds(145, 154, 169, 20);
		janConsultaExcluiPasseio.getContentPane().add(corPasseio);
		corPasseio.setColumns(10);

		JLabel lblQtdeRodas = new JLabel("Qtde Rodas:");
		lblQtdeRodas.setBounds(10, 193, 125, 14);
		janConsultaExcluiPasseio.getContentPane().add(lblQtdeRodas);

		qtdeRodasPasseio = new JTextField();
		qtdeRodasPasseio.setBounds(145, 190, 169, 20);
		janConsultaExcluiPasseio.getContentPane().add(qtdeRodasPasseio);
		qtdeRodasPasseio.setColumns(10);

		JLabel lblVelocMaxima = new JLabel("Veloc M\u00E1xima:");
		lblVelocMaxima.setBounds(10, 229, 114, 14);
		janConsultaExcluiPasseio.getContentPane().add(lblVelocMaxima);

		velocMaximaPasseio = new JTextField();
		velocMaximaPasseio.setBounds(145, 226, 169, 20);
		janConsultaExcluiPasseio.getContentPane().add(velocMaximaPasseio);
		velocMaximaPasseio.setColumns(10);

		JLabel lblQtdePistoes = new JLabel("Qtde Pist\u00F5es:");
		lblQtdePistoes.setBounds(10, 265, 125, 14);
		janConsultaExcluiPasseio.getContentPane().add(lblQtdePistoes);

		qtdePistoesPasseio = new JTextField();
		qtdePistoesPasseio.setBounds(145, 262, 169, 20);
		janConsultaExcluiPasseio.getContentPane().add(qtdePistoesPasseio);
		qtdePistoesPasseio.setColumns(10);

		JLabel lblPotencia = new JLabel("Pot\u00EAncia:");
		lblPotencia.setBounds(10, 301, 101, 14);
		janConsultaExcluiPasseio.getContentPane().add(lblPotencia);

		potenciaPasseio = new JTextField();
		potenciaPasseio.setBounds(145, 298, 169, 20);
		janConsultaExcluiPasseio.getContentPane().add(potenciaPasseio);
		potenciaPasseio.setColumns(10);

		JButton btConsultarPasseio = new JButton("Consultar");
		btConsultarPasseio.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btConsultarPasseio.setBounds(100, 331, 75, 23);
		janConsultaExcluiPasseio.getContentPane().add(btConsultarPasseio);

		JButton btExcluirPasseio = new JButton("Excluir");
		btExcluirPasseio.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btExcluirPasseio.setBounds(183, 331, 69, 23);
		janConsultaExcluiPasseio.getContentPane().add(btExcluirPasseio);

		JButton btVoltarTelaOperacoesPasseio = new JButton("Sair");
		btVoltarTelaOperacoesPasseio.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btVoltarTelaOperacoesPasseio.setBounds(260, 331, 54, 23);
		janConsultaExcluiPasseio.getContentPane().add(btVoltarTelaOperacoesPasseio);
		
		qtdePassageirosPasseio.setEnabled(false);
		marcaPasseio.setEnabled(false);
		modeloPasseio.setEnabled(false);
		corPasseio.setEnabled(false);
		qtdeRodasPasseio.setEnabled(false);
		velocMaximaPasseio.setEnabled(false);
		qtdePistoesPasseio.setEnabled(false);
		potenciaPasseio.setEnabled(false);

		btVoltarTelaOperacoesPasseio.addActionListener(new BtAbrirJanelaOperacoesPasseio());
		btConsultarPasseio.addActionListener(new BtConsultarPlacaPasseio());
		btExcluirPasseio.addActionListener(new BtExcluirPlacaPasseio());
	}

	private void criaJanelaImpressaoExclusaoTodosPasseio() {

		janImpressaoExclusaoTodosPasseio = new JFrame();
		janImpressaoExclusaoTodosPasseio.setBounds(100, 100, 730, 396);
		janImpressaoExclusaoTodosPasseio.getContentPane().setLayout(null);
		janImpressaoExclusaoTodosPasseio.setVisible(true);
		janImpressaoExclusaoTodosPasseio.setLocationRelativeTo(null);
		janImpressaoExclusaoTodosPasseio.setTitle("Imprimir / Excluir Todos	");
		janImpressaoExclusaoTodosPasseio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 694, 296);
		janImpressaoExclusaoTodosPasseio.getContentPane().add(scrollPane);

		modelPasseio = new DefaultTableModel();

		modelPasseio.addColumn("Placa");
		modelPasseio.addColumn("Marca");
		modelPasseio.addColumn("Modelo");
		modelPasseio.addColumn("Cor");
		modelPasseio.addColumn("Qtde Rodas");
		modelPasseio.addColumn("Veloc Máx");
		modelPasseio.addColumn("Qtde Pist");
		modelPasseio.addColumn("Potência");
		modelPasseio.addColumn("Qtde Passag");

		tablePasseio = new JTable(modelPasseio);

		scrollPane.setViewportView(tablePasseio);

		JButton btVoltarTelaOperacoesPasseio = new JButton("Sair");
		btVoltarTelaOperacoesPasseio.setBounds(615, 318, 89, 23);
		janImpressaoExclusaoTodosPasseio.getContentPane().add(btVoltarTelaOperacoesPasseio);

		JButton btImprimirTodos = new JButton("Imprimir Todos");
		btImprimirTodos.setBounds(318, 318, 139, 23);
		janImpressaoExclusaoTodosPasseio.getContentPane().add(btImprimirTodos);

		JButton btExcluirTodos = new JButton("Excluir Todos");
		btExcluirTodos.setBounds(466, 318, 139, 23);
		janImpressaoExclusaoTodosPasseio.getContentPane().add(btExcluirTodos);

		btVoltarTelaOperacoesPasseio.addActionListener(new BtAbrirJanelaOperacoesPasseio());
		btImprimirTodos.addActionListener(new BtImprimirTodosPasseio());
		btExcluirTodos.addActionListener(new BtExcluirTodosPasseio());
	}
	
	private void limpaCamposCadastroPasseio() {
		qtdePassageirosPasseio.setText("");
		marcaPasseio.setText("");
		modeloPasseio.setText("");
		corPasseio.setText("");
		qtdeRodasPasseio.setText("");
		velocMaximaPasseio.setText("");
		qtdePistoesPasseio.setText("");
		potenciaPasseio.setText("");
		placaPasseio.setText("");
	}

	private class BtAbrirJanelaOperacoesPasseio implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			janelaPrincipal.dispose();
			janCadastroPasseio.dispose();
			janConsultaExcluiPasseio.dispose();
			janImpressaoExclusaoTodosPasseio.dispose();

			criaJanelaOperacoesPasseio();
		}
	}

	private class BtAbrirJanelaCadastroPasseio implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			janOperacoesPasseio.dispose();

			criaJanelaCadastroPasseio();
		}
	}

	private class BtAbrirJanelaConsultarExcluirPasseio implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			janOperacoesPasseio.dispose();

			criaJanelaConsultaExcluiPasseio();
		}
	}

	private class BtAbrirJanelaInicial implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			janOperacoesPasseio.dispose();
			janOperacoesCarga.dispose();

			criaJanPrincipal();
		}
	}

	private class BtAbrirJanelaImprimirExcluirTodosPasseio implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			janOperacoesPasseio.dispose();

			criaJanelaImpressaoExclusaoTodosPasseio();
		}
	}

	private class BtLimparCamposCadastroPasseio implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			limpaCamposCadastroPasseio();
		}
	}
	
	private class BtCadastrarPasseio implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (validaCamposCadastroPasseio()) {

				Passeio p = new Passeio();

				p.setPlaca(placaPasseio.getText());

				try {
					if (bd.placaExistentePasseio(p)) {
						throw new VeicExistException();
					} else {
						p.setQtdePassageiros(Integer.parseInt(qtdePassageirosPasseio.getText()));
						p.setMarca(marcaPasseio.getText());
						p.setModelo(modeloPasseio.getText());
						p.setCor(corPasseio.getText());
						p.setQtdeRodas(Integer.parseInt(qtdeRodasPasseio.getText()));							
						p.setVelocMax(Integer.parseInt(velocMaximaPasseio.getText()));
						
						try {
							if (p.getVelocMax() < 80 || p.getVelocMax() > 110) {
								throw new VelocException();
							}
						} catch (VelocException ve) {
							p.setVelocMax(100);
						}						
						
						p.getMotor().setQtdePist(Integer.parseInt(qtdePistoesPasseio.getText()));
						p.getMotor().setPotencia(Integer.parseInt(potenciaPasseio.getText()));

						bd.inserirVeiculoPasseioArray(p);

						JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
						
						limpaCamposCadastroPasseio();
						
						qtdePassageirosPasseio.requestFocusInWindow();
					}
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "Dados informados incorretos. Tente novamente!");

				} catch (VeicExistException v) {
					limpaCamposCadastroPasseio();
				}
			} else {
				JOptionPane.showMessageDialog(null, "Todos os Campos obrigatórios!");
			}
		}
	}

	private class BtConsultarPlacaPasseio implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			Passeio p = new Passeio();

			p.setPlaca(placaPasseio.getText());

			p = localizarPlacaVeiculoPasseio(p);

			if (p != null) {
				qtdePassageirosPasseio.setText(Integer.toString(p.getQtdePassageiros()));
				placaPasseio.setText(p.getPlaca());
				marcaPasseio.setText(p.getMarca());
				modeloPasseio.setText(p.getModelo());
				corPasseio.setText(p.getCor());
				qtdeRodasPasseio.setText(Integer.toString(p.getQtdeRodas()));
				velocMaximaPasseio.setText(Integer.toString(p.calcVel(p.getVelocMax())));
				qtdePistoesPasseio.setText(Integer.toString(p.getMotor().getQtdePist()));
				potenciaPasseio.setText(Integer.toString(p.getMotor().getPotencia()));
			} else {
				JOptionPane.showMessageDialog(null, "Placa não localizada!");

				limpaCamposCadastroPasseio();
				placaPasseio.requestFocus();
			}
		}
	} 
	
	private Passeio localizarPlacaVeiculoPasseio(Passeio p2) {
		
		bd.populaArrayVeiculo();

		for (Passeio p : bd.getBDPass()) {
			if (p != null) {
				if (p.getPlaca().equals(p2.getPlaca())) {
					return p;
				}
			}
		}

		return null;
	}
	
	private class BtExcluirPlacaPasseio implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			Passeio p = new Passeio();

			p.setPlaca(placaPasseio.getText());

			p = localizarPlacaVeiculoPasseio(p);

			if (p != null) {
				bd.excluirVeiculoPasseioArray(p);

				JOptionPane.showMessageDialog(null, "Excluído com sucesso!");

				limpaCamposCadastroPasseio();
			}
		}
	}

	private class BtImprimirTodosPasseio implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if (tablePasseio.getModel().getRowCount() > 0) {
				while (tablePasseio.getModel().getRowCount() > 0) {					
					((DefaultTableModel) tablePasseio.getModel()).removeRow(0);
				}
			}
			
			bd.populaArrayVeiculo();

			if (bd.getBDPass().size() > 0) {
				for (Passeio p : bd.getBDPass()) {
					Object[] dados = {p.getPlaca(), p.getMarca(), 
							p.getModelo(), p.getCor(), p.getQtdeRodas(), 
							p.calcVel(p.getVelocMax()), 
							p.getMotor().getQtdePist(), 
							p.getMotor().getPotencia(), p.getQtdePassageiros()};

					modelPasseio.addRow(dados);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Sem dados cadastrados!");
			}		
		}
	}

	private class BtExcluirTodosPasseio implements ActionListener {
		public void actionPerformed(ActionEvent e) {			
			
			if (tablePasseio.getModel().getRowCount() > 0) {
				while (tablePasseio.getModel().getRowCount() > 0) {					
					((DefaultTableModel) tablePasseio.getModel()).removeRow(0);
				}
				
				bd.excluirTodosVeiculoPasseio();
				
				JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "Sem dados para excluir!!");
			}			
		}
	}

	private boolean validaCamposCadastroPasseio() {
		if (placaPasseio.getText().equals("") || qtdePassageirosPasseio.getText().equals("") || marcaPasseio.getText().equals("")
				|| modeloPasseio.getText().equals("") || qtdeRodasPasseio.getText().equals("") || velocMaximaPasseio.getText().equals("")
				|| qtdePistoesPasseio.getText().equals("") || potenciaPasseio.getText().equals("")) {
			return false;
		}

		return true;
	}

	private void criaJanelaOperacoesCarga() {
		
		janOperacoesCarga = new JFrame();
		janOperacoesCarga.setBounds(100, 100, 296, 196);
		janOperacoesCarga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janOperacoesCarga.getContentPane().setLayout(null);
		janOperacoesCarga.setLocationRelativeTo(null);
		janOperacoesCarga.setTitle("Veículos de Carga");
		janOperacoesCarga.setVisible(true);

		JButton btnAbrirCadastroCarga = new JButton("");
		btnAbrirCadastroCarga.setBackground(new Color(34, 139, 34));
		btnAbrirCadastroCarga.setBounds(10, 11, 89, 23);
		janOperacoesCarga.getContentPane().add(btnAbrirCadastroCarga);

		JLabel lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setBounds(109, 15, 75, 14);
		janOperacoesCarga.getContentPane().add(lblCadastrar);

		JButton btnConsultarExcluirPlacaCarga = new JButton("");
		btnConsultarExcluirPlacaCarga.setBackground(new Color(34, 139, 34));
		btnConsultarExcluirPlacaCarga.setBounds(10, 45, 89, 23);
		janOperacoesCarga.getContentPane().add(btnConsultarExcluirPlacaCarga);

		JLabel lblConsultarExcluirPlacaCarga = new JLabel("Consultar/Excluir pela Placa");
		lblConsultarExcluirPlacaCarga.setBounds(109, 49, 176, 14);
		janOperacoesCarga.getContentPane().add(lblConsultarExcluirPlacaCarga);

		JButton btImprimirExcluirTodosCarga = new JButton("");
		btImprimirExcluirTodosCarga.setBackground(new Color(34, 139, 34));
		btImprimirExcluirTodosCarga.setBounds(10, 79, 89, 23);
		janOperacoesCarga.getContentPane().add(btImprimirExcluirTodosCarga);

		JLabel lblImprimirExcluirTodosCarga = new JLabel("Imprimir/Excluir Todos");
		lblImprimirExcluirTodosCarga.setBounds(109, 83, 136, 14);
		janOperacoesCarga.getContentPane().add(lblImprimirExcluirTodosCarga);

		JButton btnVoltarTelaInicial = new JButton("");
		btnVoltarTelaInicial.setBackground(new Color(34, 139, 34));
		btnVoltarTelaInicial.setBounds(10, 113, 89, 23);
		janOperacoesCarga.getContentPane().add(btnVoltarTelaInicial);

		JLabel lblVoltarTelaInicial = new JLabel("Sair");
		lblVoltarTelaInicial.setBounds(110, 117, 46, 14);
		janOperacoesCarga.getContentPane().add(lblVoltarTelaInicial);

		btnAbrirCadastroCarga.addActionListener(new BtAbrirJanelaCadastroCarga());
		btnConsultarExcluirPlacaCarga.addActionListener(new BtAbrirJanelaConsultarExcluirCarga());
		btImprimirExcluirTodosCarga.addActionListener(new BtAbrirJanelaImprimirExcluirTodosCarga());
		btnVoltarTelaInicial.addActionListener(new BtAbrirJanelaInicial());
	}

	private void criaJanelaCadastroCarga() {

		janCadastroCarga = new JFrame();
		janCadastroCarga.setBounds(100, 100, 353, 413);
		janCadastroCarga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janCadastroCarga.getContentPane().setLayout(null);
		janCadastroCarga.setVisible(true);
		janCadastroCarga.setTitle("Cadastro de Carga");
		janCadastroCarga.setLocationRelativeTo(null);
		
		JLabel lblTara = new JLabel("Tara:");
		lblTara.setBounds(10, 7, 125, 14);
		janCadastroCarga.getContentPane().add(lblTara);

		taraCarga = new JTextField();
		taraCarga.setBounds(145, 4, 169, 20);
		janCadastroCarga.getContentPane().add(taraCarga);
		taraCarga.setColumns(10);

		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(10, 71, 46, 14);
		janCadastroCarga.getContentPane().add(lblPlaca);

		placaCarga = new JTextField();
		placaCarga.setBounds(145, 68, 169, 20);
		janCadastroCarga.getContentPane().add(placaCarga);
		placaCarga.setColumns(10);

		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 106, 46, 14);
		janCadastroCarga.getContentPane().add(lblMarca);

		marcaCarga = new JTextField();
		marcaCarga.setBounds(145, 103, 169, 20);
		janCadastroCarga.getContentPane().add(marcaCarga);
		marcaCarga.setColumns(10);

		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(10, 141, 46, 14);
		janCadastroCarga.getContentPane().add(lblModelo);

		modeloCarga = new JTextField();
		modeloCarga.setBounds(145, 138, 169, 20);
		janCadastroCarga.getContentPane().add(modeloCarga);
		modeloCarga.setColumns(10);

		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(10, 176, 46, 14);
		janCadastroCarga.getContentPane().add(lblCor);

		corCarga = new JTextField();
		corCarga.setBounds(145, 173, 169, 20);
		janCadastroCarga.getContentPane().add(corCarga);
		corCarga.setColumns(10);

		JLabel lblQtdeRodas = new JLabel("Qtde Rodas:");
		lblQtdeRodas.setBounds(10, 211, 125, 14);
		janCadastroCarga.getContentPane().add(lblQtdeRodas);

		qtdeRodasCarga = new JTextField();
		qtdeRodasCarga.setBounds(145, 208, 169, 20);
		janCadastroCarga.getContentPane().add(qtdeRodasCarga);
		qtdeRodasCarga.setColumns(10);

		JLabel lblVelocMaxima = new JLabel("Veloc M\u00E1xima:");
		lblVelocMaxima.setBounds(10, 246, 114, 14);
		janCadastroCarga.getContentPane().add(lblVelocMaxima);

		velocMaximaCarga = new JTextField();
		velocMaximaCarga.setBounds(145, 243, 169, 20);
		janCadastroCarga.getContentPane().add(velocMaximaCarga);
		velocMaximaCarga.setColumns(10);

		JLabel lblQtdePistoes = new JLabel("Qtde Pist\u00F5es:");
		lblQtdePistoes.setBounds(10, 281, 125, 14);
		janCadastroCarga.getContentPane().add(lblQtdePistoes);

		qtdePistoesCarga = new JTextField();
		qtdePistoesCarga.setBounds(145, 278, 169, 20);
		janCadastroCarga.getContentPane().add(qtdePistoesCarga);
		qtdePistoesCarga.setColumns(10);

		JLabel lblPotencia = new JLabel("Pot\u00EAncia:");
		lblPotencia.setBounds(10, 316, 101, 14);
		janCadastroCarga.getContentPane().add(lblPotencia);

		potenciaCarga = new JTextField();
		potenciaCarga.setBounds(145, 313, 169, 20);
		janCadastroCarga.getContentPane().add(potenciaCarga);
		potenciaCarga.setColumns(10);

		JButton btCadastrarCarga = new JButton("Cadastrar");
		btCadastrarCarga.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btCadastrarCarga.setBounds(10, 339, 81, 23);
		janCadastroCarga.getContentPane().add(btCadastrarCarga);

		JButton btLimparCarga = new JButton("Limpar");
		btLimparCarga.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btLimparCarga.setBounds(101, 339, 69, 23);
		janCadastroCarga.getContentPane().add(btLimparCarga);

		JButton btNovoCarga = new JButton("Novo");
		btNovoCarga.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btNovoCarga.setBounds(180, 339, 69, 23);
		janCadastroCarga.getContentPane().add(btNovoCarga);

		JButton btVoltarTelaOperacoesCarga = new JButton("Sair");
		btVoltarTelaOperacoesCarga.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btVoltarTelaOperacoesCarga.setBounds(260, 339, 54, 23);
		janCadastroCarga.getContentPane().add(btVoltarTelaOperacoesCarga);
		
		JLabel lblCargaMax = new JLabel("Carga M\u00E1xima:");
		lblCargaMax.setBounds(10, 36, 114, 14);
		janCadastroCarga.getContentPane().add(lblCargaMax);
		
		cargaMaximaCarga = new JTextField();
		cargaMaximaCarga.setBounds(145, 33, 169, 20);
		janCadastroCarga.getContentPane().add(cargaMaximaCarga);
		cargaMaximaCarga.setColumns(10);

		btVoltarTelaOperacoesCarga.addActionListener(new BtAbrirJanelaOperacoesCarga());
		btCadastrarCarga.addActionListener(new BtCadastrarCarga());
		btLimparCarga.addActionListener(new BtLimparCamposCadastroCarga());
	}

	private void criaJanelaConsultaExcluiCarga() {

		janConsultaExcluiCarga = new JFrame();
		janConsultaExcluiCarga.setBounds(100, 100, 353, 405);
		janConsultaExcluiCarga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janConsultaExcluiCarga.getContentPane().setLayout(null);
		janConsultaExcluiCarga.setVisible(true);
		janConsultaExcluiCarga.setTitle("Consultar/Excluir pela placa");
		janConsultaExcluiCarga.setLocationRelativeTo(null);

		JLabel lblTara = new JLabel("Tara:");
		lblTara.setBounds(10, 71, 125, 14);
		janConsultaExcluiCarga.getContentPane().add(lblTara);

		taraCarga = new JTextField();
		taraCarga.setBounds(145, 68, 169, 20);
		janConsultaExcluiCarga.getContentPane().add(taraCarga);
		taraCarga.setColumns(10);

		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(10, 7, 46, 14);
		janConsultaExcluiCarga.getContentPane().add(lblPlaca);

		placaCarga = new JTextField();
		placaCarga.setBounds(145, 4, 169, 20);
		janConsultaExcluiCarga.getContentPane().add(placaCarga);
		placaCarga.setColumns(10);

		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 106, 46, 14);
		janConsultaExcluiCarga.getContentPane().add(lblMarca);

		marcaCarga = new JTextField();
		marcaCarga.setBounds(145, 103, 169, 20);
		janConsultaExcluiCarga.getContentPane().add(marcaCarga);
		marcaCarga.setColumns(10);

		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(10, 141, 46, 14);
		janConsultaExcluiCarga.getContentPane().add(lblModelo);

		modeloCarga = new JTextField();
		modeloCarga.setBounds(145, 138, 169, 20);
		janConsultaExcluiCarga.getContentPane().add(modeloCarga);
		modeloCarga.setColumns(10);

		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(10, 176, 46, 14);
		janConsultaExcluiCarga.getContentPane().add(lblCor);

		corCarga = new JTextField();
		corCarga.setBounds(145, 173, 169, 20);
		janConsultaExcluiCarga.getContentPane().add(corCarga);
		corCarga.setColumns(10);

		JLabel lblQtdeRodas = new JLabel("Qtde Rodas:");
		lblQtdeRodas.setBounds(10, 211, 125, 14);
		janConsultaExcluiCarga.getContentPane().add(lblQtdeRodas);

		qtdeRodasCarga = new JTextField();
		qtdeRodasCarga.setBounds(145, 208, 169, 20);
		janConsultaExcluiCarga.getContentPane().add(qtdeRodasCarga);
		qtdeRodasCarga.setColumns(10);

		JLabel lblVelocMaxima = new JLabel("Veloc M\u00E1xima:");
		lblVelocMaxima.setBounds(10, 246, 114, 14);
		janConsultaExcluiCarga.getContentPane().add(lblVelocMaxima);

		velocMaximaCarga = new JTextField();
		velocMaximaCarga.setBounds(145, 243, 169, 20);
		janConsultaExcluiCarga.getContentPane().add(velocMaximaCarga);
		velocMaximaCarga.setColumns(10);

		JLabel lblQtdePistoes = new JLabel("Qtde Pist\u00F5es:");
		lblQtdePistoes.setBounds(10, 281, 125, 14);
		janConsultaExcluiCarga.getContentPane().add(lblQtdePistoes);

		qtdePistoesCarga = new JTextField();
		qtdePistoesCarga.setBounds(145, 278, 169, 20);
		janConsultaExcluiCarga.getContentPane().add(qtdePistoesCarga);
		qtdePistoesCarga.setColumns(10);

		JLabel lblPotencia = new JLabel("Pot\u00EAncia:");
		lblPotencia.setBounds(10, 316, 101, 14);
		janConsultaExcluiCarga.getContentPane().add(lblPotencia);

		potenciaCarga = new JTextField();
		potenciaCarga.setBounds(145, 313, 169, 20);
		janConsultaExcluiCarga.getContentPane().add(potenciaCarga);
		potenciaCarga.setColumns(10);

		JButton btConsultarCarga = new JButton("Consultar");
		btConsultarCarga.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btConsultarCarga.setBounds(90, 339, 81, 23);
		janConsultaExcluiCarga.getContentPane().add(btConsultarCarga);

		JButton btExcluirCarga = new JButton("Excluir");
		btExcluirCarga.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btExcluirCarga.setBounds(181, 339, 69, 23);
		janConsultaExcluiCarga.getContentPane().add(btExcluirCarga);

		JButton btVoltarTelaOperacoesCarga = new JButton("Sair");
		btVoltarTelaOperacoesCarga.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btVoltarTelaOperacoesCarga.setBounds(260, 339, 54, 23);
		janConsultaExcluiCarga.getContentPane().add(btVoltarTelaOperacoesCarga);
		
		JLabel lblCargaMax = new JLabel("Carga M\u00E1xima:");
		lblCargaMax.setBounds(10, 36, 114, 14);
		janConsultaExcluiCarga.getContentPane().add(lblCargaMax);
		
		cargaMaximaCarga = new JTextField();
		cargaMaximaCarga.setBounds(145, 33, 169, 20);
		janConsultaExcluiCarga.getContentPane().add(cargaMaximaCarga);
		cargaMaximaCarga.setColumns(10);
		
		taraCarga.setEnabled(false);
		marcaCarga.setEnabled(false);
		modeloCarga.setEnabled(false);
		corCarga.setEnabled(false);
		qtdeRodasCarga.setEnabled(false);
		velocMaximaCarga.setEnabled(false);
		qtdePistoesCarga.setEnabled(false);
		potenciaCarga.setEnabled(false);
		cargaMaximaCarga.setEnabled(false);

		btVoltarTelaOperacoesCarga.addActionListener(new BtAbrirJanelaOperacoesCarga());
		btConsultarCarga.addActionListener(new BtConsultarPlacaCarga());
		btExcluirCarga.addActionListener(new BtExcluirPlacaCarga());
	}

	private void criaJanelaImpressaoExclusaoTodosCarga() {

		janImpressaoExclusaoTodosCarga = new JFrame();
		janImpressaoExclusaoTodosCarga.setBounds(100, 100, 730, 396);
		janImpressaoExclusaoTodosCarga.getContentPane().setLayout(null);
		janImpressaoExclusaoTodosCarga.setVisible(true);
		janImpressaoExclusaoTodosCarga.setLocationRelativeTo(null);
		janImpressaoExclusaoTodosCarga.setTitle("Imprimir / Excluir Todos	");
		janImpressaoExclusaoTodosCarga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 694, 296);
		janImpressaoExclusaoTodosCarga.getContentPane().add(scrollPane);

		modelCarga = new DefaultTableModel();
		
		modelCarga.addColumn("Placa");
		modelCarga.addColumn("Marca");
		modelCarga.addColumn("Modelo");
		modelCarga.addColumn("Cor");
		modelCarga.addColumn("Qtde Rodas");
		modelCarga.addColumn("Veloc Máx");
		modelCarga.addColumn("Qtde Pist");
		modelCarga.addColumn("Potência");
		modelCarga.addColumn("Tara");
		modelCarga.addColumn("Carga Máx");

		tableCarga = new JTable(modelCarga);		

		scrollPane.setViewportView(tableCarga);

		JButton btVoltarTelaOperacoesCarga = new JButton("Sair");
		btVoltarTelaOperacoesCarga.setBounds(615, 318, 89, 23);
		janImpressaoExclusaoTodosCarga.getContentPane().add(btVoltarTelaOperacoesCarga);

		JButton btImprimirTodos = new JButton("Imprimir Todos");
		btImprimirTodos.setBounds(318, 318, 139, 23);
		janImpressaoExclusaoTodosCarga.getContentPane().add(btImprimirTodos);

		JButton btExcluirTodos = new JButton("Excluir Todos");
		btExcluirTodos.setBounds(466, 318, 139, 23);
		janImpressaoExclusaoTodosCarga.getContentPane().add(btExcluirTodos);

		btVoltarTelaOperacoesCarga.addActionListener(new BtAbrirJanelaOperacoesCarga());
		btImprimirTodos.addActionListener(new BtImprimirTodosCarga());
		btExcluirTodos.addActionListener(new BtExcluirTodosCarga());
	}
	
	private void limpaCamposCadastroCarga() {
		taraCarga.setText("");
		marcaCarga.setText("");
		modeloCarga.setText("");
		corCarga.setText("");
		qtdeRodasCarga.setText("");
		velocMaximaCarga.setText("");
		qtdePistoesCarga.setText("");
		potenciaCarga.setText("");
		placaCarga.setText("");
		cargaMaximaCarga.setText("");
	}

	private class BtAbrirJanelaOperacoesCarga implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			janelaPrincipal.dispose();
			janCadastroCarga.dispose();
			janConsultaExcluiCarga.dispose();
			janImpressaoExclusaoTodosCarga.dispose();

			criaJanelaOperacoesCarga();
		}
	}

	private class BtAbrirJanelaCadastroCarga implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			janOperacoesCarga.dispose();

			criaJanelaCadastroCarga();
		}
	}

	private class BtAbrirJanelaConsultarExcluirCarga implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			janOperacoesCarga.dispose();

			criaJanelaConsultaExcluiCarga();
		}
	}	

	private class BtAbrirJanelaImprimirExcluirTodosCarga implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			janOperacoesCarga.dispose();

			criaJanelaImpressaoExclusaoTodosCarga();
		}
	}

	private class BtLimparCamposCadastroCarga implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			limpaCamposCadastroCarga();
		}
	}

	private class BtCadastrarCarga implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (validaCamposCadastroCarga()) {

				Carga c = new Carga();

				c.setPlaca(placaCarga.getText());

				try {
					if (bd.placaExistenteCarga(c)) {
						throw new VeicExistException();
					} else {
						c.setTara(Integer.parseInt(taraCarga.getText()));
						c.setCargMax(Integer.parseInt(cargaMaximaCarga.getText()));
						c.setMarca(marcaCarga.getText());
						c.setModelo(modeloCarga.getText());
						c.setCor(corCarga.getText());
						c.setQtdeRodas(Integer.parseInt(qtdeRodasCarga.getText()));							
						c.setVelocMax(Integer.parseInt(velocMaximaCarga.getText()));
						
						try {
							if (c.getVelocMax() < 80 || c.getVelocMax() > 110) {
								throw new VelocException();
							}
						} catch (VelocException ve) {
							c.setVelocMax(90);
						}						
						
						c.getMotor().setQtdePist(Integer.parseInt(qtdePistoesCarga.getText()));
						c.getMotor().setPotencia(Integer.parseInt(potenciaCarga.getText()));

						bd.inserirVeiculoCargaArray(c);

						JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
						
						limpaCamposCadastroCarga();
						
						taraCarga.requestFocusInWindow();
					}
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "Dados informados incorretos. Tente novamente!");

				} catch (VeicExistException v) {
					limpaCamposCadastroCarga();
				}
			} else {
				JOptionPane.showMessageDialog(null, "Todos os Campos obrigatórios!");
			}
		}
	}

	private class BtConsultarPlacaCarga implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			Carga c = new Carga();

			c.setPlaca(placaCarga.getText());

			c = localizarPlacaVeiculoCarga(c);

			if (c != null) {
				taraCarga.setText(Integer.toString(c.getTara()));
				cargaMaximaCarga.setText(Integer.toString(c.getCargMax()));
				placaCarga.setText(c.getPlaca());
				marcaCarga.setText(c.getMarca());
				modeloCarga.setText(c.getModelo());
				corCarga.setText(c.getCor());
				qtdeRodasCarga.setText(Integer.toString(c.getQtdeRodas()));
				velocMaximaCarga.setText(Integer.toString(c.calcVel(c.getVelocMax())));
				qtdePistoesCarga.setText(Integer.toString(c.getMotor().getQtdePist()));
				potenciaCarga.setText(Integer.toString(c.getMotor().getPotencia()));
			} else {
				JOptionPane.showMessageDialog(null, "Placa não localizada!");

				limpaCamposCadastroCarga();
			}
		}
	}

	private Carga localizarPlacaVeiculoCarga(Carga c2) {
		
		bd.populaArrayCarga();

		for (Carga c : bd.getBDCarg()) {
			if (c != null) {
				if (c.getPlaca().equals(c2.getPlaca())) {
					return c;
				}
			}
		}

		return null;
	}

	private class BtExcluirPlacaCarga implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			Carga c = new Carga();

			c.setPlaca(placaCarga.getText());

			c = localizarPlacaVeiculoCarga(c);

			if (c != null) {
				bd.excluirVeiculoCargaArray(c);

				JOptionPane.showMessageDialog(null, "Excluído com sucesso!");

				limpaCamposCadastroCarga();
			}
		}
	}

	private class BtImprimirTodosCarga implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if (tableCarga.getModel().getRowCount() > 0) {
				while (tableCarga.getModel().getRowCount() > 0) {					
					((DefaultTableModel) tableCarga.getModel()).removeRow(0);
				}
			}
			
			bd.populaArrayCarga();

			if (bd.getBDCarg().size() > 0) {
				for (Carga c : bd.getBDCarg()) {
					Object[] dados = { c.getPlaca(), c.getMarca(), c.getModelo(), 
							c.getCor(), c.getQtdeRodas(), c.calcVel(c.getVelocMax()),
							c.getMotor().getQtdePist(), c.getMotor().getPotencia(), 
							c.getTara(), c.getCargMax() };

					modelCarga.addRow(dados);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Sem dados cadastrados!");
			}		
		}
	}

	private class BtExcluirTodosCarga implements ActionListener {		
		public void actionPerformed(ActionEvent e) {		
			
			if (tableCarga.getModel().getRowCount() > 0) {
				while (tableCarga.getModel().getRowCount() > 0) {					
					((DefaultTableModel) tableCarga.getModel()).removeRow(0);
				}
				
				bd.excluirTodosVeiculoCarga();
				
				JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "Sem dados para excluir!");
			}			
		}
	}

	private boolean validaCamposCadastroCarga() {
		if (placaCarga.getText().equals("") || taraCarga.getText().equals("") || marcaCarga.getText().equals("")
				|| modeloCarga.getText().equals("") || qtdeRodasCarga.getText().equals("") || velocMaximaCarga.getText().equals("")
				|| qtdePistoesCarga.getText().equals("") || potenciaCarga.getText().equals("")
				|| cargaMaximaCarga.getText().equals("")) {
			return false;
		}

		return true;
	}
}
