package br.com.db1startcalculadora;

public class Calculadora {
	
	private Integer numero1;
	private Integer numero2;
	
		
	public Integer getNumero1() {
		return numero1;
	}


	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}


	public Integer getNumero2() {
		return numero2;
	}


	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}


	public int somar (int numero1, int numero2) {
		return numero1 + numero2;
	}

	
	public int subtrair (int numero1, int numero2){
		return numero1 - numero2;
	}

	
	public int multiplicar (int numero1, int numero2){
		return numero1 * numero2;
	}
	
	
	public int dividir (int numero1, int numero2){
		return numero1 / numero2;
	}

	
	

}
