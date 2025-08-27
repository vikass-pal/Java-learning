package PracticeQues;

import java.util.ArrayList;
import java.util.List;

public class PascalssTriange {
     public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0)
            return result;

        // first row = [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        // build rows from 2 to numRows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1); // ✅ first element always 1

            // middle elements
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1); // ✅ last element always 1
            result.add(row);
        }

        return result;
    }
}
