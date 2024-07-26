package com.example.demo.Entity;

import com.example.demo.enums.Quyen;
import com.example.demo.enums.TrangThai;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "NHANVIEN")
public class NhanVien {
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
    private Quyen quyen;
    private LocalDate ngay_tao;
    private String  dia_chi;
    private  String manv;
    private TrangThai trang_thai;


}
