public class Eqn {
    double m;
    int c;

    Eqn() {
        m = 1.5;
        c = 1;
    }

    void eqn(int x) {
        double y = (m * x) + c;
        System.out.println("The y-intercept is: " + y);
    }
}