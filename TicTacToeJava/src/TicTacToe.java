import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
	
	
	public static void main(String[] args) {
		
		char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
				            {'-', '+', '-', '+', '-'},
							{' ', '|', ' ', '|', ' '},
							{'-', '+', '-', '+', '-'},
							{' ', '|', ' ', '|', ' '}};
		
		
		Scanner input = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("Enter your placements (1-9: ");
			int playerPosition = input.nextInt();
			while(playerPositions.contains(playerPosition) || cpuPositions.contains(playerPosition)) {
				System.out.println("Position taken, enter a correct position");
				playerPosition = input.nextInt();
			}
			
			//System.out.println(position);
			
			placeThePiece(gameBoard, playerPosition, "player");
			
			String result = checkWinner();	
			if(result.length() > 0) {
				System.out.println(result);
				break;
			}
			 
			Random rand = new Random();
			int cpuPosition = rand.nextInt(9) + 1;
			
			while(playerPositions.contains(cpuPosition) || cpuPositions.contains(cpuPosition)) {
				//System.out.println("Position taken, enter a correct position");
				cpuPosition = rand.nextInt(9) + 1;
			}
			
			placeThePiece(gameBoard, cpuPosition, "cpu");
			
			
			printGameBoard(gameBoard);
			result = checkWinner();
			if(result.length() > 0) {
				System.out.println(result);
				break;
			}
			System.out.println(result);
			
			
			
		}
		
		
	}
		
		
	public static void printGameBoard(char[][] gameBoard) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(gameBoard[i][j]);
			}
			System.out.println();
		
		}
	}
	
	public static void placeThePiece(char [][] gameBoard, int position, String user) {
		
		char symbol = ' ';
		
		if (user.equals("player")) {
			symbol = 'X';
			playerPositions.add(position);
		} else if(user.equals("cpu")) {
			symbol = 'O';
			cpuPositions.add(position);
		}
		
		switch(position) {
		
			case 1:
				gameBoard[0][0] = symbol;
				break;
			case 2:
				gameBoard[0][2] = symbol;
				break;
			case 3:
				gameBoard[0][4] = symbol;
				break;
			case 4:
				gameBoard[2][0] = symbol;
				break;
			case 5:
				gameBoard[2][2] = symbol;
				break;
			case 6:
				gameBoard[2][4] = symbol;
				break;
			case 7:
				gameBoard[4][0] = symbol;
				break;
			case 8:
				gameBoard[4][2] = symbol;
				break;
			case 9:
				gameBoard[4][4] = symbol;
				break;
			default:
				break;
			
		}	
		
	}
	
	public static String checkWinner() {
		
		List topRow = Arrays.asList(1, 2, 3);
		List middleRow = Arrays.asList(4, 5, 6);
		List bottomRow = Arrays.asList(7, 8, 9);
		List leftColumn = Arrays.asList(1, 4, 7);
		List middleColumn = Arrays.asList(2, 5, 8);
		List rightColumn = Arrays.asList(3, 6, 9);
		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 = Arrays.asList(7, 5, 3);
		
		List<List> winningConditions = new ArrayList<List>();
		winningConditions.add(topRow);
		winningConditions.add(middleRow);
		winningConditions.add(bottomRow);
		winningConditions.add(leftColumn);
		winningConditions.add(middleColumn);
		winningConditions.add(rightColumn);
		winningConditions.add(cross1);
		winningConditions.add(cross2);
		
		for (List l : winningConditions) {
			
			if(playerPositions.containsAll(l)) {
				return "Congratulations you won!";
			} else if (cpuPositions.containsAll(l)) {
				return "CPU Wins! Better luck next time! :)";
			} else if(playerPositions.size() + cpuPositions.size() == 9) {
				return "Draw";
			}
			
			
			
		}
		
		
		
		
		
		return "";
	}
	
	
	
}


