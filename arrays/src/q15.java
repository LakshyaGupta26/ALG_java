public class q15 {
    public static void main(String[] args) {
        int[] P = {4, 6, 1, 2, 3, 10};
        int[] Q = {19, 23, 7, 8};

        int pLength = P.length;
        int qLength = Q.length;
        int rLength = pLength + qLength;

        int[] R = new int[rLength];

        for (int i = 0; i < pLength; i++) {
            R[i] = P[i];
        }

        for (int i = 0; i < qLength; i++) {
            R[pLength + i] = Q[i];
        }

        System.out.print("R[] = ");
        for (int i = 0; i < rLength; i++) {
            System.out.print(R[i]);
            if (i < rLength - 1) {
                System.out.print(", ");
            }
        }
    }
}
