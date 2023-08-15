public class Practice1 {
    public static void main(String[] args) {
        Practice1 app1 = new Practice1();
        app1.printValues(100, 2);
    }

    void printValues(int n, int m) {
        for (int i = 0; i <= n; i++) {
            if (i % m == 0) {
                System.out.println(i);
            }
        }
    }

    // public static void main(String[] args) {
    // System.out.println("Hello World !!");
    // }
}
