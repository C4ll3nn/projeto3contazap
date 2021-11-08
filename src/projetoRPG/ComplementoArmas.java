package projetoRPG;

public class ComplementoArmas {
	public static String analisaArma(String armaJogador) {
		
		String complementoArma = "";
		
		switch(armaJogador) {			
		case "ESPADA":
			complementoArma="com sua ESPADA";
			break;
		case "MACHADO":
			complementoArma="com seu MACHADO";
			break;
		case "CAJADO":
			complementoArma="com seu CAJADO, lançando uma bola de fogo";
			break;
		case "LIVRO":
			complementoArma="absorvendo energia do livro com uma mão e liberando com a outra";
			break;
		case "TECLADO_MECANICO":
			complementoArma="com seu TECLADO MECANICO, enquanto digita códigos rápidamente";
			break;
		case "DOIS_MONITORES":
			complementoArma="com seus DOIS MONITORES, considerando dados nas diversas janelas";
			break;
	}
		
		return complementoArma;
	}
	
public static double ataqueArma(String armaJogador) {
		
		double atkArma = 0.0d;
		
		switch(armaJogador) {			
		case "ESPADA":
			atkArma=12.7d;
			break;
		case "MACHADO":
			atkArma=12.9d;
			break;
		case "CAJADO":
			atkArma=14.9d;
			break;
		case "LIVRO":
			atkArma=14.7d;
			break;
		case "TECLADO_MECANICO":
			atkArma= 13.9d;
			break;
		case "DOIS_MONITORES":
			atkArma= 13.7d;
			break;
	}
		
		return atkArma;
	}
}
