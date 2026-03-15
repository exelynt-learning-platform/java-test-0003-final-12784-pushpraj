public class BinaryPyramid {
  public static void main(String[] args){
    final int TOTAL_ROWS = 6;
    for(int row = 1; row <= TOTAL_ROWS; row++){
        for(int column = 0;  column < row; column++){
            System.out.print((row+column)%2);
        }
        System.out.println();
    }
  }
}
