import java.util.Random;
import java.util.Scanner;

public class ConsoleAdventureGame {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    public static String playerName;
    public static int playerHP;
    public static int maxHP;
    public static int enemyhp;
    public static int enemyDmg;
    public static int dmg;
    public static int dex;
    public static int splDmg;
    public static String charClass;
    public static String location;
    public static boolean fighting = false;

    public static void stats() {
        if (charClass.equals("sorcerer")) {
            System.out.println(playerName + "\nHP: " + playerHP + "\nSpell DMG: " + splDmg + "\nDex: " + dex + "\n");
        } else {
            System.out.println(playerName + "\nHP: " + playerHP + "\nDmg: " + dmg + "\nDex: " + dex + "\n");
            ;
        }

    }

    public static void legionBuild() {
        charClass = "legion";
        maxHP = 40;
        playerHP = 40;
        dmg = (int) (Math.random() * 8) + 1;
        dex = 2;

    }

    private static void legionEnemy() {
        enemyhp = 40;
        enemyDmg = (int) (Math.random() * 8) + 1;
        dex = 2;
    }


    public static void knight() {
        charClass = "knight";
        maxHP = 35;
        playerHP = 35;
        dmg = (int) (Math.random() * 10) + 1;
        dex = 5;
    }

    private static void knightEnemy() {
        enemyhp = 35;
        enemyDmg = (int) (Math.random() * 10) + 1;
        dex = 5;

    }

    public static void archer() {
        charClass = "archer";
        maxHP = 25;
        playerHP = 25;
        dmg = 10;
        dex = 15;
    }

    private static void enemyArcher() {
        enemyhp = 25;
        enemyDmg = (int) (Math.random() * 10) + 1;
    }

    public static void sorcerer() {
        charClass = "sorcerer";
        maxHP = 15;
        playerHP = 15;
        splDmg = 29;
        dex = 6;
    }

    private static void enemySorc() {
        enemyhp = 15;
        enemyDmg = (int) (Math.random() * 29) + 1;
    }


    private static void enemyAttack() {
        if (dex > 2) {
            System.out.println("Enemy hits!");
            playerHP = playerHP - enemyDmg;
            if (playerHP <= 0) {
                gameover();
                System.exit(0);//game over if player health < 0
            }
        } else {
            System.out.println("Enemy Misses!");
        }
    }

    private static boolean attack() {
        if (dex > 2) {
            System.out.println("You hit!");
            enemyhp = enemyhp - dmg;
            if (enemyhp <= 0) {
                System.out.println("You Won!"); //prints if enemy health < 0
                return false;
            }
        } else {
            System.out.println("You miss!");
        }
        return true;
    }

    private static void gameover() {
        System.out.println(playerName + " Died!");
        System.out.println("GAME OVER!");
        System.exit(0); //terminates if lost
        return;
    }

    public static void campFight() {
        String battle;
        String magicSpell = null;
        legionEnemy();
        fighting = true;
        while (true) {
            System.out.println("press 'a' to attack");
            System.out.println("press 's' to view stats");
            battle = sc.nextLine();
            if (battle.charAt(0) == 'a') {
                fighting = attack();
            }
            enemyAttack();
            if (battle.charAt(0) == 'm') {
                System.out.println("Press 'f' for fireball\nPress 'h' to heal\n");
            }
            magicSpell = sc.nextLine();
            if (magicSpell.charAt(0) == 'f') {
                int k = splDmg;
                System.out.println("You hit for " + k + " damage!");
                enemyhp = enemyhp - k;
                if (enemyhp <= 0) {
                    System.out.println("You Won!");


                }
            }
        }
    }

    public static void main(String[] args) {
        String charClass;
        System.out.println("What is your class?");
        System.out.println("press 'a' for Legion \npress 'b' for the Knight\npress 'c' for Archer\npress 'd' for Sorcerer \n");
        charClass = sc.nextLine();
        while (charClass.charAt(0) != 'a' && charClass.charAt(0) != 'b' && charClass.charAt(0) != 'c' && charClass.charAt(0) != 'd') {
            System.out.println("'a' for Legion");
            System.out.println("'b' for Knight");
            System.out.println("'c' for Archer");
            System.out.println("'d' for Sorcerer");
            charClass = sc.nextLine();
        }
        if (charClass.charAt(0) == 'a') {
            legionBuild();
        }
        if (charClass.charAt(0) == 'b') {
            knight();
        }
        if (charClass.charAt(0) == 'c') {
            archer();
        }
        if (charClass.charAt(0) == 'd') {
            sorcerer();
        }

        System.out.println("What is your Name? ");
        playerName = sc.nextLine();
        System.out.printf("Great! %s, Goodluck on your Journey!!", playerName);
        System.out.println();
        System.out.println("You have arrived at crossroad with paths that lead to four locations");
        System.out.println("Choose your path...\n'1' for War Camp\n'2' for near village\n'3' for woods\n'4' for strange light\n ");
        location = sc.nextLine();
        if (location.charAt(0)== 1){
            campFight();
        }

    }
}
