/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args)
    {
        System.out.print("What is the quote? ");
        Scanner input = new Scanner(System.in);
        String s1 = "";
        s1 += input.nextLine();
        String s2 = "";
        System.out.print("Who said it? ");
        s2 += input.nextLine();
        System.out.println(s2 + " says, " + "\"" + s1 + "\"");
    }
}