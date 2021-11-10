package br.com.pc2.semana9;

public class LancandoExcecao {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			int x = (int)(Math.random()*5);
			int y = (int)(Math.random()*5);
			if(y == 0) {
				throw new ArithmeticException("Denominador não pode ser zero");
			}
			System.out.println("x/y = "+(x/y));
		}

	}

}
