public class Interfaces {
    public static void main(String[] args) {
       Queen q = new Queen();
       q.moves(); 
        
    }
}
interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queen moves");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Hooks moves");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("King Moves");
    }
}