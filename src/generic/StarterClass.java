package generic;
//@file starter.java
//@author Sidhanath Verekar
//@brief This file calls the GenericContainer class and demonstrates it's use
//@Date:22/10/24
public class StarterClass {

	public static void main(String[] args) {
		//GenericContainer for Integer
		GenericContainer<Integer> intContainer = new GenericContainer<>();
        intContainer.setItem(10);
        System.out.println("Integer: " + intContainer.getItem());

        // GenericContainer for String
        GenericContainer<String> strContainer = new GenericContainer<>();
        strContainer.setItem("Hello Generics");
        System.out.println("String: " + strContainer.getItem());
	}

}
