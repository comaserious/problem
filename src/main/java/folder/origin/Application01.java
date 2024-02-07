package folder.origin;

public class Application01 {

    public static void main(String[] args) {

        Calculator calc = new Calculator ();

        calc.checkMethod();

        int sum = calc.sumTwoNumbers(10,20);
        System.out.println("10과 20의 합 : "+sum);
        int minus = calc.minusTwoNumber(10,5);
        System.out.println("10과 5의 차 : "+minus);
        int multi = calc.multiTwoNumber(10,5);
        System.out.println("10과 5의 곱 : "+multi);
        int divide = calc.divideTwoNumber(10,5);
        System.out.println("10에 5를 나눈 몫 : "+divide);




    }




}
