object q2{

def stringFilter(arr: List[String]): List[String] = {
        arr.filter(_.length > 5)
        // List[string] means array of the strings 
}

    def main(args: Array[String]): Unit={
       // val arr1 = List("Namal","Aberathna","Thomson","Egon","Ramsis","Mewan","Sunil")
        print("Enter the list of strings using spaces: ")
        val arr1 = scala.io.StdIn.readLine()   // Read the line and return it as a string
        val arr3 = arr1.split(" ").toList      // break that string using spaces and store them as a list
        val arr2 = stringFilter(arr3) 
        print(arr2)
}
}
