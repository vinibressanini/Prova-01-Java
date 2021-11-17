package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ViewInicio extends JFrame {
	
private JPanel contentPane;
	
	Object opcao[] = {"Sim","Não"};

	private void controlaFechamentoTela() {
		System.out.println("Saindo do sistema");
		
		int resultardo = JOptionPane.showOptionDialog(null,"Deseja realmente fechar a tela?","Aviso!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcao,opcao[0]);
		if(resultardo == 0) {
			System.exit(0);
		}
	}
	

	private JPanel contentPane1;
	private JTextField nome;
	private JTextField Idade;
	private JTextField sexo;
	static ViewProximo frame = new ViewProximo();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewInicio frame = new ViewInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	
	public ViewInicio() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				controlaFechamentoTela();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 431, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProva = new JLabel("Prova 01");
		lblProva.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblProva.setBounds(166, 11, 82, 14);
		contentPane.add(lblProva);
		
		JLabel lblNome = new JLabel("Sexo:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNome.setBounds(84, 141, 82, 14);
		contentPane.add(lblNome);
		
		JLabel label = new JLabel("Nome:");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		label.setBounds(84, 93, 82, 14);
		contentPane.add(label);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblIdade.setBounds(84, 189, 60, 14);
		contentPane.add(lblIdade);
		
		nome = new JTextField();
		nome.setBounds(165, 93, 176, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		Idade = new JTextField();
		Idade.setBounds(166, 189, 175, 20);
		contentPane.add(Idade);
		Idade.setColumns(10);
		
		JButton btnNewButton = new JButton("Gravar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[] options = { "Confirmar" };
				JOptionPane.showOptionDialog(null,"Está é a prova do " + nome.getText() + " do sexo " + sexo.getText() + " e que possui " + Idade.getText() + " anos.","Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);;
				if (options == options);
				{
					nome.setText("");
					sexo.setText("");
					Idade.setText("");
				}
			}
		});
		btnNewButton.setBounds(166, 245, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nome.setText("");
				sexo.setText("");
				Idade.setText("");
			}
		});
		btnNewButton_1.setBounds(166, 279, 89, 23);
		contentPane.add(btnNewButton_1);
		
		sexo = new JTextField();
		sexo.setBounds(162, 140, 176, 20);
		contentPane.add(sexo);
		sexo.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Pr\u00F3ximo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(166, 313, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
