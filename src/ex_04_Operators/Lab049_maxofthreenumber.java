package ex_04_Operators;

public class Lab049_maxofthreenumber {
    public static void main(String[] args) {
        // Max of three numbers using nested ternary
        int n1 = 20;
        int n2 = 30;
        int n3 = 40;
        int max = (n1 > n2)? (n1 > n3)? n1 :n3 : (n2 > n3)? n2 : n3;
        System.out.println(max);
    }
}
