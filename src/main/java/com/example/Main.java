package com.example;

public class Main {
    public static void main(String[] args) {
        Calculatrice calculatrice = new Calculatrice();

        System.out.println("Addition : " + calculatrice.additionner(5, 3));
        System.out.println("Soustraction : " + calculatrice.soustraire(10, 4));
        System.out.println("Multiplication : " + calculatrice.multiplier(6, 2));
    }
}