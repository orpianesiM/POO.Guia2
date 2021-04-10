package org.example;

public class Libro {
    private String titulo;
    private Float precio;
    private Integer stock;
    private Autor autor;

    public Libro() {
    }

    public Libro(Autor autor) {
        this.autor = autor;
    }

    public Libro(Autor autor, String titulo, Float precio, Integer stock) {
        this(autor);
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor +
                '}';
    }

    public String verDetalle(){
        return "El libro, "+ this.titulo +
                " de "+autor.getNombre() +
                ". Se vende a $" +this.precio+
                " pesos.";
    }

    public Integer aumentarStock(Integer nuevoStock){
        return this.stock+=nuevoStock;
    }
}