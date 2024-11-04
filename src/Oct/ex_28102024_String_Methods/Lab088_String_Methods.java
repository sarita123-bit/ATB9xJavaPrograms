package Oct.ex_28102024_String_Methods;

public class Lab088_String_Methods {
    public static void main(String[] args) {

        /**
        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar); //roar

        String s1 = "Sarita";
        String s2 = s1.concat("Sahoo");
        System.out.println(s2); // SaritaSahoo

        String fruits = "apple,banana,cherry"; // delimter = ,
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        String fruits2 = "ABC-XYZ-QWE"; // delimter = ,
        String[] split_fruits2 = fruits2.split("-");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);

        String s4 = "Sarita";
        System.out.println(s4.charAt(0));
        //System.out.println(s4.charAt(10)); //StringIndexOutOfBoundsException

         **/

        String s5 = " Sarita ";
        System.out.println(s5.trim()); //Sarita

        String s6 = "Sarita";
        System.out.println(s6.indexOf("r")); // true
        System.out.println(s6.indexOf("a"));

        String s7 = "Sarita";
        System.out.println(s7.contains("ar")); //true
        System.out.println(s7.contains("zy")); //false

        String s8 = "SaritaSahoo";
        System.out.println(s8.lastIndexOf("o")); //10

        String s9 = "SaritaSahoo";
        System.out.println(s9.replace("o","z"));
        System.out.println(s9.replaceAll("o","z"));

        String s10 = "SaritaSahoo";
        System.out.println(s10.startsWith("Sar")); // true
        System.out.println(s10.endsWith("oo")); // true
        System.out.println(s10.endsWith("zy")); // false

        String original = "banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1); // bonono

        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "-");
        System.out.println(result2);


        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3); //

    }
}
