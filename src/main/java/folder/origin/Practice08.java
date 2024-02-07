package folder.origin;

public class Practice08 {

    public static void main(String[] args) {

        Practice08 pr8 = new Practice08();

        String commaNumber=pr8.bettingNumber(81234567);

        System.out.println("베팅받은 금액 : " + commaNumber);





    }

    public String bettingNumber (long money) {


        money = money*35;

        long money1 = money/1000000000;
        money=money%1000000000;

        long money2 = money/1000000;
        money=money%1000000;

        long money3 = money/1000;
        money=money%1000;

        String str = money1+","+money2+","+money3+","+money;

        return str;




    }
}
