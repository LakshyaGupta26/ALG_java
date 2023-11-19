public class overload_q5 {
    public static void main(String[] args) {
        System.out.println("Filled Square:");
        polygon(5, '*');

        System.out.println("\nFilled Rectangle:");
        polygon(4, 6);

        System.out.println("\nFilled Triangle:");
        polygon();
    }
    public static void polygon(int n, char ch) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void polygon(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
    public static void polygon() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
