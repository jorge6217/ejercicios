// Jorge Luis Lopez 
package juego;
//clase Padre hereda a heroe y enemy
public class Combatiente {
	String nombre;
	int puntos_vida;
	int poder_ataque;
	Boolean turno;
	

	public Combatiente(String nombre, int puntos_vida, int poder_ataque, Boolean turno) {
		super();
		this.nombre = nombre;
		this.puntos_vida = puntos_vida;
		this.poder_ataque = poder_ataque;
		this.turno = turno;
	}


	//Se crean los setters y getters
	public Boolean getTurno() {
		return turno;
	}



	public void setTurno(Boolean turno) {
		this.turno = turno;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos_vida() {
		return puntos_vida;
	}

	public void setPuntos_vida(int puntos_vida) {
		this.puntos_vida = puntos_vida;
	}

	public int getPoder_ataque() {
		return poder_ataque;
	}

	public void setPoder_ataque(int poder_ataque) {
		this.poder_ataque = poder_ataque;
	}
	
	
	

	
}
