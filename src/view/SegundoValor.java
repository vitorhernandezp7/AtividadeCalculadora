package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import view.TelaCalculadora;
import view.PrimeiroValor;

public class SegundoValor extends JFrame {
	private JTextField textField;
	private JLabel lblNumero2;
	private JButton btnOK;
	private JButton btnCancel;
	public static int valor2;

	public SegundoValor() {
		setTitle("Segundo valor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 211);
		getContentPane().setLayout(null);
		
		lblNumero2 = new JLabel("Informe o segundo valor:");
		lblNumero2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNumero2.setBounds(78, 34, 163, 14);
		getContentPane().add(lblNumero2);
		
		textField = new JTextField();
		textField.setBounds(78, 70, 163, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Integer.parseInt(textField.getText());
				TelaCalculadora calc = new TelaCalculadora();
				PrimeiroValor primeirovalor = new PrimeiroValor();
				getContentPane().setVisible(false);
				calc.setVisible(true);
				if(calc.operacao == 1) {
					JOptionPane.showMessageDialog(getContentPane(), "O valor é: "+(primeirovalor.valor1 + valor2), "atencao", 1);
				}
				if(calc.operacao == 2) {
					JOptionPane.showMessageDialog(getContentPane(), "O Valor é: "+(primeirovalor.valor1 - valor2), "atençao", 1);
				}
				if(calc.operacao == 3) {
					JOptionPane.showMessageDialog(getContentPane(), "O valor é: "+(primeirovalor.valor1 * valor2), "atenção", 1);
				}
			}
		});
		btnOK.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOK.setBounds(75, 116, 78, 23);
		getContentPane().add(btnOK);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel.setBounds(163, 116, 78, 23);
		getContentPane().add(btnCancel);
		
		setLocationRelativeTo(null);
		setResizable(false);
	}
}
