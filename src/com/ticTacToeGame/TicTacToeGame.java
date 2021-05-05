package com.ticTacToeGame;

public class TicTacToeGame {

    private static  char[] userInput;//declaring the userInput variable

    public TicTacToeGame(){
        userInput = new char[10];//initializing userInput variable
    }
    public static void CreateBoard() {
        for (int i = 0; i < 10; i++) { //storing null values in userInput using for loop
            userInput[i] = ' ';
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to tic toe game");
        CreateBoard(); //calling the method
    }
}
