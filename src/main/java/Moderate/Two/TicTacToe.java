package Moderate.Two;

public class TicTacToe {

    private int[][] game;

    public TicTacToe(int[][] game) {
        this.game = game;
    }

    public boolean isXWin() {
        return navigate(1);
    }

    private boolean navigate(int winingRule) {
        boolean isWinning = false;
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                int currentLocation = game[i][j];
                if (currentLocation == winingRule) {
                    if (isWin(i, j)) {
                        isWinning = true;
                        break;
                    }
                }
            }
        }
        return isWinning;
    }

    private boolean isWin(int i, int j) {
        return (i + 2 < game.length && isXWin(i, j, 0)) || (j + 2 < game[i].length && isYWin(i, j, 0)) || ((i + 2 < game.length && j + 2 < game[i].length) && isDWin(i, j, 0));
    }

    private boolean isXWin(int i, int j, int matches) {
        return matches == 2 || i < game.length && isXWin(i + 1, j, game[i][j] + matches);
    }

    private boolean isYWin(int i, int j, int matches) {
        return matches == 2 || j < game[i].length && isYWin(i, j + 1, game[i][j] + matches);
    }

    private boolean isDWin(int i, int j, int matches) {
        return matches == 2 || !(i >= game.length || j >= game[i].length) && isDWin(i + 1, j + 1, game[i][j] + matches);
    }

    public boolean isOWin() {
        return navigate(0);
    }
}
