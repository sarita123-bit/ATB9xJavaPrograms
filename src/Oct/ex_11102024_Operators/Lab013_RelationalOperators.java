package Oct.ex_11102024_Operators;

public class Lab013_RelationalOperators {
    public static void main(String[] args) {
        // < (Less than)
        //<= (Less than or equal to)
        //> (Greater than)
        //>= (Greater than or equal to)
        //== (Equal to)
        //!= (Not equal to)

        //  //  > < , >= <= , != , ! -> true or false


        int a = 10;
        int b = 30;
        boolean c = a > b;
        System.out.println(c);

        int age_Sarita = 34;
        int age_Sarita1 = 34;
        boolean result = age_Sarita >= age_Sarita1;

        // age_Sarita > age_Sarita1 or age_Sarita =age_Sarita1
        System.out.println(result);

        System.out.println(!(10>20));
        //System.out.println((30>90)!); //! always will be in before not after

        System.out.println(!!!!(30>90));
    }
}
