import java.util.Date;

enum VaiTro {
    Admin,
    Employee
}

public class NhanVien {
    private int maNhanVien;
    private String tenNhanVien;
    private String gioiTinh;
    private Date ngaySinh;
    private Date ngayVaoLam;
    private String soDienThoai;
    private String email;
    private int luong;
    private String tenDangNhap;
    private String matKhau;
    private String tenVaiTro;
    private int maQuyen;
    private boolean trangThai;


    public NhanVien() {

    }

    public NhanVien(int maNhanVien, String tenNhanVien, String gioiTinh, Date ngaySinh,
                    Date ngayVaoLam, String soDienThoai, String email, int luong,
                    String tenDangNhap, String matKhau, String tenVaiTro, int maQuyen, boolean trangThai) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.luong = luong;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.tenVaiTro = tenVaiTro;
        this.maQuyen = maQuyen;
        this.trangThai = trangThai;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTenVaiTro() {
        return tenVaiTro;
    }

    public int getMaQuyen() {
        return maQuyen;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public boolean isAdmin() {
        return VaiTro.valueOf(tenVaiTro) == VaiTro.Admin;
    }

    public boolean isEmployee() {
        return VaiTro.valueOf(tenVaiTro) == VaiTro.Employee;
    }
}
