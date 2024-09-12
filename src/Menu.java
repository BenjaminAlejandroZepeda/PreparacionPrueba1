
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benja
 */
public class Menu {
        Scanner leer = new Scanner(System.in);
    // metodo Menu que retorna un numero de 1-3 
    public int menu(){
           System.out.println("""
        --------Menu----------
        1.  Registrar Producto
        2.  Ver Producto
        3.  Salir     
                           """);
        int opc = leer.nextInt(); 
        if (opc > 0 || opc <3){
            return opc;
        }
        else {
            System.out.println("Ingrese Una Opcion existente");
            return 0;
        }
   
    }
}
