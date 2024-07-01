object q1{
  
    def stringRevers(a:String): String={
        if(a != ""){                           
            stringRevers(a.tail) + a.head        // first character of the string is head
                                                //  remain characters (after the first character) called tail
        }else{
            ""
        }
    }


    def main(args:Array[String]): Unit={
        var b = stringRevers("Kamal")
        print(b)
    }
}