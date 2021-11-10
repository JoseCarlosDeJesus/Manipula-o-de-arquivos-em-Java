package br.com.pc2.semana9;

import javax.swing.JFileChooser;

public class Teste {

	public static void main(String[] args) {
		/*
		 * // Linux String pathL =
		 * "/media/jose/Data/Arquivos/IFB/Ensino/20201/ProgramacaoII/arquivos/novapasta";
		 * // Windows // String pathW = "C:\\Users\\Alunotgn\\workspace\\arquivos1"; try
		 * { System.out.println(ManipulaArquivo.criarDiretorio(pathL)); } catch
		 * (IOException e) { System.out.println(e.getMessage()); }
		 */

		/*
		 * // Linux String pathL =
		 * "/media/jose/Data/Arquivos/IFB/Ensino/20201/ProgramacaoII/arquivos/novapasta/";
		 * String arq = "teste1.txt"; // Windows // String pathW =
		 * "C:\\Users\\Alunotgn\\workspace\\arquivos1\\";
		 * 
		 * try { System.out.println(ManipulaArquivo.criarArquivo(pathL + arq)); } catch
		 * (IOException e) { System.out.println(e.getMessage()); }
		 */
		
		/*
		 * String path =
		 * "/home/jose/IFB/Ensino/20201/pc2/worspace/programacao2/src/br/com/pc2/semana9";
		 * // ou String path = "C:\\User\\Alunotgn" try {
		 * ManipulaArquivo.listarArquivo(path); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		// Abrir arquivo
				JFileChooser jf = new JFileChooser();// Objeto para dialogo
				//jf.showOpenDialog(null);//Abrir arquivo
				 jf.showSaveDialog(null);//Salvar arquivo

	}

}
