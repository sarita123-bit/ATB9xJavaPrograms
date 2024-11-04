package Oct.ex_28102024_String_Methods;

public class Lab089_StringBuffer_StringBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Sarita");
        stringBuffer.append("Sahoo");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("Sarita");
        stringBuilder.append("Sahoo1");
        System.out.println(stringBuilder);


        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World!"); // Modifies sb to "Hello World!"
        System.out.println(sb.toString()); // Output: Hello World!

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);
    }
}
