/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benja
 */
public class Principal {
    public static void main(String[] args) {
        //instanciar objetos
        Menu m1 = new Menu();
        Categoria C1 = new Categoria();
        Proveedor P1 = new Proveedor();
        Producto Pr1 = new Producto();
      
        //inicializar variable
        int opc = 0;   
        do {      
            //ecepciones
            try {
            //Llama a el metodo menu y retorna un numero de 1-3
            opc = m1.menu();
            if (opc == 1){
                System.out.println(".................");
                System.out.println("----Registro----");
                //Settear Valores a los Objetos
                C1 = C1.Crear();
                P1 = P1.Crear();
                Pr1 = Pr1.Crear(P1, C1);
                System.out.println("Registrado...");
                }
            //retorna los valores actuales del objeto Producto(Proveedor, Categoria)
            else if (opc == 2){    
                System.out.println("....................");
                System.out.println("---Datos Actuales---");
                System.out.println(Pr1.toString());
            }
            //Sale del bucle y finaliza el Programa
            else if (opc == 3){
                System.out.println("Saliendo.....");
                break;
            }  
            } catch (Exception e) 
            {
            System.out.println("Ocurrio un error, Reinicia el Programa...");
            break;
            }
            //bucle
        } while (opc > 0 || opc < 4);  
    }  
}
