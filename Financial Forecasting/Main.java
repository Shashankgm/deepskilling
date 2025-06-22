public class Main{
    public static double f_recursive(double initialvalue, double growth, int years) {
        if (years == 0) {
            return initialvalue; // Base case
        }
        return f_recursive(initialvalue, growth, years - 1) * (1 + growth);
    }

    public static void main(String[] args) {
        double initialvalue = 2000.0;   
        double growth = 1.25;        
        int years = 4;                  
        double result = f_recursive(initialvalue, growth, years);
        System.out.printf("Future value after %d years: %.0f", years, result);
    }
}
