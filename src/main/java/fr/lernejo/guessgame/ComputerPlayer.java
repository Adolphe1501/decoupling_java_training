package fr.lernejo.guessgame;



public class ComputerPlayer implements Player {

    long guessNumber = 0;
    long min=Long.MIN_VALUE;
    long max= Long.MAX_VALUE;
    @Override
    public long askNextGuess() {
        return this.guessNumber;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

        if (lowerOrGreater == false) { //plus grand
            this.min = this.guessNumber ;
            this.guessNumber = this.min + ((this.max - this.min)/2 );
        }else {
            this.max = this.guessNumber ;
            this.guessNumber = this.max - ((this.max - this.min)/2 ) ;
        }

    }
}
