    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedapapeltijera;

import java.util.Scanner;

/**
 *
 * @author LuisFernando
 */
public class Persona {
    //declaro las variable de la clase persona.
    String alias;
    String correo;
    
    
    public void solicitarDatosPersona(){    
        // Aquí esta el mensaje de bienvenida y el ingreso de los datos del usuario por teclado
        System.out.println("**************************************************");
        System.out.println("\t\tPIEDRA, PAPEL O TIJERA");
        
        Scanner sc= new Scanner(System.in);
        System.out.println("\nIngrese su alias");
        alias=sc.next();
        System.out.println("Ingrese su correo");
        correo=sc.next();
        
        System.out.println("\t\n\nCOMIENZA EL JUEGO!");
    }
    
    public void mostrarDatosPersona(){
       //Aquí muestro los datos que el usuario ingresó.
        System.out.println("\n\nJUGADOR");
        System.out.println( alias + "-" + correo);
        
        
        
        
        
    }
    
}


