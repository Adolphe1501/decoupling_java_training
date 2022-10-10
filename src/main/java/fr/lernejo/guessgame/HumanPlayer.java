package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;

public class HumanPlayer implements Player {

    private final Logger logger = LoggerFactory.getLogger("player");
    private final Scanner clavier = new Scanner(System.in);
    @Override
    public long askNextGuess() {

        System.out.println("veuillez entrer un nombre ...\n");

        long number = this.clavier.nextLong();
        return number;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

        if (lowerOrGreater)
        {
            this.logger.log("le nombre a deviner est plus grand \n");
        }else {
            this.logger.log("le nombre a deviner est plus petit \n");

        }
    }
}
