package com.ticTacToeGame;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    
    private static  char[] board= new char[10];//declaring the userInput variable
    static Scanner sc = new Scanner(System.in);
    private static char computer;
    private static char user;
    private static boolean isUserPlay,played = true;
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
                    availableCorner();
                } else {
                    System.out.println("This index is already used user");
                }
            } else {
                if (played) {
                    checkOpponentCanWin();
                }else{
                    Random randomNum = new Random();
                    int indexNumberComputer = randomNum.nextInt(9);
                    if (board[indexNumberComputer] == ' ') {
                        board[indexNumberComputer] = computer;
                        played = true;
                        isUserPlay = true;
                        indexCount++;
                    } else {
                        System.out.println("This index is already used computer");
                    }
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
    public static void checkOpponentCanWin(){

        if(board[1] == user && board[2] == user){
            played = false;
            board[3] = computer;
        }
        if (board[2] == user && board[3] == user ){
            played = false;
            board[1] = computer;
        }
        if (board[1] == user && board[3] == user){
            played = false;
            board[2] = computer;
        }
        if(board[4] == user && board[5] == user){
            played = false;
            board[6] = computer;
        }
        if (board[5] == user && board[6] == user ){
            played = false;
            board[4] = computer;
        }
        if (board[4] == user && board[6] == user){
            played = false;
            board[5] = computer;
        }
        if(board[7] == user && board[8] == user){
            played = false;
            board[9] = computer;
        }
        if (board[8] == user && board[9] == user){
            played = false;
            board[7] = computer;
        }
        if(board[7] == user && board[9] == user){
            played = false;
            board[8] = computer;
        }
        if(board[1] == user && board[4] == user){
            played = false;
            board[7] = computer;
        }
        if( board[4] == user && board[7] == user){
            played = false;
            board[1] = computer;
        }
        if(board[1] == user && board[7] == user){
            played = false;
            board[4] = computer;
        }
        if(board[2] == user && board[5] == user){
            played = false;
            board[8] = computer;
        }
        if(board[5] == user && board[8] == user){
            played = false;
            board[2] = computer;
        }
        if(board[2] == user && board[8] == user){
            played = false;
            board[5] = computer;
        }
        if(board[3] == user && board[6] == user){
            played = false;
            board[9] = computer;
        }
        if (board[6] == user && board[9] == user){
            played = false;
            board[3] = computer;
        }
        if(board[3] == user && board[9] == user){
            played = false;
            board[6] = computer;
        }
        if(board[1] == user && board[5] == user){
            played = false;
            board[9] = computer;
        }
        if(board[5] == user && board[9] == user){
            played = false;
            board[1] = computer;
        }
        if(board[1] == user && board[9] == user){
            played = false;
            board[5] = computer;
        }
        if(board[3] == user && board[5] == user){
            played = false;
            board[7] = computer;
        }
        if(board[5] == user && board[7] == user){
            played = false;
            board[3] = computer;
        }
        if(board[3] == user && board[7] == user){
            played =  false;
            board[5] = computer;
        }
        if(played) {
            played = false;
            makeMove();
        }
    }

    public static void availableCorner() {
        if (indexCount >= 3) {
            if (board[1] == ' ') {
                System.out.println("select 1st position+++++++++++++++++++++");
            } else if (board[3] == ' ') {
                System.out.println("select 3rd position+++++++++++++++++++++++");
            } else if (board[7] == ' ') {
                System.out.println("select 7th position++++++++++++++++++++++++");
            } else if (board[9] == ' ') {
                System.out.println("select 9th position+++++++++++++++++++++++");
            }
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
