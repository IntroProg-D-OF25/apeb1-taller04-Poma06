import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Double Netflix, YoutubePremium, Dropbox, Spotify, Descuento, ValorTotal;
        int edad = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL PRECIO DE NETFLIX");
        Netflix = teclado.nextDouble();
        System.out.println("INGRES EL PRECIO DE YOUTUBE PREMIUM");
        YoutubePremium = teclado.nextDouble();
        System.out.println("INGRES EL PRECIO DE DROPBOX");
        Dropbox = teclado.nextDouble();
        System.out.println("INGRESE EL PRECIO DE SPOTIFY");
        Spotify = teclado.nextDouble();
        System.out.println("INGRESE SU EDAD");
        edad = teclado.nextInt();
        Descuento = (0.8 * (1 - edad / 30) + 1 * (edad / 30));
        ValorTotal = (Netflix * YoutubePremium * Dropbox * Spotify * Descuento);
        System.out.println("EL VALOR TOTAL ES DE:" + ValorTotal);
    }
}
