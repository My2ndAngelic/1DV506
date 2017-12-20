package eh223im_assign3;

public class FractionMain {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 6);
        Fraction f2 = new Fraction(0, 4);

        f1.getDenominator(f1);

        System.out.println(f1.simplify(f1).toString());
        System.out.println(f2.simplify(f2).toString());
        Fraction f3 = f1.add(f2);
        System.out.println(f3.simplify(f3).toString());
        f3 = f1.subtract(f2);
        System.out.println(f3.simplify(f3).toString());
        f3 = f1.multiply(f2);
        System.out.println(f3.simplify(f3).toString());
        f3 = f1.divide(f2);
        System.out.println(f3.simplify(f3).toString());

    }
}
