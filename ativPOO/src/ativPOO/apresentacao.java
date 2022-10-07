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
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class apresentacao {

	private JFrame frame;
	private JTextField txtNmUser;
	private JTextField txtEndereco;

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
		frame.setBounds(100, 100, 544, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdc = new JButton("Adicionar Telefone");
		btnAdc.setBounds(140, 203, 128, 23);
		btnAdc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Linhas lin = new Linhas();
				
				lin.setEndereco(txtEndereco.getText());
				lin.setNmUser(txtNmUser.getText());
				lin.setNmUser(txtNmUser.getText());
				
			}
		});
		frame.getContentPane().add(btnAdc);
		
		JComboBox comboBoxLinhas = new JComboBox();
		comboBoxLinhas.setBounds(381, 74, 105, 22);
		frame.getContentPane().add(comboBoxLinhas);
		
		txtNmUser = new JTextField();
		txtNmUser.setBounds(140, 44, 128, 20);
		txtNmUser.setColumns(10);
		frame.getContentPane().add(txtNmUser);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(140, 106, 128, 20);
		txtEndereco.setColumns(10);
		frame.getContentPane().add(txtEndereco);
		
		JComboBox comboBoxInternet = new JComboBox();
		comboBoxInternet.setBounds(140, 168, 69, 22);
		frame.getContentPane().add(comboBoxInternet);
		
		JLabel labelNome = new JLabel("Nome do Usuário");
		labelNome.setBounds(15, 44, 82, 14);
		frame.getContentPane().add(labelNome);
		
		JLabel lblNmeroDoTelefone = new JLabel("Número do Telefone");
		lblNmeroDoTelefone.setBounds(15, 75, 105, 14);
		frame.getContentPane().add(lblNmeroDoTelefone);
		
		JLabel lblEndereo = new JLabel("Endereço com a Cidade");
		lblEndereo.setBounds(15, 106, 93, 14);
		frame.getContentPane().add(lblEndereo);
		
		JLabel lblDataDeInstalao = new JLabel("Data de Instalação");
		lblDataDeInstalao.setBounds(15, 137, 93, 14);
		frame.getContentPane().add(lblDataDeInstalao);
		
		JLabel lblConexo = new JLabel("Conexão Internet");
		lblConexo.setBounds(15, 170, 93, 14);
		frame.getContentPane().add(lblConexo);
		
		JLabel lblTipoDeLinha = new JLabel("Tipo de Linha");
		lblTipoDeLinha.setBounds(302, 78, 69, 14);
		frame.getContentPane().add(lblTipoDeLinha);
		
		JLabel lblCadastrarUmTelefone = new JLabel("Cadastrar um Telefone");
		lblCadastrarUmTelefone.setBounds(195, 11, 110, 14);
		frame.getContentPane().add(lblCadastrarUmTelefone);
		
		JFormattedTextField txtNumFone = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
		txtNumFone.setBounds(140, 75, 128, 19);
		frame.getContentPane().add(txtNumFone);
		
		JFormattedTextField txtDataInstall = new JFormattedTextField(new MaskFormatter("##/##/####"));
		txtDataInstall.setToolTipText("");
		txtDataInstall.setBounds(140, 137, 128, 19);
		frame.getContentPane().add(txtDataInstall);
	}
}
