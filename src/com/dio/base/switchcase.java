package com.dio.base; //definição do pacote no qual a classe se encontra


public class switchcase {  //definição de uma classe

    private final String code; //definição de atributo
    private final int totalValue;

    public switchcase(String code, int totalValue) { //definição de método aqui no caso construtor
        this.code = code;
        this.totalValue = totalValue;
    }

    public double calculateFoe() {
        switch (totalValue) {
            case 100:
                return totalValue * 0.99;
            case 200:
                return totalValue * 1.99;
            default:
                return totalValue;

        }

    }
}