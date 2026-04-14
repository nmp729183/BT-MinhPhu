//tao goi(thu muc chua file dich .class tu file ct.java)
package JavaApp;
//su dung lop da co
import java.lang.Math; //su dung lop Math cua goi java.lang
import java.text.DecimalFormat; //su dung de dinh dang so thap phan
//cai lop ptbac2
public class PhuongTrinhBac2 {
    //cac thuoc tinh cua doi tuong
    private double a,b,c;
    //ham thiet lap(constructor)
    public PhuongTrinhBac2 (double aa,double bb,double cc)
    {
        this.a=aa;this.b=bb;this.c=cc;//this la tu khoa chi doi tuong tuy y cua lop
    }
    public void nhap()
    {
        this.a = Share.NhapDouble("a");
        this.b = Share.NhapDouble("b");
        this.c = Share.NhapDouble("c");
    }
    //phuong thuc giai
    public void giai()
    {
        //khai bao bien cua phuong thuc
        double delta;
        //tao moi doi tuong f de dinh dang so thap phan
        DecimalFormat f= new DecimalFormat("#0.00");
        //giai phuong trinh bac 2
        delta=this.b*this.b-4*this.a*this.c;
        if(delta<0){
            System.out.println("PT vo nghiem");
        }
        if(delta==0){
            System.out.println("PT co nghiem kep x1=x2=" + f.format(-this.b/(2*this.a)));
        }
        if(delta>0){
            System.out.println("PT co nghiem x1= " + f.format((-this.b+Math.sqrt(delta))/(2*this.a)));
            System.out.println("PT co nghiem x2= " +f.format((-this.b-Math.sqrt(delta))/(2*this.a)));
        }
    }
}