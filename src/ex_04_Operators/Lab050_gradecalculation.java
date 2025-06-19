package ex_04_Operators;

public class Lab050_gradecalculation {
    public static void main(String[] args) {
        int mark = 40;
        String result = (mark >= 90) ? "A+" : (mark >= 75) ? "A" : (mark >= 60) ? "B" : (mark >= 40) ? "C" : "Fail";
        System.out.println(result);
    }
}
