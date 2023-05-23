import java.sql.SQLOutput;
import java.util.Random;

public class ServerNameGenerator {
    static String [] adj ={"Happy", "Beautiful", "Fast", "Tall", "Smart", "Delicious", "Funny", "Bright", "Brave", "Peaceful"};
    static String [] noun = {"Dog","Cat","Car","Book","Tree","Chair","Computer","Flower","Sun","House",};




    public static void main(String[] args) {
        Random random = new Random();

        //Random Adj Generator
        int randomAdjIndex = random.nextInt(adj.length);

        String randomAdj = adj[randomAdjIndex];

        //Random NOUN Generator
        int randomNounIndex = random.nextInt(noun.length);

        String randomNoun = noun[randomNounIndex];
        System.out.println("!WARNING! This server name will only show once.\nYour random server name is: " +randomNoun+ " "+randomAdj);

    }
}