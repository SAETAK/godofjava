public class OperatorIncrement {
    public static void main(String args[]) {
        OperatorIncrement sample=new OperatorIncrement();
        sample.increment();
        sample.increment2();
    }

    public void increment(){
        int intValue=1;
        System.out.println(intValue++);
        System.out.println(intValue);
        System.out.println(++intValue);
    }

    public void increment2(){
        int intValue=1;
        System.out.println(intValue);
        intValue=intValue+1;
        System.out.println(intValue);
        intValue=intValue+1;
        System.out.println(intValue);
    }
}
