package Fibonacci_Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fiboVentana extends JFrame {

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
					fiboVentana frame = new fiboVentana();
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
	public fiboVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 268);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Serie Fibonacci");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(141, 11, 320, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor Inicial:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 87, 119, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor Secundario:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 131, 174, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Iteraciones:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 177, 107, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Metodo calulcar 
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
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(299, 59, 125, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Nuevo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Metodo para "nuevo" limpiar
				
				txtValorInicial.setText(null);
				txtValorSecundario.setText(null);
				txtIteraciones.setText(null);
				txtValorInicial.grabFocus();
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(299, 107, 125, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(299, 173, 125, 23);
		contentPane.add(btnNewButton_2);
		
		txtValorInicial = new JTextField();
		txtValorInicial.setBounds(139, 86, 86, 20);
		contentPane.add(txtValorInicial);
		txtValorInicial.setColumns(10);
		
		txtValorSecundario = new JTextField();
		txtValorSecundario.setBounds(173, 130, 86, 20);
		contentPane.add(txtValorSecundario);
		txtValorSecundario.setColumns(10);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setBounds(122, 176, 86, 20);
		contentPane.add(txtIteraciones);
		txtIteraciones.setColumns(10);
	}
}
