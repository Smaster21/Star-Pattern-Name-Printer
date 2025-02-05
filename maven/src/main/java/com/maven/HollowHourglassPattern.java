package com.maven;

import java.util.Scanner;

public class HollowHourglassPattern {

    // Function to print the name in a star pattern
    public static void printNameInStars(String name) {
        for (char c : name.toCharArray()) {
            printLetterInStars(Character.toUpperCase(c));
        }
        System.out.println(); // Move to the next line after printing the name
    }
    // Function to print each letter in stars
    public static void printLetterInStars(char letter) {
        switch (letter) {
            case 'A':
                System.out.println("  *  ");
                System.out.println(" * * ");
                System.out.println("*****");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("     ");
                break;
            case 'B':
                System.out.println("**** ");
                System.out.println("*   *");
                System.out.println("**** ");
                System.out.println("*   *");
                System.out.println("**** ");
                System.out.println("     ");
                break;
            case 'C':
                System.out.println(" ***** ");
                System.out.println("*     ");
                System.out.println("*     ");
                System.out.println("*     ");
                System.out.println(" ***** ");
                System.out.println("     ");
                break;
            case 'D':
                System.out.println("****  ");
                System.out.println("*   * ");
                System.out.println("*    *");
                System.out.println("*   * ");
                System.out.println("****  ");
                System.out.println("     ");
                break;
            case 'E':
                System.out.println("******");
                System.out.println("*    ");
                System.out.println("****");
                System.out.println("*    ");
                System.out.println("******");
                System.out.println("     ");
                break;
            case 'F':
                System.out.println("****** ");
                System.out.println("*      ");
                System.out.println("****** ");
                System.out.println("*      ");
                System.out.println("*      ");
                System.out.println("*     ");
                System.out.println("     ");
                break;
            case 'G':
                System.out.println(" ***** ");
                System.out.println("*     ");
                System.out.println("*  ** ");
                System.out.println("*   * ");
                System.out.println(" ***** ");
                System.out.println("     ");
                break;
            case 'H':
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*******");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("     ");
                break;
            case 'I':
                System.out.println(" ***** ");
                System.out.println("   *   ");
                System.out.println("   *   ");
                System.out.println("   *   ");
                System.out.println(" ***** ");
                System.out.println("     ");
                break;
            case 'J':
                System.out.println("  ***** ");
                System.out.println("     *  ");
                System.out.println("     *  ");
                System.out.println("*    *  ");
                System.out.println(" *****  ");
                System.out.println("     ");
                break;
            case 'K':
                System.out.println("*    * ");
                System.out.println("*   *  ");
                System.out.println("****   ");
                System.out.println("*   *  ");
                System.out.println("*    * ");
                System.out.println("     ");
                break;
            case 'L':
                System.out.println("*      ");
                System.out.println("*      ");
                System.out.println("*      ");
                System.out.println("*      ");
                System.out.println("****** ");
                System.out.println("     ");
                break;
            case 'M':
                System.out.println("*     *");
                System.out.println("**   **");
                System.out.println("* * * *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("     ");
                break;
            case 'N':
                System.out.println("*     *");
                System.out.println("**    *");
                System.out.println("* *   *");
                System.out.println("*  *  *");
                System.out.println("*   ** ");
                System.out.println("     ");
                break;
            case 'O':
                System.out.println(" ***** ");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" ***** ");
                System.out.println("     ");
                break;
            case 'P':
                System.out.println("****  ");
                System.out.println("*   * ");
                System.out.println("****  ");
                System.out.println("*      ");
                System.out.println("*      ");
                System.out.println("     ");
                break;
            case 'Q':
                System.out.println(" ***** ");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*   * *");
                System.out.println(" ***** ");
                System.out.println("     ");
                break;
            case 'R':
                System.out.println("****  ");
                System.out.println("*   * ");
                System.out.println("****  ");
                System.out.println("*   * ");
                System.out.println("*    *");
                System.out.println("     ");
                break;
            case 'S':
                System.out.println(" ***** ");
                System.out.println("*      ");
                System.out.println("   *   ");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println(" ***** ");
                System.out.println("     ");
                break;
            case 'T':
                System.out.println("*******");
                System.out.println("   *   ");
                System.out.println("   *   ");
                System.out.println("   *   ");
                System.out.println("   *   ");
                System.out.println("     ");
                break;
            case 'U':
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" * * * ");
                System.out.println("     ");
                break;
            case 'V':
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" *   * ");
                System.out.println("  * *  ");
                System.out.println("   *   ");
                System.out.println("     ");
                break;
            case 'W':
                System.out.println("*       *");
                System.out.println("*       *");
                System.out.println("*   *   *");
                System.out.println(" *  *  * ");
                System.out.println("  *   *  ");
                System.out.println("     ");
                break;
            case 'X':
                System.out.println("*     *");
                System.out.println(" *   * ");
                System.out.println("  * *  ");
                System.out.println(" *   * ");
                System.out.println("*     *");
                System.out.println("     ");
                break;
            case 'Y':
                System.out.println("*     *");
                System.out.println(" *   * ");
                System.out.println("  * *  ");
                System.out.println("   *   ");
                System.out.println("   *   ");
                System.out.println("     ");
                break;
            case 'Z':
                System.out.println("******");
                System.out.println("    * ");
                System.out.println("   *  ");
                System.out.println("  *   ");
                System.out.println("******");
                System.out.println("     ");
                break;
            default:
                System.out.println("Letter not supported.");
        }
    }

    // Driver Function
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        printNameInStars(name);
        scanner.close();
    }
}
