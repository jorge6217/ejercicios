// Jorge Luis Lopez 
package juego;
//clase hija de Combatiene
public class Enemy extends Combatiente{
	String type;
	String[ ] items;

	public Enemy(String nombre, int puntos_vida, int poder_ataque, Boolean turno, String type, String[] items) {
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
	
	
	
	

	

	
	
	
}
