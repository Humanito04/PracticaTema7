package equipo;

import jugador.Jugador;
import jugador.centroCampista.CentroCampista;
import jugador.centroCampista.MediaPunta;
import jugador.centroCampista.Pivote;
import jugador.defensa.Central;
import jugador.defensa.Defensa;
import jugador.defensa.Lateral;
import jugador.delantero.Delantero;
import jugador.portero.Portero;

public class Equipo {

	private Jugador jugadores[11];
 CentroCampista c1= new CentroCampista;
 MediaPunta m1= new MediaPunta;
 Pivote p1= new Pivote;
 Central central1= new Central;
 Defensa d1= new Defensa;
 Lateral l1= new Lateral;
 Delantero delantero1= new Delantero;
 DelanteroCentro dCentro1= new DelanteroCentro;
 Extremo eIzq1= new Extremo;
 Portero prtero1= new Portero;
 Extremo eDer1= new Extremo;

 public void aniadirJugador(Jugador jugador,int posicion ) {
	 if(posicion<0||posicion>this.jugadores.length-1) {
		 throw new IllegalArgumentException("La posicion indicada no pertenece al array");
	 }
	 this.jugadores[posicion]= jugador;
 }

 public void mostrarAlineacion() {
	 System.out.println(this.jugadores.toString());
 }
}
