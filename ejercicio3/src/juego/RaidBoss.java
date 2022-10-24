package juego;
//Este es el nuevo enemigo 
public class RaidBoss extends Combatiente{//heredara las caracteristicas de un combatiente
	boolean turno;

	public RaidBoss(String nombre, int puntos_vida, int poder_ataque, Boolean turno) {
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
