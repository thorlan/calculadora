package br.com.infnet.calculadora.calculadora;

public class Calculadora {

	public Calculadora() {

	}

	public int add(String valorString) {

		int valor;

		if (valorString.equals("")) {
			valor = 0;
		} else if (valorString.length() == 1) {
			valor = Integer.parseInt(valorString);
		} else {
			int posicaoDaVirgula = valorString.indexOf(',');
			int primeiroValor = Integer.parseInt(valorString.substring( (posicaoDaVirgula -1) , posicaoDaVirgula ));
			int segundoValor = Integer.parseInt(valorString.substring(posicaoDaVirgula + 1));
			valor = primeiroValor + segundoValor;
		}

		return valor;
	}
}
