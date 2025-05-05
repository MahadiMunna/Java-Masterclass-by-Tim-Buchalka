public class MethodParameters{

    public static void main(String[] args){
        boolean gameOver = false;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;

        gameOver = calculateScore(gameOver, score, levelCompleted, bonus );

        if (gameOver){
            System.out.println("The  game is over!");
        }
        else{
            System.out.println("The game is still on!");
        }
    }
    public static boolean calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = (levelCompleted*bonus)+score;
        if (finalScore < 1000){
            gameOver = true;
        }

        return gameOver;
    }
} 
