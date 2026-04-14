//Tao goi: javaapp
package JavaApp;

//Su dung cac lop da co
import java.awt.*;
// su dung cac lop (Label, TextField, ...) cua goi java.awt
import java.awt.event.*;
// su dung cac lop (ActionEvent, ...) cua goi: java.awt.event

//Cai lop PTBac2_GUI, thua ke (extends) lop Frame,
//thuc hien (implements) ham xu ly su kiena khi nhan chuot cua giao tiep ActionListener
public class PTBac2_GUI extends Frame implements ActionListener {

    //Khai bao cac thuoc tinh: Cac doi tuong tren cua so CT
    private Label lbl1, lbl2, lblHeSo_a, lblHeSo_b, lblHeSo_c, lblNghiem;
    private TextField txtHeSo_a, txtHeSo_b, txtHeSo_c, txtNghiem;
    private Button btnGiai, btnLamLai, btnDong;

    //Phuong thuc thiet lap (duoc tu dong goi khi doi tuong cua lop nay duoc tao)
    public PTBac2_GUI(String title) {
        //Tao cac doi tuong (trong bb nho) da khai bao o phan thuoc tinh
        lbl1 = new Label("Giải Phương trình Bậc 2");
        //tao Label
        lbl2 = new Label("ax^2+bx+c=0");
        lblHeSo_a = new Label("Hệ số a: ");
        lblHeSo_b = new Label("Hệ số b: ");
        lblHeSo_c = new Label("Hệ số c: ");
        lblNghiem = new Label("Nghiệm: ");

        txtHeSo_a = new TextField(10);
        //tao TextField
        txtHeSo_b = new TextField(10);
        txtHeSo_c = new TextField(10);
        txtNghiem = new TextField(10);
        txtNghiem.setEditable(false);

        btnGiai = new Button("Giải");
        //tao Button
        btnLamLai = new Button("Làm lại");
        btnDong = new Button("Đóng");

        //Them cac doi tuong da tao thanh phan vao cua so chuong trinh
        add(lbl1);
        add(lbl2);
        add(lblHeSo_a);
        add(lblHeSo_b);
        add(lblHeSo_c);
        add(lblNghiem);
        add(txtHeSo_a);
        add(txtHeSo_b);
        add(txtHeSo_c);
        add(txtNghiem);
        add(btnGiai);
        add(btnLamLai);
        add(btnDong);

        //Bo cuc va thiet lap vi tri cua tung thanh Phan tren cua so chuong trinh
        setLayout(null);
        //tu bo cuc thu cong

        lbl1.setBounds(100, 30, 300, 20);
        //thiet lap vi tri (100,30) va kich thuoc (chieu rong: 300, cao: 20)
        lbl2.setBounds(130, 50, 300, 20);
        lblHeSo_a.setBounds(100, 70, 50, 20);
        lblHeSo_b.setBounds(100, 100, 50, 20);
        lblHeSo_c.setBounds(100, 130, 50, 20);
        lblNghiem.setBounds(100, 160, 60, 50);

        txtHeSo_a.setBounds(160, 70, 100, 20);
        txtHeSo_b.setBounds(160, 100, 100, 20);
        txtHeSo_c.setBounds(160, 130, 100, 20);
        txtNghiem.setBounds(160, 160, 100, 20);

        btnGiai.setBounds(120, 230, 30, 20);
        btnLamLai.setBounds(190, 230, 50, 20);
        btnDong.setBounds(280, 230, 30, 20);

        //Dang ki doi tuong lang nghe su kien
        //khi nguoi dung tuong tac (click) voi doi tuong Button tren cua so
        btnGiai.addActionListener(this);
        //this: chi CT lang nghe su kien
        btnLamLai.addActionListener(this);
        btnDong.addActionListener(this);

        //dang ky doi tuong lang nghe va xu ly khi click vao nut : Giai, LamLai, Dong, x
        DongCuaSo obj = new DongCuaSo();
        addWindowListener(obj);

        //Thiet lap tieu de cua so
        setTitle(title);

    }

    //Ham giai PT
    public void GiaiPhuongTrinhBac2() {
        double a, b, c, delta;
        double x1, x2;
        //Doc du lieu ma user nhap vao TextField->Bien tam
        a = Double.parseDouble(txtHeSo_a.getText());
        b = Double.parseDouble(txtHeSo_b.getText());
        c = Double.parseDouble(txtHeSo_c.getText());

        if (a != 0) {
            delta = b * b - (4 * a * c);
            if (delta > 0) //Pt co 2 nghiem phan biet
            {
                //Nghiem x1 =
                x1 = ((-b) - Math.sqrt(delta)) / (2 * a);
                //Nghiem x2=
                x2 = ((-b) + Math.sqrt(delta)) / (2 * a);
                //In ra 2 nghiem
                txtNghiem.setText("x1=" + x1 + ", va x2=" + x2);
            } else if (delta == 0) {
                x1 = (-b) / (2 * a);
                txtNghiem.setText("x1=x2=" + x1);
            } else {
                txtNghiem.setText("PT vo nghiem ");
            }
        } else {
            x1 = (-b) / c;
            txtNghiem.setText("x=" + x1);
        }
    }

    //Ham xu ly khi click chuot vao Button tren cua so
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGiai) //neu nguoi dung nhan nut: btnGiai
        {
            GiaiPhuongTrinhBac2();
            //goi ham giai
        }
        if (e.getSource() == btnLamLai) {
            txtHeSo_a.setText("");
            txtHeSo_b.setText("");
            txtHeSo_c.setText("");
            txtNghiem.setText("");
        }
        if (e.getSource() == btnDong) {
            System.exit(0);
        }
    }

    //Ham chinh
    public static void main(String[] args) {
        //Tao doi tuong co ten pt cua lop PTBac2_GUI=>Ham thiet lap duoc tu dong goi
        PTBac2_GUI pt = new PTBac2_GUI("Giai phuong trinh");
        //Thiet lap kich thuoc cua so CT la 400x300 (pixel)
        pt.setSize(400, 300);
        //Hien thi cua so CT
        pt.show();
    }
}
