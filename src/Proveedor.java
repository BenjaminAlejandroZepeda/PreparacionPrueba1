
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benja
 */
public class Proveedor {
    private int idproveedor;
    private String nombre, contacto;

    public Proveedor() {
        this.idproveedor = 0;
        this.nombre = "Vacio";
        this.contacto = "yyyy@gmail.com"; 
    }

    public Proveedor(int idproveedor, String nombre, String contacto) {
        this.idproveedor = idproveedor;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "\nProveedor" 
                + "\nidproveedor: " + idproveedor + 
                " \nnombre: " + nombre + 
                " \ncontacto: " + contacto
                + " \n                             " 
                ;
    }
    
    //Registrar Objeto
    
    public Proveedor Crear(){
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        Proveedor proveedor = new Proveedor();
        System.out.println("Ingresa la id del proveedor: ");
        proveedor.setIdproveedor(leer2.nextInt());
        
        System.out.println("Ingresa el nombre del Proveedor: ");
        proveedor.setNombre(leer.nextLine());
        
        System.out.println("Ingresa el contacto del Proveedor: ");
        proveedor.setContacto(leer.nextLine());
        
        System.out.println("Proveedor Registrado...");
        return proveedor;
    }
    
    
}
