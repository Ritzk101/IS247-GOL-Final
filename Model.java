//Model Class
public class Model {


    //get values for next generation
    public static String[][] getNextGen(String[][] currentGeneration) {
        int rows = currentGeneration.length;
        int cols = currentGeneration[0].length;


        //store current gen values
        String[][] nextGeneration = new String[rows][cols];


        //check grid values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //count living neighbors
                int liveNeighbors = countLiveNeighbors(currentGeneration, i, j);


                if (currentGeneration[i][j].equals("*")) {
                    //alive
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        //output dead cell
                        nextGeneration[i][j] = " ";
                    } else {
                        //output live cell
                        nextGeneration[i][j] = "*";
                    }
                } else {
                    //dead
                    if (liveNeighbors == 3) {
                        //output live cell
                        nextGeneration[i][j] = "*";
                    } else {
                        //output dead cell
                        nextGeneration[i][j] = " ";
                    }
                }
            }
        }


        return nextGeneration;
    }


    //count living neighbors
    public static int countLiveNeighbors(String[][] grid, int row, int col) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        //check values of nearby cells
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int neighborRow = row + i;
                int neighborCol = col + j;

                if (i == 0 && j == 0) {
                    continue;
                }


                //check for boundaries
                if (neighborRow >= 0 && neighborRow < rows && neighborCol >= 0 && neighborCol < cols) {
                    if (grid[neighborRow][neighborCol].equals("*")) {
                        count++;
                    }
                }
            }
        }


        return count;
    }
}
