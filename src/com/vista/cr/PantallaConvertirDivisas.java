package com.vista.cr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.SpinnerListModel;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

import com.modelo.cr.ConvertirColonesADivisas;
import com.modelo.cr.ConvertirDivisasAColones;

import javax.swing.JTextArea;

public class PantallaConvertirDivisas extends JFrame {

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
					PantallaConvertirDivisas frame = new PantallaConvertirDivisas();
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
	public PantallaConvertirDivisas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Convertir Divisas\r\n\r\n\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setBounds(275, 11, 236, 39);
		contentPane.add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Colones (₡) a Dólar Estadounidense ($)", "Colones (₡) a Euros (€)", "Colones (₡) a Yen Japonés (¥)", "Colones (₡) a Franco Suizo (CHF)", "Colones (₡) a Libra Esterlina (£)", "Colones (₡) a Won Surcoreano (₩)", "Colones (₡) a Peso Mexicano ($)", "Dólar Estadounidense ($) a Colones (₡)", "Euros (€) a Colones (₡)", "Yen Japonés (¥) a Colones (₡)", "Franco Suizo (CHF) a Colones (₡)", "Libra Esterlina (£) a Colones (₡)", "Won Surcoreano (₩) a Colones (₡)", "Peso Mexicano ($) a Colones (₡)"}));
		comboBox.setBounds(255, 94, 244, 22);
		contentPane.add(comboBox);

		textField = new JTextField();
		textField.setBounds(118, 94, 124, 22);
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
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese una cantidad");
		lblNewLabel_1.setBounds(10, 94, 115, 14);
		contentPane.add(lblNewLabel_1);
		

		JLabel lblNewLabel_2 = new JLabel("Elija a la divisa que quiere convertir");
		lblNewLabel_2.setBounds(255, 75, 188, 14);
		contentPane.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Volver al menu principal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrincipalGUI principal = new PrincipalGUI();
				principal.setVisible(true);
			}
		});
		btnNewButton.setBounds(148, 219, 150, 23);
		contentPane.add(btnNewButton);

		JButton btnSalir = new JButton("Salir ");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Programa terminado");
				System.exit(0);
			}
		});
		btnSalir.setBounds(361, 219, 150, 23);
		contentPane.add(btnSalir);

		JButton btnConvertir = new JButton("Convertir ");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Limpiar el contenido del JTextArea
		        textArea.setText("");
				// Obtener el valor ingresado por el usuario
				double valor = Double.parseDouble(textField.getText());

				// Crear una instancia de la clase ConvertorDivisar
				ConvertirColonesADivisas convertor = new ConvertirColonesADivisas();
				ConvertirDivisasAColones convertir = new ConvertirDivisasAColones();

				// Obtener la opción seleccionada por el usuario en el JComboBox
				String opcion = (String) comboBox.getSelectedItem();

				// llama a la opcion elegida en el combobox
				switch (opcion) {
				case "Colones (₡) a Dólar Estadounidense ($)":
					convertor.ConvertirColonesADolares(valor, textArea);
					break;
				case "Colones (₡) a Euros (€)":
					convertor.ConvertirColonesAEuros(valor, textArea);
					break;
				case "Colones (₡) a Franco Suizo (CHF)":
					convertor.ConvertirColonesAFrancoZuizo(valor, textArea);
					break;
				case "Colones (₡) a Libra Esterlina (£)":
					convertor.ConvertirColonesALibraEsterlina(valor, textArea);
					break;
				case "Colones (₡) a Peso Mexicano ($)":
					convertor.ConvertirColonesAPesoMexicano(valor, textArea);
					break;
				case "Colones (₡) a Won Surcoreano (₩)":
					convertor.ConvertirColonesAWonSurCoreano(valor, textArea);
					break;
				case "Colones (₡) a Yen Japonés (¥)":
					convertor.ConvertirColonesAYenJapones(valor, textArea);
					break;
				case "Dólar Estadounidense ($) a Colones (₡)":
					convertir.ConvertirDolaresAColones(valor, textArea);
					break;
				case "Euros (€) a Colones (₡)":
					convertir.ConvertirEurosAColones(valor, textArea);
					break;
				case "Franco Suizo (CHF) a Colones (₡)":
					convertir.ConvertirFrancoZuizoAColones(valor, textArea);
					break;
				case "	Libra Esterlina (£) a Colones (₡)":
					convertir.ConvertirLibraEsterlinaAColones(valor, textArea);
					break;
				case "Peso Mexicano ($) a Colones (₡)":
					convertir.ConvertirPesoMexicanoAColones(valor, textArea);
					break;
				case "Won Surcoreano (₩) a Colones (₡)":
					convertir.ConvertirWonSurCoreanoAColones(valor, textArea);
					break;
				case "Yen Japonés (¥) a Colones (₡)":
					convertir.ConvertirYenJaponesAColones(valor, textArea);
					break;		
				}
			}
		});
		btnConvertir.setBounds(517, 94, 89, 23);
		contentPane.add(btnConvertir);

		JLabel lblNewLabel_3 = new JLabel("Valor de la Divisa elegida obtenido:\r\n");
		lblNewLabel_3.setBounds(10, 139, 172, 14);
		contentPane.add(lblNewLabel_3);

		textArea = new JTextArea();
		textArea.setBounds(192, 134, 132, 22);
		contentPane.add(textArea);

	}
}
