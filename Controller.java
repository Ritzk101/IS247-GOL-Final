//Controller Class
import java.util.Scanner;

public class Controller {

    //ask for number of generations to produce
    static int genRequest = 1;
    public static void userGenerationRequest() {
        View.printWelcome();
        View.genPrompt();
        while (genRequest > 0) {
            Scanner genGet = new Scanner(System.in);
            if (genGet.hasNextInt()) {
                genRequest = genGet.nextInt();
                break;
            }

            else {
                View.intErrorMsg();
            }

        }

    }
    public static int getGenRequest(){
        return genRequest;
    }


    //start game

    public static boolean startGame(boolean startSim){
        String wordStart = "start";

        View.startPrompt();

        Scanner getStart = new Scanner(System.in);
        String start = getStart.next().toLowerCase();



        while (!start.equals("start")) {

            View.startErrorMsg();
            start = getStart.next().toLowerCase();

            if (start.equals("start")){
                startSim = true;
            }
        }

        return startSim;
    }

    //ask user to end program
    public static void endProgram(boolean endGOL){
        String wordEnd = "end";

        View.endPrompt();

        Scanner getNextInstruction = new Scanner(System.in);
        String nextIntruc = getNextInstruction.next().toLowerCase();



        while (!nextIntruc.equals("end")) {

            View.endErrorMsg();
            nextIntruc = getNextInstruction.next().toLowerCase();

            if (nextIntruc.equals("end")){
                View.goodbyeMsg();
                System.exit(0);
            }

        }

    }

}


