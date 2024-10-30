import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        //BLOQUE DECLARACION DE VARIABLES
        int gastosHijo1, gastosHijo2, gastosHijo3, gastoTotal; 
        Scanner teclado = new Scanner(System.in);
        //BLOQUE DE LECTURA DE DATOS DE ENTRADA
        System.out.println("DAME LOS GASTOS DEL PRIMER HIJO.:");
        gastosHijo1 = teclado.nextInt();
        System.out.println("DAME LOS GASTOS DEL SEGUNDO HIJO.:");
        gastosHijo2 = teclado.nextInt();
        System.out.println("DAME LOS GASTOS DEL TERCER HIJO");
        gastosHijo3 = teclado.nextInt();
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA LEIDOS
        gastoTotal = gastosHijo1 + gastosHijo2 + gastosHijo3;
        //BLOQUE DE SALIDA DE RESULTADOS
        System.out.println("El gasto total fue de =" + gastoTotal);
    }
    
}

/***
 * debug:
 * DAME LOS GASTOS DEL PRIMER HIJO.:
100
DAME LOS GASTOS DEL SEGUNDO HIJO.:
100
DAME LOS GASTOS DEL TERCER HIJO
200
El gasto total fue de =400
 */