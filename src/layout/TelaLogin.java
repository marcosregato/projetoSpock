package layout;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TelaLogin {

	private JFrame frame;
	private JTextField loginTxt;
	private JTextField senhaTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("InternalFrame.border"));
		panel.setBounds(180, 106, 339, 209);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		loginTxt = new JTextField();
		loginTxt.setBounds(108, 55, 114, 19);
		panel.add(loginTxt);
		loginTxt.setColumns(10);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(140, 36, 70, 15);
		panel.add(lblLogin);

		senhaTxt = new JTextField();
		senhaTxt.setBounds(108, 102, 114, 19);
		panel.add(senhaTxt);
		senhaTxt.setColumns(10);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(140, 86, 70, 15);
		panel.add(lblSenha);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(48, 133, 117, 25);
		panel.add(btnEntrar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(177, 133, 117, 25);
		panel.add(btnCancelar);

		
// ############ ACOES DOS COMPONENTES DA TELA ############ 
		
		btnEntrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (!loginTxt.getText().equals("") & !senhaTxt.getText().equals("")) {
	
				} else {
	
				}
			}
		});

		btnCancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);

			}
		});
	}
}
