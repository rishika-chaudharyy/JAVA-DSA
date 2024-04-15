//Write a program to create interface , classes and objects

public class Interface {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessGamePlayers { // abstract no implementation
    void moves();// method is by default public and abstract
}

class Queen implements ChessGamePlayers {
    public void moves() { // method should be public
        System.out.println("up,down.left,right,diagonal in all 4 directions");
    }
}

class King implements ChessGamePlayers {
    public void moves() {
        System.out.println("up,down.left,right");
    }
}