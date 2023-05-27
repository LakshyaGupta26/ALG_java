class A1{
    public void fA(){
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
class B1{
    public void fB(){
        int rows = 5;
        int count = 15;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + "  ");
                count--;
            }
            System.out.println();
        }
    }
}
class C1{
    public void fC(){
        int rows = 5;
        int count = 1;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + "  ");
                count++;
            }
            System.out.println();
        }
    }
}
public class q15 {
    public static void main(String[] args) {
        A1 a = new A1();
        B1 b = new B1();
        C1 c = new C1();
        a.fA();
        b.fB();
        c.fC();
    }
}