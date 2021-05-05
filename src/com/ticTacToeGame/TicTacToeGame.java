package com.ticTacToeGame;

import java.util.Scanner;

public class TicTacToeGame {
    
    private static  char[] board= new char[10];//declaring the userInput variable
    private static char computer;
    private static char user;
    public static void createBoard() {
        for (int i = 1; i < 10; i++) { //storing null values in userInput using for loop
            board[i] = ' ';
        }
    }
    public static void chooseSymbol(){
        char choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x or o to select letter from");
        choice = sc.next().charAt(0); //take input from user
        if (choice == 'x'){ // check whether the player entered x or o
            user = 'x';
            computer = 'o';
        }
        else if (choice == 'o'){
            user = 'o';
            computer = 'x';
        }else{
            System.out.println("enter valid Symbol");
        }
    }
    public static void showBoard(){
        System.out.println("-------------");
        System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
        System.out.println("-------------");
        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
        System.out.println("-------------");
        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
        System.out.println("-------------");


    }
    public static void main(String[] args) {
        System.out.println("Welcome to tic toe game");
        createBoard(); //calling the createBoard method
        chooseSymbol(); //calling the allowPlayer method
        showBoard();
    }
}
