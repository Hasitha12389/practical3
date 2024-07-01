object q2{

def stringFilter(arr: List[String]): List[String] = {
        arr.filter(_.length > 5)
        // List[string] means array of the strings 
}

    def main(args: Array[String]): Unit={
        val arr1 = List("Namal","Aberathna","Thomson","Egon","Ramsis","Mewan","Sunil")
        val arr2 = stringFilter(arr1)
        print(arr2)
}
}