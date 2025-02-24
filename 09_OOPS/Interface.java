public class Interface {
    
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}


interface ChessPlayer {
    void moves();
}


class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 direction)");
    }
}


class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right)");
    }
}


class king implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (by one step)");
    }
}


// Multiple inheritance

interface Herbivore {

}

interface Carnivore {

}


class Bear implements Herbivore, Carnivore { // Both

}