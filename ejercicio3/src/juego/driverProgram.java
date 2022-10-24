// Ejercicio 5
// Jorge Luis Lopez 
// 221038
// 23-10-2022

package juego;
import java.util.Scanner;
public class driverProgram {
	public static void main(String[] args) {
		// Se genera un scanner 
		Scanner sc = new Scanner(System.in);
		int options;
		int optionsRol;
		int optionsEnemy;
		
		// Arreglos items Heroe
		String[ ] itemsGuerrero = {"item 1", "item 2"};
		String[ ] itemsExplorador = {"item 3", "item 4", "item 5"};
		String[ ] itemsCazador = {"item 6", "item 7", "item 7"};
		
		// Arreglos enemigo
		String[ ] itemsEnemyNormal = {"item 1", "item 2"};
		String[ ] itemsEnemyJefe = {"item 3", "item 4", "item 5"};
		String[ ] itemsRaidBoss = {"item 6", "item 7", "item 7"};
		
		// Inicia el programa
		inicioJuego();
		options = sc.nextInt();
		while(options != 3) {
			if(options == 1) {
				// El usuario escoje el rol del combatiente heroe
				menuRol();
				optionsRol = sc.nextInt();
				if(optionsRol == 1) {
					// Se crea el combatiene heroe guerrero
					Heroe guerrero = new Heroe("Bruno", 2000, 300, false,"Guerrero", itemsGuerrero);
					menuEnemy();
					optionsEnemy = sc.nextInt();
					// -------------------------------------------------------------------------------------
					if(optionsEnemy == 1) {
						// Se crea el combatiene enemigo clasico(normal)
						Enemy enemigo = new Enemy("JJ", 1500, 100, false,"normal", itemsEnemyNormal);
						while(guerrero.getPuntos_vida() > 0 && enemigo.getPuntos_vida() > 0) {
							enemigo.setTurno(true);
							if(guerrero.getTurno()) {
								turnoHeroe();
							}else if(enemigo.getTurno()) {
								turnoEnemigo();
							}
							
						}
					}else if(optionsEnemy == 2) {
						Enemy enemigoJefe = new Enemy("Boldermont", 2300, 200, false,"jefe", itemsEnemyJefe);						
					}
					//-------------------------------------------------------------------------------------
				}else if(optionsRol == 2) {
					// Se crea el combatiene heroe explorador
					Heroe explorador = new Heroe("Leo", 1500, 100, false,"Explorador", itemsExplorador);
					menuEnemy();
					optionsEnemy = sc.nextInt();
					// -------------------------------------------------------------------------------------
					if(optionsEnemy == 1) {
						// Se crea el combatiene enemigo jefe
						Enemy enemigo = new Enemy("JJ", 1500, 100, false,"normal", itemsEnemyNormal);
					}else if(optionsEnemy == 2) {
						Enemy enemigoJefe = new Enemy("Boldermont", 2300, 200, false, "jefe", itemsEnemyJefe);						
					}
					// -------------------------------------------------------------------------------------
				}
			}
		}
	}
	// Se inicia partida o termina el programa (Se agrego al menu el modo raid)
	public static void inicioJuego() {
		System.out.println(" Bienvenido al juego de Batalla Version 2 ");
		System.out.println(" 1. Iniciar partida normal ");
		System.out.println(" 2. Jugar modo Raid");
		System.out.println(" 3. Salir ");
	}
	// menu para escojer el tipo de heroe (Se agrego el heroe cazador)
	public static void menuRol() {
		System.out.println(" Escoje tu heroe. ");
		System.out.println(" 1. Guerrero ");
		System.out.println(" 2. Explorador ");
		System.out.println(" 3. Cazador ");
	}
	public static void menuEnemy() {
		// menu para escojer el tipo de enemigo
		System.out.println(" Escoje tu enemigo. ");
		System.out.println(" 1. Clàsico ");
		System.out.println(" 2. Jefe ");
		System.out.println(" 3. Raid Boss ");
	}
	// menu turno heroe
	public static void turnoHeroe() {
		System.out.println("Turno Heroe");
		System.out.println("1. Atacar");
		System.out.println("2. Utilizar item o habilidad especial");
		System.out.println("3. Saltar turno");
	}
	//menu especial para el heroe cazador
	public static void turnoHeroeCazador() {
		System.out.println("Turno Heroe");
		System.out.println("1. Atacar");
		System.out.println("2. Utilizar item o habilidad especial");
		System.out.println("3. Pedir ayuda a mascota");
		System.out.println("4. Saltar turno");
	}	
	// menu turno enemigo
	public static void turnoEnemigo() {
		System.out.println("Turno Enemigo");
		System.out.println("1. Atacar");
		System.out.println("2. Utilizar item o habilidad especial");
		System.out.println("3. Saltar turno");
	}
	
}
