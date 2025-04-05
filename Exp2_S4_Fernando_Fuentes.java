/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp2_s4_fernando_fuentes;
import java.util.Scanner;
/**
 *
 * @author ffuen
 */
public class Exp2_S4_Fernando_Fuentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mensaje de Bienvenida
        System.out.println("");
        System.out.println("===  Bienvenido al Teatro Moro  ===");
        System.out.println("");
        Scanner comprar = new Scanner(System.in);
        Scanner ubicacion = new Scanner(System.in);
        Scanner edad = new Scanner(System.in);
        int precioFinal = 0;
        // Despliegue del menú principal
        while(true){
            System.out.println("            ===");
            System.out.println("");
            System.out.println("       Menú Principal:");
            System.out.println("");
            System.out.println("    Opciones disponibles:");
            System.out.println("    1 - Comprar entrada");
            System.out.println("    2 - Salir");
            System.out.println("");
            System.out.print("Seleccione el número de su respuesta:  ");
            int continua = comprar.nextInt();
            // Compra de entradas
            if(continua == 1){
                System.out.println("");
                System.out.println("    Ubicaciones Disponibles: ");
                System.out.println("    1 - Zona A");
                System.out.println("    2 - Zona B");
                System.out.println("    3 - Zona C");
                System.out.println("");
                System.out.print("Seleccione el número de su ubicación:  ");
                int ubic = ubicacion.nextInt();
                System.out.println("");
                System.out.print("Ingrese su edad:  ");
                int edad1 = edad.nextInt();
                System.out.println("");
                int precio1 = 10000;
                if( 5 <= edad1 && edad1 <= 18){
                    System.out.println("-----------------------------------------");
                    switch(ubic){
                    case 1 -> System.out.println("    Ubicación elegida: Zona A");
                    case 2 -> System.out.println("    Ubicación elegida: Zona B");
                    case 3 -> System.out.println("    Ubicación elegida: Zona C");
                    default -> System.out.println("    Ingreso de Ubicación errónea.");
                }
                    System.out.println("    Precio base de la entrada: " + precio1);
                    System.out.println("    Descuento aplicado: Estudiante, con 10% de descuento.");
                    System.out.println("    Precio final a pagar: " + (int)(precio1 * 0.9));
                    System.out.println("-----------------------------------------");
                    precioFinal = precioFinal + (int) (precio1 * 0.9);
                }else if(60 <= edad1 && edad1 <= 100){ // Control y manejo de errores al ingresar edades poco realistas
                    System.out.println("-----------------------------------------");
                    switch(ubic){
                    case 1 -> System.out.println("    Ubicación elegida: Zona A");
                    case 2 -> System.out.println("    Ubicación elegida: Zona B");
                    case 3 -> System.out.println("    Ubicación elegida: Zona C");
                    default -> System.out.println("    Ingreso de Ubicación errónea.");
                }
                    System.out.println("    Precio base de la entrada: " + precio1);
                    System.out.println("    Descuento aplicado: Tercera Edad, con 15% de descuento.");
                    System.out.println("    Precio final a pagar: " + (int)(precio1 * 0.85));
                    System.out.println("-----------------------------------------");
                    precioFinal = precioFinal + (int) (precio1 * 0.85);
                }else{
                    System.out.println("-----------------------------------------");
                    switch(ubic){
                    case 1 -> System.out.println("    Ubicación elegida: Zona A");
                    case 2 -> System.out.println("    Ubicación elegida: Zona B");
                    case 3 -> System.out.println("    Ubicación elegida: Zona C");
                    default -> System.out.println("    Ingreso de Ubicación errónea.");
                }
                    System.out.println("    Precio base de la entrada: " + precio1);
                    System.out.println("    Descuento aplicado: No corresponde.");
                    System.out.println("    Precio final a pagar: " + precio1);
                    System.out.println("-----------------------------------------");
                    precioFinal =precioFinal + precio1;
                }
                System.out.println("");
                System.out.println("Precio Final hasta el momento: " + precioFinal);
                System.out.println("");
                System.out.println("");
                
            }else{
                System.out.println("");
                System.out.println("-----------------------------------------");
                System.out.println("    Total a pagar: " + precioFinal);
                System.out.println("");
                System.out.println("    Gracias por su visita.");
                System.out.println("-----------------------------------------");
                break;
            }
        }
    }
}
