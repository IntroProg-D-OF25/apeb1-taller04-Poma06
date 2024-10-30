import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        //BLOQUE DECLARACION DE VARIABLES - DATOS DE ENTRADA Y SALIDA
        double baseTriangulo, altoTriangulo, areaTriangulo;
        Scanner teclado = new Scanner(System.in);
        //BLOQUE DE LECTURA DE DATOS DE ENTRADA
        System.out.println("DAME LA BASE DEL T.:");
        baseTriangulo = teclado.nextDouble();
        System.out.println("DAME LA ALTURA DEL T.:");
        altoTriangulo = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA
        areaTriangulo = (baseTriangulo * altoTriangulo) /2;
        // BLOQUE DE SALIDA DE RESULTADOS
        System.out.println("AREA DEL T. = " + areaTriangulo);
        
    }
    
}

/***
 * debug:
 * DAME LA BASE DEL T.:
5
DAME LA ALTURA DEL T.:
8
AREA DEL T. = 20.0
 */