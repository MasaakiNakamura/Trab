package prova;

import javax.swing.*;
import java.util.Formatter;
public class CriarTxt {
	String nomeDoArquivo = "DadosDeCadastro.txt";	
	public String nomeDeUsuario[] = new String [5];
	String senha[] = new String[5];
	String informacoes = "";
	public String login[][] = new String[5][2];
	public int a = 0;
	boolean control = false;
	
	public void CriarTXT(){
		try {
			Formatter saida = new Formatter(this.nomeDoArquivo);
			JOptionPane.showMessageDialog(null, "Digite os dados do seu cadastro:");
			this.nomeDeUsuario[a] = JOptionPane.showInputDialog("Nome de usuário:");
			this.senha[a] = JOptionPane.showInputDialog("Senha:");
			login[a][0] = this.nomeDeUsuario[a];
			login[a][1] = this.senha[a];
			informacoes += this.nomeDeUsuario[a] + "\n" + this.senha[a] + "\n\n";
			saida.format(informacoes);
			a++;
			saida.close();
			JOptionPane.showMessageDialog(null,"Arquivo " + this.nomeDoArquivo + " criado!", "Arquivo",1 );
		}
		catch (Exception erro){
			JOptionPane.showMessageDialog(null, "Arquivo não põde ser gerado");
		}
	}

}
