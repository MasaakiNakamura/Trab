package prova;

import javax.swing.JOptionPane;
public class loginDoJogo {
	LerUsuario lerUsuario = new LerUsuario();
	LerSenha lerSenha = new LerSenha();
	String usuarioLogin;
	String usuarioSenha;
	int i = 0; //variáveis que servem para definir a linha e a coluna da matriz de logins
	public void login(){

		boolean controleDeLogin = false; //boolean para saber se o usuario acertou o errou o login da conta
		while(i < 4){
			usuarioLogin = JOptionPane.showInputDialog("Nome de usuário:");
			usuarioSenha = JOptionPane.showInputDialog("Senha:");
			if(lerSenha.LerSenhaTXT().equals(usuarioLogin)){
				if(lerUsuario.LerUsuarioTXT().equals(usuarioSenha)){
					JOptionPane.showMessageDialog(null, "Dados corretos");
					JOptionPane.showMessageDialog(null, "Bom Jogo!!");
					controleDeLogin = true;
					//return 
				}			
			}
			i++;
			if(controleDeLogin){
				break;
			} else{
				JOptionPane.showMessageDialog(null, "Dados incorretos!!" + "\n" +
						"Por favor, insira os dados de login, novamente:");
			}
		}
		//return "";
	}
}
