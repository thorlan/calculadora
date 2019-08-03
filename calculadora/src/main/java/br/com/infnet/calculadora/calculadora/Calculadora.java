package br.com.infnet.calculadora.calculadora;

public class Calculadora {

	public Calculadora() {

	}

	public int add(String valorString) {

		int valor = 0 ;

		if (valorString.equals("")) {
			return valor;
		} else if (valorString.length() == 1) {
			valor = Integer.parseInt(valorString);
		} else {
			valorString = valorString.replace("\n", ",");
			String[] valorArray = valorString.split(",");
			for (String item : valorArray) {
				valor += Integer.parseInt(item);
			}
		}
		
		return valor;
	}
}
