package somanumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Double> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(double numero){
        numeros.add(numero);
    }

    public double calcularSoma(){
        double soma = 0.0;
        for(double n : numeros){
            soma += n;
        }

        return soma;

    }

    public double encontrarMaiorNumero(){
        double maiorNumero = numeros.get(0);
        if (!numeros.isEmpty()) {
            for(double n : numeros){
                if (n > maiorNumero) {
                    maiorNumero = n;
                }
            }
        }
        return maiorNumero;
    }


    public double encontrarMenorNumero(){
        double MenorNumero = numeros.get(0);
        if (!numeros.isEmpty()) {
            for(double n : numeros){
                if (n < MenorNumero) {
                    MenorNumero = n;
                }
            }
        }
        return MenorNumero;
    }


    public List<Double> exibirNumeros() {
        return new ArrayList<>(numeros); // Retorna uma cópia da lista para evitar modificações externas
    }

    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(10);
        soma.adicionarNumero(1);
        soma.adicionarNumero(50);
        soma.adicionarNumero(15);

        System.out.println("Soma dos números: " + soma.calcularSoma());
        System.out.println("Maior número: " + soma.encontrarMaiorNumero());
        System.out.println("Menor número: " + soma.encontrarMenorNumero());
        System.out.println("Números na lista: " + soma.exibirNumeros());
    }



}

