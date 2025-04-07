package HW3.Q1;

public class Rational implements Showable, Arithmetic {
    private int mone, mechane;

    public Rational(int a, int b) {
        mone = a;
        mechane = b;
    }

    public Rational() {
        this(1, 2);
    }

    public Rational(Rational r) {
        this(r.mone, r.mechane);
    }

    public String toString() {
        return mone + "/" + mechane;
    }

    public boolean equals(Rational r) {
        return this.mone / this.mechane == r.mone / r.mechane;
    }

    public void show() {
        System.out.println(this);
    }

    public Rational add(Object other) {
        if (other.getClass() != Rational.class) {
            return this;
        }
        Rational o = new Rational((Rational) other);
        int newMone = this.mone * o.mechane + o.mone * this.mechane;
        int newMechane = this.mechane * this.mone;
        return new Rational(newMone, newMechane);
    }

    public Rational sub(Object other) {
        if (other.getClass() != Rational.class) {
            return this;
        }
        Rational o = new Rational((Rational) other);
        int firstMone = this.mone * o.mechane;
        int secMone = o.mone * this.mechane;
        int newMechane = this.mechane * o.mechane;
        int newMone = firstMone - secMone;
        return new Rational(newMone, newMechane);
    }

    public Rational mul(Object other) {
        if (other.getClass() != Rational.class) {
            return this;
        }
        Rational o = new Rational((Rational) other);
        return new Rational(this.mone * o.mone, this.mechane * o.mechane);
    }

    public Rational div(Object other) {
        if (other.getClass() != Rational.class) {
            return this;
        }
        Rational o = new Rational((Rational) other);
        return new Rational(o.mechane * this.mone, this.mechane * o.mone);
    }
}
