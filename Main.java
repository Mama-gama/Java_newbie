public class Main {

    void discriminant(int a, int b, int c) {
        int d = (b * b) - (4 * a * c);
        System.out.println("The discriminant is: " + d);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Eqn eqn = new Eqn();
        main.discriminant(1, 4, 3);
        eqn.eqn(3);
    }
}