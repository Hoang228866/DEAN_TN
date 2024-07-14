package com.example.demo.ConTroller;

import com.example.demo.Entity.KhachHang;
import com.example.demo.Repo.KhachHangRepo;
import com.example.demo.enums.GioiTinh;
import com.example.demo.enums.TrangThai;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

//@Controller
//@RequestMapping("/kh")
@RestController
@CrossOrigin("*")
public class KhachHangController {
@Autowired
    KhachHangRepo khachHangRepo;
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    @RequestMapping(value = "kh/hien-thi",method = RequestMethod.GET)
    public ResponseEntity<?> khachhang() throws IOException{

        return ResponseEntity.ok(khachHangRepo.findAll());
    }
    @PostMapping("kh/add")
    public KhachHang add(@RequestBody KhachHang khachHang){
//        khachHang.setTrang_thai(TrangThai.HOATDONG);
        khachHang.setTrang_thai(TrangThai.hoatdong);
      return   khachHangRepo.save(khachHang);

    }
   @PatchMapping("kh/delete/{id}")

   public KhachHang delete(@PathVariable UUID id){
        KhachHang khachHang=khachHangRepo.findById(id).orElse(null);
       khachHang.setTrang_thai(TrangThai.khonghoatdong);
    return khachHangRepo.save(khachHang);

 }

    @GetMapping("/view-update/{id}")
    public KhachHang viewUpdate(@PathVariable UUID id){

        return khachHangRepo.findById(id).orElse(null);
    }

    @PutMapping("/kh/update/{id}")
    public KhachHang update( @RequestBody KhachHang khachHang , @PathVariable  UUID id){
        KhachHang kh = khachHangRepo.findById(id).orElse(null);
        kh.setSo_dien_thoai(khachHang.getSo_dien_thoai());
        kh.setTen_day_du(khachHang.getTen_day_du());
        kh.setTai_khoan(khachHang.getTai_khoan());
        kh.setMat_khau(khachHang.getMat_khau());
        kh.setEmail(khachHang.getEmail());
        kh.setNgay_sinh(khachHang.getNgay_sinh());
        kh.setAnh(khachHang.getAnh());
        kh.setGioi_tinh(khachHang.getGioi_tinh());



        return  khachHangRepo.save(kh);

    }
 }


