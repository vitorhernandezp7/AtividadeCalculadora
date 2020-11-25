package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import view.Calculadora_teste;

public class TelaCalculadora extends JFrame {
	private JLabel lblTexto1;
	private JButton btnSomar;
	private JButton btnDiminuir;
	private JButton btnMultiplicar;
	public static int operacao;

	public TelaCalculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 194);
		getContentPane().setLayout(null);
		
		lblTexto1 = new JLabel("Escolha a operação desejada:");
		lblTexto1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTexto1.setBounds(84, 36, 167, 14);
		getContentPane().add(lblTexto1);
		
		btnSomar = new JButton("+");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrimeiroValor primeirovalor = new PrimeiroValor();
				primeirovalor.setVisible(true);
				getContentPane().setVisible(false);
				operacao = 1;
			}
		});
		btnSomar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSomar.setBounds(81, 82, 50, 23);
		getContentPane().add(btnSomar);
		
		btnDiminuir = new JButton("-");
		btnDiminuir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrimeiroValor primeirovalor = new PrimeiroValor();
				primeirovalor.setVisible(true);
				getContentPane().setVisible(false);
				operacao = 2;
			}
		});
		btnDiminuir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDiminuir.setBounds(141, 82, 50, 23);
		getContentPane().add(btnDiminuir);
		
		btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrimeiroValor primeirovalor = new PrimeiroValor();
				primeirovalor.setVisible(true);
				getContentPane().setVisible(false);
				operacao = 3;
			}
		});
		btnMultiplicar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMultiplicar.setBounds(201, 82, 50, 23);
		getContentPane().add(btnMultiplicar);

		setLocationRelativeTo(null);
		setResizable(false);
	}

}
