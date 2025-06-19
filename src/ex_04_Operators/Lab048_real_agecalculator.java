package ex_04_Operators;

public class Lab048_real_agecalculator {
    public static void main(String[] args) {
        int age = 23;
        String calculate = (age < 18)?  "Minor" : (age < 60 )? "Adult" : " senior citizen";
        System.out.println(calculate);

    }
}
