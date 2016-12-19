package prova;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;;

public class Prova {
	public static void main(String[] args) {
		LerTxt lertxt = new LerTxt();
		CriarTxt criartxt = new CriarTxt();
		loginDoJogo login = new loginDoJogo();
		EscolhaPersonagem mago = new EscolhaPersonagem();
		EscolhaPersonagem guerreiro = new EscolhaPersonagem();
		EscolhaPersonagem arqueiro = new EscolhaPersonagem();
		int fimDeJogo = 0; // Varialvel inteira para saber se o usuario
								// dese reiniciar o jogo, apos morrer.
		boolean novoJogo = true; // variavel booleana para saber se o usuario
									// deseja jogar um novo jogo, ou não
		int respostaNovoJogo; // Armazena a resposta "Iniciar Novo jogo",
								// localizada no fim da Main
		int nivelDeDificuldade; // Armazena o nível de dificuldade
		int escolha; // Variável interia para fazer comparações e saber qual
						// herói o Jogador escolheu
		Monstros monstros = new Monstros();

		/*
		 * resposta0 = JOptionPane.showConfirmDialog(null,
		 * "Você possui uma conta cadastrada?", "Bem vindo!!", 0, 1);
		 * if(resposta0 == 1){ JOptionPane.showMessageDialog(null,
		 * "Faça o seu cadastro para poder jogar"); criartxt.CriarTXT();
		 * login.login(); } else{ login.login(); }
		 */

		Object[] dificuldade = { "Iniciante", "Intermediário", "Avançado", "Expert", "Impossible" };
		nivelDeDificuldade = JOptionPane.showOptionDialog(null, "Selecione o nível de dificuldade: ", "Nível: ",
				JOptionPane.DEFAULT_OPTION, 3, null, dificuldade, dificuldade[0]);
		switch (nivelDeDificuldade) {
		case 0:
			monstros.setMultiplicadorDeDano(1.0);
			break;
		case 1:
			monstros.setMultiplicadorDeDano(1.20);
			break;
		case 2:
			monstros.setMultiplicadorDeDano(1.45);
			break;
		case 3:
			monstros.setMultiplicadorDeDano(1.80);
			break;
		case 4:
			monstros.setMultiplicadorDeDano(2.0);
			break;
		}

		while (novoJogo) { // falta identar todo o resto
			if (novoJogo) {
				JOptionPane.showMessageDialog(null, "Novo Jogo");
			}
			JOptionPane.showMessageDialog(null, "Vidas: 1");
			JOptionPane.showMessageDialog(null, "Jogue com sabedoria...");
			Object[] herois = { "Mage", "Tanker", "Arqueiro" };
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
			JOptionPane.showMessageDialog(null, "Encerrando sessão...");
			JOptionPane.showMessageDialog(null, "Volte Sempre ^^");
			JOptionPane.showMessageDialog(null, "Sessão encerrada");
			System.exit(0);
		}
	}
}
