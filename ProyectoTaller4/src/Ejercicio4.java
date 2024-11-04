import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Double CostoMinuto, MinutosConsumidos, CostoTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESA EL COSTO POR MINUTO");
        CostoMinuto = teclado.nextDouble();
        System.out.println("INGRESA LOS MINUTOS CONSUMIDOS");
        MinutosConsumidos = teclado.nextDouble();
        CostoTotal = (CostoMinuto * MinutosConsumidos);
        System.out.println("El costo total de la planilla es:" + CostoTotal);
        
    }
    
}


/***
 * debug: 
 * INGRESA EL COSTO POR MINUTO
0.05
INGRESA LOS MINUTOS CONSUMIDOS
300
El costo total de la planilla es:15.0
 */