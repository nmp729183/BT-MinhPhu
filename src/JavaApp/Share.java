//tao goi
package JavaApp;
//su dung cac lop da co

import java.util.Scanner;
import java.awt.*;         
import java.awt.event.*;    

public class Share {

    public static double NhapDouble(String dulieu) {
        Scanner s = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhap " + dulieu + ": ");
                return s.nextDouble();
            } catch (Exception ex) {
                System.out.print("Nhap sai, vui long nhap lai!\n");
                s.nextLine();
            }
        }
    }

    public static int NhapSoNguyen(String ThongBao) {
        Scanner s = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhap " + ThongBao + ": ");
                return s.nextInt();
            } catch (Exception ex) {
                System.out.print("Nhap sai, vui long nhap lai!\n");
                s.nextLine();
            }
        }
    }

    //ham tinh tong 1+2+....+n, voi n nguyen duong
    public static int TinhTong(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        return tong;
    }

    //hàm tính tích
    public static int TinhTich(int n) {
        int tich = 1;
        for (int i = 1; i <= n; i++) {
            tich = tich * i;
        }
        return tich;
    }

    //tính S2
    public static double TinhS2(int n) {
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += 1.0 / i;
        }
        return tong;
    }

    //Tính S3
    public static double TinhS3(int n) {
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                tong -= 1.0 / i;
            } else {
                tong += 1.0 / i;
            }
        }
        return tong;
    }

    //Tính S4
    public static double TinhS4(int n) {
        double tong = 1;
        for (int i = 1; i <= n; i++) {
            tong += 1.0 / i;
        }
        return tong;
    }
}
//cai lop de tao doi tuong dong cua so

class DongCuaSo extends WindowAdapter implements WindowListener
{
    //ham su ly khi click vao nut 
    public void windowClosing(WindowEvent e) 
    {
        System.exit(0); // dong cua so chuong trinh  
    }
}
