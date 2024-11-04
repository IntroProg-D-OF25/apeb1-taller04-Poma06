import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Double MontoPresta, InteresMen, PagoMensual;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL MONTO DEL PRESTAMO");
        MontoPresta = teclado.nextDouble();
        System.out.println("INGRESE EL INTERES MENSUAL");
        InteresMen = teclado.nextDouble();
        PagoMensual = (MontoPresta * InteresMen);
        System.out.println("EL APGO MENSUAL SERA DE:" + PagoMensual);
        
    }
    
}

/***
 * debug: 
 * INGRESE EL MONTO DEL PRESTAMO
2000
INGRESE EL INTERES MENSUAL
0.09
EL APGO MENSUAL SERA DE:180.0
 */
 