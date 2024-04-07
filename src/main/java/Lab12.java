import java.util.Scanner;

public class Lab12
{
    public static void main(String[] args) {   
        System.out.print("\f");
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();       
        problem6();
        problem7();
    }

    // 7) do 7a HERE:
    
    // 3) do 3d HERE:


    public static void problem1() {
        System.out.println("\n-- Problem 1 ----------");
        // 1) do 1a, 1b, 1c HERE:
        //displayArray(stuff);
    }

    public static void problem2() {
        System.out.println("\n-- Problem 2 ----------");
        // 2)  do 2a, 2b, 2c HERE:
        //displayArray(word);
    }

    public static void problem3() {
        System.out.println("\n-- Problem 3 ----------");
        // 3)  do 3a-c, 3e-h HERE:
    }

    public static void problem4() {
        System.out.println("\n-- Problem 4 ----------");
        int[] data = {0, 1, 2, 3, 4, 5};

        // 4)  do 4a - 4d HERE:

        displayArray(data);
    }

    public static void problem5() {
        System.out.println("\n-- Problem 5 ----------");
        // 5) do 5a - 5e HERE
    }

    public static void problem6() {
        System.out.println("\n-- Problem 6 ----------");
        // 6) do 6 HERE
    }

    public static void problem7() {
        System.out.println("\n-- Problem 7 ----------");
        // 7) do 7 HERE
    }

    
    public static void displayArray(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {   
            System.out.print(i + ":" + anArray[i] + "  ");
        }
        System.out.println();
    }
    
    public static void displayArray(char[] anArray) {
        for (int i = 0; i < anArray.length; i++) {   
            System.out.print(i + ":" + anArray[i] + "  ");
        }
        System.out.println();
    }
}
