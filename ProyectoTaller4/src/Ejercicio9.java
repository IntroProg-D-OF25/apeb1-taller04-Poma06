import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        //BLOQUE DECLARACION DE VARIABLES
        double baseTriangulo, alturaTriangulo, areaTriangulo, areaRectangulo, areaCuadrado, areaTotal;
        Scanner teclado = new Scanner(System.in);
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA
        System.out.println("DAME LA BASE DEL T.:");
        baseTriangulo = teclado.nextDouble();
        System.out.println("DAME LA ALTURA DEL T.:");
        alturaTriangulo = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA LEIDOS
        areaTriangulo = ((baseTriangulo * alturaTriangulo) /2) *3;
        areaRectangulo = (baseTriangulo * alturaTriangulo);
        areaCuadrado = (baseTriangulo * baseTriangulo);
        areaTotal = areaTriangulo + areaRectangulo + areaCuadrado;
        //BLOQUE DE SALIDA DE RESULTADOS
        System.out.println("El AREA TOTAL ES. =" + areaTotal);

        
    }
    
}

/***
 * debug:
 * DAME LA BASE DEL T.:
2
DAME LA ALTURA DEL T.:
1
El AREA TOTAL ES. =9.0
 */