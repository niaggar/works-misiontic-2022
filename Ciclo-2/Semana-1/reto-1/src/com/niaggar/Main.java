package com.niaggar;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    String paquete = "";
        int papas = sc.nextInt();
        int platanos = 4 + (papas * 2);
        int tocinetas = (papas + platanos) / 5;

        if (tocinetas >= 50)
            paquete = "cuatro";
        else if (tocinetas >= 31)
            paquete = "tres";
        else if (tocinetas >= 21)
            paquete = "dos";
        else if (tocinetas >= 0)
            paquete = "uno";

        System.out.println(papas + " " + platanos + " " + tocinetas);
        System.out.println(paquete);
    }
}

