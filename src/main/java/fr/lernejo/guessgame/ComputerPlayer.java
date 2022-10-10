package fr.lernejo.guessgame;

public class ComputerPlayer implements Player {

    long guessNumber = 0;
    long min=Long.MIN_VALUE;
    long max= Long.MAX_VALUE;
    @Override
    public long askNextGuess() {
        System.out.println("le nombre devine est :"+guessNumber);
        return this.guessNumber;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

        if (lowerOrGreater == false) { //plus grand
            //System.out.println("le nombre devine est plus grand que le nombre a deviner");
            this.min = this.guessNumber ;
            this.guessNumber = this.min + ((this.max - this.min)/2 );
        }else {
            //System.out.println("le nombre devine est plus petit que le nombre a deviner");
            this.max = this.guessNumber ;
            this.guessNumber = this.max - ((this.max - this.min)/2 ) ;
        }

    }
}
