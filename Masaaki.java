package prova;


import javax.swing.JOptionPane;;

public class Prova {
	public static void main(String[] args) {
		//LerTxt lertxt = new LerTxt();
		//CriarTxt criartxt = new CriarTxt();
		Login login = new Login();
		EscolhaPersonagem mago = new EscolhaPersonagem();
		EscolhaPersonagem guerreiro = new EscolhaPersonagem();
		EscolhaPersonagem arqueiro = new EscolhaPersonagem();
		boolean novoJogo = true; // variavel booleana para saber se o usuario deseja jogar um novo jogo, ou não
		int fimDeJogo = 0; // Varialvel inteira para saber se o usuario dese reiniciar o jogo, apos morrer.
		int respostaNovoJogo; // Armazena a resposta "Iniciar Novo jogo", localizada no fim da Main
		int escolha; // Variável interia para fazer comparações e saber qual herói o Jogador escolheu
		
		JOptionPane.showMessageDialog(null, "Faça o login para começar o jogo:");
		login.login();
		
		while (novoJogo) {


			if (novoJogo) {
				JOptionPane.showMessageDialog(null, "Novo Jogo");
			}
			
			JOptionPane.showMessageDialog(null, "Vidas: 1");
			JOptionPane.showMessageDialog(null, "Jogue com sabedoria...");
			Object[] herois = { "Mage", "Guerreiro", "Arqueiro" };
			escolha = JOptionPane.showOptionDialog(null, "Selecione uma classe para escolher o seu herói", " ",
					JOptionPane.DEFAULT_OPTION, 3, null, herois, herois[0]);

			if (escolha == 0) {
				fimDeJogo = mago.mago();

				if (fimDeJogo == 0) { //se o jogador desistiu
					break;
				}
				
				if (fimDeJogo == 1) { //se o jogador morreu e quer continuar
					novoJogo = true;
				}
				
				if(fimDeJogo == 2){ //se o jogador terminou o jogo
					respostaNovoJogo = JOptionPane.showConfirmDialog(null, "Iniciar Novo jogo?", "Aviso", 0, 1);
					if (respostaNovoJogo == 0) {
						novoJogo = true;
					} else {
						novoJogo = false;
					}
				}
			}
			
			if (escolha == 1) {
				fimDeJogo = guerreiro.guerreiro();

				if (fimDeJogo == 0) { //se o jogador desistiu
					break;
				}
				
				if (fimDeJogo == 1) { //se o jogador morreu e quer continuar
					novoJogo = true;
				}
				
				if(fimDeJogo == 2){ //se o jogador terminou o jogo
					respostaNovoJogo = JOptionPane.showConfirmDialog(null, "Iniciar Novo jogo?", "Aviso", 0, 1);
					if (respostaNovoJogo == 0) {
						novoJogo = true;
					} else {
						novoJogo = false;
					}
				}
			}
			
			if (escolha == 2) {
				fimDeJogo = arqueiro.arqueiro();

				if (fimDeJogo == 0) { //se o jogador desistiu
					break;
				}
				
				if (fimDeJogo == 1) { //se o jogador morreu e quer continuar
					novoJogo = true;
				}
				
				if(fimDeJogo == 2){ //se o jogador terminou o jogo
					respostaNovoJogo = JOptionPane.showConfirmDialog(null, "Iniciar Novo jogo?", "Aviso", 0, 1);
					if (respostaNovoJogo == 0) {
						novoJogo = true;
					} else {
						novoJogo = false;
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Encerrando sessão...");
		JOptionPane.showMessageDialog(null, "Volte Sempre ^^");
		JOptionPane.showMessageDialog(null, "Sessão encerrada");
		System.exit(0);
	}
}
