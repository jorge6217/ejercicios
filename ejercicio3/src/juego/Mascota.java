package juego;
//este es el nuevo jugador
public class Mascota extends Combatiente {//heredara las mismas caracteristicas que un combatiene
	boolean turno;

	public Mascota(String nombre, int puntos_vida, int poder_ataque, Boolean turno) {
		super(nombre, puntos_vida, poder_ataque, turno);
		
	}
	//se generan los setters y getters
	public boolean isTurno() {
		return turno;
	}

	public void setTurno(boolean turno) {
		this.turno = turno;
	}
	

	
}
