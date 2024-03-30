/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugador.defensa;

/**
 *
 * @author Usuario
 */
public class Central extends Defensa {

    private int entradas;

    public Central(String nombre, int dorsal, String equipo, int disputasRealizadas, int entradas) {
        super(nombre, dorsal, equipo, disputasRealizadas);
        this.entradas = entradas;
    }

    public int getEntradas() {
        return this.entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

}
