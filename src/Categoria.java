
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benja
 */
public class Categoria {
    private int idcategoria;
    private String nombre, descripcion;

    public Categoria() {
        this.idcategoria = 0;
        this.nombre = "Vacio";
        this.descripcion = "..........";
        
    }

    public Categoria(int idcategoria, String nombre, String descripcion) {
        this.idcategoria = idcategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return "\nCategoria: "
                + "\nidcategoria: " + idcategoria 
                + " \nnombre: " + nombre 
                + " \ndescripcion: " + descripcion
                + " \n                             "    
                ;
    }
    
        public Categoria Crear(){
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        
        Categoria categoria = new Categoria();
        
        System.out.println("Ingresa la id de la Categoria: ");
        categoria.setIdcategoria(leer2.nextInt());
  
        System.out.println("Ingresa el nombre de la Categoria: ");
        categoria.setNombre(leer.nextLine());
        
        System.out.println("Ingresa el Descripcion de la Categoria: ");
        categoria.setDescripcion(leer.nextLine());
        
        System.out.println("Categoria Registrado...");
        return categoria;
    }
    
    
}
