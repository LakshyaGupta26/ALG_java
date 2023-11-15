public class q15main {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        int count1 = 15;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count1 + "  ");
                count1--;
            }
            System.out.println();
        }
        int count2 = 1;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count2 + "  ");
                count2++;
            }
            System.out.println();
        }
    }
}