package br.com.pc2.semana9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo1 {

	public static void main(String[] args) {
		String nomeArq = "/media/jose/Data/Arquivos/IFB/Ensino/20201/ProgramacaoII/arquivos/teste1.txt";
		String linha = "";
		BufferedReader arquivo = null;
		try {
			arquivo = new BufferedReader(new FileReader(nomeArq));
			while (arquivo.ready()) {
				linha = arquivo.readLine();
				System.out.println(linha);
			}
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				arquivo.close();
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("\\Users\\Alunotgn\\workspace\\arquivos1\\teste1.txt");

	}
	


}
