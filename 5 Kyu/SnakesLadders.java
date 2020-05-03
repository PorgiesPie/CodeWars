import java.util.HashMap;

public class SnakesLadders {
    public SnakesLadders() {}
    Player playerOne = new Player();
    Player playerTwo = new Player();
    Player currentPlayer = playerOne;
    int goal = 100;
    boolean finished;
    private HashMap<Integer, Integer> SnakesAndLadders = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        SnakesLadders game = new SnakesLadders();
        game.play(1,1);
        game.play(1,5);
        game.play(6,2);
        game.play(1,1);
    }

    public String play(int die1, int die2) {
        initiateBoard();
        currentPlayer.rollDice(die1, die2);
        if (currentPlayer.getScore() > 100) {
            int excess = currentPlayer.getScore() - 100;
            int newPosition = goal - excess;
            currentPlayer.setScore(newPosition);
        }
        checkForSnakeOrLadder(currentPlayer.getScore());
        String position = currentPlayer.position();
        if (currentPlayer.getScore() == goal) {
            finished = true;
            return currentPlayer.winningMessage();
        }
        changePlayer(die1, die2);
        if (finished){
            return "Game over!";
        }
        return position;
    }
    
    public void checkForSnakeOrLadder(int score) {
        for (Integer key : SnakesAndLadders.keySet()) {
            if (score == key){
                currentPlayer.setScore(SnakesAndLadders.get(key));
            }
        }
    }

    public void changePlayer(int die1, int die2){
        if (die1 != die2 && currentPlayer == playerOne){
            currentPlayer = playerTwo;
        } else if (die1 != die2 && currentPlayer == playerTwo){
            currentPlayer = playerOne;
        }
    }


    private void initiateBoard() {
        playerOne.setName("Player 1");
        playerTwo.setName("Player 2");

        SnakesAndLadders.put(2,38);
        SnakesAndLadders.put(7,14);
        SnakesAndLadders.put(8,31);
        SnakesAndLadders.put(15,26);
        SnakesAndLadders.put(21,42);
        SnakesAndLadders.put(28,84);
        SnakesAndLadders.put(36,44);
        SnakesAndLadders.put(51,67);
        SnakesAndLadders.put(71,91);
        SnakesAndLadders.put(78,98);
        SnakesAndLadders.put(87,94);
        SnakesAndLadders.put(16,6);
        SnakesAndLadders.put(46,25);
        SnakesAndLadders.put(49,11);
        SnakesAndLadders.put(62,19);
        SnakesAndLadders.put(64,60);
        SnakesAndLadders.put(74,53);
        SnakesAndLadders.put(89,68);
        SnakesAndLadders.put(92,88);
        SnakesAndLadders.put(95,75);
        SnakesAndLadders.put(99,80);
    }
}

class Player{
    int score = 0;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void rollDice(int die1, int die2){
        setScore(score + (die1 + die2));
    }

    public String position() {
        return name + " is on square " + String.valueOf(score);
    }
    
    public String winningMessage() {
        return name + " Wins!";
    }
}
