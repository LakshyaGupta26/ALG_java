class A {
    public void fA() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class B {
    public void fB() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(+j+" ");
            }
            System.out.println();
        }
    }
}
class C {
    public void fC() {
        int rows = 5;
        int start = 9;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(start+" ");
                start += 2;
            }
            System.out.println();
        }
    }
}
public class q14 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.fA();
        b.fB();
        c.fC();
    }
}