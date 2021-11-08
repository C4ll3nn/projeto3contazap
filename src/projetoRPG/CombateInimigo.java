package projetoRPG;

import java.util.concurrent.ThreadLocalRandom;

public class CombateInimigo {
	public static double inimigoAtaca(double vidaJogador, double atkInimigo, double defesaJogador, String dificuldade) {
		double dano = 0.0d;
		double dadoNormalizado = 0.0d;
		
		int dadoRolado = ThreadLocalRandom.current().nextInt(1, 20 + 1);
		if (dificuldade.equalsIgnoreCase("FACIL")||dificuldade.equalsIgnoreCase("F�CIL")) {
			dadoNormalizado = dadoRolado * 0.8;
		} else {
			dadoNormalizado = dadoRolado;
			}		    		
    	
    	String tipoDanoInimigo = "";
    	switch(dadoRolado) {
    	 	case 1:
    	 		tipoDanoInimigo = "ERROU";
    			break;
    	 	case 20:
    	 		tipoDanoInimigo = "CRITICO";
    			break;
    	 	default:	        	
    	 		tipoDanoInimigo = "COMUM";
    	}
    	
    	switch(tipoDanoInimigo) {
    	case "COMUM":
    		if((atkInimigo+dadoNormalizado)<=defesaJogador) {
    			dano = 0.0d;
    		} else {
    			dano = (atkInimigo+dadoNormalizado)-defesaJogador;
            	vidaJogador = vidaJogador-dano;
    		}
    		System.out.println("O inimigo atacou! Voc� sofreu "+ dano +" de dano e agora possui "+ vidaJogador 
    			+ " pontos de vida.");
    		break;
    	case "ERROU":
    		System.out.println("O inimigo errou o ataque! Voc� n�o sofreu dano.");
    		break;
    	case "CRITICO":
    		dano = atkInimigo+dadoNormalizado;
        	vidaJogador = vidaJogador-dano;
        	
    		System.out.println("O inimigo acertou um ataque cr�tico!! Voc� sofreu "+ dano +" de dano e agora possui "+ vidaJogador 
        			+ " pontos de vida.");
    		break;    	
    	}
    	return vidaJogador;
	}
	
	public static double danoArmadilha(double vidaJogador, double defesaJogador) {
		double dano = 0.0d;
		
		int dadoRoladoInimigo = ThreadLocalRandom.current().nextInt(1, 10 + 1);		
    	
    	String tipoDanoInimigo = "";
    	switch(dadoRoladoInimigo) {
    	 	case 1:
    	 		tipoDanoInimigo = "ERROU";
    			break;
    	 	case 10:
    	 		tipoDanoInimigo = "CRITICO";
    			break;
    	 	default:	        	
    	 		tipoDanoInimigo = "COMUM";
    	}
    	
    	switch(tipoDanoInimigo) {
    	case "COMUM":
    		if(dadoRoladoInimigo<=defesaJogador) {
    			dano = 0.0d;
    		} else {
    			dano = dadoRoladoInimigo-defesaJogador;
            	vidaJogador = vidaJogador-dano;
    		}
    		System.out.println("Flechas voam da escotilha em sua dire��o, e voc� salta\r\n"
    				+ "para dentro da sala, por�m uma delas te acerta na perna causando "+ dano +" pontos de dano.");
    		break;
    	case "ERROU":
    		System.out.println("Flechas voam da escotilha em sua dire��o, e voc� salta\r\n"
    				+ "para dentro da sala, por�m nenhuma delas te acerta.");
    		break;
    	case "CRITICO":
    		dano = dadoRoladoInimigo;
        	vidaJogador = vidaJogador-dano;
        	
    		System.out.println("Flechas voam da escotilha em sua dire��o, e voc� salta\r\n"
    				+ "para dentro da sala, por�m uma delas te acerta na perna causando um dano cr�tico de "+ dano +" pontos.");
    		break;
    	}
    	return vidaJogador;
	}
}
