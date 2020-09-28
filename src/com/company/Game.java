package com.company;

import java.util.EmptyStackException;

public class Game
{
    int f;
    int s;
    int count = 0;
    public void game()
    {
        Distribution distribution = new Distribution();
        distribution.distribution();
        while((!distribution.dequeFirst.isEmpty())||(!distribution.dequeSecond.isEmpty()))
        {
            f = distribution.dequeFirst.getFirst();
            s = distribution.dequeSecond.getFirst();
            distribution.dequeFirst.removeFirst();
            distribution.dequeSecond.removeFirst();

            if (count == 106)
            {
                System.out.println("Botva");
                break;
            }

            if(f > s)
            {
                distribution.dequeFirst.addLast(f);
                distribution.dequeFirst.addLast(s);
            }

            if(f == s)
            {
                distribution.dequeFirst.addLast(f);
                distribution.dequeSecond.addLast(s);
            }

            if(f < s)
            {
                distribution.dequeSecond.addLast(f);
                distribution.dequeSecond.addLast(s);
            }

            if(distribution.dequeSecond.isEmpty())
            {
                System.out.println("win first");
                break;
            }

            if(distribution.dequeFirst.isEmpty())
            {
                System.out.println("win second");
                break;
            }


            count ++;
        }
    }
}
