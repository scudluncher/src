import java.math.BigInteger;
import java.util.ArrayList;


public class Euler25_1000digitFibonacciNumber {

        public static ArrayList< BigInteger> fibo = new ArrayList<BigInteger >();
       

       
       
        public static void main(String [] args) {
              
              
               fibo.add (BigInteger. valueOf(1 ));
               fibo.add (BigInteger. valueOf(1 ));
              
              
               System.out .println( "Asdf");
               //while (BigInteger.valueOf(10).pow(999).compareTo((fibo.get(fibo.size() - 1)))>0) {
              
               while(true ){
                      fibo = makeFibo (fibo);
                      System.out .println( fibo.get (fibo. size() - 1 ));
                      if(fibo .get( fibo.size ()-1). toString().length ()==1000){
                             System.out .println( fibo.get (fibo. size()-1 ).toString(). length());
                            System.out .println( fibo.get (fibo. size()-1 ));
                            System.out .println( fibo.size ());
                            break;
                     }
              }
              
              
              
       }
       

       
       
        public static ArrayList< BigInteger> makeFibo (ArrayList< BigInteger> fibo ){
                     
               fibo.add (fibo. get(fibo .size()- 2).add (fibo. get(fibo .size()- 1)));
              
               return fibo ;
       }
}


  