package model;

// import java.util.Scanner;


public class Board {

	public static void main(String[] args) {

		char[] coluna = new char[8];
		int[] linha = new int[8];

		// Scanner entrada = new Scanner(System.in);
		System.out.printf("%2s%s\n%2s%s\n", "", "ChessBoard 8 x 8", "", "---");

		for (int j = 97; j <= 104; j++) {

			for (int i = 0; i <= 7; i++) {

				linha[i] = i + 1;

			}

			// System.out.printf("Insira o elemento M[%d][%d]: ", linha + 1, coluna + 1);
			coluna[j - 97] = (char) (j);

		}

		for (int j = 7; j >= 0; j--) {

			for (int i = 0 ; i <= 7; i++) {

				System.out.printf("%3c%d", coluna[i], linha[j]);

			}

			System.out.println();

		}

	}

}