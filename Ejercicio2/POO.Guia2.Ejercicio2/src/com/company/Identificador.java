package com.company;

import java.util.Random;

public interface Identificador {

    default String asignarId(int size)
    {
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = mayusculas.toLowerCase();
        String digitos = "0123456789";
        String alfanumericos = mayusculas + minusculas + digitos;

        Random random = new Random();
        char[] simbolos = alfanumericos.toCharArray();
        char[] token = new char[size] ;

        for (int i = 0; i < token.length; ++i)
            token[i] = simbolos[random.nextInt(simbolos.length)];

        return new String(token);
    }

}
