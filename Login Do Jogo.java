package prova;

import javax.swing.JOptionPane;
public class loginDoJogo {
	LerTxt lertxt = new LerTxt();
	CriarTxt criartxt = new CriarTxt();
	String usuarioLogin;
	String usuarioSenha;
	int i; //variáveis que servem para definir a linha e a coluna da matriz de logins
	public void login(){

		
		boolean controleDeLogin = false; //boolean para saber se o usuario acertou o errou o login da conta
		while(true){
			usuarioLogin = JOptionPane.showInputDialog("Nome de usuário:");
			usuarioSenha = JOptionPane.showInputDialog("Senha:");
			for(i = 0; i < criartxt.a; i++){
				if(criartxt.login[i][0].equals(usuarioLogin)){
					if(criartxt.login[i][0].equals(usuarioSenha)){
						JOptionPane.showMessageDialog(null, "Dados corretos");
						JOptionPane.showMessageDialog(null, "Bom Jogo!!");
						controleDeLogin = true;
						break;
					}
				}
			}
			if(controleDeLogin){
				break;
			} else{
				JOptionPane.showMessageDialog(null, "Dados incorretos!!" + "\n" +
						"Por favor, insira os dados de login, novamente:");
			}
		}
	}
}
