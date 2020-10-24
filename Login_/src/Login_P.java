import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Login_P extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_P frame = new Login_P();
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
	public Login_P() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 271);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setForeground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(127, 11, 111, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(31, 84, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Inciar Sesion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			
			{
				String Usuario="", Password="";
				Usuario=txtUsuario.getText();
			    Password=txtPassword.getText();
				
				
				
				//Boton para iniciar sesion... 
				ArrayList<String> varLista= new ArrayList<String>();
				varLista.add("Johana");
				varLista.add( "1234");
				varLista.add("Rubi");
				varLista.add("5678");
				
				 
					 if (Usuario.equals(txtUsuario) && (Password.equals(txtPassword)))
		    		  {
		    	          
		    	  JOptionPane.showMessageDialog(null,"Inicio de sesion correcto");
		    	          
		    		  }
		      else
		      {
		    	  
		    	  JOptionPane.showMessageDialog(null,"Inicio de sesion incorrecto");
		    	  
		      }

					 
		}
				
				
				
								 
				     
				 
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(92, 186, 152, 23);
		contentPane.add(btnNewButton);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(127, 84, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel2 = new JLabel("Password:");
		lblNewLabel2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel2.setBounds(31, 126, 98, 28);
		contentPane.add(lblNewLabel2);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(127, 133, 86, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
	}
}
