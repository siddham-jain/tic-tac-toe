package siddham.models;
import java.util.ArrayList;
import java.util.List;
public class Game {
    Board board;
    List<Player> players;
    Player winner;

    Move nextPLayerMove;
    List<Move> moves;
    GameState state;

    public Game(int size, List<Player> players){
        this.board = new Board(size);
        this.players = players;
        this.state = GameState.InProgress;
        this.moves = new ArrayList<Move>();
    }

    public enum GameState{
        InProgress, Draw, Finished;
    }


}