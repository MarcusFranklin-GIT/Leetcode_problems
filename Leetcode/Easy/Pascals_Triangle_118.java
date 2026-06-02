import java.util.*;
class Pascals_Triangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<>();
        result.add(new ArrayList<>(Arrays.asList(1)));
        for(int row=1 ; row<numRows ; row++){
            List<Integer> step = new ArrayList<>();
            step.add(1);
            for(int col=1;col<row;col++){
                step.add(result.get(row-1).get(col-1)+result.get(row-1).get(col));
            }
            step.add(1);

            result.add(step);
        }

        return result;
    }
}