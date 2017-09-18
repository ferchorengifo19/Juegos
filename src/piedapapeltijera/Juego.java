/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedapapeltijera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LuisFernando
 */
public class Juego {

    // Tengo declaradas las variables de la clase Juego
    int jugadaPersona = 0, jugadaPc = 0;
    String jugador, computadora;

    public void jugar() {

        //este es el código donde muestra el mesanje de bienvenidad e inicio del juego 
        Persona objPersona = new Persona();
        objPersona.solicitarDatosPersona();

        objPersona.mostrarDatosPersona();

        for (int i = 1; i < 4; i++) {

            System.out.println("\t\t(RONDA " + i + ")");

            Scanner sc = new Scanner(System.in);
            System.out.println("\nSeleccione su jugada escribiendo un numero");
            System.out.println("0: Piedra \n1:Papel \n2: Tijera");
            jugadaPersona = sc.nextInt();

            switch (jugadaPersona) {
                case 0:
                    jugador = "Piedra";
                    break;
                case 1:
                    jugador = "Papel";
                    break;
                case 2:
                    jugador = "Tijera";
                    break;
                default:
                    System.out.println("A seleccionado una jugada incorrecta");
            }

            switch (jugadaPc) {
                case 0:
                    computadora = "Piedra";
                    break;
                case 1:
                    computadora = "Papel";
                    break;
                case 2:
                    computadora = "Tijera";
                    break;
                default:
                    System.out.println("A seleccionado una jugada incorrecta");

                //Tenemos las condiciones del Juego.    
                }
            if (jugadaPersona == 0 && jugadaPc == 2) {
                jugadaPersona++;
            }
            if (jugadaPc == 1 && jugadaPersona == 0) {
                jugadaPc++;
            }
            if (jugadaPersona == 2 && jugadaPc == 1) {
                jugadaPersona++;
            }
            if (jugadaPc == 2 && jugadaPersona == 2) {
                System.out.println("Empate");
            }
            if (jugadaPc == 0 && jugadaPersona == 0) {
                System.out.println("Empate");
            }
            if (jugadaPc == 1 && jugadaPersona == 1) {
                System.out.println("Empate");
            }

            //Muestra en letras el juego de la Pc y Persona en las 3 rondas.     
            generarJuegoComputador();
            imprimirJugadaEnLetra();

        }

    }

    public void generarJuegoComputador() {

        //genero la jugada de forma aleatoria de la computadora
        Random r = new Random();
        jugadaPc = r.nextInt(3);
    }

    public void imprimirJugadaEnLetra() {

        //imprimo las juegadas de la persona y la computadora.
        System.out.println("======================");
        System.out.println("Jugada Persona" + ": " + jugador);
        System.out.println("jugadaPc" + ": " + computadora);
        System.out.println("======================");

    }

    public void buscarEImprimirGanadorFinal() {

    }

}
