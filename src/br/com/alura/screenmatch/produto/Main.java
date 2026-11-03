package br.com.alura.screenmatch.produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto = new Produto("Chave", 10);
        listaProdutos.add(produto);
        System.out.println(listaProdutos.toString());
    }
}