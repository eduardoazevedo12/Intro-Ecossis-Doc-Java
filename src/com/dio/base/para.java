package com.dio.base;

public class para {
    private final String code;
    private final int totalValue;

    private String[] items;

    public para(String code, int totalValue){
        this.code= code;
        this.totalValue=totalValue;
    }
    public void printItems(){
        for(int i=0;i<items.length;i++){
            System.out.println(items[i]);
        }
        /*  ENHANCED FOR
        for(String i: items){
        system.out.println(i);
        }



         */

    }


}
