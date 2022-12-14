package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;


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

    public void loopUntilPlayerSucceed(long iterations) {
        //TODO implement me

        int i=0 ;
        long timestampStart = System.currentTimeMillis();
        boolean succeed = false;
        while (!succeed && i <=iterations)
        {
            succeed = this.nextRound();
            i += 1 ;
        }

        long timestampEnd = System.currentTimeMillis();
        int duration = (int) (timestampEnd-timestampStart);
        int minutes =  duration/60000;
        int seconds = (duration - minutes*60000) /1000 ;
        int milliSec = (duration - minutes*60000 - seconds*1000);

        if (succeed)
            this.logger.log("bravo vous avez reussi !!! en "+ i + " iterations");
        else
            this.logger.log("Desole vous n'avez pas reussi !!!!");
        this.logger.log("La partie a mise: "+ minutes +"min: "+seconds+"." +milliSec+"s");
    }
}
