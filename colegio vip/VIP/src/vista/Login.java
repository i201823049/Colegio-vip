package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.border.LineBorder;

import sun.security.krb5.internal.LoginOptions;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Panel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel lblNewLabel_1;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/img/3986707-building-education-school-school-icon_112987.png")));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new Panel();
		panel.setBounds(0, 0, 884, 661);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(0, 0, 562, 661);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/img/login1.jpg")));
		lblNewLabel.setBounds(0, 0, 562, 661);
		panel_1.add(lblNewLabel);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(562, 0, 322, 661);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/img/3986707-building-education-school-school-icon_112987 (1).png")));
		label.setBounds(34, 80, 256, 271);
		panel_2.add(label);
		
		lblNewLabel_1 = new JLabel("Inicio de Sesi\u00F3n:");
		lblNewLabel_1.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(34, 374, 246, 35);
		panel_2.add(lblNewLabel_1);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Login.class.getResource("/ico/usuario (3).png")));
		label_1.setBounds(64, 434, 32, 35);
		panel_2.add(label_1);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Login.class.getResource("/ico/usuario.png")));
		label_2.setBounds(64, 485, 32, 35);
		panel_2.add(label_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(106, 444, 152, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(106, 498, 152, 20);
		panel_2.add(passwordField);
		
		btnNewButton = new JButton("Iniciar Sesi\u00F3n");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(85, 540, 160, 29);
		panel_2.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.setBounds(111, 581, 107, 23);
		panel_2.add(btnNewButton_1);
		
		this.setLocationRelativeTo(null);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		
		Login frame = new Login();
		this.dispose();

		Home dialog = new Home();
		dialog.setVisible(true);
		
		JOptionPane.showMessageDialog(contentPane,"Bienvenido");
		

		
		
		
	}
}
