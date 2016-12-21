package prova;

import javax.swing.*;
import java.util.Formatter;
public class CriarTxt {
	String nomeDoArquivo = "DadosDeCadastro.txt";	
	String nomeDeUsuario[] = new String [1];
	String senha[] = new String[1];
	String informacoes = "";
	String login[][] = new String[1][2];
	boolean control = false;
	
	public void CriarTXT(){
		try {
			Formatter saida = new Formatter(this.nomeDoArquivo);
			JOptionPane.showMessageDialog(null, "Digite os dados do seu cadastro:");
			this.nomeDeUsuario[0] = JOptionPane.showInputDialog("Nome de usuário ou email:");
			this.senha[0] = JOptionPane.showInputDialog("Senha:");
			login[0][0] = this.nomeDeUsuario[0];
			login[0][1] = this.senha[0];
			informacoes += this.nomeDeUsuario[0] + "\n" + this.senha[0];
			saida.format(informacoes);
			saida.close();
			JOptionPane.showMessageDialog(null,"Arquivo " + this.nomeDoArquivo + " criado!", "Arquivo",1 );
		}
		catch (Exception erro){
			JOptionPane.showMessageDialog(null, "Arquivo não põde ser gerado");
		}
	}

}
