object q4{
    def evenSum(list: List[Int]): Int={
        list.filter(_%2 == 0).sum
    }

    def main(args: Array[String]): Unit={
       // val temp = List(1,2,3,4,5,6,7,8,9,10)
       print("Enter the numbers you like using spaces : ")
        val temp = scala.io.StdIn.readLine()     // Read the Input as String 
        var temp3 = temp.split(" ").map(_.toInt).toList    // split that string using spaces and convert that strings to integers and store them in list
        val temp2 = evenSum(temp3)
        print(temp2)

    }
}
