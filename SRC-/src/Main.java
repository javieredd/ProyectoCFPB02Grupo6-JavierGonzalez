/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JAVIER GONZALEZ
 */
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
import static Generate.Intofiles.GenerateIntoFiles.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
   


    
    public static void main(String[] args) {
           int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            try {
                switch(opcion) {
                    case 1 -> createVendorsFile(10, "vendedores.csv");
                    case 2 -> createProductsFile(15, "productos.csv");
                    
                    case 3 -> createSalesReport(20, "ventas.csv", "vendedores.csv", "productos.csv");
                    case 4 -> createSalesMenFile(10, "Ventas aleatorio.csv");
                    case 5 -> createProductsFileDetail(12, "informacion productos.csv");
                    case 6 -> createSalesManInfoFile(10, "informacion vendedores.csv");
                    case 7 -> {
                        createVendorsFile(10, "vendedores.csv");
                        createProductsFile(15, "productos.csv");
                        createSalesReport(20, "ventas.csv", "vendedores.csv", "productos.csv");
                    }
                    case 8 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("Opción no válida!");
                }
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        } while(opcion != 8);
    }

    //final de codigo de generacion de archivos
    
    //Inicio de codigo de generacion de menu
    
    private static void mostrarMenu() {
        System.out.println("\n=== GENERADOR DE ARCHIVOS ===");
        System.out.println("1. Generar archivo de vendedores");
        System.out.println("2. Generar archivo de productos");
        System.out.println("3. Generar reporte de ventas");
        System.out.println("4. Generar reporte de ventas para vendedor especifico");
        System.out.println("5. Generar reporte de informacion de productos");
        System.out.println("6. Generar reporte de informacion de vendedores");
        System.out.println("7. Generar todos los archivos");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opción: ");
    }

    //Final de codigo de generacion de menu
    
    //Inicio de codigo para generar la estructura de los archivos y contenido de archivos (Trabajadores, productos y informe de ventas de trabajadores y productos)  
    
    // Métodos para vendedores
   public static void createSalesMenFile(int randomSalesCount, String name, Long id) throws IOException {
       try (BufferedWriter writer = new BufferedWriter(
       new OutputStreamWriter(
       new FileOutputStream(fileName), StandarCharsets.UTF_8))) {
           
           
       }
   }
   
   public static void createProductsFileDetail(int productsCount) throws IOException {
       try (BufferedWriter writer = new BufferedWriter(
       new OutputStreamWriter(
       new FileOutputStream(fileName), StandarCharsets.UTF_8))) {
           
           
       }
   }
   
   public static void createSalesManInfoFile(int salesManCount) throws IOException {
       try (BufferedWriter writer = new BufferedWriter(
       new OutputStreamWriter(
       new FileOutputStream(fileName), StandarCharsets.UTF_8))) {
           
           
       }
   }
   
    public static void createVendorsFile(int vendorsCount, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(
              new OutputStreamWriter(
                  new FileOutputStream(fileName), StandardCharsets.UTF_8))) {
            
            for (int i = 0; i < vendorsCount; i++) {
                String numeroDoc = String.format("%010d", random.nextInt(1000000000));
                String nombre = NOMBRES[random.nextInt(NOMBRES.length)];
                String apellido = APELLIDOS[random.nextInt(APELLIDOS.length)];
                
                String line = String.join(";", 
                        TIPO_DOCUMENTO,
                        numeroDoc, 
                        nombre, 
                        apellido) + System.lineSeparator();
                
                writer.write(line);
            }
            System.out.println("\nArchivo de vendedores generado: " + fileName);
        }
    }

    // Métodos para productos
    public static void createProductsFile(int productsCount, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(
              new OutputStreamWriter(
                  new FileOutputStream(fileName), StandardCharsets.UTF_8))) {
            
            for (int i = 1; i <= productsCount; i++) {
                String idProducto = String.format("PROD%03d", i);
                String nombreProducto = generateProductName();
                String precio = String.format("%.2f", 10.0 + (990.0 * random.nextDouble()));
                
                String line = String.join(";",
                        idProducto,
                        nombreProducto,
                        precio) + System.lineSeparator();
                
                writer.write(line);
            }
            System.out.println("\nArchivo de productos generado: " + fileName);
        }
    }

    // Método para generar reporte de ventas
    public static void createSalesReport(int salesCount, String fileName, String vendorsFile, String productsFile) throws IOException {
        // Verificamos si existen los archivos requeridos
        if (!new java.io.File(vendorsFile).exists()) {
            System.out.println("\nError: Archivo de vendedores no encontrado. Generando archivo...");
            createVendorsFile(10, vendorsFile);
        }
        
        if (!new java.io.File(productsFile).exists()) {
            System.out.println("\nError: Archivo de productos no encontrado. Generando archivo...");
            createProductsFile(15, productsFile);
        }
        
        try (BufferedWriter writer = new BufferedWriter(
              new OutputStreamWriter(
                  new FileOutputStream(fileName), StandardCharsets.UTF_8))) {
            
            // Escribir encabezado del reporte
            writer.write("ID_VENTA;FECHA;NUM_DOCUMENTO_VENDEDOR;ID_PRODUCTO;CANTIDAD;VALOR_TOTAL" + System.lineSeparator());
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate today = LocalDate.now();
            //LocalDate startDate = today.minusDays(30);
            
            for (int i = 1; i <= salesCount; i++) {
                String idVenta = String.format("V%05d", i);
                
                // Generar fecha aleatoria en los últimos 30 días
                int randomDays = random.nextInt(31); // 0-30 días atrás
                LocalDate saleDate = today.minusDays(randomDays);
                String fecha = saleDate.format(formatter);
                
                // Generar vendedor aleatorio (simulamos obtener del archivo)
                String numDocVendedor = String.format("%010d", random.nextInt(1000000000));
                
                // Generar producto aleatorio (simulamos obtener del archivo)
                String idProducto = String.format("PROD%03d", random.nextInt(15) + 1);
                
                // Generar cantidad y valor total
                int cantidad = random.nextInt(10) + 1;
                double valorUnitario = 10.0 + (990.0 * random.nextDouble());
                double valorTotal = cantidad * valorUnitario;
                
                String line = String.join(";",
                        idVenta,
                        fecha,
                        numDocVendedor,
                        idProducto,
                        String.valueOf(cantidad),
                        String.format("%.2f", valorTotal)) + System.lineSeparator();
                
                writer.write(line);
            }
            System.out.println("\nReporte de ventas generado: " + fileName);
        }
    }


    
    private static String generateProductName() {
        return CATEGORIAS[random.nextInt(CATEGORIAS.length)] + " " +
               DESCRIPTORES[random.nextInt(DESCRIPTORES.length)] + " " +
               MARCAS[random.nextInt(MARCAS.length)];
    }
}
