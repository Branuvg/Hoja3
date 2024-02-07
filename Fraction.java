public class Fraction implements Comparable<Fraction> {

    private int a = 0;
    private int b = 1;

    public Fraction(int numerator, int denominator){
        a = numerator;
        b = denominator;
    }

    public int compareTo(Fraction y) {
        return a*y.b - b*y.a;
    }
    
    public String toString(){
        return Integer.toString(a) + "/" + Integer.toString(b);
    }
}
