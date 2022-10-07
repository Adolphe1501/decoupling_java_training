package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;


public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        //TODO implement me
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        //TODO implement me
        this.numberToGuess =numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        //TODO implement me

        boolean result = false;
        long number = player.askNextGuess();

        if(number == this.numberToGuess)
        {
            result = true ;
        }else{
            if( number > this.numberToGuess)
            {
                player.respond(false);
            }else{
                player.respond(true);
            }
        }
        return result;
    }

    public void loopUntilPlayerSucceed() {
        boolean succeed = false;
        while (!succeed)
            this.nextRound();
        //TODO implement me
    }
}
