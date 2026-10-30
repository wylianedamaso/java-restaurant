package com.wylianedamaso.restaurant.app;

import com.wylianedamaso.restaurant.cardapio.Lanche;
import com.wylianedamaso.restaurant.pedido.GerenciadorPedidos;
import com.wylianedamaso.restaurant.pedido.Pedido;

import java.util.Collection;

public class RestauranteFacade {

    private GerenciadorPedidos gerenciador;

    public RestauranteFacade(){
        gerenciador = new GerenciadorPedidos();
    }

    public Pedido criarPedido(String nomeCliente) {
        return gerenciador.criarPedido(nomeCliente);
    }

    public void adicionarLanche(Pedido pedido, Lanche lanche){
        pedido.adicionarItem(lanche);
    }

    public double calcularTotalDoDia(){
        return gerenciador.calcularTotalDoDia();

    }

    public Collection<Pedido> listarPedidos(){
        return gerenciador.getPedidos();
    }

    public Pedido buscarPedido(int numero){
        return gerenciador.buscarPedido(numero);
    }

    public Lanche criarLanche(int opcao){
        switch (opcao){
            case 1:
                return new Lanche("X-Burger", 16.00);

            case 2:
                return new Lanche("X-Salada", 18.00);

            case 3:
                return new Lanche("X-Bacon", 22.00);

            default:
                throw new IllegalArgumentException("Opção de lanche inválida");

        }
    }

}
