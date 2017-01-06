package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Point cPointX = new Point();
        Point cPointY = new Point();

        String board[][] = {{"---", "---", "---"},
                {"---", "---", "---"},
                {"---", "---", "---"}};

        outerloop1:
        while (true)
        {

            System.out.println("Play against a computer or player?");
            Scanner keyIn = new Scanner(System.in);
            String cp = keyIn.next();

            outerloop:
            if (cp.equalsIgnoreCase("computer"))
            {
                System.out.println("You will be O and the computer will be X. Your turn is first.");

                for (int i = 0; i < 9; i++)
                {

                    System.out.println("The first row is 0 and the first column is 0 \nPlease enter a point in the format of row,column");

                    Scanner kI = new Scanner(System.in);
                    String pChoice = kI.next();


                    String sVal [] = pChoice.split(",");
                    int iValRow = Integer.parseInt(sVal[0]);
                    int iValCol = Integer.parseInt(sVal[1]);


                    System.out.println( "Your point is: " + iValRow + "," + iValCol);

                    int rowTest = cPointX.setPoint();
                    int colTest = cPointY.setPoint();


                    board[iValRow][iValCol] = " O";

                    innerLoop:
                    if ((!board[rowTest][colTest].equalsIgnoreCase("---")) || ((rowTest == iValRow) && (colTest == iValCol)))
                    {
                        for (int k = 0; k < 10000; k++)
                        {
                            rowTest = cPointX.setPoint();
                            colTest = cPointY.setPoint();
                            if (board[rowTest][colTest].equals("---") && ((rowTest != iValRow) && (colTest != iValCol)))
                            {
                                board[rowTest][colTest] = " X";
                                break innerLoop;
                            }


                        }
                    }

                    System.out.println("The computer's point is: " + rowTest + "," + colTest);

                    board[rowTest][colTest] = " X";


                    for (int row = 0; row < board.length; row++)
                    {
                        for (int col = 0; col < board[row].length; col++)
                        {
                            System.out.print(board[row][col] + "\t");
                        }
                        System.out.println("\n");
                    }

                    if ((board[0][0].equalsIgnoreCase("O") && board[0][1].equalsIgnoreCase("O") && board[0][2].equalsIgnoreCase("O"))
                            || (board[0][0].equalsIgnoreCase(" O") && board[0][1].equalsIgnoreCase(" O") && board[0][2].equalsIgnoreCase(" O"))
                            || (board[1][0].equalsIgnoreCase(" O") && board[1][1].equalsIgnoreCase(" O") && board[1][2].equalsIgnoreCase(" O"))
                            || (board[2][0].equalsIgnoreCase(" O") && board[2][1].equalsIgnoreCase(" O") && board[2][2].equalsIgnoreCase(" O"))
                            || (board[0][0].equalsIgnoreCase(" O") && board[1][1].equalsIgnoreCase(" O") && board[2][2].equalsIgnoreCase(" O"))
                            || (board[0][2].equalsIgnoreCase(" O") && board[1][1].equalsIgnoreCase(" O") && board[2][0].equalsIgnoreCase(" O"))
                            || (board[0][0].equalsIgnoreCase(" O") && board[1][0].equalsIgnoreCase(" O") && board[2][0].equalsIgnoreCase(" O"))
                            || (board[0][1].equalsIgnoreCase(" O") && board[1][1].equalsIgnoreCase(" O") && board[2][1].equalsIgnoreCase(" O"))
                            || (board[0][2].equalsIgnoreCase(" O") && board[1][1].equalsIgnoreCase(" O") && board[2][0].equalsIgnoreCase(" O")))
                    {
                        System.out.println("The player wins!");
                        System.out.println("Would you like to play again?");
                        Scanner yn = new Scanner(System.in);
                        String ans = yn.next();

                        if (ans.equalsIgnoreCase("yes"))
                        {
                            break outerloop;
                        }
                        else
                        {
                            break outerloop1;
                        }
                    }


                    else if ((board[0][0].equalsIgnoreCase(" X") && board[0][1].equalsIgnoreCase(" X") && board[0][2].equalsIgnoreCase(" X"))
                            || (board[0][0].equalsIgnoreCase(" X") && board[0][1].equalsIgnoreCase(" X") && board[0][2].equalsIgnoreCase(" X"))
                            || (board[1][0].equalsIgnoreCase(" X") && board[1][1].equalsIgnoreCase(" X") && board[1][2].equalsIgnoreCase(" X"))
                            || (board[2][0].equalsIgnoreCase(" X") && board[2][1].equalsIgnoreCase(" X") && board[2][2].equalsIgnoreCase(" X"))
                            || (board[0][0].equalsIgnoreCase(" X") && board[1][1].equalsIgnoreCase(" X") && board[2][2].equalsIgnoreCase(" X"))
                            || (board[0][2].equalsIgnoreCase(" X") && board[1][1].equalsIgnoreCase(" X") && board[2][0].equalsIgnoreCase(" X"))
                            || (board[0][0].equalsIgnoreCase(" X") && board[1][0].equalsIgnoreCase(" X") && board[2][0].equalsIgnoreCase(" X"))
                            || (board[0][1].equalsIgnoreCase(" X") && board[1][1].equalsIgnoreCase(" X") && board[2][1].equalsIgnoreCase(" X"))
                            || (board[0][2].equalsIgnoreCase(" X") && board[1][1].equalsIgnoreCase(" X") && board[2][0].equalsIgnoreCase(" X")))
                    {
                        System.out.println("The computer wins!");
                        System.out.println("Would you like to play again?");
                        Scanner yn = new Scanner(System.in);
                        String ans = yn.next();

                        if (ans.equalsIgnoreCase("yes"))
                        {
                            break outerloop;
                        }
                        else
                        {
                            break outerloop1;
                        }

                    }

                }

            }


            if (cp.equalsIgnoreCase("player"))
            {

                System.out.println("Player 1 will be O and Player 2 will be X. Player 1 goes first.");

                for (int i = 0; i < 9; i++)
                {

                    System.out.println("Player 1, please enter a point");

                    Scanner kI = new Scanner(System.in);
                    String p1Choice = kI.next();

                    System.out.println("Player 2, please enter a point");

                    Scanner kI2 = new Scanner(System.in);
                    String p2Choice = kI2.next();

                    String sValP1[] = p1Choice.split(",");
                    int iValRowP1 = Integer.parseInt(sValP1[0]);
                    int iValColP1 = Integer.parseInt(sValP1[1]);

                    String sValP2[] = p2Choice.split(",");
                    int iValRowP2 = Integer.parseInt(sValP2[0]);
                    int iValColP2 = Integer.parseInt(sValP2[1]);


                    System.out.println("Player 1's point is: " + iValRowP1 + "," + iValColP1);
                    System.out.println("Player 2's point is: " + iValRowP2 + "," + iValColP2);

                    board[iValRowP1][iValColP1] = " O";
                    board[iValRowP2][iValColP2] = " X";


                    for (int row = 0; row < board.length; row++) {
                        for (int col = 0; col < board[row].length; col++) {
                            System.out.print(board[row][col] + "\t");
                        }
                        System.out.println("\n");
                    }

                    if ((board[0][0].equalsIgnoreCase("O") && board[0][1].equalsIgnoreCase("O") && board[0][2].equalsIgnoreCase("O"))
                            || (board[0][0].equalsIgnoreCase(" O") && board[0][1].equalsIgnoreCase(" O") && board[0][2].equalsIgnoreCase(" O"))
                            || (board[1][0].equalsIgnoreCase(" O") && board[1][1].equalsIgnoreCase(" O") && board[1][2].equalsIgnoreCase(" O"))
                            || (board[2][0].equalsIgnoreCase(" O") && board[2][1].equalsIgnoreCase(" O") && board[2][2].equalsIgnoreCase(" O"))
                            || (board[0][0].equalsIgnoreCase(" O") && board[1][1].equalsIgnoreCase(" O") && board[2][2].equalsIgnoreCase(" O"))
                            || (board[0][2].equalsIgnoreCase(" O") && board[1][1].equalsIgnoreCase(" O") && board[2][0].equalsIgnoreCase(" O"))
                            || (board[0][0].equalsIgnoreCase(" O") && board[1][0].equalsIgnoreCase(" O") && board[2][0].equalsIgnoreCase(" O"))
                            || (board[0][1].equalsIgnoreCase(" O") && board[1][1].equalsIgnoreCase(" O") && board[2][1].equalsIgnoreCase(" O"))
                            || (board[0][2].equalsIgnoreCase(" O") && board[1][1].equalsIgnoreCase(" O") && board[2][0].equalsIgnoreCase(" O")))
                    {
                        System.out.println("Player 1 wins!");
                        break;
                    }

                    else if ((board[0][0].equalsIgnoreCase(" X") && board[0][1].equalsIgnoreCase(" X") && board[0][2].equalsIgnoreCase(" X"))
                            || (board[0][0].equalsIgnoreCase(" X") && board[0][1].equalsIgnoreCase(" X") && board[0][2].equalsIgnoreCase(" X"))
                            || (board[1][0].equalsIgnoreCase(" X") && board[1][1].equalsIgnoreCase(" X") && board[1][2].equalsIgnoreCase(" X"))
                            || (board[2][0].equalsIgnoreCase(" X") && board[2][1].equalsIgnoreCase(" X") && board[2][2].equalsIgnoreCase(" X"))
                            || (board[0][0].equalsIgnoreCase(" X") && board[1][1].equalsIgnoreCase(" X") && board[2][2].equalsIgnoreCase(" X"))
                            || (board[0][2].equalsIgnoreCase(" X") && board[1][1].equalsIgnoreCase(" X") && board[2][0].equalsIgnoreCase(" X"))
                            || (board[0][0].equalsIgnoreCase(" X") && board[1][0].equalsIgnoreCase(" X") && board[2][0].equalsIgnoreCase(" X"))
                            || (board[0][1].equalsIgnoreCase(" X") && board[1][1].equalsIgnoreCase(" X") && board[2][1].equalsIgnoreCase(" X"))
                            || (board[0][2].equalsIgnoreCase(" X") && board[1][1].equalsIgnoreCase(" X") && board[2][0].equalsIgnoreCase(" X")))
                    {
                        System.out.println("Player 2 wins!");
                        break;
                    }
                }
            }
        }



    }
}
