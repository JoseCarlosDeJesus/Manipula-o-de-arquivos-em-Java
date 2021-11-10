package br.com.pc2.semana9;

import java.util.ArrayList;

public class UsandoArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Ana");
		lista.add("Maria");
		//lista.add(123);//Erro -> não é possível colocar elementos diferentes do que foi definido na declaração do AraayList
		//lista.add(90.5);
		lista.add("Ana");
		
		for(String s : lista) {
			System.out.println(s);
		}

	}

}
