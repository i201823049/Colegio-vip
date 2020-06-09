package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class Home extends JDialog implements MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private JLabel label2;
	private JLabel label1;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblNombres;
	private JLabel lblApellidos;
	private JLabel lblCodigo;
	private JLabel lblCategoria;
	private JLabel lblEmail;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNombre;
	private JLabel lblOpcionesDisponibles;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel lblAadirProfesora;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Home dialog = new Home();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Home() {
		setTitle("Home");
		setBounds(100, 100, 1150, 900);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setForeground(new Color(0, 0, 0));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		label2 = new JLabel("");
		label2.setBounds(457, 11, 73, 71);
		label2.addMouseListener(this);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 447, 861);
		panel.setBackground(new Color(241, 93, 45));
		panel.setForeground(Color.BLACK);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("foto");
		lblNewLabel.setBounds(97, 111, 258, 241);
		panel.add(lblNewLabel);
		
		lblNombres = new JLabel("Nombres:");
		lblNombres.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblNombres.setBounds(24, 447, 111, 27);
		panel.add(lblNombres);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblApellidos.setBounds(24, 523, 111, 27);
		panel.add(lblApellidos);
		
		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblCodigo.setBounds(24, 600, 111, 27);
		panel.add(lblCodigo);
		
		lblCategoria = new JLabel("Categoria:");
		lblCategoria.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblCategoria.setBounds(24, 668, 111, 27);
		panel.add(lblCategoria);
		
		lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblEmail.setBounds(24, 737, 111, 27);
		panel.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(144, 448, 234, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 523, 234, 27);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(144, 600, 234, 27);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(144, 676, 234, 27);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(144, 737, 234, 27);
		panel.add(textField_4);
		panel.setVisible(false);
		label2.setIcon(new ImageIcon(Home.class.getResource("/ico/1486506264-hamburger-list-menu-options-bars-stack_81469.png")));
		contentPanel.add(label2);
		
		
				
				
				label2.setVisible(false);
		
		label1 = new JLabel("");
		label1.setBounds(10, 11, 73, 71);
		contentPanel.add(label1);
		label1.addMouseListener(this);
		label1.setIcon(new ImageIcon(Home.class.getResource("/ico/1486506264-hamburger-list-menu-options-bars-stack_81469.png")));
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(61, 59, 59));
		panel_1.setBounds(0, 0, 1134, 861);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBounds(96, 11, 772, 71);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Bienvenido:");
		lblNewLabel_1.setFont(new Font("Georgia", Font.ITALIC, 35));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(10, 11, 217, 49);
		panel_2.add(lblNewLabel_1);
		
		lblNombre = new JLabel("nombre");
		lblNombre.setBounds(207, 25, 521, 26);
		panel_2.add(lblNombre);
		
		lblOpcionesDisponibles = new JLabel("Opciones Disponibles:");
		lblOpcionesDisponibles.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
		lblOpcionesDisponibles.setForeground(new Color(255, 255, 255));
		lblOpcionesDisponibles.setBounds(108, 121, 408, 53);
		panel_1.add(lblOpcionesDisponibles);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Home.class.getResource("/img/busqueda.png")));
		label.setBounds(623, 550, 128, 136);
		panel_1.add(label);
		
		label_1 = new JLabel("Buscar Alumno:");
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(623, 697, 137, 37);
		panel_1.add(label_1);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Home.class.getResource("/img/la-busqueda-de-empleo.png")));
		label_2.setBounds(413, 550, 128, 136);
		panel_1.add(label_2);
		
		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Home.class.getResource("/img/profesor.png")));
		label_3.setBounds(412, 220, 128, 136);
		panel_1.add(label_3);
		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Home.class.getResource("/img/seguidor.png")));
		label_4.setBounds(830, 220, 128, 136);
		panel_1.add(label_4);
		
		label_5 = new JLabel("Buscar Profesor(a):");
		label_5.setForeground(new Color(255, 255, 255));
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(413, 697, 137, 37);
		panel_1.add(label_5);
		
		lblAadirProfesora = new JLabel("A\u00F1adir Profesor(a):");
		lblAadirProfesora.setForeground(new Color(255, 255, 255));
		lblAadirProfesora.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAadirProfesora.setBounds(412, 367, 137, 37);
		panel_1.add(lblAadirProfesora);
		
		label_7 = new JLabel("");
		label_7.addMouseListener(this);
		label_7.setIcon(new ImageIcon(Home.class.getResource("/img/cerrar-sesion.png")));
		label_7.setBounds(831, 550, 128, 136);
		panel_1.add(label_7);
		
		label_8 = new JLabel("Cerrar Sesi\u00F3n");
		label_8.setForeground(new Color(255, 255, 255));
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_8.setBounds(841, 697, 137, 37);
		panel_1.add(label_8);
		
		label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(Home.class.getResource("/img/estudiante.png")));
		label_9.setBounds(225, 220, 128, 136);
		panel_1.add(label_9);
		
		label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(Home.class.getResource("/img/equipo.png")));
		label_10.setBounds(622, 220, 128, 136);
		panel_1.add(label_10);
		
		label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(Home.class.getResource("/img/calendario.png")));
		label_11.setBounds(216, 550, 128, 136);
		panel_1.add(label_11);
		
		label_12 = new JLabel("Ingresar Alumnos:");
		label_12.setForeground(new Color(255, 255, 255));
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_12.setBounds(225, 367, 137, 37);
		panel_1.add(label_12);
		
		label_13 = new JLabel("Crear nuevo");
		label_13.setForeground(new Color(255, 255, 255));
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_13.setBounds(840, 356, 105, 37);
		panel_1.add(label_13);
		
		label_14 = new JLabel("administrador:");
		label_14.setForeground(new Color(255, 255, 255));
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_14.setBounds(830, 378, 137, 37);
		panel_1.add(label_14);
		
		label_15 = new JLabel("Usuarios registrados:");
		label_15.setForeground(new Color(255, 255, 255));
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_15.setBounds(613, 367, 166, 37);
		panel_1.add(label_15);
		
		label_16 = new JLabel("Horario de Clases:");
		label_16.setForeground(new Color(255, 255, 255));
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_16.setBounds(217, 697, 137, 37);
		panel_1.add(label_16);
		this.setLocationRelativeTo(null);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == label_7) {
			mouseClickedLabel_7(e);
		}
		if (e.getSource() == label1) {
			mouseClickedLabel(e);
		}
		if (e.getSource() == label2) {
			mouseClickedLblNewLabel(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLblNewLabel(MouseEvent e) {
		label1.setVisible(true);
		panel.setVisible(false);
		label2.setVisible(false);
		
	}
	protected void mouseClickedLabel(MouseEvent e) {
		label2.setVisible(true);
		panel.setVisible(true);
		label1.setVisible(false);
	}
	protected void mouseClickedLabel_7(MouseEvent e) {
		Login Login=new Login();
		Login.setVisible(true);
		
		
		this.dispose();
		
	}
}
