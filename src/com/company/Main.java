package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Play against a computer or player?");
        Scanner keyIn = new Scanner(System.in);
        String cp = keyIn.next();

        Point cPointX = new Point();
        Point cPointY = new Point();
        String player = "O";
        String comp = "X";

        String board[][] = {{"___", "___", "___"},
                {"___", "___", "___"},
                {"___", "___", "___"}};

        for (int row = 0; row < board.length; row++)
        {
            for (int col = 0; col < board[row].length; col++)
            {
                //System.out.print();
            }
        }

        if (cp.equalsIgnoreCase("computer"))
        {
            for (int i = 0; i < 9; i++)
            {
                System.out.println("You will be O and the computer will be X. Your turn is first." + "\nPlease type in your points in the format of X,Y without the parenthesis");

                Scanner kI = new Scanner(System.in);
                String pChoice = kI.next();


                String sVal [] = pChoice.split(",");
                int iValX = Integer.parseInt(sVal[0]);
                int iValY = Integer.parseInt(sVal[1]);


                System.out.println( "Your point is: " + iValX + "," + iValY);

                int xTest = cPointX.setPoint();
                int yTest = cPointY.setPoint();

                System.out.println("The computer's point is: " + xTest + "," + yTest);


            }

        }
    }
}
