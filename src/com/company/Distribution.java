package com.company;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Distribution {
    int[] mas1 = new int[5];
    int[] mas2 = new int[5];

    Deque<Integer> dequeFirst = new LinkedList<>();
    Deque<Integer> dequeSecond = new LinkedList<>();

    Scanner scan = new Scanner(System.in);
    public void distribution()
    {

        System.out.println("введите первую колоду :");
        for (int i = 0; i <mas1.length; i++)
        {
            mas1[i] = scan.nextInt();
        }
        System.out.println("\n");

        System.out.println("введите вторую колоду :");
        for (int i = 0; i <mas2.length; i++)
        {
            mas2[i] = scan.nextInt();
        }
        System.out.println("\n");

        for (int i = 0; i < mas1.length; i++)
        {
            dequeFirst.addFirst(mas1[i]);
        }

        for (int i = 0; i < mas2.length; i++)
        {
            dequeSecond.addFirst(mas2[i]);
        }
        /*
        for (int i = 0; i < mas1.length; i++)
        {
            System.out.println(dequeFirst.getFirst());
            dequeFirst.removeFirst();
        }

        System.out.println("\n");


        for (int i = 0; i < mas2.length; i++)
        {
            System.out.println(dequeSecond.getFirst());
            dequeSecond.removeFirst();
        }
        */

    }

}

