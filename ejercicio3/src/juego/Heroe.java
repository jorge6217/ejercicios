// Jorge Luis Lopez 
package juego;

import java.util.Arrays;
//clase hija de Combatiene
public class Heroe extends Combatiente{
	String type;
	String[ ] items;
	

	public Heroe(String nombre, int puntos_vida, int poder_ataque, Boolean turno, String type, String[] items) {
		super(nombre, puntos_vida, poder_ataque, turno);
		this.type = type;
		this.items = items;
	}


	//Se crean los setters y getters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Heroe [type=" + type + ", items=" + Arrays.toString(items) + ", nombre=" + nombre + ", puntos_vida="
				+ puntos_vida + ", poder_ataque=" + poder_ataque + "]";
	}
	
	
	
	
	
	
	

	
	
	
}
