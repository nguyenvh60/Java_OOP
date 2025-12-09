package DongGoi;

public class Main {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("ABC",21,300000,30,"Trưởng phòng");
        nv.setLuongCoBan(-400000);
        nv.displayInfo();
    }

}
