import java.util.ArrayList;
import java.util.List;

class SpiralTraverse {

    public List<Integer> spiralTraverse(int[][] array) {
        ArrayList<Integer> result = new ArrayList<>();

        int startRow = 0;
        int startCol = 0;
        int endRow = array.length - 1;
        int endCol = array[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startRow, j = startCol; j <= endCol; j++) {
                result.add(array[i][j]);
            }
            for (int i = startRow + 1, j = endCol; i <= endRow; i++) {
                result.add(array[i][j]);
            }

            if (endRow > startRow) {
                for (int i = endRow, j = endCol - 1; j >= startCol; j--) {
                    result.add(array[i][j]);
                }
            }

            if (endCol > startCol) {
                for (int i = endRow - 1, j = startCol; i >= startRow + 1; i--) {
                    result.add(array[i][j]);
                }
            }

            startRow += 1;
            startCol += 1;
            endRow -= 1;
            endCol -= 1;
        }

        return result;
    }
}
