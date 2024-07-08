package com.example.demo.Entity;

import com.example.demo.enums.GioiTinh;
import com.example.demo.enums.TrangThai;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name="KHACHHANG")

public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID id;


    private String so_dien_thoai;


    private String ten_day_du;


    private String tai_khoan;


    private String mat_khau;


    private String email;


    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @Temporal(TemporalType.DATE)
    private String ngay_sinh;

    private String anh;

    private GioiTinh gioi_tinh;
    private TrangThai trang_thai;
}
