public class VariableScope {
    int instanceVariable = 10;
    static int staticVariable = 20;

    public static void main(String[] args) {
        int localVariable = 30;
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Static Variable: " + localVariable);
        VariableScope variableScope = new VariableScope();
        System.out.println("Instance Variable: " + variableScope.instanceVariable);
        System.out.println("String variable: " + variableScope.instanceVariable);

    }
    
}
