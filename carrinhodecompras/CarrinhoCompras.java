package carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    
    private List<Item> carrinhoCompras;

    public CarrinhoCompras(){
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){

        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> remocaoItems = new ArrayList<>();
        for(Item i : carrinhoCompras){
            if(i.getNome().equalsIgnoreCase(nome)){
                remocaoItems.add(i);
            }
        }
        carrinhoCompras.removeAll(remocaoItems);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Item i : carrinhoCompras){
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinhoCompras);
    }


    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("feijao",6.0,2);
        carrinhoCompras.adicionarItem("arroz",5.0,1);
        carrinhoCompras.adicionarItem("macarrao",2.0,2);
        
        carrinhoCompras.exibirItens();
        System.out.println("O valor total do carrinho: R$ "+ carrinhoCompras.calcularValorTotal());
    }

}
