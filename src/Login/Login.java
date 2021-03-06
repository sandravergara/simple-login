package Login;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Window.Type;

public class Login {

	private JFrame frmLoginSystem;
	private JTextField txtUN;
	private JPasswordField txtPW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLoginSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginSystem = new JFrame();
		frmLoginSystem.setTitle("Login ");
		frmLoginSystem.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frmLoginSystem.setBackground(SystemColor.activeCaptionBorder);
		frmLoginSystem.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Downloads\\Loginnn.png"));
		frmLoginSystem.setBounds(200, 200, 332, 378);
		frmLoginSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginSystem.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(29, 139, 86, 17);
		frmLoginSystem.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(31, 195, 84, 14);
		frmLoginSystem.getContentPane().add(lblNewLabel_2);
		
		txtUN = new JTextField();
		txtUN.setBounds(100, 137, 158, 20);
		frmLoginSystem.getContentPane().add(txtUN);
		txtUN.setColumns(10);
		
		txtPW = new JPasswordField();
		txtPW.setEchoChar('*');
		txtPW.setBounds(98, 189, 160, 20);
		frmLoginSystem.getContentPane().add(txtPW);
		txtPW.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = txtPW.getText();
				String username = txtUN.getText();
				
				if (password.contains("sendre") && username.contains("admin")) {
					txtPW.setText(null);
					txtUN.setText(null);
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login Details","Login Error", JOptionPane.ERROR_MESSAGE);
					txtPW.setText(null);
					txtUN.setText(null);
				}
				
				
			}
		});
		btnLogin.setHorizontalAlignment(SwingConstants.RIGHT);
		btnLogin.setBounds(31, 261, 61, 23);
		frmLoginSystem.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUN.setText(null);
				txtPW.setText(null);
			}
		});
		btnReset.setBounds(124, 261, 70, 23);
		frmLoginSystem.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem, "Confirm if you want to exit", "LoginSystems",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(220, 261, 61, 23);
		frmLoginSystem.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 236, 268, 14);
		frmLoginSystem.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		Image img = new ImageIcon(this.getClass().getResource("/LoginIcon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\Iconss\\LoginIcon.png"));
		lblNewLabel.setBounds(80, 11, 158, 117);
		frmLoginSystem.getContentPane().add(lblNewLabel);
	}
}
