package jogo;

import jplay.Scene;
import jplay.Window;

public class Cenario1 {
	
	private Window janela;
	private Scene cena;
	private Jogador jogador;
	
	public Cenario1(Window window) {
		janela = window;
		cena = new Scene();
		cena.loadFromFile("C:\\Users\\Administrador\\eclipse-workspace\\jogo\\src\\recursos\\tiles\\Cenario1.scn");
		jogador = new Jogador(640,350);
		run();
	}
	
	private void run() {
		while(true) {
			cena.draw();
			jogador.draw();
			jogador.mover(janela);
			janela.update();
			
		}
	}
	
}