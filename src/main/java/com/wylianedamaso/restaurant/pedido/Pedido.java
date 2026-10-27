package com.wylianedamaso.restaurant.pedido;

import com.wylianedamaso.restaurant.cardapio.Lanche;

import java.util.ArrayList;

public class Pedido {
    private int numero;
    private String nomeCliente;

    private ArrayList<Lanche> itens = new ArrayList<>();

    public Pedido(int numero, String nomeCliente){
        this.numero = numero;
        setNomeCliente(nomeCliente);

    }

    public int getNumero() {
        return numero;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.isBlank()){
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nomeCliente = nomeCliente;
    }

    public void adicionarItem(Lanche lanche){
        itens.add(lanche);

    }

    public ArrayList<Lanche> getItens() {
        return itens;
    }

    public double calcularTotal(){
        double total = 0;
        for (Lanche item : itens){
            total += item.getPreco();
        }
        return total;
    }
}
