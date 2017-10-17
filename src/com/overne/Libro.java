package com.overne;

import java.util.Scanner;

public class Libro {
    //atributos
    private String titulo,autor;
    private int nroPaginas;
    //constructores
    public Libro() {
    }
    public Libro(String titulo, String autor, int nroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }
    //getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    //metodo leer
    public void leer(){
        Scanner lec=new Scanner(System.in);
        System.out.print("Titulo:");
        setTitulo(lec.next());
        System.out.print("nroPaginas:");
        setNroPaginas(lec.nextInt());
        System.out.print("Autor:");
        setAutor(lec.next());
    }
    //metodo mostrar
    public void mostrar(){
        System.out.print("Titulo:"+getTitulo()+"\n"+
            "nroPaginas:"+getNroPaginas()+"\n"+
             "autor:"+getAutor());
    }
}
