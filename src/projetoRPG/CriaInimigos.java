package projetoRPG;

public class CriaInimigos {
	public static void criaInimigo() {
		Inimigos Orque = new Inimigos();
		Orque.setNomeInimigo ("Orque");
		Orque.setVidaInimigo (200.0d);
		Orque.setAtkInimigo(2.0d);
		Orque.setArmaduraInimigo(2.0d);
		
		Inimigos Alquimista = new Inimigos();
		Alquimista.setNomeInimigo ("Alquimista");
		Alquimista.setVidaInimigo (150.0d);
		Alquimista.setAtkInimigo(5.0d);
		Alquimista.setArmaduraInimigo(2.0d);
		
		Inimigos Lider = new Inimigos();
		Lider.setNomeInimigo ("Lider");
		Lider.setVidaInimigo (275.0d);
		Lider.setAtkInimigo(5.0d);
		Lider.setArmaduraInimigo(5.0d);
	}
}
