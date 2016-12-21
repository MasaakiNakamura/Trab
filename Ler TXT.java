package prova;

import javax.swing.*;
import java.io.*;
public class LerTxt {
	CriarTxt nome = new CriarTxt();
	String loginUsuario[] = new String[5];
	String loginSenha[] = new String[5];
	String mostrar = ""; //Local para armazenar o conteudo do arquivo
	String nomeDoArq = nome.nomeDoArquivo;
	// nome do do arquivo (eu importei da classe 'CriarTxt' para manter o mesmo nome)
	String linha = "";
	public void LerTXT(){
		File arquivo = new File(nomeDoArq); 
		if(arquivo.exists()){ //retorna valor verdadeiro ou falso
			mostrar = "Arquivo: " + nomeDoArq + "\n";
			try{
				mostrar += "Dados:\n";
				//abrindo arquivo para leitura
				FileReader reader = new FileReader(nomeDoArq);
				//leitor do arquivo
				BufferedReader leitor = new BufferedReader(reader);
				while(true){
					loginUsuario[0] = leitor.readLine();
					loginSenha[0] = leitor.readLine();
					mostrar += "Usuário[" + 1 + "]: " + "\n" + "Nome: " + loginUsuario[0] + "\n" +
							"Senha: " + loginSenha[0];
					linha = leitor.readLine();
					if(linha == null){
						break;
					}
				}
				leitor.close();
			}
			catch (Exception erro) {}
			/*
			for(int i = 0; i < 5; i++){
				loginUsuario[a] = 0;
				loginSenha[a] = 0; 
			}
			*/
			JOptionPane.showMessageDialog(null, mostrar + "\n", nomeDoArq, 1);
		} else {
			JOptionPane.showMessageDialog(null, "Arquivo não existe", "Erro", 0);
		}
	}
}
