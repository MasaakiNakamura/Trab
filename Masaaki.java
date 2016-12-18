package prova;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;;
public class Prova {
    public static void main(String[] args) {
    	LerTxt lertxt = new LerTxt();
    	CriarTxt criartxt = new CriarTxt();
    	loginDoJogo login = new loginDoJogo();
    	double multiplicadorDeDano; //	multiplicador de dano
    	boolean novoJogo = true; //	variavel booleana para saber se o usuario deseja jogar um novo jogo, ou não
    	int respostaNovoJogo; // Armazena a resposta "Iniciar Novo jogo", localizada no fim da Main
    	int nivelDeDificuldade; // Armazena o nivel de dificuldade
    	int habilidade = 0;
        //	Faz a comparação com o valor inteiro amazenado para saber qual hailidade o herṕi utilizou.
        int escolha; //	Variável interia para fazer comparações e saber qual herói o Jogador escolheu 
        int a = 0; //	Parâmetro para printar se o Vencedor foi o herói ou o Monstro
        int i; //	Parâmetro para saber qual ataque o monstro vai exectuar (valor randomico)
        int countH = 0;
        //	Contador que irá permitir executar o ataque especial dos herois quando o mesmo atingir um valor específico  
        int countM = 0;
        //	Contador que irá permitir executar o ataque especial dos monstros quando o mesmo atingir um valor específico]
        int option; //	Variável utilizada quando o personagem morre. Linha 198
        int resposta0; //	Parametro para saber se o jogador já possui uma conta.
        int resposta1; //	Parametro para saber se o jogador já possui uma conta.
    	Random rand = new Random();
        Scanner scan = new Scanner (System.in);
        Monstros dragon = new Dragao(); //	Criandi o objeto Dragão
        Monstros gigante = new Gigante(); //	Criando o objeto Gigante
        Monstros kraken = new Kraken(); //	Criando o objeto Bomba
        dragon.setAtaque(rand.nextInt(15) + 5); //	valor randomico para a defesa do dragão 
        dragon.setDefesa(rand.nextInt(15) + 5); //	valor randomico para a defesa do dragão
        gigante.setAtaque(rand.nextInt(15) + 5); //	valor randomico para a defesa do gigante
        gigante.setDefesa(rand.nextInt(15) + 5); //	valor randomico para a defesa do gigante
        kraken.setAtaque(rand.nextInt(15) + 5); //	valor randomico para a defesa do bomba
        kraken.setDefesa(rand.nextInt(15) + 5); //	valor randomico para a defesa do bomba
/*        
        resposta0 = JOptionPane.showConfirmDialog(null, "Você possui uma conta cadastrada?", "Bem vindo!!", 0, 1);
        if(resposta0 == 1){
        	JOptionPane.showMessageDialog(null, "Faça o seu cadastro para poder jogar");
        	criartxt.CriarTXT();
        	login.login();
        } else{
        	login.login();
        } 
*/
        Object[] dificuldade = {"Iniciante", "Intermediário", "Avançado", "Expert", "Impossible"};
        nivelDeDificuldade = JOptionPane.showOptionDialog(null, "Selecione o nível de dificuldade: ", "Nível: ",
        		JOptionPane.DEFAULT_OPTION, 3, null, dificuldade, dificuldade[0]);
        switch (nivelDeDificuldade){
        	case 0:	multiplicadorDeDano = 0.8;
        			break;
        	case 1:	multiplicadorDeDano = 1.20;
        			break;
        	case 2:	multiplicadorDeDano = 1.45;
					break;
        	case 3:	multiplicadorDeDano = 1.80;
					break;
        	case 4:	multiplicadorDeDano = 2.0;
					break;
        }
        
        while(novoJogo){ //	falta identar todo o resto
        	if(novoJogo){
        		JOptionPane.showMessageDialog(null, "Novo Jogo");
        	}
        	JOptionPane.showMessageDialog(null, "Vidas: 1");
        	JOptionPane.showMessageDialog(null, "Jogue com sabedoria...");
        	Object[] herois = {"Mage", "Tanker", "Arqueiro", "Sniper"};
        	escolha = JOptionPane.showOptionDialog(null, "Selecione uma classe para escolher o seu herói", " ", JOptionPane.DEFAULT_OPTION, 3, null,
        			herois, herois[0]);	
        	
        	if (escolha == 0){
        		Mago mago = new Mago();
        		mago.setClasse("Mago"); //	Atribuição da Classe ao personagem
        		mago.setTipo("Magic Power"); //	Atribuição do Tipo de personagem
        		mago.setNome(JOptionPane.showInputDialog("Escolha o seu nome:"));
        		mago.setAtaque(rand.nextInt(20) + 5); //	valor randomico para o ataque do mago
            	mago.setDefesa(rand.nextInt(20) + 5); //	valor randomico para a defesa do mago
            	mago.setDanoGolpePrimario(rand.nextInt(20) + 5);
            	mago.setDanoGolpePrimario(rand.nextInt(25) + 5);
            	mago.setDanoDoEspecial(rand.nextInt(30) + 10);
            	mago.setVida(600);
            	JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Classe: " + mago.getClasse() + "\n"
            			+ "Tipo de Dano: " + mago.getTipo() +  "\n" + "Vida: " + mago.getVida() + "\n"
            			+ "Ataque: " +  mago.getAtaque() + "\n" + "Defesa: " + mago.getDefesa() + "\n"
            			+  "Habilidade Primária: " +  mago.getNomeGolpePrimario() + "\n"
            			+ "Habilidade Secundária: " + mago.getNomeGolpeSecundario() +  "\n" + "Especial: "
            			+ mago.getNomeDoEspecial() + "\n" + "*******************************" + "\n"
            			+ dragon.getNome() + "\n" + "Vida: " + dragon.getNome() + "\n" + "Ataque: "
            			+ dragon.getAtaque() + "\n" + "Defesa: " + dragon.getDefesa() + "\n"
            			+ "Habilidade Primária: " + dragon.getNomeGolpePrimario() + "\n"
            			+ "Habilidade Secundária: " + dragon.getNomeGolpeSecundario() + "\n"
            			+ "Especial: " + dragon.getNomeDoEspecial(), "Detalhes da Batalha: ", 1);
            			//	printar os atributos do mago e do monstro.
            	JOptionPane.showMessageDialog(null, "Que comece a batalha!");
            	
            	while(true){
            		JOptionPane.showMessageDialog(null, "Sua vez de jogar");
            		Object[] golpesDoHeroi= {mago.getNomeGolpePrimario(), mago.getNomeGolpeSecundario(),
            				mago.getNomeDoEspecial()};
            		Object[] golpesDoHeroiSEspecial = {mago.getNomeGolpePrimario(),
            				mago.getNomeGolpeSecundario()};
            		if(countH >= 2){
            			habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            						JOptionPane.DEFAULT_OPTION, 3, null, golpesDoHeroi, golpesDoHeroi[0]);
            		} else {
            			habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            					JOptionPane.DEFAULT_OPTION, 3, null, golpesDoHeroiSEspecial,
            					golpesDoHeroiSEspecial[0]);
            		}
            		if(habilidade == 0){ //	Comparação: se a habilidade selecionada for o golpe primário.
            			mago.golpePrimarioHeroi(dragon.getVida(), dragon.getAtaque(), dragon.getDefesa(),
            					mago.getDanoDoEspecial()); 
            			//	Comparação: se a habilidade selecionada for o Golpe Primário.
            			countH++;//	contador para disponibilizar o uso do poder especial.
            		} else if (habilidade == 1){
            			//	Comparação: se a habilidade selecionada for o golpe secundário.
            			mago.golpeSecundarioHeroi(dragon.getVida(), mago.getAtaque(), mago.getDefesa(),
            					mago.getDanoDoEspecial()); //Se aplica o método Golpe Secundário()
            			countH++;
            		} else if (habilidade == 2){ //	Comparação: se a habilidade selecionada for Golpe Especial.
            			mago.golpeEspecialHeroi(mago.getVida(), dragon.getVida(), mago.getAtaque(),
            					dragon.getDefesa(), mago.getDanoDoEspecial()); 
            			//	Aplica-se o método Golpe Especial.
            			countH = 0;
            		}
            		
            		if(mago.getVida() <= 0){
            			a = 0;
            			JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Vida: " + mago.getVida() +
            					"\n" + dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
            			break; //	Quebra o while(true) 
            		} else if (dragon.getVida() <= 0){
            			a = 1; 
            			JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Vida: " + mago.getVida() +
                    		"\n" + dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
            			break; //	Quebra o while(true) 
            		}	
            		
            		JOptionPane.showMessageDialog(null, "Rodada do Inimigo...");
            		JOptionPane.showMessageDialog(null, "Eu invoco...");
            		//	Gambiarra para usar tru Catch
            		i = rand.nextInt(3);
            		if(countM > 4){
               		switch (i){
               		//	Se countM for maior que 4, o valor de 'i' será verificado para identificar qual ataque
               		//	foi feito pelo monstro e printá-lo 
						case 0: JOptionPane.showMessageDialog(null, dragon.getNomeGolpePrimario());
					//	Printar o ataque primário
								dragon.golpePrimarioMonstro(mago.getVida(), dragon.getAtaque(),
										mago.getDefesa(), dragon.getDanoGolpePrimario(),
										dragon.getMultiplicadorDeDano());
								countM++;
								break;
						case 1: JOptionPane.showMessageDialog(null, dragon.getNomeGolpeSecundario());
					//	Printar o ataque Secundário
								dragon.golpeSecundarioMonstro(mago.getVida(), dragon.getAtaque(),
										mago.getDefesa(), dragon.getDanoDoGolpeSecundario(),
										dragon.getMultiplicadorDeDano());
								countM++;
								break;
						case 2: JOptionPane.showMessageDialog(null, dragon.getNomeDoEspecial()); 
						//	Printar o ataque Especial 
								dragon.golpeEspecialMonstro(mago.getVida(),dragon.getAtaque(),
										mago.getDefesa(), dragon.getDanoDoEspecial(),
										dragon.getMultiplicadorDeDano()); 
								countM++;	
								break;
               			}
            		} else {
            			i = rand.nextInt(2); 
               		//	Como o especial não poderá ser utilizado, o valor de i terá de ser sorteado novamente,
               		//	pois não há mais 3 possibilidades de ataque
            			switch (i){
            			//	Se countM não for maior que 4, o valor de 'i' será verificado para identificar qual
               		// ata	que foi feito pelo monstro e printá-lo
							case 0: JOptionPane.showMessageDialog(null, dragon.getNomeGolpePrimario());
						//	Printar o ataque primário
									dragon.golpePrimarioMonstro(mago.getVida(), dragon.getAtaque(),
											mago.getDefesa(), dragon.getDanoGolpePrimario(),
											dragon.getMultiplicadorDeDano());
									countM++;
									break;
							case 1: JOptionPane.showMessageDialog(null, dragon.getNomeGolpeSecundario());
						//	Printar o ataque Secundário
									dragon.golpeSecundarioMonstro(mago.getVida(), dragon.getAtaque(),
											mago.getDefesa(), dragon.getDanoDoGolpeSecundario(),
											dragon.getMultiplicadorDeDano());
									countM++;
            			}
            		}
            		countM = 0;
               	
            		if(mago.getVida() <= 0){ 
            		//	Verficação para saber se a vida está negativa. Nesse caso, se o Herói morreu
            			a = 0;
            			JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Vida: " + mago.getVida()
            					+ "\n" + dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
            			break; //	Quebra o while(true)
            		} else if (dragon.getVida() <= 0){ 
            		//		Verficação para saber se a vida está negativa. Nesse caso, se o Monstro morreu
            			a = 1;
            			JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Vida: " + mago.getVida()
            					+ "\n" + dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
            			break; //	Quebra o while(true)
            		}
            	}	
            	
            	if(a == 1){ //	se 'a' for igual a 1, printar o Herói como vencendor da batalha
            		JOptionPane.showMessageDialog(null, "VITÓRIA!!");
            		JOptionPane.showMessageDialog(null, "Vencedor: " + mago.getNome() + "\n" + "\n"+"Ataque: "
            				+ mago.getAtaque() + "\n" + "Defesa: " + mago.getDefesa() + "\n" + "Vida: "
            				+ mago.getVida() + "*******************************" + "\n" + "Perdedor: "
            				+ dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
            		JOptionPane.showMessageDialog(null, dragon.getMensagemDeVitoria());
            		JOptionPane.showMessageDialog(null, "Bônus de Vitória:" + "\n" + "+X% da vida perdida");
           		//	De	terminar o quanto de atributos que irá acrescentar ao valor inicial
           		//	printar frase de vitória do oponente
            		JOptionPane.showMessageDialog(null, "Parabéns!! \nPróxima fase: " + gigante.getNome());
            		JOptionPane.showMessageDialog(null, "Boa sorte!! \n(Vai precisar...)");
            	} else if(a == 0){ //se 'a' for igual a 0, printar o Monstro como Vencedor da batalha
            		JOptionPane.showMessageDialog(null, "DERROTA!!");
            		JOptionPane.showMessageDialog(null, "Vencedor: " + dragon.getNome() + "n" + "Vida: "
            				+ dragon.getVida() + "*******************************" + "\n" + "Perdedor: "
            				+ dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
            		JOptionPane.showMessageDialog(null, dragon.getMensagemDeDerrota());
          			//	printar frase de derrota do oponente
            		Object	[] tentarNovamente = {"Sim", "Desistir"};
            		option = JOptionPane.showOptionDialog(null, "E então?", "Novo jogo?",
          						JOptionPane.DEFAULT_OPTION, 3, null, tentarNovamente,
          						tentarNovamente[0]);
            		}
            	
            	JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Classe: " + mago.getClasse() + "\n"
            			+ "Tipo de Dano: " + mago.getTipo() +  "\n" + "Vida: " + mago.getVida() + "\n"
            			+ "Ataque: " +  mago.getAtaque() + "\n" + "Defesa: " + mago.getDefesa() + "\n"
            			+  "Habilidade Primária: " +  mago.getNomeGolpePrimario() + "\n"
            			+ "Habilidade Secundária: " + mago.getNomeGolpeSecundario() +  "\n" + "Especial: "
            			+ mago.getNomeDoEspecial() + "\n" + "*******************************" + "\n"
            			+ gigante.getNome() + "\n" + "Vida: " + gigante.getNome() + "\n" + "Ataque: "
            			+ gigante.getAtaque() + "\n" + "Defesa: " + gigante.getDefesa() + "\n"
            			+ "Habilidade Primária: " + gigante.getNomeGolpePrimario() + "\n"
            			+ "Habilidade Secundária: " + gigante.getNomeGolpeSecundario() + "\n"
            			+ "Especial: " + gigante.getNomeDoEspecial(), "Detalhes da Batalha: ", 1);
            	//	printar os atributos do mago e do monstro.
            	JOptionPane.showMessageDialog(null, "Que comece a batalha!");
            	
            	while(true){
            		JOptionPane.showMessageDialog(null, "Sua vez de jogar");
            		Object[] golpesDoHeroi= {mago.getNomeGolpePrimario(), mago.getNomeGolpeSecundario(),
            				mago.getNomeDoEspecial()};
            		Object[] golpesDoHeroiSEspecial = {mago.getNomeGolpePrimario(), mago.getNomeGolpeSecundario()};
            		if(countH >= 2){
            			habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            						JOptionPane.DEFAULT_OPTION, 3, null, golpesDoHeroi, golpesDoHeroi[0]);
            		} else {
            			habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            					JOptionPane.DEFAULT_OPTION, 3, null,  golpesDoHeroiSEspecial,
            					golpesDoHeroiSEspecial[0]);
            		}
            		if(habilidade == 0){ //Comparação: se a habilidade selecionada for o golpe primário.
            			mago.golpePrimarioHeroi(gigante.getVida(), gigante.getAtaque(), gigante.getDefesa(),
            					mago.getDanoDoEspecial()); 
            			//	Comparação: se a habilidade selecionada for o Golpe Primário.
            			countH	++;//contador para disponibilizar o uso do poder especial.
            		} else if (habilidade == 1){
            		//	Comparação: se a habilidade selecionada for o golpe secundário.
            			mago.golpeSecundarioHeroi(gigante.getVida(), mago.getAtaque(), mago.getDefesa(),
            					mago.getDanoDoEspecial()); //Se aplica o método Golpe Secundário()
            			countH++;
            		} else if (habilidade == 2){ ////Comparação: se a habilidade selecionada for Golpe Especial.
            			mago.golpeEspecialHeroi(mago.getVida(), gigante.getVida(), mago.getAtaque(),
            					gigante.getDefesa(), mago.getDanoDoEspecial()); 
            		//	Aplica-se o método Golpe Especial.
            			countH = 0;
            		}
           		
            		if(mago.getVida() <= 0){
            			a = 0;
            			JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Vida: " + mago.getVida()
            					+ "\n" + gigante.getNome() + "\n" + "Vida: " + gigante.getVida());
            			break; //	Quebra o while(true) 
            		} else if (gigante.getVida() <= 0){
            			a = 1;
            			JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Vida: " + mago.getVida()
            					+ "\n" + gigante.getNome() + "\n" + "Vida: " + gigante.getVida());
            			break; //	Quebra o while(true) 
            		}
            		
            		JOptionPane.showMessageDialog(null, "Rodada do Inimigo...");
            		JOptionPane.showMessageDialog(null, "Eu invoco...");
           			//	Gambiarra para usar tru Catch
            		i = rand.nextInt(3);
           			if(countM > 4){
           				switch (i){
           				//	Se countM for maior que 4, o valor de 'i' será verificado para identificar qual ataque
           				//	foi feito pelo monstro e printá-lo 
   							case 0: JOptionPane.showMessageDialog(null, gigante.getNomeGolpePrimario());
   						//	Printar o ataque primário
   									gigante.golpePrimarioMonstro(mago.getVida(), gigante.getAtaque(),
   											mago.getDefesa(), gigante.getDanoGolpePrimario(),
   											gigante.getMultiplicadorDeDano());
   									countM++;
   									break;
   							case 1: JOptionPane.showMessageDialog(null, gigante.getNomeGolpeSecundario());
   						//	Printar o ataque Secundário
   									gigante.golpeSecundarioMonstro(mago.getVida(), gigante.getAtaque(),
   											mago.getDefesa(), gigante.getDanoDoGolpeSecundario(),
   											gigante.getMultiplicadorDeDano());
   									countM++;
   								break;
   							case 2: JOptionPane.showMessageDialog(null, gigante.getNomeDoEspecial()); 
   					//	Printar o ataque Especial 
   									gigante.golpeEspecialMonstro(mago.getVida(),gigante.getAtaque(),
   											mago.getDefesa(), gigante.getDanoDoEspecial(),
   										gigante.getMultiplicadorDeDano()); 
   									countM++;	
   									break;
           				}
           			} else {
           				i = rand.nextInt(2); 
           				//	Como o especial não poderá ser utilizado, o valor de i terá de ser sorteado novamente,
           				// 	pois não há mais 3 possibilidades de ataque
           					switch (i){
           					//	Se countM não for maior que 4, o valor de 'i' será verificado para identificar qual
           					//	ataque foi feito pelo monstro e printá-lo
           						case 0: JOptionPane.showMessageDialog(null, gigante.getNomeGolpePrimario()); 
           						//	Printar o ataque primário
           								countM++;
           								break;
           						case 1: JOptionPane.showMessageDialog(null, gigante.getNomeGolpeSecundario());
           						//	Printar o ataque secundário 
           							countM++;
           							break;
           					}
           			}
           			countM = 0;
           			
           			if(mago.getVida() <= 0){ 
           			//	Verficação para saber se a vida está negativa. Nesse caso, se o Herói morreu
           				a = 0;
           				JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Vida: " + mago.getVida()
           						+ "\n" + gigante.getNome() + "\n" + "Vida: " + gigante.getVida());
           				break; //Quebra o while(true)
           			} else if (gigante.getVida() <= 0){
           			//	Verficação para saber se a vida está negativa. Nesse caso, se o Monstro morreu
           				a = 1;
           				JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Vida: " + mago.getVida()
           						+ "\n" + gigante.getNome() + "\n" + "Vida: " + gigante.getVida());
           				break; //Quebra o while(true) 
           			}
            	}
            	
            	if(a == 1){ //se 'a' for igual a 1, printar o Herói como vencendor da batalha
            		JOptionPane.showMessageDialog(null, "VITÓRIA!!");
            		JOptionPane.showMessageDialog(null, "Vencedor: " + mago.getNome() + "\n" + "\n " + "Ataque: "
            				+ mago.getAtaque() + "\n" + "Defesa: " + mago.getDefesa() + "\n" + "Vida: " + mago.getVida()
            				+ "*******************************" + "\n" + "Perdedor: " + gigante.getNome() + "\n"
            				+ "Vida: " + gigante.getVida());
            		JOptionPane.showMessageDialog(null, gigante.getMensagemDeVitoria());
            		JOptionPane.showMessageDialog(null, "Bônus de Vitória:" + "\n" + "+X% da vida perdida");
            		//	Determinar o quanto de atributos que irá acrescentar ao valor inicial
            		//	printar frase de vitória do oponente
            		JOptionPane.showMessageDialog(null, "Parabéns!! \nPróxima fase: " + kraken.getNome());
            		JOptionPane.showMessageDialog(null, "Boa sorte!! \n(Vai precisar...)");
            	} else if(a == 0){ //se 'a' for igual a 0, printar o Monstro como Vencedor da batalha
            		JOptionPane.showMessageDialog(null, "DERROTA!!");
            		JOptionPane.showMessageDialog(null, "Vencedor: " + gigante.getNome() + "n" + "Vida: "
            				+ gigante.getVida() + "*******************************" + "\n" + "Perdedor: "
            				+ mago.getNome() + "\n" + "Vida: " + mago.getVida());
            		JOptionPane.showMessageDialog(null, gigante.getMensagemDeDerrota()); 
            		//	printar frase de derrota do oponente
            		Object[] tentarNovamente = {"Sim", "Desistir"};
           			option = JOptionPane.showOptionDialog(null, "E então?", "Novo jogo?",
           					JOptionPane.DEFAULT_OPTION, 3, null, tentarNovamente,
           					tentarNovamente[0]);
            	}
           	
            	JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Classe: " + mago.getClasse() + "\n"
            			+ "Tipo de Dano: " + mago.getTipo() +  "\n" + "Vida: " + mago.getVida() + "\n"
            			+ "Ataque: " +  mago.getAtaque() + "\n" + "Defesa: " + mago.getDefesa() + "\n"
            			+  "Habilidade Primária: " +  mago.getNomeGolpePrimario() + "\n"
            			+ "Habilidade Secundária: " + mago.getNomeGolpeSecundario() +  "\n" + "Especial: "
            			+ mago.getNomeDoEspecial() + "\n" + "*******************************" + "\n"
            			+ kraken.getNome() + "\n" + "Vida: " + kraken.getNome() + "\n" + "Ataque: "
            			+ kraken.getAtaque() + "\n" + "Defesa: " + kraken.getDefesa() + "\n"
            			+ "Habilidade Primária: " + kraken.getNomeGolpePrimario() + "\n"
            			+ "Habilidade Secundária: " + kraken.getNomeGolpeSecundario() + "\n"
            			+ "Especial: " + kraken.getNomeDoEspecial(), "Detalhes da Batalha: ", 1);
            	//	printar os atributos do mago e do monstro.
            	JOptionPane.showMessageDialog(null, "Que comece a batalha!");
            	
            	while(true){
            		JOptionPane.showMessageDialog(null, "Sua vez de jogar");
            		Object[] golpesDoHeroi= {mago.getNomeGolpePrimario(), mago.getNomeGolpeSecundario(),
            				mago.getNomeDoEspecial()};
            		Object[] golpesDoHeroiSEspecial = {mago.getNomeGolpePrimario(), mago.getNomeGolpeSecundario()};
            		if(countH >= 2){
            			habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            					JOptionPane.DEFAULT_OPTION, 3, null, golpesDoHeroi, golpesDoHeroi[0]);
            		} else {
            			habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            					JOptionPane.DEFAULT_OPTION, 3, null,  golpesDoHeroiSEspecial,
            					golpesDoHeroiSEspecial[0]);
            		}
            		if(habilidade == 0){ //Comparação: se a habilidade selecionada for o golpe primário.
            			mago.golpePrimarioHeroi(kraken.getVida(), kraken.getAtaque(), kraken.getDefesa(),
            					mago.getDanoDoEspecial()); 
            		//	Comparação: se a habilidade selecionada for o Golpe Primário.
            			countH++;//contador para disponibilizar o uso do poder especial.
            		} else if (habilidade == 1){
            		//Comparação: se a habilidade selecionada for o golpe secundário.
            			mago.golpeSecundarioHeroi(kraken.getVida(), mago.getAtaque(), mago.getDefesa(),
            					mago.getDanoDoEspecial()); //Se aplica o método Golpe Secundário()
            			countH++;
            		} else if (habilidade == 2){ ////Comparação: se a habilidade selecionada for Golpe Especial.
            			mago.golpeEspecialHeroi(mago.getVida(), kraken.getVida(), mago.getAtaque(),
            					kraken.getDefesa(), mago.getDanoDoEspecial()); 
            		//	Aplica-se o método Golpe Especial.
            			countH = 0;
            		}
            		
            		if(mago.getVida() <= 0){
            			a = 0;
            			JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Vida: " + mago.getVida()
            					+ "\n" + kraken.getNome() + "\n" +"Vida: " + kraken.getVida());
            				break; //	Quebra o while(true) 
            		} else if (kraken.getVida() <= 0){
            			a = 1;
            			JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Vida: " + mago.getVida()
            					+ "\n" + kraken.getNome() + "\n" +"Vida: " + kraken.getVida());
            			break; //Quebra o while(true)
            		}
            		
            		JOptionPane.showMessageDialog(null, "Rodada do Inimigo...");
            		JOptionPane.showMessageDialog(null, "Eu invoco...");
            		//	Gambiarra para usar tru Catch
            		i = rand.nextInt(3);
           			if(countM > 4){
           				switch (i){
           				//	Se countM for maior que 4, o valor de 'i' será verificado para identificar qual
           				//	ataque foi feito pelo monstro e printá-lo 
   							case 0: JOptionPane.showMessageDialog(null, kraken.getNomeGolpePrimario());
   						//	Printar o ataque primário
   									kraken.golpePrimarioMonstro(mago.getVida(), kraken.getAtaque(),
   											mago.getDefesa(), kraken.getDanoGolpePrimario(),
   											kraken.getMultiplicadorDeDano());
   									countM++;
   									break;
   							case 1: JOptionPane.showMessageDialog(null, kraken.getNomeGolpeSecundario());
   						//	Printar o ataque Secundário
   									kraken.golpeSecundarioMonstro(mago.getVida(), kraken.getAtaque(),
   											mago.getDefesa(), kraken.getDanoDoGolpeSecundario(),
   											kraken.getMultiplicadorDeDano());
   									countM++;
   									break;
   							case 2: JOptionPane.showMessageDialog(null, kraken.getNomeDoEspecial()); 
   							//	Printar o ataque Especial 
   									kraken.golpeEspecialMonstro(mago.getVida(),kraken.getAtaque(),
   											mago.getDefesa(), kraken.getDanoDoEspecial(),
   											kraken.getMultiplicadorDeDano()); 
   									countM++;	
   									break;
           				}
           			} else {
           				i = rand.nextInt(2);
           				//	Como o especial não poderá ser utilizado, o valor de i terá de ser sorteado novamente, 
           				//	pois não há mais 3 possibilidades de ataque
           				switch (i){
           				//	Se countM não for maior que 4, o valor de 'i' será verificado para identificar qual
           				//	ataque foi feito pelo monstro e printá-lo
							case 0: JOptionPane.showMessageDialog(null, kraken.getNomeGolpePrimario());
						//	Printar o ataque primário
									kraken.golpePrimarioMonstro(mago.getVida(), kraken.getAtaque(),
											mago.getDefesa(), kraken.getDanoGolpePrimario(),
											kraken.getMultiplicadorDeDano());
									countM++;
									break;
							case 1: JOptionPane.showMessageDialog(null, kraken.getNomeGolpeSecundario());
						//	Printar o ataque Secundário
									kraken.golpeSecundarioMonstro(mago.getVida(), kraken.getAtaque(),
											mago.getDefesa(), kraken.getDanoDoGolpeSecundario(),
											kraken.getMultiplicadorDeDano());
									countM++;
									break;
           				}
           			}
           			countM = 0;
           			
           			if(mago.getVida() <= 0){
           			//	Verficação para saber se a vida está negativa. Nesse caso, se o Herói morreu
           				a = 0;
           				JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Vida: " + mago.getVida()
           						+ "\n" + kraken.getNome() + "\n" + "Vida: " + kraken.getVida());
           				break; //Quebra o while(true) 
           			} else if (kraken.getVida() <= 0){ 
           			//	Verficação para saber se a vida está negativa. Nesse caso, se o Monstro morreu
           				a = 1;
           				JOptionPane.showMessageDialog(null, mago.getNome() + "\n" + "Vida: " + mago.getVida() +
           						"\n" + kraken.getNome() + "\n" + "Vida: " + kraken.getVida());
           				break; //Quebra o while(true) 
           			}
            	}
            	
            	if(a == 1){ //se 'a' for igual a 1, printar o Herói como vencendor da batalha
            			JOptionPane.showMessageDialog(null, "VITÓRIA!!");
            			JOptionPane.showMessageDialog(null, "Vencedor: " + mago.getNome() + "\n" + "\n"+"Ataque: "
            					+ mago.getAtaque() + "\n" + "Defesa: " + mago.getDefesa() + "\n" + "Vida: "
            					+ mago.getVida() + "*******************************" + "\n" + "Perdedor: "
            					+ kraken.getNome() + "\n" + "Vida: " + kraken.getVida());
            			JOptionPane.showMessageDialog(null, kraken.getMensagemDeVitoria());
            			//	printar frase de vitória do oponente
            			JOptionPane.showMessageDialog(null, "Congratulations");
            			JOptionPane.showMessageDialog(null, "You has finished this game. You are the best player of " +
            					"the UFPA's world");
           				//	+ " the UFPA");
            	} else if(a == 0){ //se 'a' for igual a 0, printar o Monstro como Vencedor da batalha
            		JOptionPane.showMessageDialog(null, "DERROTA!!");
            		JOptionPane.showMessageDialog(null, "Vencedor: " + kraken.getNome() + "n" + "Vida: "
            				+ kraken.getVida() + "*******************************" + "\n" + "Perdedor: "
            				+ kraken.getNome() + "\n" + "Vida: " + kraken.getVida());
            		JOptionPane.showMessageDialog(null, kraken.getMensagemDeDerrota());
            		//	printar frase de derrota do oponente
            		Object[] tentarNovamente = {"Sim", "Desistir"};
            		option = JOptionPane.showOptionDialog(null, "E então?", "Novo jogo?",
            				JOptionPane.DEFAULT_OPTION, 3, null, tentarNovamente,
            				tentarNovamente[0]);
            	}
        	}
        	
        	if (escolha == 1){
        		Guerreiro guerreiro = new Guerreiro();
        		guerreiro.setClasse("Guerreiro"); //Atribuição da Classe ao personagem
        		guerreiro.setTipo("Physical Damage"); //Atribuição do Tipo de personagem
        		guerreiro.setNome(JOptionPane.showInputDialog("Escolha o seu nome:"));
        		guerreiro.setAtaque(rand.nextInt(10)); //valor randomico para o ataque do mago
            	guerreiro.setDefesa(rand.nextInt(10)); //valor randomico para a defesa do mago
            	guerreiro.setAtaque(rand.nextInt(20) + 5); //valor randomico para o ataque do mago
            	guerreiro.setDefesa(rand.nextInt(20) + 5); //valor randomico para a defesa do mago
            	guerreiro.setDanoGolpePrimario(rand.nextInt(20) + 5);
            	guerreiro.setDanoGolpePrimario(rand.nextInt(25) + 5);
            	guerreiro.setDanoDoEspecial(rand.nextInt(30) + 10);
            	JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Classe: "
            			+ guerreiro.getClasse() + "\n" + "Tipo de Dano: " + guerreiro.getTipo() +  "\n"
            			+ "Vida: " + guerreiro.getVida() + "\n" + "Ataque: " +  guerreiro.getAtaque() + "\n"
            			+ "Defesa: " + guerreiro.getDefesa() + "\n" +  "Habilidade Primária: "
            			+  guerreiro.getNomeGolpePrimario() + "\n" + "Habilidade Secundária: "
            			+ guerreiro.getNomeGolpeSecundario() +  "\n" + "Especial: "+ guerreiro.getNomeDoEspecial()
            			+ "\n" + "*******************************" + "\n" + dragon.getNome() + "\n" + "Vida: "
            			+ dragon.getNome() + "\n" + "Ataque: " + dragon.getAtaque() + "\n" + "Defesa: "
            			+ dragon.getDefesa() + "\n" + "Habilidade Primária: " + dragon.getNomeGolpePrimario()
            			+ "\n" + "Habilidade Secundária: " + dragon.getNomeGolpeSecundario() + "\n" 
            			+ "Especial: " + dragon.getNomeDoEspecial(), "Detalhes da Batalha: ", 1);
            	//	printar os atributos do mago e do monstro.
            	JOptionPane.showMessageDialog(null, "Que comece a batalha!");
            	
            	while(true){
            		JOptionPane.showMessageDialog(null, "Sua vez de jogar");
            		Object[] golpesDoHeroi= {guerreiro.getNomeGolpePrimario(), 
            				guerreiro.getNomeGolpeSecundario(), guerreiro.getNomeDoEspecial()};
            		Object[] golpesDoHeroiSEspecial = {guerreiro.getNomeGolpePrimario(), 
            			guerreiro.getNomeGolpeSecundario()};
            	if(countH >= 2){
            		habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            				JOptionPane.DEFAULT_OPTION, 3, null, golpesDoHeroi, golpesDoHeroi[0]);
            	} else {
            		habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            				JOptionPane.DEFAULT_OPTION, 3, null, golpesDoHeroiSEspecial,
            				golpesDoHeroiSEspecial[0]);
            	}
            	if(habilidade == 0){ //Comparação: se a habilidade selecionada for o golpe primário.
            		guerreiro.golpePrimarioHeroi(dragon.getVida(), guerreiro.getAtaque(), dragon.getDefesa(),
            				guerreiro.getDanoDoEspecial()); 
            		//Comparação: se a habilidade selecionada for o Golpe Primário.
            		countH++;//contador para disponibilizar o uso do poder especial.
            	} else if (habilidade == 1){
            		////Comparação: se a habilidade selecionada for o golpe secundário.
            		guerreiro.golpeSecundarioHeroi(dragon.getVida(), guerreiro.getAtaque(), dragon.getDefesa(),
            				guerreiro.getDanoDoEspecial()); //Se aplica o método Golpe Secundário()
            		countH++;
            	} else if (habilidade == 2){ ////Comparação: se a habilidade selecionada for Golpe Especial.
            		guerreiro.golpeEspecialHeroi(guerreiro.getVida(), dragon.getVida(), guerreiro.getAtaque(),
            				dragon.getDefesa(), guerreiro.getDanoDoEspecial()); 
            		//Aplica-se o método Golpe Especial.
            		countH = 0;
            	}
            	
               	if(guerreiro.getVida() <= 0){
                    a = 0;
                    JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Vida: " +
                    guerreiro.getVida() + "\n" + dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
                    break; //Quebra o while(true)
            	} else if (dragon.getVida() <= 0){
                    a = 1;
                    JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Vida: " +
                    guerreiro.getVida() + "\n" + dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
                    break; //Quebra o while(true)
            	}

               	JOptionPane.showMessageDialog(null, "Rodada do Inimigo...");
               	JOptionPane.showMessageDialog(null, "Eu invoco...");
               	//Gambiarra para usar tru Catch
               	i = rand.nextInt(3);
               	if(countM > 4){
               		switch (i){ 
               		//Se countM for maior que 4, o valor de 'i' será verificado para identificar qual
               		//ataque foi feito pelo monstro e printá-lo 
   						case 0: JOptionPane.showMessageDialog(null, dragon.getNomeGolpePrimario());
   						//	Printar o ataque primário
   								dragon.golpePrimarioMonstro(guerreiro.getVida(), dragon.getAtaque(),
   										guerreiro.getDefesa(), dragon.getDanoGolpePrimario(),
   										dragon.getMultiplicadorDeDano());
   								countM++;
   								break;
   						case 1: JOptionPane.showMessageDialog(null, dragon.getNomeGolpeSecundario());
   						//	Printar o ataque Secundário
   								dragon.golpeSecundarioMonstro(guerreiro.getVida(), dragon.getAtaque(),
										guerreiro.getDefesa(), dragon.getDanoDoGolpeSecundario(),
										dragon.getMultiplicadorDeDano());
   								countM++;
   								break;
   						case 2: JOptionPane.showMessageDialog(null, dragon.getNomeDoEspecial()); 
   					//	Printar o ataque Especial 
   								dragon.golpeEspecialMonstro(guerreiro.getVida(),dragon.getAtaque(),
   										guerreiro.getDefesa(), dragon.getDanoDoEspecial(),
   										dragon.getMultiplicadorDeDano()); 
   								countM++;	
   								break;
               		}
               	} else {
               		i = rand.nextInt(2);
               		//Como o especial não poderá ser utilizado, o valor de i terá de ser sorteado novamente, 
               		//pois não há mais 3 possibilidades de ataque
               		switch (i){
               		//Se countM não for maior que 4, o valor de 'i' será verificado para identificar qual
               		//ataque foi feito pelo monstro e printá-lo
						case 0: JOptionPane.showMessageDialog(null, dragon.getNomeGolpePrimario());
						//	Printar o ataque primário
								dragon.golpePrimarioMonstro(guerreiro.getVida(), dragon.getAtaque(),
										guerreiro.getDefesa(), dragon.getDanoGolpePrimario(),
										dragon.getMultiplicadorDeDano());
								countM++;
								break;
						case 1: JOptionPane.showMessageDialog(null, dragon.getNomeGolpeSecundario());
						//	Printar o ataque Secundário
								dragon.golpeSecundarioMonstro(guerreiro.getVida(), dragon.getAtaque(),
									guerreiro.getDefesa(), dragon.getDanoDoGolpeSecundario(),
									dragon.getMultiplicadorDeDano());
								countM++;
								break;
               		}
               	}
               	countM = 0;
               	                    	
            	if(guerreiro.getVida() <= 0){
            		//Verficação para saber se a vida está negativa. Nesse caso, se o Herói morreu
                    a = 0;
                    JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Vida: " +
                    guerreiro.getVida() + "\n" + dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
                    break;
            	} else if (dragon.getVida() <= 0){ 
            		//Verficação para saber se a vida está negativa. Nesse caso, se o Monstro morreu
                    a = 1;
                    JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Vida: " +
                    guerreiro.getVida() + "\n" + dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
                    break;
            	}
            }
            
           	if(a == 1){ //se 'a' for igual a 1, printar o Herói como vencendor da batalha
           		JOptionPane.showMessageDialog(null, "VITÓRIA!!");
           		JOptionPane.showMessageDialog(null, "Vencedor: " + guerreiro.getNome() + "\n" +
           				"\n"+"Ataque: " + guerreiro.getAtaque() + "\n" +
           				"Defesa: " + guerreiro.getDefesa() + "\n" + "Vida: " + guerreiro.getVida() +
           				"*******************************" + "\n" + "Perdedor: " +  dragon.getNome() + "\n" +
           				"Vida: " + dragon.getVida());
           		JOptionPane.showMessageDialog(null, dragon.getMensagemDeVitoria());
           		//printar frase de vitória do oponente
           		JOptionPane.showMessageDialog(null, "Parabéns!! \nPróxima fase: " + gigante.getNome());
           		JOptionPane.showMessageDialog(null, "Bônus de Vitória:" + "\n" + "+X% da vida perdida");
           		//Determinar o quanto de atributos que irá acrescentar ao valor inicial
           		JOptionPane.showMessageDialog(null, "Boa sorte!! \n(Vai precisar...)");
           	} else if(a == 0){ //se 'a' for igual a 0, printar o Monstro como Vencedor da batalha
           		JOptionPane.showMessageDialog(null, "DERROTA!!");
          		JOptionPane.showMessageDialog(null, "Vencedor: " + dragon.getNome() + "n" + "Vida: " +
          				dragon.getVida() + "*******************************" + "\n" + "Perdedor: " +
          				dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
          		JOptionPane.showMessageDialog(null, dragon.getMensagemDeDerrota()); 
          		//printar frase de derrota do oponente
          		Object[] tentarNovamente = {"Sim", "Desistir"};
          		option = JOptionPane.showOptionDialog(null, "E então?", "Novo jogo?", 
          				JOptionPane.DEFAULT_OPTION, 3, null, tentarNovamente,
          				tentarNovamente[0]);
          	}
        
        	JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Classe: "
        			+ guerreiro.getClasse() + "\n" + "Tipo de Dano: " + guerreiro.getTipo() +  "\n"
        			+ "Vida: " + guerreiro.getVida() + "\n" + "Ataque: " +  guerreiro.getAtaque() + "\n"
        			+ "Defesa: " + guerreiro.getDefesa() + "\n" +  "Habilidade Primária: "
        			+  guerreiro.getNomeGolpePrimario() + "\n" + "Habilidade Secundária: "
        			+ guerreiro.getNomeGolpeSecundario() +  "\n" + "Especial: "+ guerreiro.getNomeDoEspecial()
        			+ "\n" + "*******************************" + "\n" + gigante.getNome() + "\n" + "Vida: "
        			+ gigante.getNome() + "\n" + "Ataque: " + gigante.getAtaque() + "\n" + "Defesa: "
        			+ gigante.getDefesa() + "\n" + "Habilidade Primária: " + gigante.getNomeGolpePrimario()
        			+ "\n" + "Habilidade Secundária: " + gigante.getNomeGolpeSecundario() + "\n" 
        			+ "Especial: " + gigante.getNomeDoEspecial(), "Detalhes da Batalha: ", 1);
           	//printar os atributos do mago e do monstro.
           	JOptionPane.showMessageDialog(null, "Que comece a batalha!");
           	
           	while(true){
           		JOptionPane.showMessageDialog(null, "Sua vez de jogar");
           		Object[] golpesDoHeroi= {guerreiro.getNomeGolpePrimario(), guerreiro.getNomeGolpeSecundario(),
           				guerreiro.getNomeDoEspecial()};
            	Object[] golpesDoHeroiEspecial = {guerreiro.getNomeGolpePrimario(),
            			guerreiro.getNomeGolpeSecundario()};
            	if(countH >= 2){
            		habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            				JOptionPane.DEFAULT_OPTION, 3, null, golpesDoHeroi, golpesDoHeroi[0]);
            	} else {
            		habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            				JOptionPane.DEFAULT_OPTION, 3, null, golpesDoHeroiEspecial,
            				golpesDoHeroiEspecial[0]);
            	}
            	if(habilidade == 0){ //Comparação: se a habilidade selecionada for o golpe primário.
            		guerreiro.golpePrimarioHeroi(gigante.getVida(), guerreiro.getAtaque(), gigante.getDefesa(),
            				guerreiro.getDanoDoEspecial()); 
            		//Comparação: se a habilidade selecionada for o Golpe Primário.
            		countH++;//contador para disponibilizar o uso do poder especial.
            	} else if (habilidade == 1){
            		////Comparação: se a habilidade selecionada for o golpe secundário.
            		guerreiro.golpeSecundarioHeroi(gigante.getVida(), guerreiro.getAtaque(), gigante.getDefesa(),
            				guerreiro.getDanoDoEspecial()); //Se aplica o método Golpe Secundário()
            		countH++;
            	} else if (habilidade == 2){ ////Comparação: se a habilidade selecionada for Golpe Especial.
            		guerreiro.golpeEspecialHeroi(guerreiro.getVida(), gigante.getVida(), guerreiro.getAtaque(),
            				gigante.getDefesa(), guerreiro.getDanoDoEspecial()); 
            		//Aplica-se o método Golpe Especial.
            		countH = 0;
            	}
           		
           		if(guerreiro.getVida() <= 0){
           			a = 0;
           			JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Vida: " +
           			guerreiro.getVida() + "\n" + gigante.getNome() + "\n" + "Vida: " + gigante.getVida());
           			break; //Quebra o while(true) da linha 396
           		} else if (gigante.getVida() <= 0){
           			a = 1;
           			JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Vida: " +
           			guerreiro.getVida() + "\n" + gigante.getNome() + "\n" + "Vida: " + gigante.getVida());
           			break; //Quebra o while(true) da linha 396
           		}	
           		
           		JOptionPane.showMessageDialog(null, "Rodada do Inimigo...");
           		JOptionPane.showMessageDialog(null, "Eu invoco...");
           	//	Gambiarra para usar tru Catch
           		i = rand.nextInt(3);
           		if(countM > 4){
           			switch (i){
           			//Se countM for maior que 4, o valor de 'i' será verificado para identificar qual ataque
           			//foi feito pelo monstro e printá-lo 
   						case 0: JOptionPane.showMessageDialog(null, gigante.getNomeGolpePrimario());
   						//	Printar o ataque primário
   								gigante.golpePrimarioMonstro(guerreiro.getVida(), gigante.getAtaque(),
   										guerreiro.getDefesa(), gigante.getDanoGolpePrimario(),
   										gigante.getMultiplicadorDeDano());
   								countM++;
   								break;
   						case 1: JOptionPane.showMessageDialog(null, gigante.getNomeGolpeSecundario());
   						//	Printar o ataque Secundário
   								gigante.golpeSecundarioMonstro(guerreiro.getVida(), gigante.getAtaque(),
										guerreiro.getDefesa(), gigante.getDanoDoGolpeSecundario(),
										gigante.getMultiplicadorDeDano());
   								countM++;
   								break;
   						case 2: JOptionPane.showMessageDialog(null, gigante.getNomeDoEspecial()); 
   						//	Printar o ataque Especial 
   								gigante.golpeEspecialMonstro(guerreiro.getVida(),gigante.getAtaque(),
   										guerreiro.getDefesa(), gigante.getDanoDoEspecial(),
   										gigante.getMultiplicadorDeDano()); 
   								countM++;	
   								break;
           			}
           		} else {
           			i = rand.nextInt(2);
           			//Como o especial não poderá ser utilizado, o valor de i terá de ser sorteado novamente,
           			//pois não há mais 3 possibilidades de ataque
           			switch (i){
           				case 0: JOptionPane.showMessageDialog(null, gigante.getNomeGolpePrimario());
           				//	Printar o ataque primário
   								gigante.golpePrimarioMonstro(guerreiro.getVida(), gigante.getAtaque(),
   										guerreiro.getDefesa(), gigante.getDanoGolpePrimario(),
   										gigante.getMultiplicadorDeDano());
   								countM++;
   								break;
           				case 1: JOptionPane.showMessageDialog(null, gigante.getNomeGolpeSecundario());
           				//	Printar o ataque Secundário
           						gigante.golpeSecundarioMonstro(guerreiro.getVida(), gigante.getAtaque(),
           								guerreiro.getDefesa(), gigante.getDanoDoGolpeSecundario(),
           								gigante.getMultiplicadorDeDano());
           						countM++;
           						break;
           			}
           		}
           		countM = 0;
           	                    		
           		if(guerreiro.getVida() <= 0){ //Verficação para saber se a vida está negativa.
           			//Nesse caso, se o Herói morreu
           			a = 0;
           			JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Vida: "
           						+ guerreiro.getVida() + "\n" + gigante.getNome() + "\n" + "Vida: "
           						+ gigante.getVida());
           			break; //Quebra o while(true) 
           		} else if (gigante.getVida() <= 0){ 
           			//Verficação para saber se a vida está negativa. Nesse caso, se o Monstro morreu
           			a = 1;
           			JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Vida: "
           						+ guerreiro.getVida() + "\n" + gigante.getNome() + "\n" + "Vida: "
           						+ gigante.getVida());
           			break; //Quebra o while(true)
           		}
           	}
           	
           	if(a == 1){ //se 'a' for igual a 1, printar o Herói como vencendor da batalha
           		JOptionPane.showMessageDialog(null, "VITÓRIA!!");
           		JOptionPane.showMessageDialog(null, "Vencedor: " + guerreiro.getNome() + "\n" + "\n"+"Ataque: "
           				+ guerreiro.getAtaque() + "\n" + "Defesa: " + guerreiro.getDefesa() + "\n" + "Vida: " +
           				guerreiro.getVida() + "*******************************" + "\n" + "Perdedor: " +
           				gigante.getNome() + "\n" + "Vida: " + gigante.getVida());
           		JOptionPane.showMessageDialog(null, gigante.getMensagemDeVitoria());
           		JOptionPane.showMessageDialog(null, "Bônus de Vitória:" + "\n" + "+X% da vida perdida");
           		//Determinar o quanto de atributos que irá acrescentar ao valor inicial
           		//printar frase de vitória do oponente.
           		JOptionPane.showMessageDialog(null, "Parabéns!! \nPróxima fase: " + kraken.getNome());
           		JOptionPane.showMessageDialog(null, "Boa sorte!! \n(Vai precisar...)");
           		} else if(a == 0){ //se 'a' for igual a 0, printar o Monstro como Vencedor da batalha
           			JOptionPane.showMessageDialog(null, "DERROTA!!");
           			JOptionPane.showMessageDialog(null, "Vencedor: " + gigante.getNome() + "n" + "Vida: " +
           					gigante.getVida() + "*******************************" + "\n" + "Perdedor: " +
           					gigante.getNome() + "\n" + "Vida: " + gigante.getVida());	
           			JOptionPane.showMessageDialog(null, gigante.getMensagemDeDerrota());
           			//printar frase de derrota do oponente.
           			Object	[] tentarNovamente = {"Sim", "Desistir"};
           			option = JOptionPane.showOptionDialog(null, "E então?", "Novo jogo?",
           					JOptionPane.DEFAULT_OPTION, 3, null, tentarNovamente, tentarNovamente[0]);
           		}
      		
        	JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Classe: "
        			+ guerreiro.getClasse() + "\n" + "Tipo de Dano: " + guerreiro.getTipo() +  "\n"
        			+ "Vida: " + guerreiro.getVida() + "\n" + "Ataque: " +  guerreiro.getAtaque() + "\n"
        			+ "Defesa: " + guerreiro.getDefesa() + "\n" +  "Habilidade Primária: "
        			+  guerreiro.getNomeGolpePrimario() + "\n" + "Habilidade Secundária: "
        			+ guerreiro.getNomeGolpeSecundario() +  "\n" + "Especial: "+ guerreiro.getNomeDoEspecial()
        			+ "\n" + "*******************************" + "\n" + kraken.getNome() + "\n" + "Vida: "
        			+ kraken.getNome() + "\n" + "Ataque: " + kraken.getAtaque() + "\n" + "Defesa: "
        			+ kraken.getDefesa() + "\n" + "Habilidade Primária: " + kraken.getNomeGolpePrimario()
        			+ "\n" + "Habilidade Secundária: " + kraken.getNomeGolpeSecundario() + "\n" 
        			+ "Especial: " + kraken.getNomeDoEspecial(), "Detalhes da Batalha: ", 1);
           	//printar os atributos do mago e do monstro.
           	JOptionPane.showMessageDialog(null, "Que comece a batalha!");
        	
           	while(true){
           		JOptionPane.showMessageDialog(null, "Sua vez de jogar");
           		Object[] golpesDoHeroi= {guerreiro.getNomeGolpePrimario(), guerreiro,
           				guerreiro.getNomeDoEspecial()};
            	Object[] golpesDoHeroiSEspecial = {guerreiro.getNomeGolpePrimario(),
            			guerreiro.getNomeGolpeSecundario()};
            	if(countH >= 2){
            		habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            				JOptionPane.DEFAULT_OPTION, 3, null,
            				golpesDoHeroi, golpesDoHeroi[0]);
            	} else {
            		habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            				JOptionPane.DEFAULT_OPTION, 3, null,
            				golpesDoHeroiSEspecial, golpesDoHeroiSEspecial[0]);
            	}
            	if(habilidade == 0){ //Comparação: se a habilidade selecionada for o golpe primário.
            		guerreiro.golpePrimarioHeroi(kraken.getVida(), guerreiro.getAtaque(), kraken.getDefesa(),
            				guerreiro.getDanoDoEspecial()); 
            		//Comparação: se a habilidade selecionada for o Golpe Primário.
            		countH++;//contador para disponibilizar o uso do poder especial.
            	} else if (habilidade == 1){
            		////Comparação: se a habilidade selecionada for o golpe secundário.
            		guerreiro.golpeSecundarioHeroi(kraken.getVida(), guerreiro.getAtaque(), kraken.getDefesa(),
            				guerreiro.getDanoDoEspecial()); //Se aplica o método Golpe Secundário()
            		countH++;
            	} else if (habilidade == 2){ ////Comparação: se a habilidade selecionada for Golpe Especial.
            		guerreiro.golpeEspecialHeroi(guerreiro.getVida(), kraken.getVida(), guerreiro.getAtaque(),
            				kraken.getDefesa(), guerreiro.getDanoDoEspecial()); 
            		//Aplica-se o método Golpe Especial.
            		countH = 0;
            	}
        	
           		if(guerreiro.getVida() <= 0){
           			a = 0;
           			JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Vida: " +
           			guerreiro.getVida() + "\n" + kraken.getNome() +"\n" + "Vida: " + kraken.getVida());
           			break; //Quebra o while(true)
           		} else if (kraken.getVida() <= 0){
           			a = 1;
           			JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Vida: " + 
           			guerreiro.getVida() + "\n" + kraken.getNome() + "\n" + "Vida: " + kraken.getVida());
           			break; //Quebra o while(true) 
           		}

           		JOptionPane.showMessageDialog(null, "Rodada do Inimigo...");
           		JOptionPane.showMessageDialog(null, "Eu invoco...");
           	//	Gambiarra para usar tru Catch
           		i = rand.nextInt(3);
           		if(countM > 4){
           			switch (i){
           			//Se countM for maior que 4, o valor de 'i' será verificado para identificar qual ataque
           			//foi feito pelo monstro e printá-lo 
       					case 0: JOptionPane.showMessageDialog(null, kraken.getNomeGolpePrimario());
       				//Printar o ataque primário
       							kraken.golpePrimarioMonstro(guerreiro.getVida(), kraken.getAtaque(),
       									guerreiro.getDefesa(), kraken.getDanoGolpePrimario(),
       									kraken.getMultiplicadorDeDano());
       							countM++;
       							break;
       					case 1: JOptionPane.showMessageDialog(null, kraken.getNomeGolpeSecundario());
       					//	Printar o ataque Secundário
       							kraken.golpeSecundarioMonstro(guerreiro.getVida(), kraken.getAtaque(),
										guerreiro.getDefesa(), kraken.getDanoDoGolpeSecundario(),
										kraken.getMultiplicadorDeDano());
       							countM++;
       							break;
       					case 2: JOptionPane.showMessageDialog(null, kraken.getNomeDoEspecial()); 
       					//	Printar o ataque Especial 
       							kraken.golpeEspecialMonstro(guerreiro.getVida(),kraken.getAtaque(),
       									guerreiro.getDefesa(), kraken.getDanoDoEspecial(),
       									kraken.getMultiplicadorDeDano()); 
       							countM++;	
       							break;
           			}	
           		} else {
           			i = rand.nextInt(2);
           			//Como o especial não poderá ser utilizado, o valor de i terá de ser sorteado novamente,
           			//pois não há mais 3 possibilidades de ataque
           			switch (i){
           			//Se countM não for maior que 4, o valor de 'i' será verificado para identificar qual
           			// ataque foi feito pelo monstro e printá-lo
       				case 0: JOptionPane.showMessageDialog(null, kraken.getNomeGolpePrimario());
       				//Printar o ataque primário
       						kraken.golpePrimarioMonstro(guerreiro.getVida(), kraken.getAtaque(),
       								guerreiro.getDefesa(), kraken.getDanoGolpePrimario(),
       								kraken.getMultiplicadorDeDano());
       						countM++;
       						break;
       				case 1: JOptionPane.showMessageDialog(null, kraken.getNomeGolpeSecundario());
       				//Printar o ataque Secundário
       						kraken.golpeSecundarioMonstro(guerreiro.getVida(), kraken.getAtaque(),
										guerreiro.getDefesa(), kraken.getDanoDoGolpeSecundario(),
										kraken.getMultiplicadorDeDano());
       						countM++;
       						break;
           			}
           		}
           		countM = 0;
           		
           		if(guerreiro.getVida() <= 0){
           			//Verficação para saber se a vida está negativa. Nesse caso, se o Herói morreu
           			a = 0;
           			JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Vida: " +
           			guerreiro.getVida() + "\n" + kraken.getNome() +
           					"\n" + "Vida: " + kraken.getVida());
           			break; //Quebra o while(true)
           		} else if (kraken.getVida() <= 0){
           			//Verficação para saber se a vida está negativa. Nesse caso, se o Monstro morreu
           			a = 1;
           			JOptionPane.showMessageDialog(null, guerreiro.getNome() + "\n" + "Vida: " +
           			guerreiro.getVida() + "\n" + kraken.getNome() +
           					"\n" + "Vida: " + kraken.getVida());
           			break; //Quebra o while(true) 
           		}	
           	}
           	
           	if(a == 1){ //se 'a' for igual a 1, printar o Herói como vencendor da batalha
           		JOptionPane.showMessageDialog(null, "VITÓRIA!!");
           		JOptionPane.showMessageDialog(null, "Vencedor: " + guerreiro.getNome() + "\n" + "\n"+"Ataque: "
           				+ guerreiro.getAtaque() + "\n" + "Defesa: " + guerreiro.getDefesa() + "\n" + "Vida: "
           				+ guerreiro.getVida() + "*******************************" + "\n" + "Perdedor: "
           				+ kraken.getNome() + "\n" + "Vida: " + kraken.getVida());
       			JOptionPane.showMessageDialog(null, kraken.getMensagemDeVitoria()); //printar frase de vitória do oponente
           		JOptionPane.showMessageDialog(null, "Congratulations");
           		JOptionPane.showMessageDialog(null, "You has finished this game. You are the best player of "
           				+ "the UFPA's world");
           	} else if(a == 0){ //se 'a' for igual a 0, printar o Monstro como Vencedor da batalha
           		JOptionPane.showMessageDialog(null, "DERROTA!!");
           		JOptionPane.showMessageDialog(null, "Vencedor: " + kraken.getNome() + "n" + "Vida: "
           				+ kraken.getVida() + "*******************************" + "\n" + "Perdedor: "
           				+ kraken.getNome() + "\n" + "Vida: " + kraken.getVida());
           		JOptionPane.showMessageDialog(null, kraken.getMensagemDeDerrota());
           		//printar frase de derrota do oponente
           		Object[] tentarNovamente = {"Sim", "Desistir"};
           		option = JOptionPane.showOptionDialog(null, "E então?", "Novo jogo?",
           				JOptionPane.DEFAULT_OPTION, 3, null, tentarNovamente, tentarNovamente[0]);
           	}
        }
 
        if (escolha == 2){
            Arqueiro arqueiro = new Arqueiro();
            arqueiro.setClasse("Arqueiro");//Classe do tipo Arqueiro
            arqueiro.setTipo("Physical Damage");//Denife o tipo de dano
            arqueiro.setNome(JOptionPane.showInputDialog("Escolha o seu nome:"));
            arqueiro.setAtaque(rand.nextInt(10)); //valor randomico para o ataque do mago
            arqueiro.setDefesa(rand.nextInt(10)); //valor randomico para a defesa do mago
        	JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Classe: "
        			+ arqueiro.getClasse() + "\n" + "Tipo de Dano: " + arqueiro.getTipo() +  "\n"
        			+ "Vida: " + arqueiro.getVida() + "\n" + "Ataque: " +  arqueiro.getAtaque() + "\n"
        			+ "Defesa: " + arqueiro.getDefesa() + "\n" +  "Habilidade Primária: "
        			+  arqueiro.getNomeGolpePrimario() + "\n" + "Habilidade Secundária: "
        			+ arqueiro.getNomeGolpeSecundario() +  "\n" + "Especial: "+ arqueiro.getNomeDoEspecial()
        			+ "\n" + "*******************************" + "\n" + dragon.getNome() + "\n" + "Vida: "
        			+ dragon.getNome() + "\n" + "Ataque: " + dragon.getAtaque() + "\n" + "Defesa: "
        			+ dragon.getDefesa() + "\n" + "Habilidade Primária: " + dragon.getNomeGolpePrimario()
        			+ "\n" + "Habilidade Secundária: " + dragon.getNomeGolpeSecundario() + "\n" 
        			+ "Especial: " + dragon.getNomeDoEspecial(), "Detalhes da Batalha: ", 1); 
            //printar os atributos do mago e do monstro.
            JOptionPane.showMessageDialog(null, "Que comece a batalha!");
            
            while(true){
            	JOptionPane.showMessageDialog(null, "Sua vez de jogar");
            	Object[] golpesDoHeroi= {arqueiro.getNomeGolpePrimario(), arqueiro.getNomeGolpeSecundario(),
            			arqueiro.getNomeDoEspecial()};
            	Object[] golpesDoHeroiEspecial = {arqueiro.getNomeGolpePrimario(),
            			arqueiro.getNomeGolpeSecundario()};
            	if(countH >= 2){
            		habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            				JOptionPane.DEFAULT_OPTION, 3, null, golpesDoHeroi, golpesDoHeroi[0]);
            	} else {
            		habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            				JOptionPane.DEFAULT_OPTION, 3, null, golpesDoHeroiEspecial,
            				golpesDoHeroiEspecial[0]);
            	}
            	if(habilidade == 0){ //Comparação: se a habilidade selecionada for o golpe primário.
            		arqueiro.golpePrimarioHeroi(dragon.getVida(), arqueiro.getAtaque(), dragon.getDefesa(),
            				arqueiro.getDanoDoEspecial()); 
            		//Comparação: se a habilidade selecionada for o Golpe Primário.
            		countH++;//contador para disponibilizar o uso do poder especial.
            	} else if (habilidade == 1){ ////Comparação: se a habilidade selecionada for o golpe secundário.
            		arqueiro.golpeSecundarioHeroi(dragon.getVida(), arqueiro.getAtaque(), dragon.getDefesa(),
            				arqueiro.getDanoDoEspecial()); //Se aplica o método Golpe Secundário()
            		countH++;
            	} else if (habilidade == 2){ ////Comparação: se a habilidade selecionada for Golpe Especial.
            		arqueiro.golpeEspecialHeroi(arqueiro.getVida(), dragon.getVida(), arqueiro.getAtaque(),
            				dragon.getDefesa(), arqueiro.getDanoDoEspecial()); 
            		//Aplica-se o método Golpe Especial.
            		countH = 0;
            	}
           		
               	if(arqueiro.getVida() <= 0){
                    a = 0;
                    JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Vida: " + 
                    arqueiro.getVida() + "\n" + dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
                    break; //Quebra o while(true)
            	} else if (dragon.getVida() <= 0){
                    a = 1;
                    JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Vida: " + 
                    arqueiro.getVida() + "\n" + dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
                    break; //Quebra o while(true) 
            	}

               	JOptionPane.showMessageDialog(null, "Rodada do Inimigo...");
               	JOptionPane.showMessageDialog(null, "Eu invoco...");
               	//Gambiarra para usar tru Catch
               	i = rand.nextInt(3);
               	if(countM > 4){
               		switch (i){
           			//	Se countM não for maior que 4, o valor de 'i' será verificado para identificar qual
               		//	ataque foi feito pelo monstro e printá-lo
   					case 0: JOptionPane.showMessageDialog(null, dragon.getNomeGolpePrimario());
   				//Printar o ataque primário
   					dragon.golpePrimarioMonstro(arqueiro.getVida(), dragon.getAtaque(),
   							arqueiro.getDefesa(), dragon.getDanoGolpePrimario(),
   									dragon.getMultiplicadorDeDano());
   							countM++;
   							break;
   					case 1: JOptionPane.showMessageDialog(null, dragon.getNomeGolpeSecundario());
   					//	Printar o ataque Secundário
   					dragon.golpeSecundarioMonstro(arqueiro.getVida(), dragon.getAtaque(),
   							arqueiro.getDefesa(), dragon.getDanoDoGolpeSecundario(),
									dragon.getMultiplicadorDeDano());
   							countM++;
   							break;
   					case 2: JOptionPane.showMessageDialog(null, dragon.getNomeDoEspecial()); 
   					//	Printar o ataque Especial 
   							dragon.golpeEspecialMonstro(arqueiro.getVida(),dragon.getAtaque(),
   									arqueiro.getDefesa(), dragon.getDanoDoEspecial(),
   									dragon.getMultiplicadorDeDano()); 
   							countM++;	
   							break;
               		}
               	} else {
               		i = rand.nextInt(2);
               		//Como o especial não poderá ser utilizado, o valor de i terá de ser sorteado novamente,
               		//pois não há mais 3 possibilidades de ataque
               		switch (i){
               		//Se countM não for maior que 4, o valor de 'i' será verificado para identificar qual
               		//ataque foi feito pelo monstro e printá-lo
   					case 0: JOptionPane.showMessageDialog(null, dragon.getNomeGolpePrimario());
   				//Printar o ataque primário
   					dragon.golpePrimarioMonstro(arqueiro.getVida(), dragon.getAtaque(),
   							arqueiro.getDefesa(), dragon.getDanoGolpePrimario(),
   									dragon.getMultiplicadorDeDano());
   							countM++;
   							break;
   					case 1: JOptionPane.showMessageDialog(null, dragon.getNomeGolpeSecundario());
   					//	Printar o ataque Secundário
   					dragon.golpeSecundarioMonstro(arqueiro.getVida(), dragon.getAtaque(),
   							arqueiro.getDefesa(), dragon.getDanoDoGolpeSecundario(),
									dragon.getMultiplicadorDeDano());
   							countM++;
   							break;
               		}
               	}
               	countM = 0;
               	                    	
            	if(arqueiro.getVida() <= 0){
            		//Verficação para saber se a vida está negativa. Nesse caso, se o Herói morreu
                    a = 0;
                    JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Vida: " + arqueiro.getVida()
                    		+ "\n" + dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
                    break; //Quebra o while(true) 
            	} else if (dragon.getVida() <= 0){
            		//Verficação para saber se a vida está negativa. Nesse caso, se o Monstro morreu
                    a = 1;
                    JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Vida: "
                    		+ arqueiro.getVida() + "\n" + dragon.getNome() + "\n" + "Vida: "
                    		+ dragon.getVida());
                    break; //Quebra o while(true) 
            	}
            }
            
           	if(a == 1){ //se 'a' for igual a 1, printar o Herói como vencendor da batalha
           		JOptionPane.showMessageDialog(null, "VITÓRIA!!");
           		JOptionPane.showMessageDialog(null, "Vencedor: " + arqueiro.getNome() + "\n" + "\n"
           				+ "Ataque: " + arqueiro.getAtaque() + "\n" + "Defesa: " + arqueiro.getDefesa() + "\n"
           				+ "Vida: " + arqueiro.getVida() + "*******************************" + "\n"
           				+ "Perdedor: " + dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
           		JOptionPane.showMessageDialog(null, dragon.getMensagemDeVitoria());
           		JOptionPane.showMessageDialog(null, "Bônus de Vitória:" + "\n" + "+X% da vida perdida");
           		//Determinar o quanto de atributos que irá acrescentar ao valor inicial
           		//printar frase de derrota do oponente
           		JOptionPane.showMessageDialog(null, "Parabéns!! \nPróxima fase: " + gigante.getNome());
           		JOptionPane.showMessageDialog(null, "Boa sorte!! \n(Vai precisar...)");
           	} else if(a == 0){ //se 'a' for igual a 0, printar o Monstro como Vencedor da batalha
           		JOptionPane.showMessageDialog(null, "DERROTA!!");
          		JOptionPane.showMessageDialog(null, "Vencedor: " + dragon.getNome() + "n" + "Vida: " +
          				dragon.getVida() + "*******************************" + "\n" + "Perdedor: " +
          				dragon.getNome() + "\n" + "Vida: " + dragon.getVida());
          		JOptionPane.showMessageDialog(null, dragon.getMensagemDeDerrota());
          		//printar frase de derrota do oponente
          		Object[] tentarNovamente = {"Sim", "Desistir"};
          		option = JOptionPane.showOptionDialog(null, "E então?", "Novo jogo?",
          				JOptionPane.DEFAULT_OPTION, 3, null, tentarNovamente,
          				tentarNovamente[0]);
          	}

        	JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Classe: "
        			+ arqueiro.getClasse() + "\n" + "Tipo de Dano: " + arqueiro.getTipo() +  "\n"
        			+ "Vida: " + arqueiro.getVida() + "\n" + "Ataque: " +  arqueiro.getAtaque() + "\n"
        			+ "Defesa: " + arqueiro.getDefesa() + "\n" +  "Habilidade Primária: "
        			+  arqueiro.getNomeGolpePrimario() + "\n" + "Habilidade Secundária: "
        			+ arqueiro.getNomeGolpeSecundario() +  "\n" + "Especial: "+ arqueiro.getNomeDoEspecial()
        			+ "\n" + "*******************************" + "\n" + gigante.getNome() + "\n" + "Vida: "
        			+ gigante.getNome() + "\n" + "Ataque: " + gigante.getAtaque() + "\n" + "Defesa: "
        			+ gigante.getDefesa() + "\n" + "Habilidade Primária: " + gigante.getNomeGolpePrimario()
        			+ "\n" + "Habilidade Secundária: " + gigante.getNomeGolpeSecundario() + "\n" 
        			+ "Especial: " + dragon.getNomeDoEspecial(), "Detalhes da Batalha: ", 1); 
           			//printar os atributos do mago e do monstro.
           	JOptionPane.showMessageDialog(null, "Que comece a batalha!");
           	
           	while(true){
           		JOptionPane.showMessageDialog(null, "Sua vez de jogar");
           		Object[] golpesDoHeroi= {(arqueiro.getNomeGolpePrimario()), (arqueiro.getNomeGolpeSecundario()),
           				(arqueiro.getNomeDoEspecial())};
            	Object[] golpesDoHeroiEspecial = {(arqueiro.getNomeGolpePrimario()),
            			(arqueiro.getNomeGolpeSecundario())};
            	if(countH >= 2){
            		habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            				JOptionPane.DEFAULT_OPTION, 3, null, golpesDoHeroi, golpesDoHeroi[0]);
            	} else {
            		habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            				JOptionPane.DEFAULT_OPTION, 3, null, golpesDoHeroiEspecial,
            				golpesDoHeroiEspecial[0]);
            	}
            	if(habilidade == 0){ //Comparação: se a habilidade selecionada for o golpe primário.
            		arqueiro.golpePrimarioHeroi(gigante.getVida(), arqueiro.getAtaque(), gigante.getDefesa(),
            				arqueiro.getDanoDoEspecial()); 
            		//Comparação: se a habilidade selecionada for o Golpe Primário.
            		countH++;//contador para disponibilizar o uso do poder especial.
            	} else if (habilidade == 1){ ////Comparação: se a habilidade selecionada for o golpe secundário.
            		arqueiro.golpeSecundarioHeroi(gigante.getVida(), arqueiro.getAtaque(), gigante.getDefesa(),
            				arqueiro.getDanoDoEspecial()); //Se aplica o método Golpe Secundário()
            		countH++;
            	} else if (habilidade == 2){ ////Comparação: se a habilidade selecionada for Golpe Especial.
            		arqueiro.golpeEspecialHeroi(arqueiro.getVida(), gigante.getVida(), arqueiro.getAtaque(),
            				gigante.getDefesa(), arqueiro.getDanoDoEspecial()); 
            		//Aplica-se o método Golpe Especial.
            		countH = 0;
            	}
           		
           		if(arqueiro.getVida() <= 0){
           			a = 0;
           			JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Vida: " +
           			arqueiro.getVida() + "\n" + gigante.getNome() + "\n" + "Vida: " + gigante.getVida());
           			break; //Quebra o while(true) 
           		} else if (gigante.getVida() <= 0){
           			a = 1;
           			JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Vida: " + arqueiro.getVida() + "\n" + gigante.getNome() +
           					"\n" + "Vida: " + gigante.getVida());
                	break; //Quebra o while(true) 
           		}
           		
           		JOptionPane.showMessageDialog(null, "Rodada do Inimigo...");
           		JOptionPane.showMessageDialog(null, "Eu invoco...");
           		//Gambiarra para usar tru Catch
           		i 	= rand.nextInt(3);
           		if(countM > 4){
           			switch (i){
           			//Se countM for maior que 4, o valor de 'i' será verificado para identificar qual ataque
           			// foi feito pelo monstro e printá-lo 
           				case 0: JOptionPane.showMessageDialog(null, gigante.getNomeGolpePrimario());
           				//Printar o ataque primário
           						gigante.golpePrimarioMonstro(arqueiro.getVida(), gigante.getAtaque(),
           								arqueiro.getDefesa(), gigante.getDanoGolpePrimario(),
           								gigante.getMultiplicadorDeDano());
           						countM++;
           						break;
           				case 1: JOptionPane.showMessageDialog(null, gigante.getNomeGolpeSecundario());
           				//Printar o ataque Secundário
   								gigante.golpeSecundarioMonstro(arqueiro.getVida(), gigante.getAtaque(),
   										arqueiro.getDefesa(), gigante.getDanoDoGolpeSecundario(),
   										gigante.getMultiplicadorDeDano());
           						countM++;
           						break;
           				case 2: JOptionPane.showMessageDialog(null, gigante.getNomeDoEspecial()); 
           				//Printar o ataque Especial 
           						gigante.golpeEspecialMonstro(arqueiro.getVida(),gigante.getAtaque(),
           								arqueiro.getDefesa(), gigante.getDanoDoEspecial(),
           								gigante.getMultiplicadorDeDano()); 
								countM++;	
								break;
           			}
           		} else {
           			i = rand.nextInt(2); 
           			//Como o especial não poderá ser utilizado, o valor de i terá de ser sorteado novamente,
           			// pois não há mais 3 possibilidades de ataque.
           			switch (i){
           			//Se countM não for maior que 4, o valor de 'i' será verificado para identificar qual
           			//ataque foi feito pelo monstro e printá-lo.
       				case 0: JOptionPane.showMessageDialog(null, gigante.getNomeGolpePrimario());
       				//Printar o ataque primário
       						gigante.golpePrimarioMonstro(arqueiro.getVida(), gigante.getAtaque(),
       								arqueiro.getDefesa(), gigante.getDanoGolpePrimario(),
       								gigante.getMultiplicadorDeDano());
       						countM++;
       						break;
       				case 1: JOptionPane.showMessageDialog(null, gigante.getNomeGolpeSecundario());
       				//Printar o ataque Secundário
								gigante.golpeSecundarioMonstro(arqueiro.getVida(), gigante.getAtaque(),
										arqueiro.getDefesa(), gigante.getDanoDoGolpeSecundario(),
										gigante.getMultiplicadorDeDano());
       						countM++;
       						break;
           			}
           		}
           		countM = 0;
           		
           		if(arqueiro.getVida() <= 0){
           			//Verficação para saber se a vida está negativa. Nesse caso, se o Herói morreu
           			a = 0;
           			JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Vida: " +
           			arqueiro.getVida() + "\n" + gigante.getNome() + "\n" + "Vida: " + gigante.getVida());
           			break;
           			//Quebra o while(true) 
           		} else if (gigante.getVida() <= 0){ //Verficação para saber se a vida está negativa.
           			// Nesse caso, se o Monstro morreu
           			a = 1;
           			JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Vida: " +
           			arqueiro.getVida() + "\n" + gigante.getNome() + "\n" + "Vida: " + gigante.getVida());
           			break; //Quebra o while(true) 
           		}
           	}
           	
           	if(a == 1){ //se 'a' for igual a 1, printar o Herói como vencendor da batalha.
           		JOptionPane.showMessageDialog(null, "VITÓRIA!!");
           		JOptionPane.showMessageDialog(null, "Vencedor: " + arqueiro.getNome() + "\n" + "\n"+"Ataque: "
           				+ arqueiro.getAtaque() + "\n" + "Defesa: " + arqueiro.getDefesa() + "\n" + "Vida: "
           				+ arqueiro.getVida() + "*******************************" + "\n" + "Perdedor: "
           				+ gigante.getNome() + "\n" + "Vida: " + gigante.getVida());
           		JOptionPane.showMessageDialog(null, gigante.getMensagemDeVitoria());
           		JOptionPane.showMessageDialog(null, "Bônus de Vitória:" + "\n" + "+X% da vida perdida");
           		//Determinar o quanto de atributos que irá acrescentar ao valor inicial
           		//printar frase de vitória do oponente.
           		JOptionPane.showMessageDialog(null, "Parabéns!! \nPróxima fase: " + kraken.getNome());
           		JOptionPane.showMessageDialog(null, "Boa sorte!! \n(Vai precisar...)");
           	} else if(a == 0){ //se 'a' for igual a 0, printar o Monstro como Vencedor da batalha.
           		JOptionPane.showMessageDialog(null, "DERROTA!!");
           		JOptionPane.showMessageDialog(null, "Vencedor: " + gigante.getNome() + "n" + "Vida: "
           				+ gigante.getVida() + "*******************************" + "\n" + "Perdedor: "
           				+ gigante.getNome() + "\n" + "Vida: " + gigante.getVida());
           		JOptionPane.showMessageDialog(null, gigante.getMensagemDeDerrota());
           		//printar frase de derrota do oponente.
           		Object	[] tentarNovamente = {"Sim", "Desistir"};
      			option = JOptionPane.showOptionDialog(null, "E então?", "Novo jogo?",
      					JOptionPane.DEFAULT_OPTION, 3, null, tentarNovamente, tentarNovamente[0]);
           	}
           	
        	JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Classe: "
        			+ arqueiro.getClasse() + "\n" + "Tipo de Dano: " + arqueiro.getTipo() +  "\n"
        			+ "Vida: " + arqueiro.getVida() + "\n" + "Ataque: " +  arqueiro.getAtaque() + "\n"
        			+ "Defesa: " + arqueiro.getDefesa() + "\n" +  "Habilidade Primária: "
        			+  arqueiro.getNomeGolpePrimario() + "\n" + "Habilidade Secundária: "
        			+ arqueiro.getNomeGolpeSecundario() +  "\n" + "Especial: "+ arqueiro.getNomeDoEspecial()
        			+ "\n" + "*******************************" + "\n" + kraken.getNome() + "\n" + "Vida: "
        			+ kraken.getNome() + "\n" + "Ataque: " + kraken.getAtaque() + "\n" + "Defesa: "
        			+ kraken.getDefesa() + "\n" + "Habilidade Primária: " + kraken.getNomeGolpePrimario()
        			+ "\n" + "Habilidade Secundária: " + kraken.getNomeGolpeSecundario() + "\n" 
        			+ "Especial: " + kraken.getNomeDoEspecial(), "Detalhes da Batalha: ", 1); 
           	//printar os atributos do mago e do monstro.
           	JOptionPane.showMessageDialog(null, "Que comece a batalha!");
        
           	while(true){
           		JOptionPane.showMessageDialog(null, "Sua vez de jogar");
           		Object[] golpesDoHeroi= {(arqueiro.getNomeGolpePrimario()), (arqueiro.getNomeGolpeSecundario()),
           				(arqueiro.getNomeDoEspecial())};
            	Object[] golpesDoHeroiEspecial = {arqueiro.getNomeGolpePrimario(), 
            			arqueiro.getNomeGolpeSecundario()};
            	if(countH >= 2){
            		habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            				JOptionPane.DEFAULT_OPTION, 3, null, golpesDoHeroi, golpesDoHeroi[0]);
            	} else {
            		habilidade = JOptionPane.showOptionDialog(null, "Selecione o ataque:", "Usar o golpe",
            				JOptionPane.DEFAULT_OPTION, 3, null, golpesDoHeroiEspecial,
            				golpesDoHeroiEspecial[0]);
            	}
            	if(habilidade == 0){ //Comparação: se a habilidade selecionada for o golpe primário.
            		arqueiro.golpePrimarioHeroi(kraken.getVida(), arqueiro.getAtaque(), kraken.getDefesa(),
            				arqueiro.getDanoDoEspecial()); 
            		//Comparação: se a habilidade selecionada for o Golpe Primário.
            		countH++;//contador para disponibilizar o uso do poder especial.
            	} else if (habilidade == 1){ ////Comparação: se a habilidade selecionada for o golpe secundário.
            		arqueiro.golpeSecundarioHeroi(kraken.getVida(), arqueiro.getAtaque(), kraken.getDefesa(),
            				arqueiro.getDanoDoEspecial()); //Se aplica o método Golpe Secundário()
            		countH++;
            	} else if (habilidade == 2){ ////Comparação: se a habilidade selecionada for Golpe Especial.
            		arqueiro.golpeEspecialHeroi(arqueiro.getVida(), kraken.getVida(), arqueiro.getAtaque(),
            				kraken.getDefesa(), arqueiro.getDanoDoEspecial()); 
            		//Aplica-se o método Golpe Especial.
            		countH = 0;
            	}
           		
           		if(arqueiro.getVida() <= 0){
           			a = 0;
           			JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Vida: " + arqueiro.getVida() 
           					+ "\n" + kraken.getNome() + "\n" + "Vida: " + kraken.getVida());
                	break; //Quebra o while(true) 
           		} else if (kraken.getVida() <= 0){
           			a = 1;
           			JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Vida: " + arqueiro.getVida()
           					+ "\n" + kraken.getNome() + "\n" + "Vida: " + kraken.getVida());
           			break; //Quebra o while(true) 
           		}
           			
           		JOptionPane.showMessageDialog(null, "Rodada do Inimigo...");
           		JOptionPane.showMessageDialog(null, "Eu invoco...");
           		
           	//	Gambiarra para usar try Catch
           		i 	= rand.nextInt(3);
           		if(countM > 4){
           			switch (i){
           				//Se countM for maior que 4, o valor de 'i' será verificado para identificar qual
           				//ataque foi feito pelo monstro e printá-lo.
       					case 0: JOptionPane.showMessageDialog(null, kraken.getNomeGolpePrimario());
       				//Printar o ataque primário
       							kraken.golpePrimarioMonstro(arqueiro.getVida(), kraken.getAtaque(),
       									arqueiro.getDefesa(), kraken.getDanoGolpePrimario(),
       									kraken.getMultiplicadorDeDano());
       							countM++;
       							break;
       					case 1: JOptionPane.showMessageDialog(null, kraken.getNomeGolpeSecundario());
       				//Printar o ataque Secundário
       							kraken.golpeSecundarioMonstro(arqueiro.getVida(), kraken.getAtaque(),
       									arqueiro.getDefesa(), kraken.getDanoDoGolpeSecundario(),
       									kraken.getMultiplicadorDeDano());
       							countM++;
       							break;
       					case 2: JOptionPane.showMessageDialog(null, kraken.getNomeDoEspecial()); 
       				//Printar o ataque Especial 
       							kraken.golpeEspecialMonstro(arqueiro.getVida(),kraken.getAtaque(),
       									arqueiro.getDefesa(), kraken.getDanoDoEspecial(),
       									kraken.getMultiplicadorDeDano()); 
       							countM++;	
       							break;
           			}
           		} else {
           			i = rand.nextInt(2);
           			//Como o especial não poderá ser utilizado, o valor de i terá de ser sorteado novamente,
           			// pois não há mais 3 possibilidades de ataque.
           			switch (i){
           			//Se countM não for maior que 4, o valor de 'i' será verificado para identificar qual
           			// ataque foi feito pelo monstro e printá-lo.
       					case 0: JOptionPane.showMessageDialog(null, kraken.getNomeGolpePrimario());
       				//Printar o ataque primário
       							kraken.golpePrimarioMonstro(arqueiro.getVida(), kraken.getAtaque(),
       									arqueiro.getDefesa(), kraken.getDanoGolpePrimario(),
       									kraken.getMultiplicadorDeDano());
       							countM++;
       							break;
       					case 1: JOptionPane.showMessageDialog(null, kraken.getNomeGolpeSecundario());
       				//Printar o ataque Secundário
       							kraken.golpeSecundarioMonstro(arqueiro.getVida(), kraken.getAtaque(),
       									arqueiro.getDefesa(), kraken.getDanoDoGolpeSecundario(),
       									kraken.getMultiplicadorDeDano());
       							countM++;
           			}
           		}
           		countM = 0;
           	                    		
           		if(arqueiro.getVida() <= 0){ //Verficação para saber se a vida está negativa. Nesse caso,
           			//se o Herói morreu.
           			a = 0;
           			JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Vida: " +
           			arqueiro.getVida() + "\n" + kraken.getNome() +
           					"\n" + "Vida: " + kraken.getVida());
                	break; //Quebra o while(true)
           		} else if (kraken.getVida() <= 0){ //Verficação para saber se a vida está negativa.
           			//Nesse caso, se o Monstro morreu.
           			a = 1;
           			JOptionPane.showMessageDialog(null, arqueiro.getNome() + "\n" + "Vida: " +
           			arqueiro.getVida() + "\n" + kraken.getNome() +
           					"\n" + "Vida: " + kraken.getVida());
           			break; //Quebra o while(true) 
           		}
           	}	
        
           	if(a == 1){ //se 'a' for igual a 1, printar o Herói como vencendor da batalha.
           		JOptionPane.showMessageDialog(null, "VITÓRIA!!");
           		JOptionPane.showMessageDialog(null, "Vencedor: " + kraken.getNome() + "\n" + "\n" + "Ataque: "
           				+ arqueiro.getAtaque() + "\n" + "Defesa: " + arqueiro.getDefesa() + "\n" + "Vida: " 
           				+ arqueiro.getVida() + "*******************************" + "\n" + "Perdedor: "
           				+ kraken.getNome() + "\n" + "Vida: " + kraken.getVida());
           		JOptionPane.showMessageDialog(null, kraken.getMensagemDeVitoria());
           		//printar frase de vitória do oponente.
           		JOptionPane.showMessageDialog(null, "Congratulations");
           			JOptionPane.showMessageDialog(null, "You has finished this game. You are the best player "
           				+ "of the UFPA's world");
           		} else if(a == 0){ //se 'a' for igual a 0, printar o Monstro como Vencedor da batalha.
           			JOptionPane.showMessageDialog(null, "DERROTA!!");
           			JOptionPane.showMessageDialog(null, "Vencedor: " + kraken.getNome() + "n" + "Vida: "
           					+ kraken.getVida() + "*******************************" + "\n" + "Perdedor: "
           					+  kraken.getNome() + "\n" + "Vida: " + kraken.getVida());
           			JOptionPane.showMessageDialog(null, kraken.getMensagemDeDerrota());
           		//	printar frase de derrota do oponente.
           			Object[] tentarNovamente = {"Sim", "Desistir"};
           			option = JOptionPane.showOptionDialog(null, "E então?", "Novo jogo?",
           					JOptionPane.DEFAULT_OPTION, 3, null, tentarNovamente, tentarNovamente[0]);
           		}
           	
           		respostaNovoJogo = JOptionPane.showConfirmDialog(null, "Iniciar Novo jogo?", "Aviso" ,0, 1);
           		if(respostaNovoJogo == 0){
           			break;
           		}
           		//JOptionPane.showConfirmDialog(null, "Você deseja jogar novamente?");
        	}
        }
    }
}
	
abstract class Personagem{
    private int ataque, defesa, vida = 10;
    private String nome;
    private int golpePrimario; //habilidade primaria
    private int golpeSecundario; //habilidade secundaria
    private int golpeEspecial; //ultimate
    private String nomeGolpePrimario = "s"; //nome da primeira habilidade
    private String nomeGolpeSecundario = "s"; //nome da segunda habilidade
    private String nomeDoEspecial = "s"; //nome da ultimate

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNomeGolpePrimario() {
        return nomeGolpePrimario;
    }

    public int getDanoGolpePrimario() {
        return golpePrimario;
    }
    
    public void setDanoGolpePrimario(int golpePrimario) {
        this.golpePrimario = golpePrimario;
    }
        
    public String getNomeGolpeSecundario() {
    	return nomeGolpeSecundario;    	
    }
    
    public int getDanoDoGolpeSecundario() {
        return golpeSecundario;
    }

    public void setDanoDoGolpeSecundario(int golpeSecundario) {
        this.golpeSecundario = golpeSecundario;
    }

    public String getNomeDoEspecial() {
        return nomeDoEspecial;
    }
    
    public int getDanoDoEspecial() {
        return golpeEspecial;
    }
    
    public void setDanoDoEspecial(int golpeEspecial) {
        this.golpeEspecial = golpeEspecial;
    }

    public void setGolpeEspecial(int golpeEspecial) {
        this.golpeEspecial= golpeEspecial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
	public int golpePrimarioMonstro(int vidaDoInim , int danoDeAtaquePerso,  int defesaInim, int danoPrimario,
			double multDeDano){
		return 0; //a definir
	}
	
	public int golpeSecundarioMonstro(int vidaDoInimigo, int danoDeAtaquePerso, int defesaInim, int danoSecundario,
			double multDeDano){
		return 0; // a definir
	}
	
	public int golpeEspecialMonstro(int vidaDoInimigo, int danoDeAtaquePerso,  int defesaInim, int danoEspecial,
			double multDeDano) {
		return 0; //a definir
	}
        
	public int golpePrimarioHeroi(int vidaDoInim , int danoDeAtaquePerso,  int defesaInim, int danoPrimario){
		return 0; //a definir
	}
	
	public int golpeSecundarioHeroi(int vidaDoPers, int danoDeAtaquePerso, int defesaInim, int danoSecundario){
		return 0; // a definir
	}
	
	public int golpeEspecialHeroi(int vidaDoPers, int vidaDoInim , int danoDeAtaquePerso,  int defesaInim,
			int danoEspecial) {
		return 0; //a definir
	}
	
}

class Herois extends Personagem{
    int nivel; //podemos fazer para somar um valor fixo de experiência (mas nesse caso sempre seria aconteceria a mesma coisa).
    //eu proponho muda de "Experiência para nível (String)
    int level = 1;//e aqui podemos fazer a separação dos níveis, em números
    private String tipo;
    private String classe;
    public void setClasse(String classe){
    	this.classe = classe;
    }
    	
   	public String getClasse(){
    	return classe;
   	}
    	
	/*
	private String nivel;
	
	public void setNivel(String level){
	this.level = level;
	}
	
	public String getNivel(){
	return nivel;
	}
*/	
	public String getTipo(){
		return tipo;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
}

class Mago extends Herois{
	
}

class Arqueiro extends Herois{
	
}

class Guerreiro extends Herois{
	
}

class Monstros extends Personagem{
	private double multiplicadorDeDano;
	private String mensagemDeVitoria = " ";
	private String mensagemDeDerrota = " ";
	
	public double getMultiplicadorDeDano(){
		return multiplicadorDeDano;
	}
	
	public void setMultiplicadorDeDano(double multiplicador){
		this.multiplicadorDeDano = multiplicador;
	}
	
	public String getMensagemDeVitoria(){
		return "";
	}
	
	public String getMensagemDeDerrota(){
		return "";
	}
}

class Dragao extends Monstros{
	@Override
	public String getMensagemDeVitoria(){
		return "//frase de vitoria";
	}
	
	@Override
	public String getMensagemDeDerrota(){
		return "//frase de vitoria";
	}
}

class Gigante extends Monstros{
	@Override
	public String getMensagemDeVitoria(){
		return "//frase de vitoria";
	}
	
	@Override
	public String getMensagemDeDerrota(){
		return "//frase de vitoria";
	}
}

class Kraken extends Monstros{
	@Override
	public String getMensagemDeVitoria(){
		return "//frase de vitoria";
	}
	
	@Override
	public String getMensagemDeDerrota(){
		return "//frase de vitoria";
	}
}
