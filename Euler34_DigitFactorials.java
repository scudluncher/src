//145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
//
//Find the sum of all numbers which are equal to the sum of the factorial of their digits.
//
//Note: as 1! = 1 and 2! = 2 are not sums they are not included.
//

public class Euler34_DigitFactorials {
        static int max = 0;
        static int pallette[] = new int [10];

        public static void main(String [] args) {

               // int max;
               int temp = 1;
               int resultSum = 0;
               for (int i = 0; i < 10; i++) {

                      pallette[i ] = getPermutation( i);
                      System.out .println( pallette[i ]);
                      max += pallette [i];
                      // System.out.println(max);
              }
               for (int k = 3; k <= max; k++) {
                      if(k ==getDigitFactorials( k))
                     {
                            resultSum=resultSum +k;
                            System.out .println( resultSum);
                     }
                     
                     
                     
              }

       }

        public static int getPermutation(int intValue) {
               if (intValue == 0 || intValue == 1 ) {
                      return 1 ;
              }

               else
                      return intValue * getPermutation( intValue - 1 );

       }

        public static int getDigitFactorials(int k) {
               int temp =k;
               int tempSum =0;
              
               while(temp >0){
                      tempSum=tempSum +pallette[ temp%10 ];
                      temp=temp /10;
              }
              
               return tempSum ;
              
              
              
              
              
       }
}