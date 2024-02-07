package folder.origin;

public class Practice03 {



    public static void main(String[] args) {

        Practice03 ap1 = new Practice03();

        ap1.clock(7456);







    }
    public void clock (int 초) {

        int 분 = 초/60;
        int 초res = 초%60;

        int 시 = 분/60;
        int 분res = 분%60;

        System.out.println("초를 시간으로 "+ 시 +"시"+분res+"분"+초res + "초");






    }




    }




