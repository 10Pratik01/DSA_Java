package Basics;

import java.util.*;


class Methods { 

    static Integer toCheckValidInt(String input){
        try {
            return Integer.parseInt(input); 
        } catch (NumberFormatException e) {
            return null; 
        }
    }

     // Create a methode to check if the number is prime or not
    static String CheckPrime(int input){
        String result= "No"; 
         if(input <= 1 || input == 2 ){
            return result = "Yes";  

         }else if (input % 2 == 0 ){
            return result = "No"; 
         } else {
            for(int i = 3; i * i <= input; i+=2){
                if(input % i == 0){
                    return result = "No"; 
                }else{
                    return result = "Yes"; 
                }
            }
         }
        return result; 
    }

    // to check if the number is odd or even
    static String CheckEvenOdd(int input){
        String result; 
        if(input % 2 == 0){ 
            result = "Even";  // if the number is even
        }else{
            result = "Odd"; // if the number is odd
        }
        return result; 
    }


    // To get the factors we will use recursion (also non static)
    int Factorial(int input, int x){ 
        if(x == input){
            return x;
        }

        return x * Factorial(input, x+1); 
    }
    

    boolean isPlaindrome(String input){ 
        int length = input.length(); 
        char[] arr = input.toCharArray(); 

        for( int i=0; i<length/2; i++){
            if(arr[i] != arr[length-i-1])
                 return false; 
        }
        return true; 
    }
    
}

class FinalOutput{

    static void Output(int number){
        String isPrime = Methods.CheckPrime(number);
        String oddOrEven = Methods.CheckEvenOdd(number); 
                
        // creating a obj for practice and class is non static
        Methods obj = new Methods(); 
        int factorial = obj.Factorial(number, 1); 
        System.out.println("Is the number prime ? " + isPrime);
        System.out.println("Is number odd or even? The number is = " + oddOrEven );
        System.out.println("Factorial of number = "+ factorial);
        
    }


    static void Output(String element){
        Methods obj = new Methods(); 
        int lenght = element.length(); 
        System.out.println("The length of the string is : "+ lenght);
        boolean isPlaindrome; 

        
            isPlaindrome = obj.isPlaindrome(element);
        
         
        if(isPlaindrome) System.out.println("String is a Palindrome");
        else System.out.println("String is not in palindrome"); 

    }
}



public class Basics {
   

    // Main function to print everything
    public static void main(String args[]){ 
        // Take the array input from the user if the number is string or the number is int 
        ArrayList<String> arr = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the number of Inputs : "); 
        int numberOfInputes = sc.nextInt(); 

        for(int i=1 ; i<numberOfInputes+1; i++){ 
            System.out.println("User Input : ");
            String input = sc.next();
            input = input.trim().toLowerCase();
            arr.add(input); 
        }

        int size = arr.size(); 
        

        for(int i=0; i<size; i++){
            // check if the input is string or int if int then convert the string to the int
            String element = arr.get(i); 
            
            Integer valid = Methods.toCheckValidInt(element); 
            int number;

            if(valid != null){
                System.out.println(valid + " is valid number"); 
                number = valid; 
                FinalOutput.Output(number);
                
            }else {
                System.out.println(" ");
                System.out.println(element + " is a valid String"); 
                FinalOutput.Output(element);
            }
            
        }
        
        sc.close();

    }

}
