package view;

public class Calculadora_teste {
	
	private int operacao;
	double primeiroValor;
	double segundoValor;
	
	public void calculadora_teste() {
		
	}
	
	public Calculadora_teste(int operacao, double primeiroValor, double segundoValor) {
		this.operacao = operacao;
		this.primeiroValor = primeiroValor;
		this.segundoValor = segundoValor;
	}
	
	
	public int getOperacao() {
		return operacao;
	}
	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}
	public double getPrimeiroValor() {
		return primeiroValor;
	}
	public void setPrimeiroValor(double primeiroValor) {
		this.primeiroValor = primeiroValor;
	}
	public double getSegundoValor() {
		return segundoValor;
	}
	public void setSegundoValor(double segundoValor) {
		this.segundoValor = segundoValor;
	}
	
	
}
