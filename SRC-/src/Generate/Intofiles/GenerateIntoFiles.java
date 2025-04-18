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
//import java.io.BufferedWriter;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.nio.charset.StandardCharsets;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList; 
import java.util.Random;
//import java.util.Collection;
//import java.util.List;
//import java.util.Collections;
//import static java.util.Collections.emptyList;





public class GenerateIntoFiles {

    public static class Vendedores {
        private final String idVendedor;
        private final  String tipoDocumento;
        private final String numeroDocumento;
        private final String nombre;
        private final String apellidos;
        private final String edad;

        public Vendedores(String idVendedor, String tipoDocumento, String numeroDocumento,
                          String nombre, String apellidos, String edad) {
            this.idVendedor = idVendedor;
            this.tipoDocumento = tipoDocumento;
            this.numeroDocumento = numeroDocumento;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
        }

        public String toFileString() {
            return String.join(";", idVendedor, tipoDocumento, numeroDocumento, nombre, apellidos, edad);
        }
    }

    // Lista para almacenar los vendedores
    public static ArrayList<Vendedores> listaVendedores = new ArrayList<>();

    public static void createSalesManInfoFile(int salesManCount, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(fileName), StandardCharsets.UTF_8))) {

            // Escribimos encabezado
            writer.write("ID Vendedor;Tipo Documento;Numero Documento;Nombre;Apellidos;Edad");
            writer.newLine();

            for (int i = 0; i < salesManCount && i < listaVendedores.size(); i++) {
                Vendedores v = listaVendedores.get(i);
                writer.write(v.toFileString());
                writer.newLine();
            }

            System.out.println("\nArchivo de informacion vendedores generado: " + new File(fileName).getAbsolutePath());
        }
    }

    public static void main(String[] args) throws IOException {
        // Agregamos algunos vendedores a la lista
        listaVendedores.add(new Vendedores("A4901", "CC", "123456", "Pablo", "Paez Gaviria", "20"));
        listaVendedores.add(new Vendedores("A4902", "CC", "654321", "Alejandro", "Balde Martinez", "21"));
        listaVendedores.add(new Vendedores("A4903", "CC", "789123", "Raphael", "Diaz Bellouli", "27"));
        listaVendedores.add(new Vendedores("A4904", "CC", "321987", "Pedro", "Gonzalez Lopez", "22"));

        createSalesManInfoFile(listaVendedores.size(), "vendedores.csv");

    }






    
        
       
                
    

        
     
        
  
    
    //public static void createSalesManInfoFile(int salesManCount, String fileName) throws IOException {
      //try (BufferedWriter writer = new BufferedWriter(
              //new OutputStreamWriter(
                  //new FileOutputStream(fileName), StandardCharsets.UTF_8))) {
          
        
      //for (int i = 0; i < salesManCount; i++){            
           //     String idVendedor = IDVENDEDOR;
               // String tipoDocumento = TIPODOCUMENTO;
           //     String numeroDocumento = NUMERODOCUMENTO;
               // String nombre = NOMBRES_;
            //    String apellidos = APELLIDOS_;
                //String edad= EDAD;
                
              //  String line = String.join(";",
                  //      idVendedor,
                      //  tipoDocumento,
               //         numeroDocumento, 
                   //     nombre, 
                       // apellidos + System.lineSeparator(),
                    //    edad);
                        
                
         //        writer.write(line);
         //   }
  //     System.out.println("\nArchivo de informacion de vendedores generado: " + fileName);
  // }
//}
 //   }
    
       
        
        
        
    

    
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

}
  
  


 
    
    
    
    
    //Informacion vendedores
    
       

    
