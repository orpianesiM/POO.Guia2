package org.example;

public class Libro {
    private String titulo;
    private Float precio;
    private Integer stock;
    private Autor[] autores;

    public Libro(Autor[] autores) {
        this.autores = autores;
    }

    public Libro(Autor[] autores, String titulo, Float precio, Integer stock) {
        this(autores);
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

    public Autor[] getAutor() {
        return autores;
    }

    public void setAutor(Autor[] autores) {
      this.autores = autores;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autores +
                '}';
    }

   /* public String verDetalle(){
        return "El libro, "+ this.titulo +
                " de " + autor.getNombre() +
                ". Se vende a $" +this.precio+
                " pesos.";
    }*/
    public Integer aumentarStock(Integer nuevoStock){
       return this.stock+=nuevoStock;
   }

    public String verDetalle(){
      String detalle = "El libro " + this.titulo + " es de: \n" ;

       for (Autor autores : this.autores){
           detalle += autores; //Llama directamente al metodo toString?
           detalle += "\n";
        }
        detalle += "Se vende a $"+this.precio;
        return detalle;
    }


}