package com.bridgelab;
public class SnakeAndLadder {
    public static void main(String[] args) {
        int player1 = 0, player2 = 0;
        int count = 1;
        while (player1 < 100 && player2 < 100) {
            count++;
            System.out.println(count);
            double diceNumber = Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Player" + (count % 2 + 1) + "Turn dice number is:" + diceNumber);
            double option = Math.floor(Math.random() * 10) % 3;
            System.out.println("option is:" + option);
            if (option == 0) {
                System.out.println("sorry,no play for the player" + (count % 2 + 1));
            } else if (option == 1) {
                System.out.println("yayy! you got ladder for the Player" + (count % 2 + 1));
                if (count % 2 == 0) {
                    player1 += diceNumber;
                    System.out.println("His position is now " + player1);
                    if (player1 > 100) {
                        player1 -= diceNumber;
                        System.out.println("player 1 postion is" + player1);
                    }
                } else {
                    player2 += diceNumber;
                    System.out.println("His position is now " + player2);
                    if (player2 > 100) {
                        player2 -= diceNumber;
                        System.out.println("Since it is more than 100, his postion is" + player2);
                    }
                }
                count--;
            } else if (option == 2) {
                System.out.println("oops!snake for the player " + (count % 2 + 1));
                if (count % 2 == 0) {
                    player1 -= diceNumber;
                    if (player1 < 0) {
                        player1 = 0;
                        System.out.println("Since it is less than 0, his postion is" + player1);
                    }
                } else {
                    player2 -= diceNumber;
                    System.out.println("His position is now " + player2);
                    if (player2 < 0) {
                        player2 = 0;
                        System.out.println("Since it is less than 0, his postion is" + player2);
                    }
                }
            }
            System.out.println("Position of player1 is " + player1);
            System.out.println("Position of player2 is " + player2);
            if (player1 == 100) {
                System.out.println("Player1 is winner");
            } else {
                System.out.println("Player2 is winner");
            }
        }
    }
}
