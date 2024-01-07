public class Calculator {
    public static void main(String[] args){
        System.out.println("Calculator class started");
        Calculator calc=new Calculator();
        int num1=10;
        int num2=5;
        System.out.println("add="+calc.add(num1,num2));
        System.out.println("subtract="+calc.subtract(num1, num2));
        System.out.println("multiply="+calc.multiply(num1, num2));
        System.out.println("divide="+calc.divide(num1, num2));
    }
    public int add(int num1, int num2) {
        return num1+num2;
    }
    public int subtract(int num1, int num2) {
        return num1-num2;
    }
    public int multiply(int num1, int num2) {
        return num1*num2;
    }
    public int divide(int num1, int num2) {
        return num1/num2;
    }
}
