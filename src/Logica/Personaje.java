package Logica;

public class Personaje {
	private String nombre;
	
	//cordenadas
	private int x;
	private int y;
	
	private int ATAQUEMAXIMO = 35;
	private int HPMAXIMO = 999;
	private int MANAMAXIMO = 9999;
	
	private int hpTot;
	private int hpAct;
	private int manaTot;
	private int manaAct;
	private int paMax;
	private int paMin;
	private int ph; 
	private int def;
	private int lvl;
	private int expAct;
	private int expF;
	private int vectorHechizos[];	//vectorDeObjetos tipo hechizos para hacer
	private int vectorInventario[][];
	private int clase; 				//1 mago, 2 paladin,3 guerrero, 4 bardo
	private int genero;				//1 hombre, 2 mujer , 3 kidding solo hay 2 xdxdxdxd
	private int raza;				//1 humano, 2 elfo, 3 gnomo, 4 negro
	
	private char direccion;			//'N' 'O' 'E' 'S'
	
	private boolean estaDopado;
	private boolean estaVivo;		
	private boolean enCombate;		
	private boolean estaEnvenenado;
	private boolean tieneArma;		
	private boolean estaMeditando;	
	
	public void Personaje()
	{
		
	}
	
	public void CrearPersonaje(int unaClase, String unNombre, int unGenero, int unaRaza)
	{
		nombre = unNombre;
		clase = unaClase;
		expAct = 0;
		expF = 300;
		x = 4;
		y = 9;
		lvl = 1;
		expAct = 0;
		hpTot = 20;
		hpAct = 20;
		def = 0;
		genero = unGenero;
		raza = unaRaza;
		vectorInventario = new int [15][2];
		vectorHechizos = new int [15];
		direccion = 'N';
		CrearMago();
		CrearPala();
		CrearGuerre();
		CrearBardo();
	}
	
	public void CrearMago()
	{
		manaTot = 100;
		manaAct = 100;
		paMax = 3;
		paMin = 1;
		ph = 5;
	}
	public void CrearPala()
	{
		manaTot = 0;
		manaAct = 0;
		paMax = 6;
		paMin = 5;
		ph = 1;
	}
	public void CrearGuerre()
	{
		manaTot = 100;
		manaAct = 100;
		paMax = 8;
		paMin = 6;
		ph = 0;
	}
	public void CrearBardo()
	{
		manaTot = 50;
		manaAct = 50;
		paMax = 5;
		paMin = 3;
		ph = 3;
	}
	public void SubeLvl()
	{
		int base = 3;
		lvl++;
		expF = (int)Math.pow(base, (double)lvl/5) + (300 * lvl);
	}
	public void ObtenerExp()
	{
		System.out.println("Exp " + expAct + "  /  " + expF + ".");
	}
	public void ObtenerHp()
	{
		System.out.println("hp " + hpAct + "  /  " + hpTot + ".");
	}
	public void ObtenerMana()
	{
		System.out.println("mana " + manaAct + "  /  " + manaTot + ".");
	}
	
	public void EquiparArma(Item unItem)
	{
		if (PuedeEquipar(unItem)) 
		{
			tieneArma = true;
		}
		else System.out.println("Tu clase no puede usar ese objeto.");
	}
	
	public boolean PuedeEquipar(Item unItem)
	{
		return true;		//Work In Progress

	}
	public void UsarItem(Item unItem, int posInv)
	{
		if (estaVivo) {				// pregunta si el usuario esta vivo
			if(unItem.EsUsable())
			{
				int type = unItem.GetType();
				switch(type)
				{
				case 4:
					TomarPocion(type,unItem);
					vectorInventario[posInv][1]--;
					if (vectorInventario[posInv][1] == 0) {
						vectorInventario[posInv][1] = 0;
					}
					break;
				case 5:
					AprenderHechizo(unItem);
					vectorInventario[posInv][1]--;
					if (vectorInventario[posInv][1] == 0) {
						vectorInventario[posInv][1] = 0;
					}
					break;
				case 6:
					UsarLlave(unItem);
					break;
				}
			}
		}
		else System.out.println("No puedes usar items si estas muerto");
	}
	public void TomarPocion(int type, Item unaPota)
	{
		switch(unaPota.GetCode()) 
		{
		case 1:
			Curar(unaPota);								//Efecto de la pocion	
			break;
		case 2:
			Mana(unaPota);
			break;
		case 3:
			if(estaEnvenenado) {
				estaEnvenenado = false;
				System.out.println("Te has curado el envenanamiento.");
			}
		}
	}
	public void Curar(Item pocionRoja)
	{
		if(this.hpAct < this.hpTot) {
			int heal = pocionRoja.GetHeal();
			if (this.hpAct + heal == this.hpTot) {
				this.hpAct = this.hpTot;
			}
			else this.hpAct += heal;
		}
	}
	public void Mana(Item pocionAzul) {
		if(this.manaAct < this.manaTot) {
			int mana = pocionAzul.GetMana();
			if(this.manaAct + mana == this.manaTot) {
				this.manaAct = this.manaTot;
			}
			else this.manaAct += mana;
		}
	}
	public void AprenderHechizo(Item unHechi) {
		//Agrega el hechizo al vector hechizos
	}
	public void UsarLlave(Item unaLlave) {
		//getCodigo puerta cercana
		//getCodigo llave
		//son iguales?
			// si lo son abre la puerta
			// sino no hace nada
	}
	public void MoverNorte() {
		y--;
		direccion = 'N';
	}
	public void MoverOeste() {
		x++;
		direccion = 'O';
	}
	public void MoverEste() {
		x--;
		direccion = 'E';
	}
	public void MoverSur() {
		y++;
		direccion = 'S';
	}
	public boolean GetEstaDopada() {
		return estaDopado;
	}
	public boolean GetEstaVivo() {
		return estaVivo;
	}
	public boolean GetEstaEnCombate() {
		return enCombate;
	}
	public boolean GetEstaMeditando() {
		return estaMeditando;
	}
	public boolean GetEstaEnvenenado() {
		return estaEnvenenado;
	}
	public boolean GetTieneArma() {
		return tieneArma;
	}
	public char GetDireccion() {
		return direccion;
	}
	public int GetLvl() {
		return lvl;
	}
	public int GetExpRequired() {
		return expF;
	}
	public int GetExpAct() {
		return expAct;
	}
	public int GetRaza() {
		return raza;
	}
	public void LanzarHechizo(String unNombre) {
		Hechizo hechi = new Hechizo();
		hechi = hechi.BuscarHechizo(unNombre);
		switch(hechi.GetTipo()) {
		case 1:
			LanzarHechizoAtaque(hechi);
			break;
		case 2:
			LanzarHechizoBuffFuerza(hechi);
			break;
		case 3:
			LanzarHechizoBuffDefensa(hechi);
			break;
		case 6:
			LanzarHechizoCurar(hechi);
			break;
		default:
			System.out.println("A ocurrido un error al lanzar el hechizo.");
			break;
		}
	}
	public void ActualizaMana(Hechizo unHechi) {
		this.manaAct -= unHechi.GetManaCost();
		if (this.manaAct < 0) this.manaAct = 0;
	}
	public void LanzarHechizoAtaque(Hechizo hechi) {
		ActualizaMana(hechi);
	}
	public void LanzarHechizoBuffFuerza(Hechizo hechi) {
		ActualizaMana(hechi);
		estaDopado = true;
		this.paMax += hechi.GetAumDmg();
		this.paMin += hechi.GetAumDmg();
		System.out.println("Has aumentado tus puntos de ataque en " + hechi.GetAumDmg()+ " puntos.");
		// Agregar rutina de temporizador para que dure un tiempo;
	}
	public void LanzarHechizoBuffDefensa(Hechizo hechi) {
		ActualizaMana(hechi);
		this.def += hechi.GetAumDef();
		System.out.println("Has aumentado tu defensa en , " + hechi.GetAumDef() + " puntos.");
		// Agregar rutina de temporizador para que dure un tiempo;
	}
	public void LanzarHechizoCurar(Hechizo hechi) {
		ActualizaMana(hechi);
		this.hpAct += hechi.GetCurar();
		if (this.hpAct > this.hpTot) this.hpAct = this.hpTot;
		System.out.println("Te has curado, " + hechi.GetCurar() + " puntos de vida.");
	}
}
