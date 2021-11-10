package br.com.pc2.semana9;

public class UsandoMinhaExcecao {

	public static void main(String[] args) {
		try {
			// Faça algo
			throw new ExemploMinhaExcecao();
		} catch (ExemploMinhaExcecao e) {
			System.out.println("Minha exceção: " + e.getMessage());
		}

	}

}
