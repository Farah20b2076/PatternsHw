public class StrategyPattern {
    public static void main(String[] args) {
       Context context = new Context(new Addition());		
       System.out.println("20 + 35 = " + context.exeStrategy(20, 35));
 
       context = new Context(new Subtraction());		
       System.out.println("100 - 9 = " + context.exeStrategy(100, 9));

    }
 }
