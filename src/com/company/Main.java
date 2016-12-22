package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Point cPointX = new Point();
        Point cPointY = new Point();
        String player = "O";
        String comp = "X";
        //int row;


        String board[][] = {{"---", "---", "---"},
                {"---", "---", "---"},
                {"---", "---", "---"}};



//        for (int row = 0; row < board.length; row++)
//        {
//            for (int col = 0; col < board[row].length; col++)
//            {
//                System.out.print(board[row][col] + "\t");
//            }
//            System.out.println("\n");
//        }


        System.out.println("Play against a computer or player?");
        Scanner keyIn = new Scanner(System.in);
        String cp = keyIn.next();

        System.out.println("You will be O and the computer will be X. Your turn is first.");

        if (cp.equalsIgnoreCase("computer"))
        {


            for (int i = 0; i < 9; i++)
            {

                System.out.println("Please enter a point");

                Scanner kI = new Scanner(System.in);
                String pChoice = kI.next();


                String sVal [] = pChoice.split(",");
                int iValRow = Integer.parseInt(sVal[0]);
                int iValCol = Integer.parseInt(sVal[1]);


                System.out.println( "Your point is: " + iValRow + "," + iValCol);

                int rowTest = cPointX.setPoint();
                int colTest = cPointY.setPoint();

                System.out.println("The computer's point is: " + rowTest + "," + colTest);

                board[iValRow][iValCol] = " O";

                if (board[rowTest][colTest].equalsIgnoreCase(" X") && board[rowTest][colTest].equalsIgnoreCase(" O"))
                {
                    for (int k = 0; k < 10000; k++)
                    {
                        rowTest = cPointX.setPoint();
                        colTest = cPointY.setPoint();
                        if (board[rowTest][colTest].equals("---") && (rowTest == iValRow) && (colTest == iValCol))
                        {
                            board[rowTest][colTest] = " X";
                            continue;
                        }
                    }
                }

                board[rowTest][colTest] = " X";


                for (int row = 0; row < board.length; row++)
                {
                    for (int col = 0; col < board[row].length; col++)
                    {
                        System.out.print(board[row][col] + "\t");
                    }
                    System.out.println("\n");
                }

                break;

            }

        }
    }
}
