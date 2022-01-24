package com.dio;

import com.dio.base.order;
                            // fosse criada aqui não precisaria

public class MyFristProgram {
    public static void main(String[] args) {
        final order calculateFee= new order("1245",100.00);
        System.out.println(calculateFee);

    }
}
// import com.dio.base.ifelse;  //CONDICIONAL COM IF ELSE
//import com.dio.base.switchcase; // CONDIFIOCNAL COM SWITCH CASE
/* Conceitos
/* MÉTODOS
MÉTODOS CONSTRUTORES- Definem como a classe será instanciada "construida"

MÉTODOS COMUNS- Definem comportamentos que podem ou não estar atribuídas às regras
de negócio. Ex: Calular taxas de um pedido, etc.
Modificadores de acesso:
"public" qualquer classe de qualquer pacote poderá acessar o atributo método
"protected" qualquer classe definida no mesmo pacote ou subclasse
"private" apenas a própria classe
sem nenhum apenas classes definidas no mesmo packge

*/