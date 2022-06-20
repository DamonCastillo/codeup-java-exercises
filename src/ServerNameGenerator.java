import java.util.ArrayList;
import java.util.Random;

public class ServerNameGenerator {


    public static String randomAdj() {

        ArrayList<String> adj = new ArrayList<String>();
        adj.add("adorable");
        adj.add("annoying");
        adj.add("poopy");
        adj.add("awful");
        adj.add("better");
        adj.add("bloody");
        adj.add("clean");
        adj.add("dirty");
        adj.add("blushing");
        adj.add("cloudy");

        String randAdj = adj.get(new Random().nextInt(adj.size()));
        return randAdj;
    }

    public static String randomNoun() {
        ArrayList<String> noun = new ArrayList<String>();
        noun.add("fist");
        noun.add("foot");
        noun.add("knee");
        noun.add("elbow");
        noun.add("neck");
        noun.add("cheek");
        noun.add("dog");
        noun.add("cat");
        noun.add("bird");
        noun.add("cup");

        String randNoun = noun.get(new Random().nextInt(noun.size()));
        return randNoun;
    }


    public static void main(String[] args) {
        System.out.println("Here is your server name: " + randomAdj() + "-" + randomNoun());

    }
}
