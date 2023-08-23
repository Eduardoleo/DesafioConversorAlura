package com.vista.cr;

import java.awt.EventQueue;
import com.modelo.cr.ConvertirColonesADivisas;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToggleButton;

public class PrincipalGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalGUI frame = new PrincipalGUI();
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
	public PrincipalGUI() {
		setForeground(new Color(0, 0, 0));
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBackground(new Color(0, 0, 0));
		setType(Type.UTILITY);
		setTitle("Conversor");
		setFont(new Font("Dubai", Font.ITALIC, 15));
		setBounds(100, 100, 800, 397);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menú Principal");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel.setBounds(606, 33, 104, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Convertor De Monedas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaConvertirDivisas convertirC = new PantallaConvertirDivisas();
				convertirC.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(93, 73, 175, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Convertor de Temperatura");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaConvertirTemperatura pantallaTem = new PantallaConvertirTemperatura();
				pantallaTem.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBounds(93, 151, 175, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Programa terminado");
				 System.exit(0);
			}
		});
		btnNewButton_3.setBackground(new Color(128, 128, 128));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_3.setBounds(93, 227, 175, 37);
		contentPane.add(btnNewButton_3);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PrincipalGUI.class.getResource("/com/image/cr/convertor.jpeg")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setLabelFor(this);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(479, 84, 261, 180);
		contentPane.add(lblNewLabel_1);
	}
}
