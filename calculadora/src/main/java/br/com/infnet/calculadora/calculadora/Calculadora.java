package br.com.infnet.calculadora.calculadora;

public class Calculadora {

	public Calculadora() {

	}

	public int add(String valorString) throws Exception {
		String[] valorArray;

		int valor = 0;
		int i = 0;

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
				i = 2;

			} else {
				valorString = valorString.replace("\n", delimitador);
				valorArray = valorString.split(delimitador);
				i = 0;
			}
			boolean lancarExcecao = false;
			int positivos = 0;
			int negativos = 0;
			for (i = i; i < valorArray.length; i++) {

				if (Integer.parseInt(valorArray[i]) < 0) {
					negativos++;
					lancarExcecao = true;

				} else {
					negativos++;
				}
				valor += Integer.parseInt(valorArray[i]);
			}

			if (lancarExcecao) {
				if (negativos > positivos) {
					for (String string : valorArray) {
						System.out.println(string);
					}
				}
				throw new Exception("Números negativos não permitidos");
			}

		}

		return valor;
	}
}
