public class ControlSwitch{
    public static void main(String[] args){
        ControlSwitch control = new ControlSwitch();
        control.swtichStatement(1);
        control.swtichStatement(2);
        control.swtichStatement(3);
        control.swtichStatement(4);
        control.swtichStatement(6);
    }
    public void swtichStatement(int numberOfWheel){
        switch (numberOfWheel){
            case 1:
                System.out.println(numberOfWheel+" : It is one foot bicycle.");
                break;
            case 2:
                System.out.println(numberOfWheel+" : It is moter cycle or bicycle..");
                break;
            case 3:
                System.out.println(numberOfWheel+" : It is three wheels car.");
                break;
            case 4:
                System.out.println(numberOfWheel+" : It is a car.");
                break;
            default:
                System.out.println(numberOfWheel+" : It is an expensive car.");
                break;
        }
    }
}