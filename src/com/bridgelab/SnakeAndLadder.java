package com.bridgelab;
public class SnakeAndLadder {
    public static void main(String[] args) {
        int initialPosition=0;
        System.out.println("initial position is:" + initialPosition);
        double diceNumber= Math.floor(Math.random()*10)%6+1;
        System.out.println("dice number is:"+ diceNumber);
    }
}
