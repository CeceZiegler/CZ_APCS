public class PopulationProjection
{
    public static void main(String [] args)
    { /* This method calculates the projected population in the next five years. The method uses variables and uses the math
     procedures addition, subrtaction, multiplacation, and division to project the new populations. The projected numbers aren't
     exactly correct becuase the exact numbers would be in decimal form, or have a remainder, but java rounds, and doesn't 
     include decimals or remainders/*/
    
        int birthRate = 7;
        int deathRate = 13;
        int immRate = 45;
        int currentPop = 312032486;
        int secondsInYear = 31536000;
        int popInOneYear = (secondsInYear / birthRate) - (secondsInYear / deathRate) + (secondsInYear / immRate);
        
        System.out.println(currentPop + popInOneYear);
        System.out.println(currentPop + (popInOneYear * 2));
        System.out.println(currentPop + (popInOneYear * 3));
        System.out.println(currentPop + (popInOneYear * 4));
        System.out.println(currentPop + (popInOneYear * 5));
    }
}