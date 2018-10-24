package Logica;

public class CrearItems {
	private int i = 0;
	private int df = 16;		//cantidad total de items
	public void CrearItems(Item[] unVecItems)
	{							//1 normal, 2 arma, 3 armadura, 4 pocion, 5 pergamino, 6 llave
								//	unNombre, TIPO, PA, DEF, COD, PH
		unVecItems[i] = new Item("NADA",1, 0, 0, 0,0);
		i++;unVecItems[i] = new Item("Vestimentas comunes",3, 0, 1, 0,0);
		i++;unVecItems[i] = new Item("Daga (newbie)",2, 3, 0, 0,0);
		i++;unVecItems[i] = new Item("Pocion roja",4, 0, 0, 1,0);
		i++;unVecItems[i] = new Item("Pocion azul",4, 0, 0, 2,0);
		i++;unVecItems[i] = new Item("Ramita magica(newbie)",2, 1, 0, 0,1);
		i++;unVecItems[i] = new Item("Armadura de cuero",3, 0, 6, 0,0);
		i++;unVecItems[i] = new Item("Tunica de monje",3, 0, 4, 0,0);
		i++;unVecItems[i] = new Item("Llave sotano",6, 0, 0, 1,0);
		i++;unVecItems[i] = new Item("Espada larga",2, 10, 0, 0,0);
		i++;unVecItems[i] = new Item("Vara de fresno",2, 3, 1, 0,5);
		i++;unVecItems[i] = new Item("Llave casa de Jorge",6, 0, 1, 2,0);
		i++;unVecItems[i] = new Item("Tormenta de fuego",3, 0, 0, 0,0); 	
		i++;unVecItems[i] = new Item("Pocion de curar veneno",4, 0, 0, 3,0);
		i++;unVecItems[i] = new Item("Baculo Sagrado de Neithan",2, 5, 1, 0,15);
		i++;unVecItems[i] = new Item("Espada Sagrada de Neithan",2, 20, 1, 0,5);

		/*
		unVecItems[i].NuevoItem("NADA",1, 0, 0, 0,0); 						i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Vestimentas comunes",3, 0, 1, 0,0); 		i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Daga (newbie)",2, 3, 0, 0,0); 	  		    i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Pocion roja",4, 0, 0, 1,0);	       		i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Pocion azul",4, 0, 0, 2,0);		   		i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Ramita magica(newbie)",2, 1, 0, 0,1); 		i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Armadura de cuero",3, 0, 6, 0,0); 	   	    i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Tunica de monje",3, 0, 4, 0,0);   	        i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Llave sotano",6, 0, 0, 1,0); 		   		i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Espada larga",2, 10, 0, 0,0); 				i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Vara de fresno",2, 3, 1, 0,5); 			i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Llave casa de Jorge",6, 0, 1, 2,0); 		i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Tormenta de fuego",3, 0, 0, 0,0); 			i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Pocion de curar veneno",4, 0, 0, 3,0); 	i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Baculo Sagrado de Neithan",2, 5, 1, 0,15); i++;unVecItems[i] = new Item();
		unVecItems[i].NuevoItem("Espada Sagrada de Neithan",2, 20, 1, 0,5);
		*/
	}

}
