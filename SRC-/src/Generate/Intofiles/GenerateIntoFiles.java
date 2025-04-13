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
    private final String idVendedor; 
    private final String tipoDocumento;
    private final String numeroDocumento;
    private final String nombre;
    private final String apellidos;
    private final String edad;
    
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
        Vendedores Raphinha = new Vendedores ("A4903", "CC", "735463", "Raphael", "Diaz Bellouli", "27");
        Vendedores Pedri = new Vendedores ("A4904", "CC", "869590", "Pedro", "Gonzalez Lopez", "22");
        Vendedores Pau = new Vendedores ("A4905", "CC", "754282", "Paulo", "Cubarsi Paredes", "18");
        Vendedores Hfort = new Vendedores ("A4906", "CC", "758493", "Hector", "Fort Garcia", "18");
        Vendedores Pauv = new Vendedores ("A4907", "CC", "584930", "Paulo", "Victor Delgado", "23");
        Vendedores Toni = new Vendedores ("A4908", "CC", "646473", "Antonio", "Fernandez Casino", "18");
        Vendedores Dani = new Vendedores ("A4909", "CC", "852949", "Daniel", "Muñoz Chitiva", "28");
        Vendedores Danio = new Vendedores ("A4910", "CC", "528206", "Daniel", "Olmo Carvajal", "26");
        
        
        ArrayList<Vendedores> misVendedores = new ArrayList<>();
        misVendedores.add(Gavi);
        misVendedores.add(Balde);
        misVendedores.add(Raphinha);
        misVendedores.add(Pedri);
        misVendedores.add(Pau);
        misVendedores.add(Hfort);
        misVendedores.add(Pauv);
        misVendedores.add(Toni);
        misVendedores.add(Dani);
        misVendedores.add(Danio);
        
       
        
        
        
        
    }

    
    // Constantes para vendedores
    public static final String TIPO_DOCUMENTO = "CC";
    //private static final String NUMERO_DOCUMENTO = "asdasd";
   
   
    public static final String[] NOMBRES = {"Pablo", "Raphael", "Alejandro", 
                                            "Pedro", "Paulo", "Hector",
                                            "Paulo", "Antonio", "Daniel", 
                                            "Daniel"};
    public static final String[] APELLIDOS = {"Paez Gaviria", "Diaz Bellouli", "Balde Martinez",
                                             "Gonzalez Lopez", "Cubarsi Paredes", "Fort Garcia",
                                             "Victor Delgado", "Fernandez Casino", "Muñoz Chitiva", 
                                             "Olmo Carvajal"};
    
    // Constantes para productos
    public static final String[] CATEGORIAS = {"Laptop", "Camiseta", "Zapatos", "Teléfono", "Libro", "Mochila"};
    public static final String[] DESCRIPTORES = {"Premium", "Económico", "Deportivo", "Profesional", "Clásico", "Inteligente"};
    public static final String[] MARCAS = {"HP", "Nike", "Samsung", "Apple", "Adidas", "Dell"};

    public GenerateIntoFiles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public GenerateIntoFiles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
    
    
    //Informacion vendedores
    
       

    
