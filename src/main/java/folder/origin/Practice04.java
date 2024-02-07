package folder.origin;

public class Practice04 {

    public static void main(String[] args) {


        System.out.println("최소 동전의 갯수 : "+ money(430));





    }
    public static int money (int penny) {


        int coin500 = penny/500;
        penny = penny%500;
        int coin100 = penny/100;
        penny = penny%100;
        int coin50 = penny/50;
        penny = penny %50;
        int coin10 =penny/10;

        int coin = coin10+coin50+coin100+coin500;

        return coin ;










    }



}
