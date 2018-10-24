package Logica;

public class Mapa {
	private int coordX;
	private int coordY;
	private int cantidadEnemigos;
	private int cantidadNpcAliados;
	private int vectorItems[];
	private int oro;
	
	private boolean zonaSegura;
	private boolean hayEnemigos;
	private boolean hayAliados;
	
	public void SetX(int xPrima) {
		coordX = xPrima;
	}
	public void SetY(int yPrima) {
		coordY = yPrima;
	}
	public void SetZonaSeg(boolean esSegura) {
		zonaSegura = esSegura;
	}
	public void SetAmountAlllyNpc(int unaCantidad) {
		cantidadNpcAliados = unaCantidad;
	}
	public void SetAmountEnemiesNpc(int unaCantidad) {
		cantidadEnemigos = unaCantidad;
	}
	public void CrearPos(int x,int y,boolean esSegura) {	//Constructor de posicion vacia
		this.SetX(x);
		this.SetY(y);
		SetZonaSeg(esSegura);
	}
	public void CrearPos(int x,int y,boolean esSegura,int cntAllyes,int cntEnemies) {	//Constructor de posicion con npcs
		this.SetX(x);
		this.SetY(y);
		SetZonaSeg(esSegura);
		SetAmountAlllyNpc(cntAllyes);
		SetAmountEnemiesNpc(cntEnemies);
	}
	
	
}
