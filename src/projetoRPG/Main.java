package projetoRPG;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {		
		
		System.out.println("Seja bem vindo(a) � BATALHA FINAL!\r\n"
				+"Por favor fa�a suas escolhas baseadas nas palavras em letra mai�scula.");
		
		Jogador novoPlayer = new Jogador();
		CriaInimigos.criaInimigo();
		
//configura��o do jogo		

		Scanner inputJogador = new Scanner(System.in);
//dificuldade
	    System.out.println("Qual o nivel de dificuldade que voc� gostaria de jogar?\r\n"
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
            System.out.println("Voc� inseriu uma classe inv�lida!");
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
            System.out.println("Voc� inseriu uma classe inv�lida!");
		}
		
		String armaJogador = novoPlayer.getArma();
		
		System.out.println("A noite se aproxima, a lua j� surge no c�u, estrelas v�o se acendendo, e sob a luz do crep�sculo\r\n"
				+ "voc� est� prestes a entrar na fase final da sua miss�o. Voc� olha para o portal � sua frente, e\r\n"
				+ "sabe que a partir desse ponto, sua vida mudar� para sempre.\r\n"
				+ "Mem�rias do caminho percorrido para chegar at� aqui invadem sua mente. Voc� se lembra de\r\n"
				+ "todos os inimigos j� derrotados para alcan�ar o covil do l�der maligno. Olha para seu\r\n"
				+ "equipamento de combate, j� danificado e desgastado depois de tantas lutas. Voc� est� a um\r\n"
				+ "passo de encerrar para sempre esse mal.");
		
		System.out.println("Buscando uma inje��o de �nimo, voc� se for�a a lembrar o que te trouxe at� aqui.");
		
//escolha da motiva��o				
	    System.out.println("Escolha sua motiva��o para invadir a caverna do inimigo e derrot�-lo: VINGAN�A ou GL�RIA:");

	    String motivacao = inputJogador.nextLine();
		
		if (motivacao.equalsIgnoreCase("VINGAN�A")) {
			System.out.println("VINGAN�A: Imagens daquela noite tr�gica invadem sua mente. Voc� nem precisa se esfor�ar\r\n"
					+ "para lembrar, pois essas mem�rias est�o sempre presentes, mesmo que de pano de fundo,\r\n"
					+ "quando voc� tem outros pensamentos em foco, elas nunca o deixaram. Elas s�o o combust�vel\r\n"
					+ "que te fizeram chegar at� aqui. E voc� sabe que n�o ir� desistir at� ter vingado a morte daqueles\r\n"
					+ "que foram - e pra sempre ser�o - sua fonte de amor e desejo de continuar vivo. O maldito l�der\r\n"
					+ "finalmente pagar� por tanto mal causado na vida de tantos (e principalmente na sua).");
		} else { System.out.println("GL�RIA: Voc� j� consegue visualizar na sua mente o povo da cidade te recebendo de bra�os\r\n"
				+ "abertos, bardos criando can��es sobre seus feitos her�icos, nobres te presenteando com j�ias e\r\n"
				+ "diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilan�as. Desde\r\n"
				+ "j�, voc� sente o amor do p�blico, te louvando a cada passo que d� pelas ruas, depois de destruir\r\n"
				+ "o vil�o que tanto assombrou a paz de todos. Por�m, voc� sabe que ainda falta o �ltimo ato dessa\r\n"
				+ "hist�ria. Voc� se concentra na miss�o. A gl�ria o aguarda, mas n�o antes da �ltima batalha.");}
		
		System.out.println("Inspirado pelo motivo que te trouxe at� aqui, voc� sente seu cora��o ardendo em chamas, suas\r\n"
				+ "m�os formigarem em volta da sua arma. Voc� a segura com firmeza. Seu foco est� renovado.\r\n"
				+ "Voc� avan�a pelo portal.");
		
		System.out.println("A escurid�o te envolve. Uma ilumina��o muito fraca entra pelo portal �s suas costas. � sua\r\n"
				+ "frente, s� � poss�vel perceber que voc� se encontra em um corredor extenso. Voc� s� pode ir �\r\n"
				+ "frente, ou desistir.");
//seta msgs Combate
		String msgDerrota =("");
		if(motivacao.equalsIgnoreCase("VINGAN�A")) {msgDerrota = "Voc� n�o estava preparado para a for�a do inimigo. N�o foi poss�vel concluir sua vingan�a, "
				+ "e agora resta saber se algu�m se vingar� por voc�.";} else {
				if (novoPlayer.getSexo().equalsIgnoreCase("MASCULINO")){
					msgDerrota = "Voc� n�o estava preparado para a for�a do inimigo. A gl�ria que buscavas n�o ser� sua,\r\n"
				+ "e a cidade aguarda por seu pr�ximo her�i.";
				} else {msgDerrota = "Voc� n�o estava preparado para a for�a do inimigo. A gl�ria que buscavas n�o ser� sua,\r\n"
				+ "e a cidade aguarda por sua pr�xima her�ina.";}
		}
		String msgVitoria = "O inimigo n�o � p�reo para o seu hero�smo, e jaz im�vel aos seus p�s.";
		String msgFugir = "Voc� n�o estava preparado para a for�a do inimigo, e decide fugir para que possa tentar novamente em uma pr�xima vez.";
		
//segue ou desiste		
	    System.out.println("Escolha entre SEGUIR ou DESISTIR:");

	    String desistencia = inputJogador.nextLine();	    
		
		if (desistencia.equalsIgnoreCase("DESISTIR")) {
			System.out.println("DESISTIR: o medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio.\r\n"
					+ "Voc� se volta para a noite l� fora e corre em dire��o � seguran�a.");
			System.exit(0);
		} else { 
			System.out.println("SEGUIR: voc� caminha, atento a todos os seus sentidos, por v�rios metros, at� visualizar a frente\r\n"
				+ "uma fonte de luz, que voc� imagina ser a chama de uma tocha, vindo de dentro de uma porta\r\n"
				+ "aberta.");}
		
		System.out.println("Voc� se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera\r\n"
				+ "sobre como passar pela porta.");		
//escolha de travessia
	    System.out.println("Escolha entre passar ANDANDO, CORRENDO ou SALTANDO:");
	    String travessia = inputJogador.nextLine();	    
	   
	    switch(travessia.toUpperCase()){

        case "ANDANDO":        	
        	System.out.println("ANDANDO: Voc� toma cuidado e vai caminhando vagarosamente em dire��o � luz. Quando voc�\r\n"
					+ "pisa exatamente embaixo da porta, voc� sente o ch�o ceder levemente, como se tivesse pisado\r\n"
					+ "em uma pedra solta. Voc� ouve um ru�do de mecanismos se movimentando, e uma escotilha se\r\n"
					+ "abre no teto atr�s de voc�, no corredor.");
//dano da travessia andando
        	CombateInimigo.danoArmadilha(vidaPlayer, defesaPlayer);
            break;

        case "SALTANDO":
        	System.out.println("SALTANDO: Voc� se concentra e pula em dire��o � luz, saltando de antes da porta at� o interior\r\n"
					+ "da sala.");
            break;
        
        case "CORRENDO":
        	System.out.println("CORRENDO: Voc� respira fundo e desata a correr em dire��o � sala. Quando passa pela porta,\r\n"
    				+ "sente que pisou em uma pedra solta, mas n�o d� muita import�ncia e segue para dentro da sala,\r\n"
    				+ "olhando ao redor � procura de inimigos. N�o tem ningu�m, mas voc� ouve sons de flechas\r\n"
    				+ "batendo na pedra atr�s de voc�, e quando se vira, v� v�rias flechas no ch�o. Espiando pela porta,\r\n"
    				+ "voc� entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,\r\n"
    				+ "mas por sorte voc� entrou correndo e conseguiu escapar desse ataque surpresa.");    		    		
        	break;
		}		
		
		System.out.println("Voc� se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma\r\n"
				+ "delas foi aquela pela qual voc� entrou, que estava aberta, e as outras tr�s est�o fechadas. A\r\n"
				+ "porta � sua frente � a maior das quatro, com inscri��es em seu entorno em uma l�ngua que voc�\r\n"
				+ "n�o sabe ler, mas reconhece como sendo a l�ngua antiga utilizada pelo inimigo. Voc� se aproxima\r\n"
				+ "da porta e percebe que ela est� trancada por duas fechaduras douradas, e voc� entende que\r\n"
				+ "precisar� primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir\r\n"
				+ "enfrentar o l�der.");
		
		System.out.println("Voc� se dirige para a porta � direita.");
		
		System.out.println("PORTA DIREITA: Voc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o\r\n"
				+ "escuta nada. Segura com mais for�a sua arma com uma m�o, enquanto empurra a porta com a\r\n"
				+ "outra. Ao entrar, voc� se depara com uma sala espa�osa, com v�rios equipamentos de batalha\r\n"
				+ "pendurados nas paredes e dispostos em arm�rios e mesas. Voc� imagina que este seja o arsenal\r\n"
				+ "do inimigo, onde est�o guardados os equipamentos que seus soldados utilizam quando saem\r\n"
				+ "para espalhar o terror nas cidades e vilas da regi�o.");
		
		System.out.println("Enquanto seu olhar percorre a sala, voc� ouve a porta se fechando e gira rapidamente para olhar\r\n"
				+ "para tr�s. Ali, de p� entre voc� e a porta fechada, bloqueando o caminho do seu destino, est� um\r\n"
				+ "dos capit�es do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em\r\n"
				+ "posi��o de combate. Ele avan�a em sua dire��o.");		
//combate 
		System.out.println("Voc� deseja LUTAR ou FUGIR?");
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
					System.out.println("Voc� deseja ATACAR ou ESPERAR?");
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
		
		System.out.println("Ap�s derrotar o Armeiro, voc� percebe que seus equipamentos est�o muito danificados, e olha\r\n"
				+ "em volta, encarando todas aquelas pe�as de armaduras resistentes e em �timo estado.");
		
//escolha de armadura
		System.out.println("Voc� deseja PEGAR uma nova armadura?");
		String pegaArmadura = inputJogador.nextLine();
		
		if (pegaArmadura.equalsIgnoreCase("PEGAR")||pegaArmadura.equalsIgnoreCase("SIM")) {
			System.out.println("Voc� resolve usar os equipamentos do\r\n"
					+ "inimigo contra ele, e trocar algumas pe�as suas, que estavam danificadas, pelas pe�as de\r\n"
					+ "armaduras existentes na sala. De armadura nova, voc� se sente mais protegido para os desafios\r\n"
					+ "� sua frente.");
			novoPlayer.setArmadura(defesaPlayer+5.0);
			defesaPlayer = novoPlayer.getArmadura();			
		} else {System.out.println("Voc� decide que n�o precisa utilizar\r\n"
				+ "nada que venha das m�os do inimigo.");}	
		
		System.out.println("Em uma mesa, voc� encontra uma chave dourada, e sabe que aquela chave abre uma das\r\n"
				+ "fechaduras da porta do l�der inimigo. Voc� pega a chave e guarda numa pequena bolsa que leva\r\n"
				+ "presa ao cinto.");
		
		System.out.println("PORTA ESQUERDA: Voc� retorna � sala anterior e se dirige � porta da esquerda. Voc� se\r\n"
				+ "aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada. Segura com mais\r\n"
				+ "for�a sua arma com uma m�o, enquanto empurra a porta com a outra. Ao entrar, voc� se depara\r\n"
				+ "com uma sala parecida com a do arsenal, mas em vez de armaduras, existem v�rios potes e\r\n"
				+ "garrafas de vidro com conte�dos misteriosos e de cores diversas, e voc� entende que o capit�o\r\n"
				+ "que vive ali, realiza experimentos com diversos ingredientes, criando po��es utilizadas pelos\r\n"
				+ "soldados para aterrorizar a regi�o.\r\n"
				+ "No fundo da sala, olhando em sua dire��o, est� outro dos capit�es do inimigo. Um orque\r\n"
				+ "horrendo, de armadura, cajado em punho, em posi��o de combate. Ele avan�a em sua dire��o.");
		
//combate
		System.out.println("Voc� deseja LUTAR ou FUGIR?");
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
				System.out.println("Voc� deseja ATACAR ou ESPERAR?");
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
		
		System.out.println("Ap�s derrotar o Alquimista, voc� olha em volta, tentando reconhecer alguma po��o do estoque\r\n"
				+ "do inimigo. Em uma mesa, voc� reconhece uma pequena garrafa de vidro contendo um l�quido\r\n"
				+ "levemente rosado, pega a garrafa e pondera se deve beber um gole.");
		
//escolha po��o
		System.out.println("Voc� deseja BEBER ou DESCARTAR a po��o?");
		String bebePocao = inputJogador.nextLine();
		if (bebePocao.equalsIgnoreCase("BEBER")) {
			System.out.println("Voc� se sente revigorado para seguir adiante!");
			novoPlayer.setVidaJogador(vidaInicial);
		} else {System.out.println("Voc� fica receoso de beber algo produzido pelo inimigo.");}	
				
		System.out.println("Ao lado da porta, voc� v� uma chave dourada em cima de uma mesa, e sabe que aquela chave\r\n"
				+ "abre a outra fechadura da porta do l�der inimigo. Voc� pega a chave e guarda na pequena bolsa\r\n"
				+ "que leva presa ao cinto.\r\n"
				+ "De volta � sala das portas, voc� se dirige � porta final. Coloca as chaves nas fechaduras, e a\r\n"
				+ "porta se abre. Seu cora��o acelera, mem�rias de toda a sua vida passam pela sua mente, e voc�\r\n"
				+ "percebe que est� muito pr�ximo do seu objetivo final. Segura sua arma com mais firmeza, foca\r\n"
				+ "no combate que voc� sabe que ir� se seguir, e adentra a porta.");
		
		System.out.println("L� dentro, voc� v� o l�der sentado em uma poltrona dourada, com duas fogueiras de cada lado, e\r\n"
				+ "prisioneiros acorrentados �s paredes.\r\n"		
				+ "Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de\r\n"
				+ "l�mina dupla.");
		
//combate
		System.out.println("Voc� deseja LUTAR ou FUGIR?");
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
				System.out.println("Voc� deseja ATACAR ou ESPERAR?");
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

		
		System.out.println("Voc� conseguiu!");
		inputJogador.close();
		
//msg de vitoria condicional		
		if (motivacao.equalsIgnoreCase("VINGAN�A")) {
			System.out.println("VINGAN�A: Voc� obteve sua vingan�a. Voc� se ajoelha e cai no choro, invadido por uma\r\n"
					+ "sensa��o de al�vio e felicidade. Voc� se vingou, tudo que sempre quis, est� feito. Agora voc�\r\n"
					+ "pode seguir sua vida.");
		} else {System.out.println("GL�RIA: O �xtase em que voc� se encontra n�o cabe dentro de si. Voc� se ajoelha e grita de\r\n"
				+ "alegria. A gl�ria o aguarda, voc� a conquistou.");}
		
		System.out.println("Voc� se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos voc�s saem em\r\n"
				+ "dire��o � noite, retornando � cidade. Seu dever est� cumprido.");
		
	}
}