class MathAdapter implements AdvancedOperations{
    Operations operations;
    public MathAdapter(Operations operations){
        this.operations = operations;
    }

    public void pow(int a, int b){
        System.out.println("============================");
        System.out.println("addition");
        operations.add(a, b);
        System.out.println("============================");
    }

    public void sqrt(int a){
        System.out.println("============================");
        System.out.println("subtraction");
        operations.sub(a, 0);
        System.out.println("============================");
    }

    public void log(int a){
        System.out.println("============================");
        System.out.println("multiplication");
        operations.mul(a, 10);
        System.out.println("============================");
    }

    public void ln(int a){
        System.out.println("============================");
        System.out.println("division");
        operations.div(a, 1);
        System.out.println("============================");
    }

}
