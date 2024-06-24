/* Online Scala Compiler */
object HelloWorld {
   def main(args: Array[String]) {
      println("Hello, world!")
      val price1 = 10
      val price2 = 15
      val price3 = 20
      val pepolcome = 120
      val showCost = 500
      val onePcost = 3
      
      val profit1 = (10 - 3)*(pepolcome + 20) - 500
      val profit2 = (15 - 3)*(pepolcome + 0) - 500
      val profit3 = (20 - 3)*(pepolcome - 20) - 500
      
      println("price = 10 / frofit = " + profit1 )
      println("price = 10 / frofit = " + profit2 )
      println("price = 10 / frofit = " + profit3 )
      
      if(profit1 > profit2){
          if(profit3 > profit2){
              println(" best ticket price is " + profit3)
          }else{println(" best ticket price is " + profit2)}
      }else{
          if(profit3 > profit2){
               println(" best ticket price is " + profit3)
          }else{ println(" best ticket price is " + profit2)}
      }
   }
}