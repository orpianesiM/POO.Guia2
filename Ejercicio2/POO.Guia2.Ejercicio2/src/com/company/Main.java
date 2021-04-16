package com.company;

public class Main {

    public static void main(String[] args) {

        Factura factura = new Factura();

       // System.out.println(factura.getFecha());

        System.out.println(factura.getFecha());
        System.out.println("\u0031");


    }

    public void givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        System.out.println(generatedString);
    }
}
