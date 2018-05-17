package br.com.db1startcalculadora;

public class Main {

	public static void main(String[] args) {
		exibirSoma(5,5);
		exibirSubtrair(7,3);
		exibirMultiplicar(5,5);
		exibirDividir(30,6);
	}

	private static void exibirSoma(Integer semNumero1, Integer semNumero2) {
		Calculadora calculadora = new Calculadora();
		calculadora.setNumero1(semNumero1);
		calculadora.setNumero2(semNumero2);
		System.out.println(calculadora.somar(semNumero1, semNumero2));
	}

	private static void exibirSubtrair(Integer semNumero1, Integer semNumero2) {
		Calculadora calculadora = new Calculadora();
		calculadora.setNumero1(semNumero1);
		calculadora.setNumero2(semNumero2);
		System.out.println(calculadora.subtrair(semNumero1, semNumero2));
	}

	private static void exibirMultiplicar(Integer semNumero1, Integer semNumero2) {
		Calculadora calculadora = new Calculadora();
		calculadora.setNumero1(semNumero1);
		calculadora.setNumero2(semNumero2);
		System.out.println(calculadora.multiplicar(semNumero1, semNumero2));
	}
	
	private static void exibirDividir(Integer semNumero1, Integer semNumero2) {
		Calculadora calculadora = new Calculadora();
		calculadora.setNumero1(semNumero1);
		calculadora.setNumero2(semNumero2);
		System.out.println(calculadora.dividir(semNumero1, semNumero2));
	}

}
