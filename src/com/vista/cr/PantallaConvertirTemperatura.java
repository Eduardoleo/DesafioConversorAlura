package com.vista.cr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.modelo.cr.ConvertidorTemperatura;
import com.modelo.cr.ConvertirColonesADivisas;
import com.modelo.cr.ConvertirDivisasAColones;

import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class PantallaConvertirTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	protected JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaConvertirTemperatura frame = new PantallaConvertirTemperatura();
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
	public PantallaConvertirTemperatura() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(192, 192, 192));
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Grados Celsius a Grados Fahrenheit", "Grados Celsius a Grados Kelvin", "Grados Celsius a Grados Rankine", "Grados Fahrenheit a Grados Celsius", "Grados Fahrenheit a Grados Kelvin", "Grados Fahrenheit a Grados Rankine", "Grados Kelvin a Grados Celsius", "Grados Kelvin a Grados Fahrenheit ", "Grados Kelvin a Grados Rankine", "Grados Rankine a Grados Celsius", "Grados Rankine a Grados Kelvin", "Grados Rankine a Grados Fahrenheit"}));
		comboBox.setBounds(20, 144, 234, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Convertor de Temperatura\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewLabel.setBounds(161, 11, 234, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese la cantidad de temperatura a convertir");
		lblNewLabel_1.setBounds(10, 64, 270, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(20, 88, 136, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		//metodo para mostrar el error si se mete un caracter
				textField.addKeyListener(new KeyAdapter() {
				    @Override
				    public void keyTyped(KeyEvent e) {
				        char c = e.getKeyChar();
				        if (!Character.isDigit(c)) {
				            JOptionPane.showMessageDialog(null, "Solo se aceptan números");
				            e.consume();
				        }
				    }
				});
		
		JLabel lblNewLabel_2 = new JLabel("Elija la escala a la que quieres convertir la temperatrua\r\n");
		lblNewLabel_2.setBounds(10, 119, 286, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("La temperatura es:");
		lblNewLabel_3.setBounds(10, 192, 125, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Volver al menú principal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrincipalGUI principal = new PrincipalGUI();
				principal.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(197, 264, 153, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Programa terminado");
				System.exit(0);
			}
		});
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setBounds(400, 264, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Limpiar el contenido del JTextArea
		        textArea.setText("");
				// Obtener el valor ingresado por el usuario
				double valor = Double.parseDouble(textField.getText());

				// Crear una instancia de la clase ConvertidorTemperatura
				ConvertidorTemperatura temperatura = new ConvertidorTemperatura();
				
				//Obtener la opción seleccionada por el usuario en el JComboBox
				String opcion = (String) comboBox.getSelectedItem();
				
				//Llama a la variabe elegida por el usuario y hace su respectiva operacion
				switch(opcion){
					case "Grados Celsius a Grados Fahrenheit":
						temperatura.GradosCelsiusAGradosFahrenheit(valor, textArea);
					break;
					case "Grados Celsius a Grados Kelvin":
						temperatura.GradosCelsiusAGradosKelvin(valor, textArea);
					break;
					case "Grados Celsius a Grados Rankine":
						temperatura.GradosCelsiusAGradosRankine(valor, textArea);
					break;
					case "Grados Fahrenheit a Grados Celsius":
						temperatura.GradosFahrenheitAGradosCelsius(valor, textArea);
					break;
					case "Grados Fahrenheit a Grados Kelvin":
						temperatura.GradosFahrenheitAGradosKelvin(valor, textArea);
					break;
					case "Grados Fahrenheit a Grados Rankine":
						temperatura.GradosFahrenheitAGradosRankine(valor, textArea);
					break;
					case "Grados Kelvin a Grados Celsius":
						temperatura.GradosKelvinAGradosCelsius(valor, textArea);
					break;
					case "Grados Kelvin a Grados Fahrenheit ":
						temperatura.GradosKelvinAGradosFahrenheit(valor, textArea);
					break;
					case "Grados Kelvin a Grados Rankine":
						temperatura.GradosKelvinAGradosRankine(valor, textArea);
					break;
					case "Grados Rankine a Grados Celsius":
						temperatura.GradosRankineAGradosCelsius(valor, textArea);
					break;
					case "Grados Rankine a Grados Kelvin":
						temperatura.GradosRankineAGradosKelvin(valor, textArea);
					break;
					case "Grados Rankine a Grados Fahrenheit":
						temperatura.GradosRankineAGradosFahrenheit(valor, textArea);
						break;		
				}
				}
		});
		btnConvertir.setBounds(307, 144, 89, 23);
		contentPane.add(btnConvertir);
		
		//aca llamo a la variable textarea del btnConvertir para poder imprimir el resultado
		textArea = new JTextArea();
		textArea.setBounds(20, 217, 132, 22);
		contentPane.add(textArea);
	}
}
