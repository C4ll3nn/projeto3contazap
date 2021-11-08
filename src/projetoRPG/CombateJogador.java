package projetoRPG;

import java.util.concurrent.ThreadLocalRandom;

public class CombateJogador {
	public static double jogadorAtaca(double vidaInimigo, String armaJogador, double defesaInimigo, String dificuldade) {

		double dano = 0.0d;
		double dadoNormalizado = 0.0d;
		
		int dadoRolado = ThreadLocalRandom.current().nextInt(1, 20 + 1);
		if (dificuldade.equalsIgnoreCase("DIFICIL")||dificuldade.equalsIgnoreCase("DIFÍCIL")) {
			dadoNormalizado = dadoRolado * 0.9;
		} else {
			dadoNormalizado = dadoRolado;
			}		    	
    	String tipoDanoJogador = "";
    	switch(dadoRolado) {
    	 	case 1:
    	 		tipoDanoJogador = "ERROU";
    			break;
    	 	case 20:
    	 		tipoDanoJogador = "CRITICO";
    			break;
    	 	default:	        	
    	 		tipoDanoJogador = "COMUM";
    	}
    	
    	String complementoArma = ComplementoArmas.analisaArma(armaJogador);
    	double atkArma = ComplementoArmas.ataqueArma(armaJogador);  
    	
    	switch(tipoDanoJogador) {
    	case "COMUM":
    		if((atkArma+dadoNormalizado)<=defesaInimigo) {
    			dano=0.0d;
    		} else {
    			dano = (atkArma+dadoNormalizado)-defesaInimigo;
        		vidaInimigo = vidaInimigo-dano;
    		}
    		System.out.println("Você atacou " + complementoArma +" e causou "+ dano +" de dano no inimigo! Agora ele possui "+ vidaInimigo 
    			+ " pontos de vida.");
    		break;
    	case "ERROU":
    		System.out.println("Você errou seu ataque! O inimigo não sofreu dano algum.");
    		break;
    	case "CRITICO":
    		dano = atkArma+dadoNormalizado;
    		vidaInimigo = vidaInimigo-dano;
    		System.out.println("Você acertou um ataque crítico!Você atacou " + complementoArma +" e causou "+ dano +" de dano no inimigo!\r\n"
    			+"agora ele possui "+ vidaInimigo + " pontos de vida.");
    		break;    	
    	}
    	return vidaInimigo;
	}		
}
