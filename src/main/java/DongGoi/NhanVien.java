package DongGoi;

public class NhanVien {
    private String ten;
    private int tuoi;
    private double luongCoBan ;
    private int soNgayDiLam ;
    private String viTri ;

    public NhanVien(String ten, int tuoi, double luongCoBan, int soNgayDiLam, String viTri) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.luongCoBan = luongCoBan;
        this.soNgayDiLam = soNgayDiLam;
        this.viTri = viTri;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        checkValidateLuongCoBan(luongCoBan);
        this.luongCoBan = luongCoBan;
    }

    public int getSoNgayDiLam() {
        return soNgayDiLam;
    }

    public void setSoNgayDiLam(int soNgayDiLam) {
        this.soNgayDiLam = soNgayDiLam;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void checkValidateLuongCoBan(double luongCoBan) {
         if (luongCoBan < 0) {
             throw new IllegalArgumentException("Lỗi");
         }
    }

    public double tinhThucNhan (){
        return soNgayDiLam * luongCoBan ;
    }

    public void displayInfo(){
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Lương ngày: " + luongCoBan);
        System.out.println("Số ngày công : " + soNgayDiLam);
        System.out.println("Vị trí: " + viTri);
        System.out.println("Thực nhận : " + tinhThucNhan());

    }
}
