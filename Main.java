//Main Class
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Controller.userGenerationRequest();
        if(Controller.startGame(true)){

        String[] cellState = {"*", " "};

        int rows = 20;
        int columns = 20;

        //2D array
        String[][] currentGeneration = new String[rows][columns];

        //randomize values in the array
        for (int i = 0; i < rows; i++) {
            for (int a = 0; a < columns; a++) {
                int randomIndex = (int) (Math.random() * cellState.length);
                currentGeneration[i][a] = cellState[randomIndex];
            }
        }

        //print initial board
        View.dashLine();
        View.initialBoardMsg();
        View.printBoard(currentGeneration);
        Thread.sleep(750);

        int genCount = 0;

        for(int i = 0; i < Controller.getGenRequest(); i++){
            //calculate and print evolved board and genCount
            String[][] nextGeneration = Model.getNextGen(currentGeneration);
            System.out.println("Generation " + (genCount + 1) + ":");
            View.printBoard(nextGeneration);

            //update the current board and genCount
            currentGeneration = nextGeneration;
            genCount++;


            //sleep
            try {
                    Thread.sleep(750);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
        //exit program
        Controller.endProgram(true);
    }
}

