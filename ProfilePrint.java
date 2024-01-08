public class ProfilePrint {
	byte age;
	String name;
	boolean isMarried;
	
	public static void main(String[] args) {
		ProfilePrint profile=new ProfilePrint();
		byte age=30;
		String name="InHoan";
		boolean isMarried=false;
		
		profile.setAge(age);
		profile.setName(name);
		profile.setMarried(isMarried);
		
		System.out.println(profile.getAge());
		System.out.println(profile.getName());
		System.out.println(profile.isMarried());
	}
	public void setAge(byte age1) {
		age=age1;
	}
	public byte getAge() {
		return age;
	}
	public void setName(String name1) {
		name=name1;
	}
	public String getName() {
		return name;
	}
	public void setMarried(boolean isMarried1) {
		isMarried=isMarried1;
	}
	
	public boolean isMarried() {
		return isMarried;
	}
}