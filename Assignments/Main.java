
class Main {

    public static void main(String args[]) {
        int[][] items = { { 0, 1, 3, 4 }, { 4, 3, 99, 0, 7 }, { 3, 2 } };
        for (int row = 0; row < items.length; row++)
        {
            System.out.println();
            for (int col = 0; col < items[row].length; col++)
            System.out.print(items[row][col] + " ");
        }
    }
}