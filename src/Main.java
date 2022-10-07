import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BasicMath basicMath = new BasicMath();
        AdvancedOperations advancedOperations = new AdvancedMath();

        AdvancedOperations mathAdapter = new MathAdapter(basicMath);

        System.out.println("Basic Math");
        basicMath.add(1, 2);
        basicMath.sub(1, 2);
        basicMath.mul(1, 2);
        basicMath.div(1, 2);
        System.out.println("Advanced Math");
        advancedOperations.pow(1, 2);
        advancedOperations.sqrt(1);
        advancedOperations.log(1);
        advancedOperations.ln(1);
        System.out.println("Math Adapter");
        mathAdapter.pow(1, 2);
        mathAdapter.sqrt(1);
        mathAdapter.log(1);
        mathAdapter.ln(1);
    }
}