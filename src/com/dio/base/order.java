package com.dio.base;
import java.math.BigDecimal;

/**
 * @author eduar
 * @version 1.0.0
 * @see BigDecimal
 * @since 1.0.0
 */

public class order {

    //representa o código do pedido
    private final String code;
    private final BigDecimal totalValue;

    /**
     * Construtor da Classe
     * @param code   código do pedido
     * @param totalValue    valor total do pedido
     */
    public order(String code, BigDecimal totalValue) {
        this.code= code;
        this.totalValue= totalValue;
    }

    /**
     * Calcula as taxas de valor total do pedido. Se o valor foi maior que 100 a taxa é cobrada
     *
     * @return valor total do pedido com as taxas
     * @throws RuntimeException se o valor do pedido for negativo
     */

   public BigDecimal calculateFee() throws RuntimeException{
        if (this.totalValue.signum() <0){
            throw new RuntimeException("O pedido não pode ter valor negativo");
        }
        if (this.totalValue.compareTo(new BigDecimal("100.00"))>100){
            return this.totalValue.multiply(new BigDecimal("0.99"));
        }
        return this.totalValue;
   }

    }
