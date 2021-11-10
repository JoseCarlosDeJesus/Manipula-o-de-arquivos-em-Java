package br.com.pc2.semana9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class GravaArquivo1 {

	public static void main(String[] args) throws IOException {
		File f = new File("arq2.txt");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String novaLinha = "\n";
		System.out.println("Digite um texto ($ para sair)");
		String texto = bf.readLine();
		while (!texto.equals("$")) {
			fos.write(texto.getBytes());
			fos.write(novaLinha.getBytes());
			System.out.println("Digite um texto ($ para sair)");
			texto = bf.readLine();
		}
		fos.close();

	}

}
