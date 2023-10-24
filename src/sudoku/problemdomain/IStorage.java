package sudoku.problemdomain;

import java.io.IOException;

public interface IStorage {
    void updateGamedata(SudokuGame game) throws IOException;
    SudokuGame getGameData() throws IOException;
}
