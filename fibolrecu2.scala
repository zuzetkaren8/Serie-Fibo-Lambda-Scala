object fibo{
  val resu = (n: Int)=> fibona(n-1)+fibona(n-2)+fibona(n-3)
  def fibona(n: Int):Int = {
    if (n == 0){
      return 0
    }else if (n == 1){
            return 1
          }else if (n == 2){
                  return 1
                }else{
                  return (resu(n))
          }
    }
  
  def fiboResu(n: Int):Unit = {
    for (i <-0 to (n-1)){
      System.out.print(fibona(i)+" ")
    }
  }
  
  
  def main(args:Array[String]):Unit = {
    println("Introduce la cantidad de numeros que deseas de la secuencia de fibonacci: ")
    val n = scala.io.StdIn.readInt()
    fiboResu(n)
  }
}