package com.dio.base; //definição do pacote no qual a classe se encontra

public class ifelse {  //definição de uma classe

    private final String code; //definição de atributo
    private final double totalValue;

    public ifelse(String code, double totalValue) { //definição de método aqui no caso construtor
        this.code = code;
        this.totalValue =totalValue;
    }

public double calculeFoe(){
        if(totalValue>100){
            return totalValue*0.99;
        }else{
            return totalValue;
        }
}

}