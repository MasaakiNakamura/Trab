package prova;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class LerUsuario {
	CriarTxt nome = new CriarTxt();
	String loginUsuario;
	String loginSenha;
	String mostrar = ""; //Local para armazenar o conteudo do arquivo
	String nomeDoArq = nome.nomeDoArquivo;
	// nome do do arquivo (eu importei da classe 'CriarTxt' para manter o mesmo nome)
	String linha = "";
	String login[][] = new String[1][2];
	
	public String LerUsuarioTXT(){
		File arquivo = new File(nomeDoArq); 
		if(arquivo.exists()){ //retorna valor verdadeiro ou falso
			try{
				//abrindo arquivo para leitura
				FileReader reader = new FileReader(nomeDoArq);
				//leitor do arquivo
				BufferedReader leitor = new BufferedReader(reader);
				while(true){
					loginUsuario = leitor.readLine();
					loginSenha = leitor.readLine();
					linha = leitor.readLine();
					if((linha == null) || (loginUsuario == null) || (loginSenha == null)){
						break;
					}
				}
				leitor.close();
			}
			catch (Exception erro) {}
		} else {
			JOptionPane.showMessageDialog(null, "Arquivo não existe", "Erro", 0);
		}
		return loginUsuario;
	}
}

