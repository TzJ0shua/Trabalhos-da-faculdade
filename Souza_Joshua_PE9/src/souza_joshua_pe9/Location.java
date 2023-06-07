
package souza_joshua_pe9;


public class Location {

        public int row;
        public int column;
        public double maxValue;

        public Location(int row, int column, double maxValue) {
            this.row = row;
            this.column = column;
            this.maxValue = maxValue;
        }
        
           public static Location locateLargest(double[][] m) {
        int row = 0;
        int column = 0;
        double maxValue = m[row][column];

        //Makes that the largest value equals maxVAlue. 
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (maxValue < m[i][j]) {
                    maxValue = m[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        return new Location(row, column, maxValue);
   }
}


