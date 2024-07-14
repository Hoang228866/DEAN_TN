package com.example.demo.ConTroller;

import com.example.demo.Entity.KhachHang;
import com.example.demo.Entity.NhanVien;
import com.example.demo.Repo.NhanVienRepo;
import com.example.demo.enums.Quyen;
import com.example.demo.enums.TrangThai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.UUID;

@RestController
@CrossOrigin("*")
public class NhanVienController {
    @Autowired
    NhanVienRepo nhanVienRepo;


    @RequestMapping(value = "nv/hien-thi",method = RequestMethod.GET)
    public ResponseEntity<?> nhanvien() throws IOException {

        return ResponseEntity.ok(nhanVienRepo.findAll());
    }
    @PostMapping("nv/add")
    public NhanVien add(@RequestBody NhanVien nhanVien){
//        khachHang.setTrang_thai(TrangThai.HOATDONG);
        nhanVien.setTrang_thai(TrangThai.hoatdong);
        return   nhanVienRepo.save(nhanVien);

    }
    @PatchMapping("nv/delete/{id}")

    public NhanVien delete(@PathVariable UUID id){
        NhanVien nhanVien=nhanVienRepo.findById(id).orElse(null);
        nhanVien.setTrang_thai(TrangThai.khonghoatdong);
        return nhanVienRepo.save(nhanVien);

    }


    @PutMapping("/nv/update/{id}")
    public NhanVien update( @RequestBody NhanVien nhanVien , @PathVariable  UUID id){
        NhanVien nv = nhanVienRepo.findById(id).orElse(null);
        nv.setSo_dien_thoai(nhanVien.getSo_dien_thoai());
        nv.setTen_day_du(nhanVien.getTen_day_du());
        nv.setTai_khoan(nhanVien.getTai_khoan());
        nv.setMat_khau(nhanVien.getMat_khau());
        nv.setEmail(nhanVien.getEmail());
        nv.setNgay_sinh(nhanVien.getNgay_sinh());
        nv.setAnh(nhanVien.getAnh());
//        nv.setQuyen(Quyen.NhanVien);
        nv.setNgay_tao(nhanVien.getNgay_tao());
        nv.setDia_chi(nhanVien.getDia_chi());
        nv.setManv(nhanVien.getManv());




        return  nhanVienRepo.save(nv);

    }
    @GetMapping("nv/view-update/{id}")
    public NhanVien viewUpdate(@PathVariable UUID id){

        return nhanVienRepo.findById(id).orElse(null);
    }
}
