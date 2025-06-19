package ex_04_Operators;

public class Lab047_even_or_odd {
    public static void main(String[] args) {
        int A = 19;
        String even_or_odd = (A % 2 == 0) ? "even" : "odd";
        System.out.println(even_or_odd);
        A  = 20;
        String even_odd = (A % 2 == 0) ? "even" : "odd";
        System.out.println(even_odd);
    }
}
