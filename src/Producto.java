
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benja
 */
public class Producto {
    
    private int idProducto, precio, stock;
    private String nombre;
    private Categoria categoria;
    private Proveedor proveedor;

    public Producto() {
        this.idProducto = 0;
        this.precio = 0;
        this.stock = 0;
        this.nombre = "Vacio";
        this.categoria = new Categoria();
        this.proveedor = new Proveedor();
    }

    public Producto(int idProducto, int precio, int stock, String nombre, Categoria categoria, Proveedor proveedor) {
        this.idProducto = idProducto;
        this.precio = precio;
        this.stock = stock;
        this.nombre = nombre;
        this.categoria = categoria;
        this.proveedor = proveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Producto:" + 
               " \nidProducto: " + idProducto + 
                " \nprecio: " + precio + 
                " \nstock: " + stock + 
                " \nnombre: " + nombre + 
                "" + categoria +
                ""+ proveedor 
                + " \n                             " 
                ;
    }
        public Producto Crear(Proveedor proveedor, Categoria categoria){
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        Producto producto = new Producto();
        System.out.println("Ingresa la id del producto: ");
        producto.setIdProducto(leer.nextInt());
        
        System.out.println("Ingresa el nombre del producto: ");
        producto.setNombre(leer2.nextLine());
            do {       
                System.out.println("Ingresa el Precio del producto: ");
                producto.setPrecio(leer.nextInt());
                
            } while (producto.getPrecio() < 0);
        
            do {                
                System.out.println("Ingresa el stock del producto");
                producto.setStock(leer2.nextInt());
            } while (producto.getStock() <= 0);
            
        producto.setProveedor(proveedor);
        producto.setCategoria(categoria);
        
            System.out.println("Producto registrado...");
        return producto;
    }
    
    
}
