# **Praticando programação em Kotlin**

## Desafio - **2** **/** **3** **-** **Conversão Simples de Base**

![img](https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1199.gif)

Neste problema você é solicitado a escrever um simples programa de conversão de base. A entrada será um valor hexadecimal ou decimal. Você deverá converter cada valor da entrada. Se o valor for hexadecimal, você deve convertê-lo para decimal e vice-versa. O valor hexadecimal inicia sempre com “0x” ou também, é aquele valor cuja segunda casa contém a letra 'x'.

## Entrada

A entrada contém vários casos de teste. Cada linha de entrada, com exceção da última, contém um número não-negativo, decimal ou hexa. O valor decimal será menor ou igual a 231. A última linha contém um número negativo que não deve ser processado, indicando o encerramento do programa.

## Saída

Para cada linha de entrada (exceto a última) deve ser produzido uma linha de saída. Todo número hexadecimal deve ser precedido na saída por '0x' (zero xis).



| Exemplos de Entrada | Exemplos de Saída |
| ------------------- | ----------------- |
| 4                   | 0x4               |
| 7                   | 0x7               |
| 44                  | 0x2C              |
| 0x80685             | 525957            |
| -1                  |                   |



<hr />

<h4 align="left">Solução</h4>

    fun main(args: Array<String>) {
    	
    	var s : String
    	var n : Int
    	val r = "0x"
    	while(true) {
    		
    //escreva sua solução aqui
    
        val s = readLine()!!
        
        try {
            val value = s.toInt()
            
            if (value == -1) {
                break
            }
        } catch (e: Exception) {}
        
        if (s.contains(r)) {
            hexaToDecimal(s)
        } else {
            decimalToHexa(s)
        }
      }
    }
    
    fun decimalToHexa(s: String) {
      val n = s.toInt()
      
      print("0x${Integer.toHexString(n).toUpperCase()}\n")
    }
    
    fun hexaToDecimal(s: String) {
      val hex = s.subSequence(2, s.length).toString()
      val n = Integer.parseInt(hex, 16)
      
      print("$n\n")
    }

