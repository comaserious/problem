package folder.origin;

public class Practice07 {

    public static void main(String[] args) {

        Practice07 moneyRate =new Practice07 ();

        int money=moneyRate.rate(50000,0.03,24);

        System.out.println("원리금 = " + money);



    }
    public int rate(int money,double rate,int period) {

        money =(int)( money*Math.pow(1+rate,period));

        return money;




    }


}
