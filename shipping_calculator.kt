fun shippingCost(amount: Double, international: Boolean): Double {
    var fee:Double;
  if(international==true){
            fee=amount*0.15;
            if(fee>50){
                fee=50.0;
            }else{
                 fee=amount*0.15;
            }
  }else{
      fee=amount*0.1;
      if(amount>=75){
          fee=0.0;
      }else{
          fee=amount*0.1
      }

  }
  return fee;
}
fun main(args: Array<String>) {
  val total = readLine()!!.toDouble()
  val international = readLine()!!.toBoolean()    
  println(shippingCost(total, international))
}