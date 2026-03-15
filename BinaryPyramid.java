public class BinaryPyramid {
  public static void main(String[] args){
    
    // Total number of rows in our pyramid
    final int TOTAL_ROWS = 6; 

    // Outer loop for 6 rows
    for(int row = 1; row <= TOTAL_ROWS; row++){
      // Inner loop for dynamic column numbers
        for(int column = 0;  column < row; column++){
            // Printing logic, remainder of row + column
            System.out.print((row+column)%2 + " ");
        }
        System.out.println();
    }
  }
}
