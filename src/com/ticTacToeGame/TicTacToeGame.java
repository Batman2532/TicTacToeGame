package com.ticTacToeGame;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    
    private static  char[] board= new char[10];//declaring the userInput variable
    static Scanner sc = new Scanner(System.in);
    private static char computer;
    private static char user;
    public static void createBoard() {
        for (int i = 1; i < 10; i++) { //storing null values in userInput using for loop
            board[i] = ' ';
        }
    }
    public static void chooseSymbol(){
        char choice;
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
        System.out.println("-------------------");
        System.out.println("| " + board[1] + "1  | " + board[2] + "2  | " + board[3] + "3  |");
        System.out.println("-------------------");
        System.out.println("| " + board[4] + "4  | " + board[5] + "5  | " + board[6] + "6  |");
        System.out.println("-------------------");
        System.out.println("| " + board[7] + "7  | " + board[8] + "8  | " + board[9] + "9  |");
        System.out.println("-------------------");
    }
    public static void makeMove(){
        System.out.println("Enter the position between 1-9 number where you want to play" );
        int indexNumber;
        indexNumber = sc.nextInt();
        if(board[indexNumber] == ' ') {
        switch (indexNumber){
            case 1:
                board[indexNumber]= user;
                break;
            case 2:
                board[indexNumber]= user;
                break;
            case 3:
                board[indexNumber]= user;
                break;
            case 4:
                board[indexNumber]= user;
                break;
            case 5:
                board[indexNumber]= user;
                break;
            case 6:
                board[indexNumber]= user;
                break;
            case 7:
                board[indexNumber]= user;
                break;
            case 8:
                board[indexNumber]= user;
                break;
            case 9:
                board[indexNumber]= user;
                break;
            default:
                System.out.println("Enter valid number");
        }
        }
        else{
            System.out.println("this position is already used");
        }
    }
    public static void tossCoin(){
        System.out.println("Select 0 for head or 1 for tails to see who play first");
        int heads = 0;
        int tails = 1;
        int userSelection = sc.nextInt();
        Random randomNum = new Random();
        int coinToss = randomNum.nextInt(2);
        if (userSelection == coinToss){
            System.out.println("user will play first");
        }
        else
            System.out.println("computer will play first");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to tic toe game");
//        createBoard(); //calling the createBoard method
//        chooseSymbol(); //calling the allowPlayer method
//        showBoard();
//        makeMove();
        tossCoin();
    }
}
