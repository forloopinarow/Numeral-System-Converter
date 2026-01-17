package org.example;

public class Logik {
    public Logik(){

    }

    public int conversionToDecimal(String toConvert, int base){
        int potenz = 0;
        int wertDerStelle;
        int summe = 0;

        for (int i = toConvert.length()-1; i >= 0; i--, potenz++){
            if (toConvert.charAt(i) >= '0' && toConvert.charAt(i) <= '9'){
                wertDerStelle = toConvert.charAt(i) - '0';
                summe += wertDerStelle * potenzieren(base, potenz);
            }
            else if(toConvert.charAt(i) >= 'A' && toConvert.charAt(i) <= 'Z'){
                wertDerStelle = toConvert.charAt(i) - 'A' + 10;
                summe += wertDerStelle * potenzieren(base, potenz);
            }
        }
        return summe;
    }

    public String conversionOutOfDecimal(int toConvert,int targetBase){
        if (toConvert == 0) return "0";

        int rest;
        StringBuilder stringBuilder = new StringBuilder();
        while(toConvert > 0){
            rest = toConvert % targetBase;
            if(rest < 10){
                stringBuilder.append((char) ('0' + rest));
            }
            else {
                stringBuilder.append((char) ('A' + rest -10));
            }
            toConvert /= targetBase;
        }
        return stringBuilder.reverse().toString();
    }

    private int potenzieren(int zahl, int potenz){
        int summe = 1;
        for(int i = 0; i < potenz; i++){
            summe *= zahl;
        }
        return summe;
    }

}