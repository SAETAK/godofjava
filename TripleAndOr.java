public class TripleAndOr {
    public static void main(String[] args){
        int age = 25;
        boolean isMarried = true;
        double height = 180;
        if(age > 25 || isMarried && height >= 180){
            System.out.println("Age is over 25 or Married and height is over 180");
        }
    }
}