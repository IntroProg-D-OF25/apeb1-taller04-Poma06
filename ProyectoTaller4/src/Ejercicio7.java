import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Double CostoKilova, KilovatiosConsu, ValorCancelar, Descuento;
        int Edad; 
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL COSTO POR KILOVATIO");
        CostoKilova = teclado.nextDouble();
        System.out.println("INGRESE EL NUMERO DE KILOVATIOS CONSUMIDOS");
        KilovatiosConsu = teclado.nextDouble();
        System.out.println("INGRESE SU EDAD");
        Edad = teclado.nextInt();
        Descuento = (0.9 * (Edad / 66) + 1 * (1 - Edad / 66));
        ValorCancelar = CostoKilova * KilovatiosConsu * Descuento;
        System.out.println("EL VALOR A CANCELAR ES DE:" + ValorCancelar);
        
    }
    
}

/***
 * debug: 
 * INGRESE EL COSTO POR KILOVATIO
0.10
INGRESE EL NUMERO DE KILOVATIOS CONSUMIDOS
10000
INGRESE SU EDAD
67
EL VALOR A CANCELAR ES DE:900.0
 */
