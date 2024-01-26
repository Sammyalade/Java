import java.util.ArrayList;

public class RowLengthOfArrayList {
    public static void main(String[] args) {
        // Creating a 2D ArrayList
        ArrayList<ArrayList<Integer>> grid = new ArrayList<>();

        // Adding rows to the grid
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(6);
        row3.add(7);
        row3.add(8);
        row3.add(9);

        // Adding rows to the grid
        grid.add(row1);
        grid.add(row2);
        grid.add(row3);

        // Get size of a specific row without using a for loop
        int rowSize = grid.get(1).size(); // Change the index to the row you want to check
        System.out.println("Size of row 2: " + rowSize);
    }
}
