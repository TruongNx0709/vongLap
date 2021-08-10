import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class baiThucHanh4 {
    public static void main(String[] args) {
        baiThucHanh4 baitap = new baiThucHanh4();
        //baitap.bai1a();
        //baitap.bai1b();
        baitap.bai5();
    }

    public void bai1a() {
        System.out.println("----------------------------");
        System.out.println("Bài 1a : Có phải là số đối xứng");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số muốn kiểm tra: ");
        int number = input.nextInt();
        //Convert int sang String để so sánh cho dễ
        String numberChecking = String.valueOf(number);
        int length = numberChecking.length();
        System.out.println("Độ dài của chuỗi: " + length);
        int sogiua = length / 2;
        if (sogiua == 0) {
            System.out.println("Không phải số đối xứng");
        } else {
            String numberSwap = "";
            for (int i = length - 1; i >= 0; i--) {
                numberSwap = numberSwap + numberChecking.charAt(i);
                if (numberSwap.equals(numberChecking)) {
                    System.out.println("Đây là số đối xứng");
                }
            }
        }
    }

    public void bai1b() {
        System.out.println("----------------------------");
        System.out.println("Bài 1b : Có phải là số chính phương");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số muốn kiểm tra: ");
        int number = input.nextInt();
        //Hàm tính căn bậc 2 java. Math.sqrt
        double layCanBacHai = Math.sqrt(number);
        System.out.println(layCanBacHai);
        //Làm tròn số
        double lamtron = Math.floor(layCanBacHai);
        System.out.println(lamtron);
        // So sánh nếu số sau khi làm tròn trừ cho số có căn bậc 2 = 0 thì căn bậc 2 của số đó là số nguyên => Số chính phương
        if (lamtron - layCanBacHai == 0) {
            System.out.println("Số " + number + " là số chính phương");
        } else {
            System.out.println("Không phải số chính phương");
        }
    }

    public void bai5() {
        System.out.println("----------------------------");
        System.out.println("Bài 5 : Xuất ra số ngược lại");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số : ");
        int number = input.nextInt();
        //Convert int sang String
        String numberChecking = String.valueOf(number);
        int length = numberChecking.length();
        System.out.println("Độ dài của chuỗi: " + length);
        String numberSwap = "";
        for (int i = length - 1; i >= 0; i--) {
            numberSwap = numberSwap + numberChecking.charAt(i);
        }
        System.out.println("Số ngược lại là : "+numberSwap);

    }
}


