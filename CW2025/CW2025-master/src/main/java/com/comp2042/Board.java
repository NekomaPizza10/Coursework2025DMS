package com.comp2042;

public interface Board {

    boolean moveBrickDown();

    boolean moveBrickLeft();

    boolean moveBrickRight();

    boolean rotateLeftBrick();

    boolean createNewBrick();

    int[][] getBoardMatrix();

    ViewData getViewData();

    void mergeBrickToBackground();

    ClearRow clearRows();

    Score getScore();

    void newGame();

    //HOLD and NEXT queue
    boolean holdCurrentBrick();

    int[][] getHoldBrickData();

    List<int[][]> getNextBricksData(int count);

    int getPiecesPlaced();

    int getLinesCleared();
}
