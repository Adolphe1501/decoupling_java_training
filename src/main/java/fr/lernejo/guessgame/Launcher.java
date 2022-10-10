package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        // long randomNumber = random.nextLong(); // génère un nombre entre Long.MIN_VALUE et Long.MAX_VALUE
        long randomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)

        if(args.length > 0)
        {
            if( args[0].equals("-interactive"))
            {
                HumanPlayer humanPlayer = new HumanPlayer();
                Simulation simulation = new Simulation(humanPlayer);
                simulation.initialize(randomNumber);
                simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);
            } else if (args[0].equals("-auto")) {
                ComputerPlayer computerPlayer = new ComputerPlayer();

                if(args.length>1)
                {
                    try {
                        Simulation simulation = new Simulation(computerPlayer);
                        simulation.initialize(Integer.parseInt(args[1]));
                        simulation.loopUntilPlayerSucceed(1000);
                    }catch (NumberFormatException e){
                        System.out.println(" En mode -auto vous devez renseigner comme second parametre le nombre a deviner\n");
                    }
                }
            }
        }else {
            System.out.println(" Veuillez passer le mode de lancement en argument ...\n --> soit le mode -interactive \n --> soit le mode -auto [numberToGuess]\n");
        }
        ;

    }
}
