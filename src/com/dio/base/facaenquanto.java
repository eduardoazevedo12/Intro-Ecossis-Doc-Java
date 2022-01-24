package com.dio.base;

public class facaenquanto {
    private final String code;
    private final int totalValue;

    private String[] items;

    public facaenquanto(String code, int totalValue){
        this.code= code;
        this.totalValue=totalValue;
    }
    public void printItems(){
        int i=0;
        do{
            System.out.println(items[i]);
            i++;
        }while(i<items.length);


    }


}
