package eh223im_assign3;

public class Fraction {
    private int Numerator = 1;
    private int Denominator = 1;

    private boolean isNegative = false;

    Fraction(int N, int D) {
        Numerator = N;
        if (D == 0) {
            System.err.println("NOT A VALID FRACTION. SET DENOMINATOR TO 1.");
            Denominator = 1;
        }
        else {
            Denominator = D;
        }
    }

    Fraction () {
        Numerator = 1;
        Denominator = 1;
    }

    private boolean isValid (Fraction F) {
        return getDenominator(F) != 0;
    }

    public double getFraction() {
        return Numerator / Denominator;
    }

    public String toString() {
        switch (Denominator) {
            case 1: return Integer.toString(Numerator);
            default: return Numerator + "/" + Denominator;
        }
    }

    public int getNumerator() {
        return Numerator;
    }

    public int getNumerator(Fraction f) {
        return f.Numerator;
    }

    public int getDenominator(Fraction f) {
        return f.Denominator;
    }

    public int getDenominator() {
        return Denominator;
    }

    public Fraction add(Fraction f) {
        return new Fraction(Numerator * f.Denominator + f.Numerator * Denominator, Denominator * f.Denominator);
    }

    private int getGCD(Fraction f) {
        int n = f.Numerator;
        int d = f.Denominator;
        while (n != d) {
            if (n > d) {
                n = n - d;
            } else d = d - n;
        }
        return n;
    }

    private int getGCD(int n, int d) {
        while (n != d) {
            if (n > d) {
                n = n - d;
            } else d = d - n;
        }
        return n;
    }

    public Fraction simplify(Fraction f) {
        int n = Numerator / getGCD(f);
        int d = Denominator / getGCD(f);
        return new Fraction(n, d);
    }

    public Fraction simplify (int N, int D) {
        return new Fraction(N / getGCD(N,D), D / getGCD(N,D));
    }

    public Fraction subtract(Fraction f) {
        return new Fraction(Numerator * f.Denominator - f.Numerator * Denominator, Denominator * f.Denominator);
    }

    public Fraction multiply(Fraction f) {
        return new Fraction(Numerator * f.Numerator, Denominator * f.Denominator);
    }

    public Fraction divide(Fraction f) {
        return new Fraction(Numerator * f.Denominator, Denominator * f.Numerator);
    }

    public boolean isEqualTo(Fraction f) {
        return Numerator * f.Denominator == Denominator * f.Numerator;
    }
}
