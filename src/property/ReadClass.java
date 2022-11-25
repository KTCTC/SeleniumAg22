package property;

public class ReadClass {

	public static void main(String[] args) {
		PropertyHelper ph = new PropertyHelper("Sample.properties");
		System.out.println(ph.getKeyValueFromProerty("Password"));

	}

}
