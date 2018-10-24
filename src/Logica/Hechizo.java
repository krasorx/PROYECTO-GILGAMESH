package Logica;

public class Hechizo {
	private static int indice;
	private int index;
	private String info;
	private String nombre;
	private int dmg;
	private int manaCost;
	private int tipo;				// 1 - Daño a npcs 2 - buffingAtk 3 - buffDef - 4 debuff 5 ilusion - 6 curacion
	private int cura;
	private int aumDmg;
	private int aumDef;
	
	public Hechizo() {
		
	}
	public void SetDmg(int unDmg) {
		dmg = unDmg;
	}
	public void SetManaCost(int unManaCost) {
		manaCost = unManaCost;
	}
	public void SetTipo(int unTipo) {
		tipo = unTipo;
	}
	public void SetInfo(String unaInfo) {
		info = unaInfo;
	}
	public void SetCurar(int unaCuracion) {
		cura = unaCuracion;
	}
	public void SetAumDmg(int unAumento) {
		aumDmg = unAumento;
	}
	public void SetAumDef(int unAumento) {
		aumDef = unAumento;
	}
	public void HechizoAtaque(int unDmg,int unManaCost,int unTipo) {
		indice++;
		index = indice;
		SetDmg(unDmg);
		SetManaCost(unManaCost);
		SetTipo(unTipo);
	}
	public void HechizoCuracion(int unaCura,int unManaCost,int unTipo) {
		indice++;
		index = indice;
		SetCurar(unaCura);
		SetManaCost(unManaCost);
		SetTipo(unTipo);
	}
	public void HechizoBuffAtaque(int unInt, int unManaCost, int unTipo) {
		indice++;
		index = indice;
		SetAumDmg(unInt);
		SetManaCost(unManaCost);
		SetTipo(unTipo);
	}
	public void HechizoBuffDef(int unInt, int unManaCost, int unTipo) {
		indice++;
		index = indice;
		SetAumDef(unInt);
		SetManaCost(unManaCost);
		SetTipo(unTipo);
	}
	public void CrearHechizo(int unInt,int unManaCost,int unTipo,String unNombre,String unaInfo) {
		info = unaInfo;
		nombre = unNombre;
		switch(unTipo) {
		case 1:
			HechizoAtaque(unInt,unManaCost, unTipo);
			break;
		case 2:
			HechizoBuffAtaque(unInt,unManaCost, unTipo);
			break;
		case 3:
			HechizoBuffDef(unInt,unManaCost, unTipo);
			break;
		case 4:
			//TODO
			break;
		case 5:
			//TODO
			break;
		case 6:
			HechizoCuracion(unInt,unManaCost, unTipo);
			break;
		default:
			System.out.println("Error al crear hechizo, tipo de hechizo invalido." + unTipo);
			break;
		}
	}
	public int GetDmg() {
		return dmg;
	}
	public int GetManaCost() {
		return manaCost;
	}
	public int GetTipo() {
		return tipo;
	}
	public int GetCurar() {
		return cura;
	}
	public int GetAumDmg() {
		return aumDmg;
	}
	public int GetAumDef() {
		return aumDef;
	}
	public String GetNombre() {
		return nombre;
	}
	public String Getinfo() {
		switch(tipo) {
		case 1:
			return (info + " Causa " + GetDmg() + " puntos de daño, " + " y cuesta " + GetManaCost() + " puntos de mana.");
		case 2:
			return (info + " Otorga " + GetAumDmg() + " puntos de daño, " + " y cuesta " + GetManaCost() + " puntos de mana.");
		case 3:
			return (info + " Otorga " + GetAumDef() + " puntos de defensa, " + " y cuesta " + GetManaCost() + " puntos de mana.");
		case 6:
			return (info + " Cura " + GetCurar() + " puntos de vida, " + " y cuesta " + GetManaCost() + " puntos de mana.");
		default:
			return "Ha ocurrido un error.";
		}
	}
	public Hechizo BuscarHechizo(String unNombre) {
		Hechizo hechi = new Hechizo();
		CrearHechizos ch = new CrearHechizos();
		hechi = ch.GetHechizo(unNombre);
		return hechi;
	}
	public void LanzarHechizo() {
		
	}
	
	

}
