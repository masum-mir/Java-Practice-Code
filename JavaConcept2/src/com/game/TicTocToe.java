package com.game;

import java.util.Arrays;
import java.util.Scanner;

class TicToc {
	private static final char EMPTY_BOX = ' ';
	private static final char PLAYER_ONES_SYMBOL = 'X';
	private static final char PLAYER_TWOS_SYMBOL = 'O';

	private final char[][] gameBoard = new char[3][3];
	
	private final Scanner input = new Scanner(System.in);

	private String playerOne;
	private String playerTwo;
	
	private String currentPlayer;
	private String whoWonTheGame;
	
	public void startGame() {
		initizeBoard();
		askForUserNames();
		
		while(isGameNotOver()) {
			drawBoard();
			printPlayerTurn();
			askForManeuver();
		}
		printGameOver();
	}
	
	private void initizeBoard() {
		
		for(char[] chars: gameBoard) {
			Arrays.fill(chars, EMPTY_BOX);
		}
		
	}
	
	private void askForUserNames() {
		System.out.println("Welcome to Tic Tac Toe!");
		System.out.println("What's your name? ");
		playerOne = input.nextLine();
		
		System.out.println("Who are the playing with?");
		playerTwo = input.nextLine();
		
		System.out.println("Who is playing first? press" + "\n1 For "+ playerOne +"\n2 For "+playerTwo);
	}

	private boolean isGameNotOver() {
	
		return !(isBoardIsFull() || hasAnyPlayerOwn());
	}
	
	private void drawBoard() {
		System.out.println("|---|---|---|");
		for(char[] chars: gameBoard) {
			System.out.printf("| %c | %c | %c | %n", chars[0], chars[1], chars[2]);
			System.out.println("|---|---|---|");
		}
	}
	
	private void printPlayerTurn() {
		System.out.println(whoIsPlaying() + "'s turn'");
	}
	private void askForManeuver() {
		int row, col;
		
		do {
			System.out.println("Enter a row number (0, 1, or 2): ");
			row = input.nextInt();
			System.out.println("Enter a col number (0, 1, or 2): ");
			col = input.nextInt();
		} while(!validateInput(row,col));
		
		
		
	}
	
	private void printGameOver() {
		
	}
private boolean isBoardIsFull() {
	
	return false;
}

private boolean hasAnyPlayerOwn() {
	
	return false;
}

private boolean whoIsPlaying() {
	
	return false;
}

private boolean validateInput(int row, int col) {
	
	return false;
}

}


public class TicTocToe {

	public static void main(String[] args) {
		TicToc game = new TicToc();
		game.startGame();
	}
}
