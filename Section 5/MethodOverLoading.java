public class MethodOverLoading{
    public static void main(String[] args) {
        calculateScore("Munna", 50);
        int score = calculateScore(50);
        System.out.println("score: "+score);
    }
    public static void calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score+" points.");
    }
    public static int calculateScore(int score){
        return score*100;
    }
}

//Method overloadding happens when a class has multiple methods with the same name but methods are declared with different parameter
//A method signature consists of name, uniqueness of the declaration of its parameters
//Method signature don't depend on method return type and parameter name