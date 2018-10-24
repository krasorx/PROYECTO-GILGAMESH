package Logica;

public class CrearHechizos {
	private int i = 0;
	private int df = 6;
	private Hechizo vHechizos[] = new Hechizo[df];
	
	public void CrearHechizos(Hechizo[] unvHechizos) {
		unvHechizos[i] = new Hechizo();
		unvHechizos[i].CrearHechizo(5, 10, 1,"Dardo Magico","Lanza un dardo magico que daña al objetivo.");i++;unvHechizos[i] = new Hechizo();
		unvHechizos[i].CrearHechizo(10, 25, 1,"Flecha Magica","Lanza una flecha magica que daña al objetivo.");i++;unvHechizos[i] = new Hechizo();
		unvHechizos[i].CrearHechizo(30, 45, 1,"Fuego Magico","Lanza una bola de fuego magico que daña al objetivo.");i++;unvHechizos[i] = new Hechizo();
		unvHechizos[i].CrearHechizo(5, 10, 6,"Curar heridas leves","Cura levemente al objetivo.");i++;unvHechizos[i] = new Hechizo();
		unvHechizos[i].CrearHechizo(3, 10, 2,"Fuerza","Aumenta tu fuerza temporalmente.");i++;unvHechizos[i] = new Hechizo();
		unvHechizos[i].CrearHechizo(3, 10, 3,"Armadura Magica","Aumenta tu resistencia temporalmente.");i++;unvHechizos[i] = new Hechizo();
		for (i = 0;i<df;i++) {
			vHechizos [i] = unvHechizos[i];
		}
	}
	
	public Hechizo GetHechizo(String unNombre) {
		int i = 0;
		boolean noHallo = true;
		while (i < df && noHallo) {
			if (vHechizos[i].GetNombre() == unNombre ) {
				noHallo = false;
			}	
		}
		return vHechizos[i];
	}
	
}
