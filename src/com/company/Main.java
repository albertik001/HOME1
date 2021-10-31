package com.company;

public class Main {

    public static void main(String[] args) {
        String word1;
        final int NUM = 0;
        String word = "OSAS";
        word1 = NUM + word;
        System.out.println(word1);
        if (NUM > 0) {
            System.out.println("ВЫ СОХРАНИЛИ ОТРИЦАТЕЛЬНОЕ ЧИСЛО!");
        }

        if (NUM < 0) {
            System.out.println("ВЫ СОХРАНИЛИ ПОЛОЖИТЕЛЬНОЕ ЧИСЛО!");

        }
        if (NUM <= 0 ){
            System.out.println("ВЫ СОХРАНИЛИ НУЛЬ!");
        }


    }
}
