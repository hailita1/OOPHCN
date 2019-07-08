import java.util.Scanner;

public class Main {
    public static class HCN {
        double width, height;

        public HCN() {
            this.width = 10.0;
            this.height = 20.0;
        }

        public HCN(double width, double height) {
            this.height = height;
            this.width = width;
        }

        public double dienTich() {
            return this.width * this.height;
        }

        public double chuVi() {
            return (this.height + this.width) * 2;
        }

        public String hien() {
            return "Hinh chu nhat: {" + "width= " + width + ", height= " + height + "}";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        HCN hcn = new HCN(width, height);
        String chuoi = hcn.hien();
        double cv = hcn.chuVi();
        double S = hcn.dienTich();
        System.out.print(chuoi + " Chu vi la: " + cv + " Dien tich la: " + S);
    }

}
