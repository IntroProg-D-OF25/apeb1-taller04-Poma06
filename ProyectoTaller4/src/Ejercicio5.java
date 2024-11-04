import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Double PrecioCpu, PrecioTecla, PrecioRaton, PrecioTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESA EL PRECIO DEL CPU");
        PrecioCpu = teclado.nextDouble();
        System.out.println("INGRESA EL PRECIO DEL TECLADO");
        PrecioTecla = teclado.nextDouble();
        System.out.println("INGRESA EL PRECIO DEL RATON");
        PrecioRaton = teclado.nextDouble();
        PrecioTotal = (PrecioCpu + PrecioTecla + PrecioRaton);
        System.out.println("EL PRECIO POR LA COMPUTADOR ES DE:" + PrecioTotal);
    }
}

/***
 * debug: 
 * INGRESA EL PRECIO DEL CPU
300
INGRESA EL PRECIO DEL TECLADO
30.50
INGRESA EL PRECIO DEL RATON
14.50
EL PRECIO POR LA COMPUTADOR ES DE:345.0
 */
