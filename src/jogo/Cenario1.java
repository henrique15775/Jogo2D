package jogo;

import jplay.Scene;
import jplay.Window;

public class Cenario1 {
	
	private Window janela;
	private Scene cena;
	
	public Cenario1(Window window) {
		janela = window;
		cena = new Scene();
		cena.loadFromFile("C:\\Users\\Administrador\\eclipse-workspace\\jogo\\src\\recursos\\tiles\\Cenario1.scn");
		
		run();
	}
	
	private void run() {
		while(true) {
			cena.draw();
			janela.update();
		}
	}
	
}
