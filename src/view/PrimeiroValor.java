package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrimeiroValor extends JFrame {
	private JLabel lblNumero1;
	private JTextField textField;
	private JButton btnOk1;
	private JButton btnCancel1;
	public static int valor1;

	public PrimeiroValor() {
		setTitle("Primeiro valor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 197);
		getContentPane().setLayout(null);
		
		lblNumero1 = new JLabel("Informe o primeiro numero:");
		lblNumero1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNumero1.setBounds(72, 32, 169, 14);
		getContentPane().add(lblNumero1);
		
		textField = new JTextField();
		textField.setBounds(72, 58, 206, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnOk1 = new JButton("OK");
		btnOk1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SegundoValor segundovalor = new SegundoValor();
				segundovalor.setVisible(true);
				valor1 = Integer.parseInt(textField.getText());
				getContentPane().setVisible(false);
			}
		});
		btnOk1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOk1.setBounds(80, 104, 76, 23);
		getContentPane().add(btnOk1);
		
		btnCancel1 = new JButton("Cancel");
		btnCancel1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel1.setBounds(166, 104, 76, 23);
		getContentPane().add(btnCancel1);
		
		setLocationRelativeTo(null);
		setResizable(false);
	}


}
