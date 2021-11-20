import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String op, num1, num2;
            op = scanner.nextLine();
            char co = op.charAt(0);
            num1 = scanner.nextLine();
            num2 = scanner.nextLine();
            Rational n1 = new Rational(M(num1), D(num1));
            Rational n2 = new Rational(M(num2), D(num2));
            switch (co) {
                case '+' : {
                    System.out.println(n1.outRationl() + " + " + n2.outRationl() + " = " + (n1.add(n2)).outRationl());
                    break;
                }
                case '-' : {
                    System.out.println(n1.outRationl() + " - " + n2.outRationl() + " = " + (n1.sub(n2)).outRationl());
                    break;
                }
                case '*' : {
                    System.out.println(n1.outRationl() + " * " + n2.outRationl() + " = " + (n1.multiply(n2)).outRationl());
                    break;
                }
                case '/' : {
                    System.out.println(n1.outRationl() + " / " + n2.outRationl() + " = " + (n1.divide(n2)).outRationl());
                    break;
                }
                default : {
                }
            }
        }
    }
    public static int M(String str) {
        int s, e, molecular;
        s = str.indexOf('(');
        e = str.indexOf('/');
        molecular = Integer.parseInt((str.substring(s + 1, e)).trim());
        return molecular;
    }
    public static int D(String str) {
        int s, e, denominator;
        s = str.indexOf('/');
        e = str.indexOf(')');
        denominator = Integer.parseInt((str.substring(s + 1, e)).trim());
        return denominator;
    }
}
class Rational {
    private int molecular, denominator;
    public static int gcd(int x, int y) {
        int Max, min, temp;
        Max = Math.max(x, y);
        min = Math.min(x, y);
        if(min != 0)
            temp = Max % min;
        else
            temp = Max;
        while (temp != 0) {
            Max = min;
            min = temp;
            temp = Max % min;
        }
        return Math.abs(min);
    }
    public static int lcm(int x, int y) {
        return (x * y / gcd(x, y));
    }
    public Rational() {
        molecular = 1;
        denominator = 1;
    }
    public Rational(int im, int id) {
        molecular = im;
        denominator = id;
    }
    public int getMolecular() {
        return molecular;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setMolecular(int im) {
        this.molecular = im;
    }
    public void setDenominator(int id) {
        this.denominator = id;
    }
    public Rational add(Rational p) {
        int gtemp, ltemp, mtemp;
        Rational r = new Rational();
        ltemp = lcm(this.denominator, p.denominator);
        mtemp = this.molecular * (ltemp / this.denominator) + p.molecular * (ltemp / p.denominator);
        gtemp = gcd(mtemp, ltemp);
        r.molecular = mtemp / gtemp;
        r.denominator = ltemp / gtemp;
        return r;
    }
    public Rational sub(Rational p) {
        int gtemp, ltemp, mtemp;
        Rational r = new Rational();
        ltemp = lcm(this.denominator, p.denominator);
        mtemp = this.molecular * (ltemp / this.denominator) - p.molecular * (ltemp / p.denominator);
        gtemp = gcd(mtemp, ltemp);
        r.molecular = mtemp / gtemp;
        r.denominator = ltemp / gtemp;
        return r;
    }
    public Rational multiply(Rational p) {
        Rational r = new Rational();
        int temp;
        r.molecular = this.molecular * p.molecular;
        r.denominator = this.denominator * p.denominator;
        temp = gcd(r.molecular, r.denominator);
        r.molecular = r.molecular / temp;
        r.denominator = r.denominator / temp;
        return r;
    }
    public Rational divide(Rational p) {
        Rational r = new Rational();
        int temp;
        r.molecular = this.molecular * p.denominator;
        r.denominator = this.denominator * p.molecular;
        temp = gcd(r.molecular, r.denominator);
        r.molecular = r.molecular / temp;
        r.denominator = r.denominator / temp;
        return r;
    }
    public String outRationl() {
        int temp = gcd(molecular, denominator);
        if ((molecular % denominator) == 0) {
            return (String.valueOf(molecular / denominator));
        }
        else {
            if (denominator < 0) {
                return "(" + (molecular / temp * -1) + "/ " + (denominator / temp * -1) + ")";
            }
            else {
                return "(" + (molecular / temp) + "/ " + (denominator / temp) + ")";
            }
        }
    }
}
