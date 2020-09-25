import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fibonacci extends JFrame {

	private JPanel contentPane;
	private JTextField txtValorInicial;
	private JTextField txtValorSecundario;
	private JTextField txtIteraciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibonacci frame = new Fibonacci();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fibonacci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 253);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Serie Fibonacci");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(131, 11, 303, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblValorIncial = new JLabel("Valor incial:");
		lblValorIncial.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblValorIncial.setBounds(10, 64, 102, 17);
		contentPane.add(lblValorIncial);
		
		JLabel lblNewLabel_2 = new JLabel("Valor secundario:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 110, 154, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Iteraciones:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 155, 120, 14);
		contentPane.add(lblNewLabel_3);
		
		txtValorInicial = new JTextField();
		txtValorInicial.setBounds(131, 64, 86, 20);
		contentPane.add(txtValorInicial);
		txtValorInicial.setColumns(10);
		
		txtValorSecundario = new JTextField();
		txtValorSecundario.setBounds(161, 109, 86, 20);
		contentPane.add(txtValorSecundario);
		txtValorSecundario.setColumns(10);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setBounds(119, 154, 86, 20);
		contentPane.add(txtIteraciones);
		txtIteraciones.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				 
				int Valor1= Integer.parseInt(txtValorInicial.getText());
						int Valor2= Integer.parseInt(txtValorSecundario.getText());
						int iteraciones= Integer.parseInt(txtIteraciones.getText());
						int Valor3, cont=0;
						
			             
						do
					     {
					          Valor3=Valor1+Valor2;
							
					         JOptionPane.showMessageDialog(rootPane, Valor3);
					          
					          
					         Valor1=Valor2;
					         Valor2=Valor3;
					         cont += 1;
					     }while(cont<iteraciones);

			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalcular.setBounds(308, 60, 116, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				txtValorInicial.setText(null);
				txtValorSecundario.setText(null);
				txtIteraciones.setText(null);
				txtValorInicial.grabFocus();

			}
		});
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNuevo.setBounds(308, 94, 116, 23);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0); 
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSalir.setBounds(308, 138, 116, 23);
		contentPane.add(btnSalir);
	}
}
