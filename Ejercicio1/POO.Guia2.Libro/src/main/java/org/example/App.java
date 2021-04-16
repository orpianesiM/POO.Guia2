package org.example;


public class App 
{
    public static void main( String[] args )
    {
       // Autor autores = new Autor("Joshua",  "Bloch", "joshua@email.com", 'M');
        Autor[] autores = new Autor[3];
        autores[0] = new Autor("Joshua",  "Bloch", "joshua@email.com", 'M');
        autores[1] = new Autor("Jose",  "Blond", "blonded@email.com", 'M');
        autores[2] = new Autor("Josefina",  "Brown", "josefina@email.com", 'F');

        //Si yo quiero añadir solo 2 autores de 3, deberia crear otro objeto ?

        Libro libro = new Libro(autores, "Effective Java", 450F, 150);
        /*
        System.out.println(libro.toString());
        System.out.println(autores.toString());
        System.out.println(libro.getStock());
        */

        libro.setPrecio(500F);
        libro.aumentarStock(50);
        /*******************Print del detalle**********************/
        System.out.println(libro.verDetalle());

    }
}
