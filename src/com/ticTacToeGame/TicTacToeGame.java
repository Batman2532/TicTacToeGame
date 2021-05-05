package com.ticTacToeGame;

import java.lang.constant.Constable;
import java.util.Scanner;

public class TicTacToeGame {
    
    private static  char[] board;//declaring the userInput variable
    public static String computer;
    public static String user;
    public TicTacToeGame(){
        board = new char[10];//initializing userInput variable
    }
    public static void createBoard() {
        for (int i = 0; i < 10; i++) { //storing null values in userInput using for loop
            board[i] = ' ';
        }
    }
    public static void allowPlayer(){
        String choice = "x";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x or o to select letter from");
        choice = sc.nextLine(); //take inpute from user
        if (choice == "x"){ // check whether the player entered x or o
            user = "x";
            computer = "o";
        }
        else{
            user = "o";
            computer = "x";
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to tic toe game");
        createBoard(); //calling the createBoard method
        allowPlayer(); //calling the allowPlayer method
    }
}
