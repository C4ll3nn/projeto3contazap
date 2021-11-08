package projetoRPG;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {		
		
		System.out.println("Seja bem vindo(a) à BATALHA FINAL!\r\n"
				+"Por favor faça suas escolhas baseadas nas palavras em letra maiúscula.");
		
		Jogador novoPlayer = new Jogador();
		CriaInimigos.criaInimigo();
		
//configuração do jogo		

		Scanner inputJogador = new Scanner(System.in);
//dificuldade
	    System.out.println("Qual o nivel de dificuldade que você gostaria de jogar?\r\n"
	    		+ java.util.Arrays.asList(NiveisDificuldade.values()));
	    String dificuldade = inputJogador.nextLine();
//NOME
	    System.out.println("Qual o NOME do seu personagem?");

	    String userName = inputJogador.nextLine();
		novoPlayer.setNome(userName.toUpperCase());		
//sexo
	    System.out.println("Escolha entre um personagem do sexo MASCULINO ou FEMININO:");

	    String userSex = inputJogador.nextLine();
		novoPlayer.setSexo(userSex.toUpperCase());		
		
//classe		
		System.out.println("Escolha sua classe entre as 3 disponiveis:"+java.util.Arrays.asList(ClasseJogador.values()));

	    String userClass = inputJogador.nextLine();		
		ClasseJogador classeJogador = ClasseJogador.valueOf(userClass.toUpperCase());
		novoPlayer.setClasseJogador (classeJogador);				
		
//seta vida e armadura		
		switch(userClass.toUpperCase()){

        case "GUERREIRO":	
    		novoPlayer.setVidaJogador (225.0d);    		
    		novoPlayer.setArmadura(7.0d);
            break;

        case "MAGO":
    		novoPlayer.setVidaJogador (175.0d);    		
    		novoPlayer.setArmadura(5.5d);
            break;
        
        case "PROGRAMADOR":
    		novoPlayer.setVidaJogador (200.0d);    		
    		novoPlayer.setArmadura(6.2d);
        	break;

        default:
            System.out.println("Você inseriu uma classe inválida!");
		}
		
		double vidaPlayer = novoPlayer.getVidaJogador();
		double defesaPlayer = novoPlayer.getArmadura();
		double vidaInicial = novoPlayer.getVidaJogador();
		
//escolhe arma
		
		switch(userClass.toUpperCase()){

        case "GUERREIRO":        	
    	    System.out.println("Escolha sua classe entre as 3 disponiveis:"+java.util.Arrays.asList(ArmasGuerreiro.values()));

    	    String userWeaponG = inputJogador.nextLine();	
    		novoPlayer.setArma (userWeaponG.toUpperCase());    		
            break;

        case "MAGO":
    	    System.out.println("Escolha sua classe entre as 3 disponiveis:"+java.util.Arrays.asList(ArmasMago.values()));

    	    String userWeaponM = inputJogador.nextLine();	
    		novoPlayer.setArma (userWeaponM.toUpperCase());
            break;
        
        case "PROGRAMADOR":
    	    System.out.println("Escolha sua classe entre as 3 disponiveis:"+java.util.Arrays.asList(ArmasProgramador.values()));

    	    String userWeaponP = inputJogador.nextLine();	
    		novoPlayer.setArma (userWeaponP.toUpperCase());    		    		
        	break;

        default:
            System.out.println("Você inseriu uma classe inválida!");
		}
		
		String armaJogador = novoPlayer.getArma();
		
		System.out.println("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo\r\n"
				+ "você está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e\r\n"
				+ "sabe que a partir desse ponto, sua vida mudará para sempre.\r\n"
				+ "Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de\r\n"
				+ "todos os inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu\r\n"
				+ "equipamento de combate, já danificado e desgastado depois de tantas lutas. Você está a um\r\n"
				+ "passo de encerrar para sempre esse mal.");
		
		System.out.println("Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.");
		
//escolha da motivação				
	    System.out.println("Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo: VINGANÇA ou GLÓRIA:");

	    String motivacao = inputJogador.nextLine();
		
		if (motivacao.equalsIgnoreCase("VINGANÇA")) {
			System.out.println("VINGANÇA: Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar\r\n"
					+ "para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo,\r\n"
					+ "quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível\r\n"
					+ "que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles\r\n"
					+ "que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder\r\n"
					+ "finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).");
		} else { System.out.println("GLÓRIA: Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços\r\n"
				+ "abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e\r\n"
				+ "diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde\r\n"
				+ "já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir\r\n"
				+ "o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa\r\n"
				+ "história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.");}
		
		System.out.println("Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas\r\n"
				+ "mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado.\r\n"
				+ "Você avança pelo portal.");
		
		System.out.println("A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua\r\n"
				+ "frente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à\r\n"
				+ "frente, ou desistir.");
//seta msgs Combate
		String msgDerrota =("");
		if(motivacao.equalsIgnoreCase("VINGANÇA")) {msgDerrota = "Você não estava preparado para a força do inimigo. Não foi possível concluir sua vingança, "
				+ "e agora resta saber se alguém se vingará por você.";} else {
				if (novoPlayer.getSexo().equalsIgnoreCase("MASCULINO")){
					msgDerrota = "Você não estava preparado para a força do inimigo. A glória que buscavas não será sua,\r\n"
				+ "e a cidade aguarda por seu próximo herói.";
				} else {msgDerrota = "Você não estava preparado para a força do inimigo. A glória que buscavas não será sua,\r\n"
				+ "e a cidade aguarda por sua próxima heróina.";}
		}
		String msgVitoria = "O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.";
		String msgFugir = "Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.";
		
//segue ou desiste		
	    System.out.println("Escolha entre SEGUIR ou DESISTIR:");

	    String desistencia = inputJogador.nextLine();	    
		
		if (desistencia.equalsIgnoreCase("DESISTIR")) {
			System.out.println("DESISTIR: o medo invade o seu coração e você sente que ainda não está à altura do desafio.\r\n"
					+ "Você se volta para a noite lá fora e corre em direção à segurança.");
			System.exit(0);
		} else { 
			System.out.println("SEGUIR: você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente\r\n"
				+ "uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta\r\n"
				+ "aberta.");}
		
		System.out.println("Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera\r\n"
				+ "sobre como passar pela porta.");		
//escolha de travessia
	    System.out.println("Escolha entre passar ANDANDO, CORRENDO ou SALTANDO:");
	    String travessia = inputJogador.nextLine();	    
	   
	    switch(travessia.toUpperCase()){

        case "ANDANDO":        	
        	System.out.println("ANDANDO: Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você\r\n"
					+ "pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado\r\n"
					+ "em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se\r\n"
					+ "abre no teto atrás de você, no corredor.");
//dano da travessia andando
        	CombateInimigo.danoArmadilha(vidaPlayer, defesaPlayer);
            break;

        case "SALTANDO":
        	System.out.println("SALTANDO: Você se concentra e pula em direção à luz, saltando de antes da porta até o interior\r\n"
					+ "da sala.");
            break;
        
        case "CORRENDO":
        	System.out.println("CORRENDO: Você respira fundo e desata a correr em direção à sala. Quando passa pela porta,\r\n"
    				+ "sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala,\r\n"
    				+ "olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas\r\n"
    				+ "batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta,\r\n"
    				+ "você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,\r\n"
    				+ "mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.");    		    		
        	break;
		}		
		
		System.out.println("Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma\r\n"
				+ "delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A\r\n"
				+ "porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você\r\n"
				+ "não sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima\r\n"
				+ "da porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que\r\n"
				+ "precisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir\r\n"
				+ "enfrentar o líder.");
		
		System.out.println("Você se dirige para a porta à direita.");
		
		System.out.println("PORTA DIREITA: Você se aproxima, tentando ouvir o que acontece porta adentro, mas não\r\n"
				+ "escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a\r\n"
				+ "outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha\r\n"
				+ "pendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal\r\n"
				+ "do inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem\r\n"
				+ "para espalhar o terror nas cidades e vilas da região.");
		
		System.out.println("Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar\r\n"
				+ "para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um\r\n"
				+ "dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em\r\n"
				+ "posição de combate. Ele avança em sua direção.");		
//combate 
		System.out.println("Você deseja LUTAR ou FUGIR?");
		String continuaCombate = inputJogador.nextLine();
		
		if (continuaCombate.equalsIgnoreCase("LUTAR")) {
		
			double vidaOrque = 200.0d;
			double atkOrque = 2.0d;
			double defesaOrque = 2.0d;
			
			while (vidaOrque>0.0) {
				if (vidaPlayer<=0.0) { 
					System.out.println(msgDerrota);
					System.exit(0);
				} else {				
					System.out.println("Você deseja ATACAR ou ESPERAR?");
					String iniciativaCombate = inputJogador.nextLine();
					if (iniciativaCombate.equalsIgnoreCase("ATACAR")) {	
			        	vidaOrque = CombateJogador.jogadorAtaca(vidaOrque, armaJogador, defesaOrque, dificuldade);
			        		if (vidaOrque<0.0) {
			        			System.out.println(msgVitoria);
			        			break;
			        		}
			        	vidaPlayer = CombateInimigo.inimigoAtaca(vidaPlayer, atkOrque, defesaPlayer, dificuldade);
			        	} else {
			        		vidaPlayer = CombateInimigo.inimigoAtaca(vidaPlayer, atkOrque, defesaPlayer, dificuldade);
				        		if (vidaPlayer<0.0) {
				        			System.out.println(msgDerrota);
				        			System.exit(0);				        			
				        		}
				        		vidaOrque = CombateJogador.jogadorAtaca(vidaOrque, armaJogador, defesaOrque, dificuldade);
			        			if (vidaOrque<0.0) {
				        			System.out.println(msgVitoria);
				        			break;
				        		}				        	
			        	}
					} 
				}
			} else {
				System.out.println(msgFugir);
				System.exit(0);
				}
		
		System.out.println("Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha\r\n"
				+ "em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");
		
//escolha de armadura
		System.out.println("Você deseja PEGAR uma nova armadura?");
		String pegaArmadura = inputJogador.nextLine();
		
		if (pegaArmadura.equalsIgnoreCase("PEGAR")||pegaArmadura.equalsIgnoreCase("SIM")) {
			System.out.println("Você resolve usar os equipamentos do\r\n"
					+ "inimigo contra ele, e trocar algumas peças suas, que estavam danificadas, pelas peças de\r\n"
					+ "armaduras existentes na sala. De armadura nova, você se sente mais protegido para os desafios\r\n"
					+ "à sua frente.");
			novoPlayer.setArmadura(defesaPlayer+5.0);
			defesaPlayer = novoPlayer.getArmadura();			
		} else {System.out.println("Você decide que não precisa utilizar\r\n"
				+ "nada que venha das mãos do inimigo.");}	
		
		System.out.println("Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das\r\n"
				+ "fechaduras da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva\r\n"
				+ "presa ao cinto.");
		
		System.out.println("PORTA ESQUERDA: Você retorna à sala anterior e se dirige à porta da esquerda. Você se\r\n"
				+ "aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais\r\n"
				+ "força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara\r\n"
				+ "com uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e\r\n"
				+ "garrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão\r\n"
				+ "que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos\r\n"
				+ "soldados para aterrorizar a região.\r\n"
				+ "No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque\r\n"
				+ "horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.");
		
//combate
		System.out.println("Você deseja LUTAR ou FUGIR?");
		continuaCombate = inputJogador.nextLine();
		
		if (continuaCombate.equalsIgnoreCase("LUTAR")) {
		
		double vidaAlquimista = 150.0d;
		double atkAlquimista = 5.0d;
		double defesaAlquimista = 2.0d;
		
		while (vidaAlquimista>0.0) {
			if (vidaPlayer<=0.0) { 
				System.out.println(msgDerrota);
				System.exit(0);
			} else {				
				System.out.println("Você deseja ATACAR ou ESPERAR?");
				String iniciativaCombate = inputJogador.nextLine();
				if (iniciativaCombate.equalsIgnoreCase("ATACAR")) {	
					vidaAlquimista = CombateJogador.jogadorAtaca(vidaAlquimista, armaJogador, defesaAlquimista, dificuldade);
		        		if (vidaAlquimista<0.0) {
		        			System.out.println(msgVitoria);
		        			break;
		        		}
		        		vidaPlayer = CombateInimigo.inimigoAtaca(vidaPlayer, atkAlquimista, defesaPlayer, dificuldade);			        		
		        	} else {
		        		vidaPlayer = CombateInimigo.inimigoAtaca(vidaPlayer, atkAlquimista, defesaPlayer, dificuldade);
			        		if (vidaPlayer<0.0) {
			        			System.out.println(msgDerrota);
			        			System.exit(0);				        			
			        		}
			        		vidaAlquimista = CombateJogador.jogadorAtaca(vidaAlquimista, armaJogador, defesaAlquimista, dificuldade);
		        			if (vidaAlquimista<0.0) {
			        			System.out.println(msgVitoria);
			        			break;
			        		}				        	
		        	}
				} 
			}
		} else {
			System.out.println(msgFugir);
			System.exit(0);
			}
		
		System.out.println("Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque\r\n"
				+ "do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido\r\n"
				+ "levemente rosado, pega a garrafa e pondera se deve beber um gole.");
		
//escolha poção
		System.out.println("Você deseja BEBER ou DESCARTAR a poção?");
		String bebePocao = inputJogador.nextLine();
		if (bebePocao.equalsIgnoreCase("BEBER")) {
			System.out.println("Você se sente revigorado para seguir adiante!");
			novoPlayer.setVidaJogador(vidaInicial);
		} else {System.out.println("Você fica receoso de beber algo produzido pelo inimigo.");}	
				
		System.out.println("Ao lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave\r\n"
				+ "abre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa\r\n"
				+ "que leva presa ao cinto.\r\n"
				+ "De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a\r\n"
				+ "porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você\r\n"
				+ "percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca\r\n"
				+ "no combate que você sabe que irá se seguir, e adentra a porta.");
		
		System.out.println("Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e\r\n"
				+ "prisioneiros acorrentados às paredes.\r\n"		
				+ "Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de\r\n"
				+ "lâmina dupla.");
		
//combate
		System.out.println("Você deseja LUTAR ou FUGIR?");
		continuaCombate = inputJogador.nextLine();
		
		if (continuaCombate.equalsIgnoreCase("LUTAR")) {
		double vidaLider = 225.0d;
		double atkLider = 5.0d;
		double defesaLider = 5.0d;
		
		while (vidaLider>0.0) {
			if (vidaPlayer<=0.0) { 
				System.out.println(msgDerrota);
				System.exit(0);
			} else {				
				System.out.println("Você deseja ATACAR ou ESPERAR?");
				String iniciativaCombate = inputJogador.nextLine();
				if (iniciativaCombate.equalsIgnoreCase("ATACAR")) {	
					vidaLider = CombateJogador.jogadorAtaca(vidaLider, armaJogador, defesaLider, dificuldade);
		        		if (vidaLider<0.0) {
		        			System.out.println(msgVitoria);
		        			break;
		        		}
		        		vidaPlayer = CombateInimigo.inimigoAtaca(vidaPlayer, atkLider, defesaPlayer, dificuldade);			        		
		        	} else {
		        		vidaPlayer = CombateInimigo.inimigoAtaca(vidaPlayer, atkLider, defesaPlayer, dificuldade);
			        		if (vidaPlayer<0.0) {
			        			System.out.println(msgDerrota);
			        			System.exit(0);				        			
			        		}
			        		vidaLider = CombateJogador.jogadorAtaca(vidaLider, armaJogador, defesaLider, dificuldade);
		        			if (vidaLider<0.0) {
			        			System.out.println(msgVitoria);
			        			break;
			        		}				        	
		        	}
				} 
			}
		} else {
			System.out.println(msgFugir);
			System.exit(0);
			}

		
		System.out.println("Você conseguiu!");
		inputJogador.close();
		
//msg de vitoria condicional		
		if (motivacao.equalsIgnoreCase("VINGANÇA")) {
			System.out.println("VINGANÇA: Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma\r\n"
					+ "sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você\r\n"
					+ "pode seguir sua vida.");
		} else {System.out.println("GLÓRIA: O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de\r\n"
				+ "alegria. A glória o aguarda, você a conquistou.");}
		
		System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em\r\n"
				+ "direção à noite, retornando à cidade. Seu dever está cumprido.");
		
	}
}