package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {

    public static void main(String[] args) {

        HumanPlayer humanPlayer = new HumanPlayer();
        Simulation simulation = new Simulation(humanPlayer);
        SecureRandom random = new SecureRandom();
        // long randomNumber = random.nextLong(); // génère un nombre entre Long.MIN_VALUE et Long.MAX_VALUE
        long randomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)
    }
}
