public class findX  {
    public static void main(String[] args) {
        String[] equations = {
            "X*23=46",
            "30*X=90",
            "100*5=X"
        };

        for (String eq : equations) {
            System.out.println(eq + " → X = " + solve(eq));
        }
    }

    static int solve(String equation) {
        String[] parts = equation.split("=");

        String left = parts[0];
        String right = parts[1];

        if (left.contains("X")) {
            String[] factors = left.split("\\*");
            if (factors[0].equals("X")) {
                int b = Integer.parseInt(factors[1]);
                int c = Integer.parseInt(right);
                return c / b;
            } else { // X is second factor
                int a = Integer.parseInt(factors[0]);
                int c = Integer.parseInt(right);
                return c / a;
            }
        } else { // right contains X
            String[] factors = left.split("\\*");
            int a = Integer.parseInt(factors[0]);
            int b = Integer.parseInt(factors[1]);
            return a * b;
        }
    }
}

