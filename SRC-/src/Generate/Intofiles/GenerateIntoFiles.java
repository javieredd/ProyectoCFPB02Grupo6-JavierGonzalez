package Generate.Intofiles;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//import java.io.BufferedWriter;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.nio.charset.StandardCharsets;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.nio.charset.StandardCharsets;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Random;
//import java.util.Scanner; 
import java.util.ArrayList; 

class Vendedores {
    private String idVendedor;
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellidos;
    private String edad;
    
    public Vendedores(String idVendedor, String tipoDocumento, String numeroDocumento, String nombre, String apellidos, String edad) {
        this.idVendedor = idVendedor;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
}

public class GenerateIntoFiles {
    
    public static void main (String[] args) {
       
        Vendedores Gavi = new Vendedores ("A4901", "CC", "252154", "Pablo", "Paez Gaviria", "20");
        Vendedores Balde = new Vendedores ("A4902", "CC", "242346", "Alejandro", "Balde Martinez", "21");
        Vendedores Raphinha = new Vendedores 
        
        ArrayList<Vendedores> misVendedores = new ArrayList<>();
        misVendedores.add(Gavi);
        misVendedores.add(Balde);
        
        
        
    }

    
    // Constantes para vendedores
    public static final String TIPO_DOCUMENTO = "CC";
    //private static final String NUMERO_DOCUMENTO = "asdasd";
   
   
    public static final String[] NOMBRES = {"Pablo", "Raphael", "Alejandro", 
                                            "María José", "Juan Pablo", "Sofía Alejandra",
                                            "Diego Armando", "Carmen Rosa", "Laura Beatriz", 
                                            "José Antonio"};
    public static final String[] APELLIDOS = {"Paez Gaviria", "Diaz Bellouli", "Balde Martinez",
                                             "Hernández Sánchez", "López Ramírez", "Pérez Flores",
                                             "Gómez Mendoza", "Díaz Castro", "Vargas Rojas", 
                                             "Morales Suárez"};
    
    // Constantes para productos
    public static final String[] CATEGORIAS = {"Laptop", "Camiseta", "Zapatos", "Teléfono", "Libro", "Mochila"};
    public static final String[] DESCRIPTORES = {"Premium", "Económico", "Deportivo", "Profesional", "Clásico", "Inteligente"};
    public static final String[] MARCAS = {"HP", "Nike", "Samsung", "Apple", "Adidas", "Dell"};
    
}
    
    
    //Informacion vendedores
    
       

    
