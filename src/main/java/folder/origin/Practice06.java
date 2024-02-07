package folder.origin;

public class Practice06 {

    public static void main(String[] args) {

        Practice06 circle = new Practice06();

        System.out.println(circle.circleArea(23));



    }
    public double circleArea (double radius) {

        double area =Math.pow(radius,2)*Math.PI;

        return area ;



    }


}
