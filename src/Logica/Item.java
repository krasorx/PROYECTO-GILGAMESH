package Logica;

public class Item {
	private static int indice;
	private String nombre;
	private int puntosAtaque;
	private int ph;
	private int tipo;							//1 normal, 2 arma, 3 armadura, 4 pocion, 5 pergamino, 6 llave
	private int puntosDefensa;					// pocion --> cod 1 vida , 2 mana, 3 curar veneno
	private int codigo;							//solo llaves
	private int daMana = 30;
	private int daVida = 15;

	public Item()
	{
		indice++;
	}
	
	public Item(String unNombre,int unTipo, int unosPtsAtaque,int unosPtsDefensa,
						  int unCodigo,int unPh)
	{
		indice++;
		nombre = unNombre;
		tipo = unTipo;
		puntosAtaque = unosPtsAtaque;
		puntosDefensa = unosPtsDefensa;
		codigo = unCodigo;
		ph = unPh;
	}
	
	public boolean EsUsable()
	{
		if (tipo == 4 || tipo == 5 || tipo == 6) return true;
		else return false;
	}
	
	public int GetType()
	{
		return tipo;
	}
	public int GetCode()
	{
		return codigo;
	}
	public int GetHeal()
	{
		return daVida;
	}
	public int GetMana()
	{
		return daMana;
	}
	
}