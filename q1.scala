object q1{
  
 def stringRevers(a:String): String={ 
    if (a != ""){         // To stop the recurtion            
     stringRevers(a.tail) + a.head       
// first character of the string is head                                
//  remain characters (after the first character) called tai;
    }else{
        ""
    }
   
}

 def main(args:Array[String]): Unit={
    print("Enter your string : ")
    var b = scala.io.StdIn.readLine()    // Read line and return it as a string 
    var d = stringRevers(b);
    print(d)
 }
}
