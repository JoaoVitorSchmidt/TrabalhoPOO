/**
 * @author Gabriel de Souza Borba e João Vitor Schmidt
 */

package ativPOO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JToolBar;

public class apresentacao {

	private JFrame frame;
	private JTextField txtNmUser;
	private JTextField txtEndereco;
	
	ArrayList<Linhas> agenda = new ArrayList<Linhas>();
	private JTextField txtRamo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					apresentacao window = new apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws ParseException 
	 */
	public apresentacao() throws ParseException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		
		frame = new JFrame();
		frame.setBounds(0, -39, 600, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtNmUser = new JTextField();
		txtNmUser.setBounds(148, 44, 138, 20);
		txtNmUser.setColumns(10);
		frame.getContentPane().add(txtNmUser);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(148, 106, 138, 20);
		txtEndereco.setColumns(10);
		frame.getContentPane().add(txtEndereco);
		
		JLabel lblFaturamento = new JLabel("Mensagem");
		lblFaturamento.setBounds(327, 320, 220, 14);
		frame.getContentPane().add(lblFaturamento);
		lblFaturamento.setVisible(false);
		
		JLabel labelNome = new JLabel("Nome do Usuário");
		labelNome.setBounds(15, 44, 105, 14);
		frame.getContentPane().add(labelNome);
		
		JLabel lblNmeroDoTelefone = new JLabel("Número do Telefone");
		lblNmeroDoTelefone.setBounds(15, 75, 115, 14);
		frame.getContentPane().add(lblNmeroDoTelefone);
		
		JLabel lblEndereo = new JLabel("Endereço c/ Cidade");
		lblEndereo.setBounds(15, 106, 128, 14);
		frame.getContentPane().add(lblEndereo);
		
		JLabel lblDataDeInstalao = new JLabel("Data de Instalação");
		lblDataDeInstalao.setBounds(15, 137, 115, 14);
		frame.getContentPane().add(lblDataDeInstalao);
		
		JLabel lblConexao = new JLabel("Conexão Internet");
		lblConexao.setBounds(310, 76, 115, 14);
		frame.getContentPane().add(lblConexao);
		
		JLabel lblTipoDeLinha = new JLabel("Tipo de Linha");
		lblTipoDeLinha.setBounds(310, 48, 82, 14);
		frame.getContentPane().add(lblTipoDeLinha);
		
		JLabel lblCadastrarUmTelefone = new JLabel("Cadastrar um Telefone");
		lblCadastrarUmTelefone.setBounds(215, 11, 138, 14);
		frame.getContentPane().add(lblCadastrarUmTelefone);
		
		JFormattedTextField txtNumFone = new JFormattedTextField(new MaskFormatter("(##) ####-####"));
		txtNumFone.setBounds(148, 75, 138, 19);
		frame.getContentPane().add(txtNumFone);
		
		JFormattedTextField txtNumFoneConsult = new JFormattedTextField(new MaskFormatter("(##) ####-####"));
		txtNumFoneConsult.setBounds(148, 317, 138, 19);
		frame.getContentPane().add(txtNumFoneConsult);
		
		JFormattedTextField txtDataInstall = new JFormattedTextField(new MaskFormatter("##/##/####"));
		txtDataInstall.setBounds(148, 137, 138, 19);
		txtDataInstall.setToolTipText("");
		frame.getContentPane().add(txtDataInstall);
		
		JLabel lblNmeroDoTelefone_1 = new JLabel("Número do Telefone");
		lblNmeroDoTelefone_1.setBounds(10, 320, 115, 14);
		frame.getContentPane().add(lblNmeroDoTelefone_1);
		
		JLabel lblConsultarUmTelefone = new JLabel("Consultar os dados de um Telefone");
		lblConsultarUmTelefone.setBounds(85, 278, 201, 28);
		frame.getContentPane().add(lblConsultarUmTelefone);
		
		JLabel lblQntdOcorrncias = new JLabel("Qntd Ocorrências");
		lblQntdOcorrncias.setBounds(310, 140, 105, 14);
		frame.getContentPane().add(lblQntdOcorrncias);
		lblQntdOcorrncias.setVisible(false);
		
		JFormattedTextField txtQntdOcorrencias = new JFormattedTextField(new MaskFormatter("###########").getPlaceholder());
		txtQntdOcorrencias.setBounds(442, 137, 105, 19);
		frame.getContentPane().add(txtQntdOcorrencias);
		txtQntdOcorrencias.setVisible(false);
		
		JLabel lblConsultFatu = new JLabel("Consulta Faturamento da Empresa");
		lblConsultFatu.setBounds(355, 278, 201, 28);
		frame.getContentPane().add(lblConsultFatu);
		
		txtRamo = new JTextField();
		txtRamo.setBounds(442, 105, 105, 20);
		txtRamo.setColumns(10);
		frame.getContentPane().add(txtRamo);
		txtRamo.setVisible(false);
		
		JLabel lblRamoDeAtividades = new JLabel("Ramo de Atividades");
		lblRamoDeAtividades.setBounds(310, 109, 138, 14);
		frame.getContentPane().add(lblRamoDeAtividades);
		lblRamoDeAtividades.setVisible(false);
		
		JComboBox<String> comboBoxInter = new JComboBox<String>();
		comboBoxInter.setBounds(442, 72, 105, 20);
		frame.getContentPane().add(comboBoxInter);
		comboBoxInter.addItem("Sim");
		comboBoxInter.addItem("Não");
		
		
		JComboBox<String> comboBoxLinhas = new JComboBox<String>();
		comboBoxLinhas.setBounds(442, 44, 105, 20);
		frame.getContentPane().add(comboBoxLinhas);
		comboBoxLinhas.addItem("Residencial");
		comboBoxLinhas.addItem("Comercial");
		comboBoxLinhas.addItem("Especializada");
		
		comboBoxLinhas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxLinhas.getSelectedItem().equals("Especializada")) {
					
					lblQntdOcorrncias.setVisible(true);
					txtQntdOcorrencias.setVisible(true);
					
				}else {
					
					lblQntdOcorrncias.setVisible(false);
					txtQntdOcorrencias.setVisible(false);
					
				}
					
				if(comboBoxLinhas.getSelectedItem().equals("Residencial")){
					
					lblConexao.setVisible(true);
					comboBoxInter.setVisible(true);
					
				}else {
					
					lblConexao.setVisible(false);
					comboBoxInter.setVisible(false);
					
				}
				
				if(comboBoxLinhas.getSelectedItem().equals("Comercial")){
				
					lblRamoDeAtividades.setVisible(true);
					txtRamo.setVisible(true);
				
				}else {
					
					lblRamoDeAtividades.setVisible(false);
					txtRamo.setVisible(false);
					
				}
			}
		});
		
		JButton btnAdc = new JButton("Adicionar Telefone");
		btnAdc.setBounds(202, 165, 151, 23);
		btnAdc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Linhas lin;
				
				if(txtQntdOcorrencias.getText().isBlank() && comboBoxLinhas.getSelectedItem().equals("Especializada")) {
					
					JOptionPane.showMessageDialog(null, "Digite alguma ocorrência!", "Erro", JOptionPane.ERROR_MESSAGE);
					
					throw new NullPointerException();
					
				}else if(txtRamo.getText().isBlank() && comboBoxLinhas.getSelectedItem().equals("Comercial")){
					
					JOptionPane.showMessageDialog(null, "Digite algum Ramo!", "Erro", JOptionPane.ERROR_MESSAGE);
					
					throw new NullPointerException();
					
				}
				
				try {
					
					lin = new Linhas(txtNumFone.getText(), txtNmUser.getText(), txtDataInstall.getText(), txtEndereco.getText(), comboBoxLinhas.getSelectedItem().toString());
					
					if(comboBoxLinhas.getSelectedItem().equals("Especializada")) {
						
						lin.setQntdOco(Integer.parseInt(txtQntdOcorrencias.getText()));
						
					}else if(comboBoxLinhas.getSelectedItem().equals("Residencial")) {
						
						lin.setInternet(comboBoxInter.getSelectedItem().toString());
						
					}else {
						
						lin.setRamo(txtRamo.getText());
						
					}
					
					
					agenda.add(lin);
					
					JOptionPane.showMessageDialog(btnAdc, "Número cadastrado com sucesso!");
					
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(btnAdc, "");
				}
			}
		});
		frame.getContentPane().add(btnAdc);
		
		JButton btnConsultarDados = new JButton("Consultar Dados");
		btnConsultarDados.setBounds(148, 347, 138, 23);
		btnConsultarDados.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				
				for(Linhas lin : agenda) {
					if(lin.getNumFone().equals(txtNumFoneConsult.getText())) {
						
						if(lin.getTipoLinha().equals("Especializada")) {

							JOptionPane.showMessageDialog(btnConsultarDados, "Número do Fone: " + lin.getNumFone() +"\nNome do Usuário: " + lin.getNmUser() + 
														 					 "\nTipo de Linha: " + lin.getTipoLinha() + "\nData de Instalação: " + lin.getDataInstall() + 
														 					 "\nEndereço: " + lin.getEndereco() + "\nQntd Ocorrências: " + lin.getQntdOco() + "\nValor Básico a pagar: R$" + valorLinha(lin.getTipoLinha(), lin.getQntdOco()));
						}else if(lin.getTipoLinha().equals("Comercial")){
							
							JOptionPane.showMessageDialog(btnConsultarDados, "Número do Fone: " + lin.getNumFone() +"\nNome do Usuário: " + lin.getNmUser() + 
				 					 "\nTipo de Linha: " + lin.getTipoLinha() + "\nData de Instalação: " + lin.getDataInstall() + 
				 					 "\nEndereço: " + lin.getEndereco() + "\nRamo de Atividade: " + lin.getRamo()+ "\nValor Básico a pagar: R$" + valorLinha(lin.getTipoLinha(), lin.getQntdOco()));
						
						}else if(lin.getTipoLinha().equals("Residencial")){
							
							JOptionPane.showMessageDialog(btnConsultarDados, "Número do Fone: " + lin.getNumFone() +"\nNome do Usuário: " + lin.getNmUser() + 
				 					 "\nTipo de Linha: " + lin.getTipoLinha() + "\nData de Instalação: " + lin.getDataInstall() + 
				 					 "\nEndereço: " + lin.getEndereco() + "\nPossuí Internet: " + lin.getInternet()+ "\nValor Básico a pagar: R$" + valorLinha(lin.getTipoLinha(), lin.getQntdOco()));
						
						}else if(txtNumFoneConsult.getText().isBlank() || txtNumFoneConsult.getText().isEmpty()) {
							
							JOptionPane.showMessageDialog(btnConsultarDados, "Favor digitar um número para ser consultado!");
							
						}else {
							
							JOptionPane.showMessageDialog(btnConsultarDados, "Favor digitar um número válido!");
							
						}
					}
				}
			
			}
		});
		frame.getContentPane().add(btnConsultarDados);
		
		JButton btnFaturamento = new JButton("Consultar Faturamento");
		btnFaturamento.setBounds(355, 345, 169, 23);
		btnFaturamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double faturamento = 0;
				
				for(Linhas lin : agenda) {
					
					faturamento += valorLinha(lin.getTipoLinha(), lin.getQntdOco());
					
				}
				
				lblFaturamento.setText("O Potencial Faturamento da Empresa é de: R$" + faturamento);
				lblFaturamento.setVisible(true);
				
			}
		});
		frame.getContentPane().add(btnFaturamento);
	}
	
	public double valorLinha(String s, Integer i) {
		
		double v;
		
		switch (s) {
		case "Residencial":
			v = 15.00;
		break;
		
		case "Comercial":
			v = 25.00;
		break;
		
		default:
			
			if(i <= 1000) {
				v =  50.00;
			}else if(i <= 5000) {
				v =  67.80;
			}else if(i <= 10000) {
				v =  98.50;
			}else if(i <= 50000) {
				v =  123.90;
			}else {
				v =  187.82;
			}
			
		break;
		}
		
		return v;
	}
}
