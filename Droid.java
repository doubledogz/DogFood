public class Droid {
	int batterLevel;
	String name;
	
	public Droid(String droidName) {
		name = droidName;
		batterLevel = 100;
	}
	
	public void performTask(String task) {
		System.out.println(code.perforTask("dancing"));
		
	}
	
	public String toString() {
		System.out.println(code.perforTask("dancing"));
		
	}
	
	public String toString() {
		batterLevel = batteryLevel - 10;
		return "Hello, I am the droid: " + name;
		
	}
	
	public static void main(String[] args) {
		Droid codey = new Droid("Codey");
		System.out.println(codey);
		codey.performTask("dancing");
		margot.performTask("levitating");
		
	}
}