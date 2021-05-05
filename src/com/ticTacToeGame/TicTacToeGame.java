package com.ticTacToeGame;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    
    private static  char[] board= new char[10];//declaring the userInput variable
    static Scanner sc = new Scanner(System.in);
    private static char computer;
    private static char user;
    private static boolean isUserPlay;
    private static int indexNumberUser, indexCount;
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
        System.out.println("| " + board[1] + "  | " + board[2] + "  | " + board[3] + "  |");
        System.out.println("-------------------");
        System.out.println("| " + board[4] + "  | " + board[5] + "  | " + board[6] + "  |");
        System.out.println("-------------------");
        System.out.println("| " + board[7] + "  | " + board[8] + "  | " + board[9] + "  |");
        System.out.println("-------------------");
    }
    public static void makeMove(){
        if (indexCount == 9){
            System.out.println("played all turns");
            System.exit(0);
        }
        else {
            if (isUserPlay) {
                System.out.println("Enter the position between 1-9 number where you want to play");
                indexNumberUser = sc.nextInt();
                if (board[indexNumberUser] == ' ') {
                    board[indexNumberUser] = user;
                    isUserPlay = false;
                    indexCount++;
                } else {
                    System.out.println("This index is already used");
                }
            } else {
                Random randomNum = new Random();
                int indexNumberComputer = randomNum.nextInt(9);
                if (board[indexNumberComputer] == ' ') {
                    board[indexNumberComputer] = computer;
                    isUserPlay = true;
                    indexCount++;
                } else {
                    System.out.println("This index is already used");
                }
            }
        }
    }
    public static void tossCoin(){
        System.out.println("Select 0 for head or 1 for tails to see who play first");
        int userSelection = sc.nextInt();
        Random randomNum = new Random();
        int coinToss = randomNum.nextInt(2);
        if (userSelection == coinToss){
            System.out.println("user will play first");
            isUserPlay = true;
        }
        else {
            System.out.println("computer will play first");
            isUserPlay = false;
        }
    }
    public static void winnerOrTie(){
        if (board[1] == 'x' && board[2] == 'x' && board[3] == 'x' ||
                board[4] == 'x' && board[5] == 'x' && board[6] == 'x' ||
                board[7] == 'x' && board[8] == 'x' && board[9] == 'x' ||
                board[1] == 'x' && board[4] == 'x' && board[7] == 'x' ||
                board[2] == 'x' && board[5] == 'x' && board[8] == 'x' ||
                board[3] == 'x' && board[6] == 'x' && board[9] == 'x' ||
                board[1] == 'x' && board[5] == 'x' && board[9] == 'x' ||
                board[3] == 'x' && board[5] == 'x' && board[7] == 'x'){
            if (user == 'x'){
                System.out.println("Congrats you win the match.........");
                System.exit(0);
            }
            else {
                System.out.println("Computer wins the match..........");
                System.exit(0);
            }

        }else if(board[1] == 'o' && board[2] == 'o' && board[3] == 'o' ||
                board[4] == 'o' && board[5] == 'o' && board[6] == 'o' ||
                board[7] == 'o' && board[8] == 'o' && board[9] == 'o' ||
                board[1] == 'o' && board[4] == 'o' && board[7] == 'o' ||
                board[2] == 'o' && board[5] == 'o' && board[8] == 'o' ||
                board[3] == 'o' && board[6] == 'o' && board[9] == 'o' ||
                board[1] == 'o' && board[5] == 'o' && board[9] == 'o' ||
                board[3] == 'o' && board[5] == 'o' && board[7] == 'o'){
            if (user == 'o'){
                System.out.println("Congrats you win the match.........");
                System.exit(0);
            }
            else{
                System.out.println("Computer wins the match..........");
                System.exit(0);
        }
        }else if(indexCount == 9){
            System.out.println("match is tie");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to tic toe game");
        createBoard(); //calling the createBoard method
        chooseSymbol(); //calling the allowPlayer method
        showBoard();
        tossCoin();
        while (indexCount <9) {
            makeMove();
            showBoard();
            winnerOrTie();
            System.out.println("--------------------------------------------------------");
        }

    }
}
