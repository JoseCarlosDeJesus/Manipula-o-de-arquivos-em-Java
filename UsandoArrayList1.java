package br.com.pc2.semana9;

import java.util.ArrayList;

public class UsandoArrayList1 {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		
		lista.add("Ana");
		lista.add("Maria");
		lista.add(123);
		lista.add(90.5);
		lista.add("Ana");
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println(lista);
		
		/*
		 * for(String s : lista) {
		 * 
		 * }
		 */

	}

}
