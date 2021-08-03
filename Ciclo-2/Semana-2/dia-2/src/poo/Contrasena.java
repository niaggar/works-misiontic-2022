package poo;

import java.util.HashMap;
import java.util.Arrays;

public class Contrasena {

    private int longitud = 8;
    private char[] contrasena;
    private HashMap<Integer, String> chars = new HashMap<>();

    public Contrasena() {
        this.chars.put(0, "ABCDEFGHIJQLMNOPQRSTUVWXYZ");
        this.chars.put(1, "abcdefghijklmnopkrstuvwxyz");
        this.chars.put(2, "0123456789");
        this.generarContrasena();
    }

    public boolean esFuerte() {
        return true;
    }

    public void generarContrasena() {
        char[] newContrasena = new char[this.longitud];

        int num = 4;
        int may = 2;
        int min = this.longitud - num - may;

        System.out.println("longitud 0 " + this.chars.get(0).length());
        System.out.println("longitud 1 " + this.chars.get(1).length());
        System.out.println("longitud 2 " + this.chars.get(2).length());

        for (int x = 0; x < this.longitud; x++) {
            char a = ' ';
            int i = -1;
            while (i == -1) {
                int valor = generarNumeroAleatorio(2);
                switch (valor) {
                    case 0:
                        if (may > 0) {
                            i = generarNumeroAleatorio(this.chars.get(0).length());
                            System.out.println(i);
                            a = this.chars.get(0).charAt(i);
                            may -= 1;
                            break;
                        }
                    case 1:
                        if (min > 0) {
                            i = generarNumeroAleatorio(this.chars.get(1).length());
                            System.out.println(i);
                            a = this.chars.get(1).charAt(i);
                            min -= 1;
                            break;
                        }
                    case 2:
                        if (num > 0) {
                            i = generarNumeroAleatorio(this.chars.get(2).length());
                            System.out.println(i);
                            a = this.chars.get(2).charAt(i);
                            num -= 1;
                            break;
                        }
                }
            }
            System.out.println(a);

            newContrasena[x] = a;
        }

        this.contrasena = newContrasena;
    }

    private int generarNumeroAleatorio(int maximo) {
        return (int) Math.floor( (Math.random() * (maximo + 1)) );
    }




    public void setContrasena(String newContrasena) {
        if (newContrasena.length() >= 8) {
            this.contrasena = newContrasena.toCharArray();
            this.longitud = newContrasena.length();
        }

    }

    public String getContrasena() {
        return Arrays.toString(this.contrasena);
    }

    public void setLongitud(int newLongitud) {
        if (newLongitud >= 8) this.longitud = newLongitud;
    }

    public int getLongitud() {
        return  this.longitud;
    }
}
