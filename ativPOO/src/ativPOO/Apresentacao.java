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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Apresentacao {

	private JFrame frame;
	private JTextField txtNmUser;
	private JTextField txtEndereco;

	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	//Lista com as informações de todos os clientes
	ArrayList<Linhas> agenda = new ArrayList<Linhas>();
	private JTextField txtRamo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
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
	public Apresentacao() throws ParseException {
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
		lblFaturamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblFaturamento.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblFaturamento.setBounds(336, 310, 220, 34);
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
		lblConsultFatu.setBounds(346, 278, 210, 28);
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
				
				//Verificando qual linha está selecionada, para permitir ao usuário digitar as informações corretas
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
		
		//O código abaixo está realizando a adição de informações a lista
		
		JButton btnAdc = new JButton("Adicionar Telefone");
		btnAdc.setBounds(202, 165, 151, 23);
		btnAdc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Linhas lin;
				
				//Verificações e retornos de mensagens conforme certos erros
				if(txtQntdOcorrencias.getText().isBlank() && comboBoxLinhas.getSelectedItem().equals("Especializada")) {
					
					JOptionPane.showMessageDialog(null, "Digite alguma ocorrência!", "Erro", JOptionPane.ERROR_MESSAGE);
					
					throw new NullPointerException();
					
				}else if(txtRamo.getText().isBlank() && comboBoxLinhas.getSelectedItem().equals("Comercial")){
					
					JOptionPane.showMessageDialog(null, "Digite algum Ramo!", "Erro", JOptionPane.ERROR_MESSAGE);
					
					throw new NullPointerException();
					
				}
				
				for(Linhas l : agenda) {
					
					if(l.getNumFone().equals(txtNumFone.getText())) {
						
						JOptionPane.showMessageDialog(null, "Esse número ja existe, favor digitar um novo.", "Erro", JOptionPane.ERROR_MESSAGE);
						
						throw new IllegalStateException();
					}
				}
				
				if(txtNmUser.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Favor inserir um nome!.", "Erro", JOptionPane.ERROR_MESSAGE);
					
					throw new IllegalStateException();
				}
				
				if(txtNumFone.getText().replace("(", "").replace(")", "").replace(" ", "").replace("-", "").isBlank()) {
					JOptionPane.showMessageDialog(null, "Favor inserir um telefone!.", "Erro", JOptionPane.ERROR_MESSAGE);
					
					throw new IllegalStateException();
				}
				
				if(txtEndereco.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Favor inserir um endereço!.", "Erro", JOptionPane.ERROR_MESSAGE);
					
					throw new IllegalStateException();
				}
				
				if(txtDataInstall.getText().replace("/", "").isBlank()) {
					JOptionPane.showMessageDialog(null, "Favor inserir uma data!.", "Erro", JOptionPane.ERROR_MESSAGE);
					
					throw new IllegalStateException();
				}
				
				//Adicionando informações a lista, conforme a linha selecionada
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
					
					JOptionPane.showMessageDialog(null, "Erro!", "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		frame.getContentPane().add(btnAdc);
		
		//O código abaixo está consultando os dados referente ao número digitado
		
		JButton btnConsultarDados = new JButton("Consultar Dados");
		btnConsultarDados.setBounds(148, 357, 138, 23);
		btnConsultarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                Boolean existe = false;

				try {
					
					for(Linhas lin : agenda) {
						
					  for (Linhas l : agenda) {
						  
                            if(l.getNumFone().equals(txtNumFoneConsult.getText())){
                            	
                                existe = true;
                            }
                        }
						
						if(lin.getNumFone().equals(txtNumFoneConsult.getText())) {
							
							if(lin.getTipoLinha().equals("Especializada")) {
	
								JOptionPane.showMessageDialog(btnConsultarDados, "Número do Fone: " + lin.getNumFone() +"\nNome do Usuário: " + lin.getNmUser() + 
															 					 "\nTipo de Linha: " + lin.getTipoLinha() + "\nData de Instalação: " + lin.getDataInstall() + 
															 					 "\nEndereço: " + lin.getEndereco() + "\nQntd Ocorrências: " + lin.getQntdOco() + "\nValor Básico a pagar: R$" + valorLinha(lin.getTipoLinha(), lin.getQntdOco(), lin.getDataInstall()));
							}else if(lin.getTipoLinha().equals("Comercial")){
								
								JOptionPane.showMessageDialog(btnConsultarDados, "Número do Fone: " + lin.getNumFone() +"\nNome do Usuário: " + lin.getNmUser() + 
					 					 "\nTipo de Linha: " + lin.getTipoLinha() + "\nData de Instalação: " + lin.getDataInstall() + 
					 					 "\nEndereço: " + lin.getEndereco() + "\nRamo de Atividade: " + lin.getRamo()+ "\nValor Básico a pagar: R$" + valorLinha(lin.getTipoLinha(), lin.getQntdOco(), lin.getDataInstall()));
							
							}else {
								
								JOptionPane.showMessageDialog(btnConsultarDados, "Número do Fone: " + lin.getNumFone() +"\nNome do Usuário: " + lin.getNmUser() + 
					 					 "\nTipo de Linha: " + lin.getTipoLinha() + "\nData de Instalação: " + lin.getDataInstall() + 
					 					 "\nEndereço: " + lin.getEndereco() + "\nPossuí Internet: " + lin.getInternet()+ "\nValor Básico a pagar: R$" + valorLinha(lin.getTipoLinha(), lin.getQntdOco(),lin.getDataInstall() ));
							
							}
						}else if(txtNumFoneConsult.getText().replace("(", "").replace(")", "").replace(" ", "").replace("-", "").isBlank() || txtNumFoneConsult.getText().replace("(", "").replace(")", "").replace(" ", "").replace("-", "").isEmpty()) {
							
							throw new NullPointerException();
						}else if (existe == false) {
							
							throw new IllegalStateException();
						}
					}
					
				} catch(Exception e2){
					
					if(txtNumFoneConsult.getText().replace("(", "").replace(")", "").replace(" ", "").replace("-", "").isBlank() || txtNumFoneConsult.getText().replace("(", "").replace(")", "").replace(" ", "").replace("-", "").isEmpty()) {
						
						JOptionPane.showMessageDialog(null, "Favor digitar um número para ser consultado!", "Erro", JOptionPane.ERROR_MESSAGE);
						
					}else {
						
						JOptionPane.showMessageDialog(btnConsultarDados, "Favor digitar um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
						
					}
				}
			}
		});
		frame.getContentPane().add(btnConsultarDados);
		
		//Este botão está mostrando qual o Potencial Faturamento da empresa, conforme os números já salvos na Lista
		JButton btnFaturamento = new JButton("Consultar Faturamento");
		btnFaturamento.setBounds(362, 355, 169, 23);
		btnFaturamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double faturamento = 0;
					
					for(Linhas lin : agenda) {
						
						faturamento += valorLinha(lin.getTipoLinha(), lin.getQntdOco(), lin.getDataInstall());
						
					}
					
					lblFaturamento.setText("Potencial Faturamento: R$" + faturamento);
					lblFaturamento.setVisible(true);
				}catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, "Erro!", "Erro", JOptionPane.ERROR_MESSAGE);
					
				}
			}
		});
		frame.getContentPane().add(btnFaturamento);
	}

	//Este método está calculando qual o valor do Potencial Faturamento da Empresa
	public double valorLinha(String s, Integer i, String dataIn) throws ParseException{
		
		double v;
		Date data = formato.parse("01/01/2019");
		Date dataRecebida = formato.parse(dataIn);
		
		switch (s) {
		case "Residencial":
			v = 15.00;
		break;
		
		case "Comercial":
			
			if(dataRecebida.before(data)) {
				v = 25.00;
			}else {
				v = 37.50;
			}
			
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