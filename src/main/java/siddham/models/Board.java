package siddham.models;
import java.util.List;
import java.util.ArrayList;
public class Board {
    int size;
    List<List<Cell>> board;

    public Board(int size){
        this.size = size;
        board = new ArrayList<List<Cell>>();
        for(int i = 0; i < size; i++){
            List<Cell> row = new ArrayList<Cell>();
            for(int j = 0; j < size; j++){
                row.add(new Cell(i, j));
            }
            board.add(row);
        }
    }
}
