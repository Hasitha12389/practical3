object q3{
    def add(num1: Int,num2: Int): Double={
        num1 + num2
       }
     
    def average(num1: Int,num2: Int): Double={
        val num3 = add(num1,num2)
        val num4 = (num3/2)
        BigDecimal(num4).setScale(2).toDouble
    }

    def main(args: Array[String]): Unit={
        val num5 = average(3,4)
        print(num5)
    }
}