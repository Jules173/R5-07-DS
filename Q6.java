public class Q6 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Q5 <N>");
            return;
        }

        int N = Integer.parseInt(args[0]);
        for (int i = 1; i <= N; i++) {
            for (int j = N; j >= i; j--) {
                System.out.print("x ");
                if (j < i) System.out.print(" ");
            }
            System.out.println();
        }
    }
}