package com.example.demo.Entity;

import com.example.demo.enums.DiaChi;
import com.example.demo.enums.GioiTinh;
import com.example.demo.enums.TrangThai;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.UUID;

@Data
@Entity
@Table(name="KHACHHANG")

public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
     @Column(name = "id")
    private UUID id;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @Column(name = "ten_day_du")
    private String tenDayDu;

    @Column(name = "tai_khoan")
    private String taiKhoan;

    @Column(name = "mat_khau")
    private String matKhau;

    @Column(name = "email")
    private String email;


    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @Temporal(TemporalType.DATE)
    @Column(name = "ngay_sinh")
    private String ngaySinh;
    @Column(name = "anh")
    private String anh;
    @Column(name = "gioi_tinh")
    private GioiTinh gioiTinh;
    @Column(name = "dia_chi")
    private String diaChi;
    @Column(name = "trang_thai")
    private TrangThai trangThai;
}
