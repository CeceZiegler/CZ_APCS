public class TabletopDice
 {
     public static void main(String[] args)
     {
         /* This method creates seven different dice that have different values, and uses the Math.random() to
         generate a random roll of the dice. The dice are created as variable, and printed out using 
         println().*/

           int dFour = (int) (Math.random()*4 +1);
          int dSix = (int) (Math.random()* 6 + 1);
          int dEight = (int) (Math.random()*8 + 1);
          int dTen = (int) (Math.random()*10);
          int dTwelve = (int) (Math.random()*12 +1);
          int dTwenty = (int) (Math.random()*20 +1);
          int percentile = (int) (Math.random()*100 + 1);

           


          System.out.println(dFour);
           System.out.println(dSix);
          System.out.println(dEight);
          System.out.println(dTen);
          System.out.println(dTwelve);
          System.out.println(dTwenty);
          System.out.println(percentile);

    }

}