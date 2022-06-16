object fibo {
  
  def fibona(n: Int):Int = {
    var i = 0
    var a = -1
    var b = 1
    var c = 0
    var res = 0
    val resu = (x:Int, y:Int, z:Int)=>x+y+z
  
    while( i < n ) {
        
        a = b
        b = c
        c = res
        res=resu(a,b,c)
        i = i + 1
  }
    return res
  }
  
  
  def fiboResu(n: Int):Unit = {
	 for (i <-0 to (n-1)){
	   System.out.print(fibona(i)+" ")
	 }
	}
  
  def main(args:Array[String]):Unit = {
    println("Introduce la cantidad de numeros que deseas de la secuencia de fibonacci: ")
    val n = scala.io.StdIn.readInt()
    print(fiboResu(n))
  }
}
