package week4.minesweeper;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author JOSEPH
 * Mine Sweeper Game
 */

public class MineSweeper {
    String[][] gameBoard;
    private final int width;
    private final int height;
    private final int numberOfMines;

    private int row;
    private int col;

    public MineSweeper(int width, int height) {
        this.width = height;
        this.height = width;
        this.numberOfMines = width * height / 4;

        fillGameBoard();

    }

    public void printGameBoard(boolean finished) {
        System.out.print("\n==================\n");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {

                if (!finished)
                    System.out.print((Objects.equals(gameBoard[i][j], "*") ? "-" : gameBoard[i][j]) + "\t");
                else
                    System.out.print(gameBoard[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.print("=================\n");
    }

    public int checkNeighbourCells(int i, int j) {
        int counter = 0;

        int rowStart = Math.max(i - 1, 0);
        int rowFinish = Math.min(i + 1, width - 1);
        int colStart = Math.max(j - 1, 0);
        int colFinish = Math.min(j + 1, height - 1);

        for (int row = rowStart; row <= rowFinish; row++) {
            for (int col = colStart; col <= colFinish; col++) {
                if (gameBoard[row][col].equals("*"))
                    counter++;
            }
        }

        return counter;

    }

    private void fillGameBoard() {
        gameBoard = new String[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                gameBoard[i][j] = "-";
            }
        }

        int m, n;

        for (int i = 0; i < numberOfMines; i++) {

            m = ThreadLocalRandom.current().nextInt(width);
            n = ThreadLocalRandom.current().nextInt(height);

            while (true) { // make sure no more than one mine is placed in the same place

                if (gameBoard[m][n].equals("*")) {
                    m = ThreadLocalRandom.current().nextInt(width);
                    n = ThreadLocalRandom.current().nextInt(height);
                } else {
                    gameBoard[m][n] = "*";
                    break;
                }

            }

        }
    }

    public boolean isGameOver() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {

                if (gameBoard[i][j].equals("-"))
                    return false;
            }
        }
        return true;
    }

    private boolean getCoordinates() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Row: ");
            row = scanner.nextInt();

            System.out.print("Column: ");
            col = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch");
            return false;
        }

        if (row < 0 || row > width || col < 0 || col > height) {
            System.out.println("Index out of range");
            return false;
        }

        return true;
    }

    private void play() {

        System.out.println("Welcome To Mine Sweeper!");

        while (true) {
            printGameBoard(false);

            if (!getCoordinates())
                continue;

            if (gameBoard[row][col].equals("*")) {
                System.out.println("You stepped on a mine, Game Over!");
                break;
            }

            gameBoard[row][col] = String.valueOf(checkNeighbourCells(row, col));

            if (isGameOver()) {
                System.out.println("Congrats swept all the mines successfully! ");
                break;
            }

        }
        System.out.println("Game Board was like:");
        printGameBoard(true);
    }


    public static void main(String[] args) {
        MineSweeper game = new MineSweeper(4, 3);
        game.play();
    }

}
