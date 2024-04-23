package siddham.models;

public class Cell {
     int row;
     int col;
     Player player;
     CellState state;
     public enum CellState{
         Empty, Filled, Blocked;
     }

     public Cell(int row, int col){
         this.row = row;
         this.col = col;
         this.state = CellState.Empty;
     }
}
