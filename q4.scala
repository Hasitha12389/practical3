object q4{
    def evenSum(list: List[Int]): Int={
        list.filter(_%2 == 0).sum
    }

    def main(args: Array[String]): Unit={
        val temp = List(1,2,3,4,5,6,7,8,9,10)
        val temp2 = evenSum(temp)
        print(temp2)

    }
}