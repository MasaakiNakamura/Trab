package prova;

import javax.swing.JOptionPane;
public class Login {
	public void login(){
		int i;
		boolean controleDeLogin = true;
		
		String nomeDeUsuario;
		String senhaDeUsuario;
		String usuarios[] = {"tsylasac@gmail.com", "fcfmuller@gmail.com", "projetonewton.ufpa@gmail.com",
							"renatofarias@gmail.com", "arissaniwa3@gmail.com", "masaaki_naka@hotmail.com"};
		String senhas[] = {"thiagosylas", "franciscomuller", "projetonewton", "renatofarias",
							"arissaniwa", "masaakinakamura"};
		JOptionPane.showMessageDialog(null, "Coloque seus dados de login");
		
		while(controleDeLogin){
			nomeDeUsuario = JOptionPane.showInputDialog("Digite seu nome de usuario ou email: \nDica: Coloque o seu email");
			senhaDeUsuario = JOptionPane.showInputDialog("Digite sua senha: \nDica: Coloque seu nome");
		
			for(i = 0; i < 6; i++){
				if((nomeDeUsuario.equals(usuarios[i]) && (senhaDeUsuario.equals(senhas[i])))){
					JOptionPane.showMessageDialog(null, "Login feito com sucesso");
					controleDeLogin = false;
				}
			}		
		
			if(controleDeLogin){
				JOptionPane.showMessageDialog(null, "Dados de Login inválidos" + "\n" + "Insira os dados novamente:");
			}
		}
	}
}
