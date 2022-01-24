package com.dio.base;

public class enquanto {
    private final String code;
    private final int totalValue;

    private String[] items;

    public enquanto(String code, int totalValue){
        this.code= code;
        this.totalValue=totalValue;
    }
    public void printItems(){
        int i=0;
        while(i<items.length){
            System.out.println(items[i]);
            i++;

        }


    }


}
