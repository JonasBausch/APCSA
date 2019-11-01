import java.util.Scanner;

class Pokemon {

    public static void main() {
        startBattle();
    }

    /**
     * Initializes the scanner and starts the battle
     * <p>
     * Note: method names should allows follow a "verb-object" structure
     */
    private static void startBattle() {
        String challenger = issueChallenge();
        String pokemon = choosePokemon();
        System.out.println("It's a Pokémon battle between " + challenger + " and " + pokemon + "! Go!");
    }

    private static String issueChallenge() {
        System.out.println("Another trainer is issuing a challenge!");
        String challenger = "Zebstrika";
        System.out.println(challenger + " appeared.");
        return challenger;
    }

    private static String choosePokemon() {
        System.out.println("Which Pokémon do you choose?");
        Scanner scanner = new Scanner((System.in));
        String chosenPokemon = scanner.nextLine();
        scanner.close();
        System.out.println("You chose " + chosenPokemon);
        return chosenPokemon;
    }

}
