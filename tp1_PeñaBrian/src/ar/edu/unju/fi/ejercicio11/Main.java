package ar.edu.unju.fi.ejercicio11;

public class Main {

    public static void main(String[] args) {
        int i = 2;
        int j = 40;
        int resultado;

        for (; j >= 0; j--) {

            resultado = j * i;

            System.out.print(" " + resultado);

            i++;
        }
    }
}
