package HomeWork_1.ExtraTask;

public class Triangle {

    public static void main(String[] args) {
        int side1 = 5;
        int side2 = 5;
        int side3 = 5;

        double s = (double) (side1 + side2 + side3)/2;

        double areaTriangle = (int) Math.sqrt(s * ((s - side1) * (s - side2) * s - side3));

        System.out.println("Сторона 1 = " + side1);
        System.out.println("Сторона 2 = " + side2);
        System.out.println("Сторона 3 = " + side3);
        System.out.println("Площадь треугольника = " + areaTriangle);
    }
}
