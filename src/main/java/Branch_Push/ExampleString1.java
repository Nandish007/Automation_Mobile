package Branch_Push;

public class ExampleString1 {

    public static void main(String[] args) {

        String str="nandish is a automation tester";
        System.out.println("The length of the String is: "+str.length());
        System.out.println(str.equals("nAndish"));

        System.out.println(str.equalsIgnoreCase("nandiSH"));

        System.out.println(str.contains("ish"));
        System.out.println(str.startsWith("nan"));

        System.out.println(str.endsWith("er"));

        System.out.println(str.split(" ")[3]);

    }
}
