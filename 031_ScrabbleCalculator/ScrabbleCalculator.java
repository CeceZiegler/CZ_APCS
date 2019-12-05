import java.util.Scanner;

public class ScrabbleCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word;
        
        // I have created a variable for each letter in the alphabet of how many available tiles there are.

        int a = 9;
        int aTotal = 0;
        int b = 2;
        int bTotal = 0;
        int c = 2;
        int cTotal = 0;
        int d = 4;
        int dTotal = 0;
        int e = 12;
        int eTotal = 0;
        int f = 2;
        int fTotal = 0;
        int g = 3;
        int gTotal = 0;
        int h = 2;
        int hTotal = 0;
        int i = 9;
        int iTotal = 0;
        int j = 1;
        int jTotal = 0;
        int k = 1;
        int kTotal = 0;
        int l = 4;
        int lTotal = 0;
        int m = 2;
        int mTotal = 0;
        int n = 6;
        int nTotal = 0;
        int o = 8;
        int oTotal = 0;
        int p = 2;
        int pTotal = 0;
        int q = 1;
        int qTotal = 0;
        int r = 6;
        int rTotal = 0;
        int s = 4;
        int sTotal = 0;
        int t = 6;
        int tTotal = 0;
        int u = 4;
        int uTotal = 0;
        int v = 2;
        int vTotal = 0;
        int w = 2;
        int wTotal = 0;
        int x = 1;
        int xTotal = 0;
        int y = 2;
        int yTotal = 0;
        int z = 1;
        int zTotal = 0;
        int points = 0;
       
        

        //The user will be prompted to enter a word they would like to make with their tiles.
        System.out.println("Please enter a word: ");
        word = scan.nextLine();
        
        //This for loop will run as many times as the length of the word entered by the user.
        for(int num = 0; num < word.length(); num++)
        {
            
            /*I am using a series of if and else if statements to compare the number of available letter tiles to the total number of that same letter in
            the word entered by the user. If the total number exceeds the available number, the user will get a statement saying theier word
            cannot be made. If the total number is less than the amount available for each letter, the word will be printed.*/

            if(word.substring(num, num + 1).equals("a") && a > aTotal)
            {
               aTotal++;
            }
           
            else if(word.substring(num, num + 1).equals("b") && b > bTotal)
            {
               bTotal++;
            }
            else if(word.substring(num, num + 1).equals("c") && c > cTotal)
            {
               cTotal++;
            }
            else if(word.substring(num, num + 1).equals("d") && d > dTotal)
            {
               dTotal++;
            }
            else if(word.substring(num, num + 1).equals("e") && e > eTotal)
            {
               eTotal++;
            }
            else if(word.substring(num, num + 1).equals("f") && f > fTotal)
            {
               fTotal++;
            }
            else if(word.substring(num, num + 1).equals("g") && g > gTotal)
            {
               gTotal++;
            }
            else if(word.substring(num, num + 1).equals("h") && h > hTotal)
            {
               hTotal++;
            }
            else if(word.substring(num, num + 1).equals("i") && i > iTotal)
            {
               iTotal++;
            }
            else if(word.substring(num, num + 1).equals("j") && j > jTotal)
            {
               jTotal++;
            }
            else if(word.substring(num, num + 1).equals("k") && k > kTotal)
            {
               kTotal++;
            }
            else if(word.substring(num, num + 1).equals("l") && l > lTotal)
            {
               lTotal++;
            }
            else if(word.substring(num, num + 1).equals("m") && m > mTotal)
            {
               mTotal++;
            }
            else if(word.substring(num, num + 1).equals("n") && n > nTotal)
            {
               nTotal++;
            }
            else if(word.substring(num, num + 1).equals("o") && o > oTotal)
            {
               oTotal++;
            }
            else if(word.substring(num, num + 1).equals("p") && p > pTotal)
            {
               pTotal++;
            }
            else if(word.substring(num, num + 1).equals("q") && q > qTotal)
            {
               qTotal++;
            }
            else if(word.substring(num, num + 1).equals("r") && r > rTotal)
            {
               rTotal++;
            }
            else if(word.substring(num, num + 1).equals("s") && s > sTotal)
            {
               sTotal++;
            }
            else if(word.substring(num, num + 1).equals("t") && t > tTotal)
            {
               tTotal++;
            }
            else if(word.substring(num, num + 1).equals("u") && u > uTotal)
            {
               uTotal++;
            }
            else if(word.substring(num, num + 1).equals("v") && v > vTotal)
            {
               vTotal++;
            }
            else if(word.substring(num, num + 1).equals("w") && w > wTotal)
            {
               wTotal++;
            }
            else if(word.substring(num, num + 1).equals("x") && x > xTotal)
            {
               xTotal++;
            }
            else if(word.substring(num, num + 1).equals("y") && y > yTotal)
            {
               yTotal++;
            }
            else if(word.substring(num, num + 1).equals("z") && z > zTotal)
            {
               zTotal++;
            }
            else
            {
                System.out.println("The word you entered cannot be made.");
                break;
            }
        
            
          
    
            
        }
        //This for statement will also run as long as the length of the word. It is set up to counts the points of each letter in the word./
        for(int num2 = 0; num2 < word.length(); num2++)
        {
            //The if and else if statements determine what letter is in the word, and then determines the amount of points to add to the total.
            if(word.substring(num2, num2 + 1).equals("a") || word.substring(num2, num2 + 1).equals("e") || word.substring(num2, num2 + 1).equals("i") || word.substring(num2, num2 + 1).equals("o") || word.substring(num2, num2 + 1).equals("l") || word.substring(num2, num2 + 1).equals("n") || word.substring(num2, num2 + 1).equals("s") || word.substring(num2, num2 + 1).equals("t") || word.substring(num2, num2 + 1).equals("r") )
            {
                points += 1;
            }
            else if(word.substring(num2, num2 + 1).equals("d") || word.substring(num2, num2 + 1).equals("g"))
            {
                points += 2;
            }
            else if(word.substring(num2, num2 + 1).equals("b") || word.substring(num2, num2 + 1).equals("c") || word.substring(num2, num2 + 1).equals("m") || word.substring(num2, num2 + 1).equals("m") || word.substring(num2, num2 + 1).equals("p"))
            {
                points += 3;
            }
            else if(word.substring(num2, num2 + 1).equals("f") || word.substring(num2, num2 + 1).equals("h") || word.substring(num2, num2 + 1).equals("v") || word.substring(num2, num2 + 1).equals("w") || word.substring(num2, num2 + 1).equals("y"))
            {
                points += 4;
            }
            else if(word.substring(num2, num2 + 1).equals("k"))
            {
                points += 5;
            }
            else if(word.substring(num2, num2 + 1).equals("j") || word.substring(num2, num2 + 1).equals("x"))
            {
                points += 8;
            }
            else if(word.substring(num2, num2 + 1).equals("q") || word.substring(num2, num2 + 1).equals("z"))
            {
                points += 10;
            }

            
        }
        System.out.println("You earned " +  points + " points for your word.");
    }
}