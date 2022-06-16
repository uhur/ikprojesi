import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
	int rowNumber, colNumber;
	int[][] map;
	int[][] board;
	boolean game = true;

	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	private int size;

	MayinTarlasi(int rowNumber, int colNumber) {
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.map = new int[rowNumber][colNumber];
		this.board = new int[rowNumber][colNumber];
		this.size = rowNumber * colNumber;

	}

	public void run() {
		int row, col;
		prepareGame();
		print(map);
		System.out.println("Row :");
		while (game) {
			print(board);
			System.out.print("satýr :");
			row = scan.nextInt();
			System.out.print("sütün :");
			col = scan.nextInt();
			if (map[row][col] != -1) {
				check(col, row);
			} else {
				game = false;
				System.out.println(" game over");
			}

			break;
		}
	}

	public void check(int r, int c) {

		if (map[r][c + 1] == -1) {
			board[r][c + 1]++;
		}
		if (map[r + 1][c] == -1) {
			board[r + 1][c]++;
		}
		if (map[r - 1][c] == -1) {
			board[r - 1][c]++;
		}
		if (map[r][c - 1] == -1) {
			board[r][c - 1]++;
		}
	}

	public void prepareGame() {
		int randRow, randCol, count = 0;
		int size = 4;
		while (count != (size / 4)) {
			randRow = rand.nextInt(rowNumber);
			randCol = rand.nextInt(colNumber);
			int randCol1 = rand.nextInt(colNumber);
			if (map[randRow][randCol1] != -1) {
				map[randRow][randCol1] = -1;
				count++;
			}

		}
	}

	public void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int J = 0; J < arr[0].length; J++) {
				if (arr[i][J] >= 0)
					;
				System.out.println(arr[i][J] + " ");

				System.out.println();
			}
		}
	}
}
