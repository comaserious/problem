package folder.origin;

public class Practice05 {

    public static void main(String[] args) {

        Practice05 pr5 = new Practice05();

        pr5.clock(2,30);



    }
    public void clock (int Time , int time){

        int watch = Time*60 + time;

        watch = watch-45;
        int 시=(watch/60==0)? 12 : watch/60;
        int watchRes= watch%60;


        System.out.println("변환된 시간은 " +시+ "시" +  watchRes +"분");

    }
}
