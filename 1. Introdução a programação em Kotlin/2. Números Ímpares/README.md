# **Introdução a programação em Kotlin**

## Desafio - **2** **/** **3** **-** **Números Ímpares**

Leia um valor inteiro **X** (1 <= **X** <= 1000). Em seguida mostre os ímpares de 1 até **X**, um valor por linha, inclusive o **X**, se for o caso.

## Entrada

O arquivo de entrada contém 1 valor inteiro qualquer.

## Saída

Imprima todos os valores ímpares de 1 até **X**, inclusive **X**, se for o caso.

 

| Exemplos de Entrada | Exemplos de Saída |
| ------------------- | ----------------- |
| 8                   | 1                 |
|                     | 3                 |
|                     | 5                 |
|                     | 7                 |



<hr />

<h4 align="left">Solução</h4>

    fun main(args: Array<String>) {
        
        for (i in 1 .rangeTo(readLine()!!.toInt()).step( 2 )) println(i) //complete o codigo com os valores corretos
        
    }

