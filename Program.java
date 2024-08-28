//import stuff here
import java.util.Scanner;
//Your code here
class Program8{
    public static void main (String[]args){
        //make scanner
        Scanner myScanner = new Scanner(System.in);
        //deifne variables
        int int1=0;
        int int2=0;
        //ask for input and store
        System.out.println("Enter integer 1: ");
        int1= myScanner.nextInt();
        System.out.println("Enter integer 2: ");
        int2= myScanner.nextInt();
        //Do Calculations
        int sum= int1+int2;
        int difference= int1-int2;
        int product= int1*int2;
        double average=(double)(sum)/2.0;
        int asbVal=(Math.abs(difference));
        //Create output for most variables
        System.out.println("Origninal numbers are "+int1+" and "+int2);
        System.out.println("Sum= "+sum);
        System.out.println("Difference= "+difference);
        System.out.println("Product= "+product);
        System.out.println("Average= "+average);
        System.out.println("Absolute value= "+asbVal);
        //Display Max and min
        if (int1>=int2){
        System.out.println("Maximum= "+int1);
        System.out.println("Minimum= "+int2);
    }
        else{
        System.out.println("Maximum= "+int2);
        System.out.println("Minimum= "+int1);    
        }
}
}
//Paste console output below:
/*
Enter integer 1: 
13
Enter integer 2: 
20
Origninal numbers are 13 and 20
Sum= 33
Difference= -7
Product= 260
Average= 16.5
Absolute value= 7
Maximum= 20
Minimum= 13
*/
