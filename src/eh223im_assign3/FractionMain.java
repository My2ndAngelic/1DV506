package eh223im_assign3;

public class FractionMain {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,2);
        Fraction f2 = new Fraction(1,2);

        System.out.println(f1.simplify(f1));
        Fraction f3 = f1.add(f2);
        System.out.println(f3.simplify(f3).toString());

    }
}
