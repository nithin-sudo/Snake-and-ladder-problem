package com.bridgelab;
public class SnakeAndLadder {
    public static void main(String[] args) {
        int initialPosition=0;
        System.out.println("initial position is:" + initialPosition);
        double diceNumber= Math.floor(Math.random()*10)%6+1;
        System.out.println("dice number is:"+ diceNumber);
        double currentPosition= Math.floor(Math.random()*10)%3;
        System.out.println("random number is:"+ currentPosition);
        if (currentPosition == 0)
        {
            System.out.println("sorry,no play");
        }
        else if (currentPosition==1)
        {
            System.out.println("yayy! you got ladder");
            initialPosition+=diceNumber;
        }
        else if (currentPosition==2)
        {
            System.out.println("oops!you got snake");
            initialPosition-=diceNumber;
            if (initialPosition<0) {
                initialPosition = 0;
            }
        }
        System.out.println("player postion is" + initialPosition);
    }
}
