//View Class
public class View {

    //print board to console
    public static void printBoard(String[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
        dashLine();
    }

    //print dashed line
    public static void dashLine(){
        System.out.println("\n-------------------------------------------------------------------------------");
    }


    //print statements throughout program
    public static void printWelcome() {
        System.out.println("\n* * * * * * Welcome to the Game of Life Simulation * * * * * *");
    }
    public static void genPrompt(){
        System.out.println("How many generations do you want produced from the original?");
    }
    public static void intErrorMsg(){
        System.out.println("Please type in an integer: ");
    }

    public static void startPrompt(){
        System.out.println("Type 'start' to begin the simulation: ");
    }

    public static void startErrorMsg(){
        System.out.println("Must type 'start'");
    }

    public static void initialBoardMsg(){
        System.out.println("Initial Generation");
    }
    public static void endPrompt(){
        System.out.println("Type 'end' to exit");
    }
    public static void endErrorMsg(){
        System.out.println("Must type 'end'");
    }
    public static void goodbyeMsg(){
        System.out.println("Goodbye!");
    }
}

