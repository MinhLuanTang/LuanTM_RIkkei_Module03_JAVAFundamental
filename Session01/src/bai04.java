public class bai04 {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;
        int soDu = a % b;

        System.out.println("a = " + a + " và b = " + b);
        System.out.println("Tổng 2 số a+b = " + tong);
        System.out.println("Hiệu 2 số a-b = " + hieu);
        System.out.println("Tích 2 số a*b = " + tich);
        System.out.println("Thương 2 số a/b = " + thuong);
        System.out.println("Số dư khi chia số a cho b = " + soDu);
    }
}