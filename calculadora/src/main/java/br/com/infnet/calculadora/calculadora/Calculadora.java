package br.com.infnet.calculadora.calculadora;

public class Calculadora {

	public Calculadora() {

	}

	public int add(String valorString) {
		String[] valorArray;

		int valor = 0;

		if (valorString.equals("")) {
			return valor;
		} else if (valorString.length() == 1) {
			valor = Integer.parseInt(valorString);
		} else {
			String delimitador = ",";

			if (valorString.contains("//")) {

				delimitador = valorString.substring(2, 3);
				valorString = valorString.replace("//", "0");
				valorString = valorString.replace("\n", delimitador);
				valorArray = valorString.split(delimitador);
				for (int i = 2; i < valorArray.length; i++) {
					valor += Integer.parseInt(valorArray[i]);
				}

			} else {
				valorString = valorString.replace("\n", delimitador);
				valorArray = valorString.split(delimitador);
				for (String item : valorArray) {
					valor += Integer.parseInt(item);
				}
			}

		}

		return valor;
	}
}
