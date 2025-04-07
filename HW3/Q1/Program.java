package HW3.Q1;

public class Program {
    public static void Main(String[] args) {
        Rational r1 = new Rational(3, 4);  
        Rational r2 = new Rational(6, 8);  
        Rational r3 = new Rational(1, 2); 

        System.out.println("r1: " + r1);  
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);

        
        System.out.println("r1 equals r2? " + r1.equals(r2));  
        System.out.println("r1 equals r3? " + r1.equals(r3));  

        
        Rational sum = r1.add(r3);  
        Rational diff = r1.sub(r3);  
        Rational prod = r1.mul(r3); 
        Rational quot = r1.div(r3); 

        System.out.println("r1 + r3 = " + sum);
        System.out.println("r1 - r3 = " + diff);
        System.out.println("r1 * r3 = " + prod);
        System.out.println("r1 / r3 = " + quot);

        
        Rational cloneOfR1 = r1.clone();
        System.out.println("Clone of r1: " + cloneOfR1);
        System.out.println("r1 == cloneOfR1? " + (r1 == cloneOfR1));  

        
        System.out.print("r1 shown using show(): ");
        r1.show();
    }
}
