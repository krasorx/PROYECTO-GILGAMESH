package Logica;

public class Main {

	public static void main(String[] args) {
		int df = 15, dh = 5;
		Item vItems [] = new Item[df];
		CrearItems ci = new CrearItems();
		ci.CrearItems(vItems);
		Hechizo vHechizos[] = new Hechizo[df];
		CrearHechizos ch = new CrearHechizos();
		ch.CrearHechizos(vHechizos);
		
	}

}
