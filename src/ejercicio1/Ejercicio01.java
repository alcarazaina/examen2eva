package ejercicio1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HexFormat;
import java.util.Random;

public class Ejercicio01 {
    public static void main(String[] args) {

        HashMap<Integer, Character> hexadec = HEXaDEC();
        System.out.println(hexadec);
        HashMap<Character, Integer> decahex = DECaHEX();
        System.out.println(decahex);
        int[] generar = generarNumeros();
        String generados = Arrays.toString(generar);
        System.out.println(generados);
        String color = colorHexadecimal(hexadec ,generar);
        System.out.println(color);
        System.out.println(hexadecimalaRGB(decahex, color));

    }

    public static HashMap<Character, Integer> DECaHEX() {

        HashMap<Character, Integer> decimal = new HashMap<>();
        decimal.put('0', 0);
        decimal.put('1', 1);
        decimal.put('2', 2);
        decimal.put('3', 3);
        decimal.put('4', 4);
        decimal.put('5', 5);
        decimal.put('6', 6);
        decimal.put('7', 7);
        decimal.put('8', 8);
        decimal.put('9', 9);
        decimal.put('A', 10);
        decimal.put('B', 11);
        decimal.put('C', 12);
        decimal.put('D', 13);
        decimal.put('E', 14);
        decimal.put('F', 15);
        return decimal;
    }

    public static HashMap<Integer, Character> HEXaDEC() {
        HashMap<Integer, Character> decimal = new HashMap<>();
        decimal.put(0, '0');
        decimal.put(1, '1');
        decimal.put(2, '2');
        decimal.put(3, '3');
        decimal.put(4, '4');
        decimal.put(5, '5');
        decimal.put(6, '6');
        decimal.put(7, '7');
        decimal.put(8, '8');
        decimal.put(9, '9');
        decimal.put(10, 'A');
        decimal.put(11, 'B');
        decimal.put(12, 'C');
        decimal.put(13, 'D');
        decimal.put(14, 'E');
        decimal.put(15, 'F');
        return decimal;
    }

    public static int[] generarNumeros() {
        Random generador = new Random();
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generador.nextInt(0, 16);
        }
        return numeros;
    }
    public static String colorHexadecimal(HashMap<Integer, Character> mapa, int[] numeros){
        return "#" + mapa.get(numeros[0])+ mapa.get(numeros[1])+ mapa.get(numeros[2])+ mapa.get(numeros[3])+ mapa.get(numeros[4])+ mapa.get(numeros[5]);
    }
    public static String hexadecimalaRGB(HashMap<Character, Integer> mapa, String color){
        int rojo = mapa.get(color.charAt(1)) * 16 + mapa.get(color.charAt(2));
        int verde = mapa.get(color.charAt(3)) * 16 + mapa.get(color.charAt(4));
        int azul = mapa.get(color.charAt(5)) * 16 + mapa.get(color.charAt(6));
        return "rgb(" + rojo + ", " + verde + ", " + azul + ")";
    }
}
