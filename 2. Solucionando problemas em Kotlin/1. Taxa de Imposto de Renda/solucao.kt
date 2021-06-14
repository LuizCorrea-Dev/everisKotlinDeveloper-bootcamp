fun main(args: Array<String>) {
  //continue a solução
  fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
  val renda = readLine()!!.toFloat()
  val imposto: Float

    when {
      //Imposto de Renda Isento
      renda in 0.0..2000.0 -> {
          println("Isento")
      }
      
      //8% de Imposto de Renda
      renda in 2000.01..3000.00 -> {
          imposto = (renda - 2000) * 0.08.toFloat()
          println("R$ ${imposto.format(2)}")
      }
      
      //18% de Imposto de Renda
      renda in 3000.01..4500.00 -> {
          imposto = (renda - 3000) * 0.18.toFloat() + 1000.00.toFloat() * 0.08.toFloat()
          println("R$ ${imposto.format(2)}")
      }
      
      //28% de Imposto de Renda
      renda > 4500 -> {
         imposto = ((renda - 4500.00) * 0.28.toFloat() + 1500.00.toFloat() * 0.18.toFloat() + 1000.00.toFloat() * 0.08.toFloat()).toFloat()
          println("R$ ${imposto.format(2)}")
      }
    }
            
}