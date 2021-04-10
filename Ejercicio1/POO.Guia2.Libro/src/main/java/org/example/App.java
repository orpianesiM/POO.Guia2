package org.example;


public class App 
{
    public static void main( String[] args )
    {
        Autor autor = new Autor("Joshua",  "Bloch", "joshua@email.com", 'M');
        System.out.println(autor.toString());
        Libro libro = new Libro(autor, "Effective Java", 450F, 150);
        System.out.println(libro.toString());

        libro.setPrecio(500F);
        libro.aumentarStock(50);
        System.out.println(libro.getStock());




        System.out.println(libro.verDetalle());

    }
}
