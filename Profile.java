public class Profile {
    String name;
    int age;
    public static void main(String[] args){
        Profile profile=new Profile();
        String str="Min";
        int val=20;
        profile.setName(str);
        profile.setAge(val);
        profile.printName(str);
        profile.printAge(val);    
    }
    public void setName(String str) {
        name=str;
    }
    public void setAge(int val) {
        age=val;
    }
    public void printName(String str) {
        System.out.println("My name is "+name);
    }
    public void printAge(int val) {
        System.out.println("My age is "+age);
    }
}
