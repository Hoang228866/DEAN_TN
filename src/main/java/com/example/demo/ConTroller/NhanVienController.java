package com.example.demo.ConTroller;


import com.example.demo.Entity.NhanVien;
import com.example.demo.Repo.NhanVienRepo;
import com.example.demo.enums.TrangThai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

@RestController
@CrossOrigin("*")
public class NhanVienController {
    @Autowired
    NhanVienRepo nhanVienRepo;


    @RequestMapping(value = "nv/hien-thi",method = RequestMethod.GET)
    public ResponseEntity<?> NhanVien() throws IOException {

        return ResponseEntity.ok(nhanVienRepo.findAll());
    }
    @PostMapping("nv/add")
    public NhanVien add(@RequestBody NhanVien nhanVien){
     String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
       StringBuilder randomPart = new StringBuilder();
      Random random = new Random();
       int length = 5 + random.nextInt(3);  // Độ dài từ 8 đến 10 ký tự
      for (int i = 0; i < length; i++) {
            randomPart.append(characters.charAt(random.nextInt(characters.length())));
       }
       nhanVien.setTaiKhoan("TK"+ randomPart);
      nhanVien.setMatKhau("MT"+ randomPart);
        nhanVien.setMaNhanVien("NV"+ randomPart);
      nhanVien.setNgayTao(LocalDate.now());
        nhanVien.setTrangThai(TrangThai.HOẠTĐỘNG);
        return   nhanVienRepo.save(nhanVien);
//
  }
//@PostMapping("nv/add")
//public NhanVien add(@RequestBody NhanVien nv){
//
//    nv.setTrangThai(TrangThai.HOẠTĐỘNG);
////
//    return   nhanVienRepo.save(nv);
//
//}
    @PatchMapping("nv/delete/{id}")

    public NhanVien delete(@PathVariable UUID id){
        NhanVien nhanVien=nhanVienRepo.findById(id).orElse(null);

        if (nhanVien.getTrangThai() == TrangThai.HOẠTĐỘNG){ nhanVien.setTrangThai(TrangThai.KHÔNGHOẠTĐỘNG);
        }
        else if(nhanVien.getTrangThai() == TrangThai.KHÔNGHOẠTĐỘNG){ nhanVien.setTrangThai(TrangThai.HOẠTĐỘNG);
        }
        return nhanVienRepo.save(nhanVien);


    }


    @PutMapping("/nv/update/{id}")
    public NhanVien update( @RequestBody NhanVien nhanVien , @PathVariable  UUID id){
        NhanVien nv =nhanVienRepo.findById(id).orElse(null);
        nv.setSdt(nhanVien.getSdt());
        nv.setTenDayDu(nhanVien.getTenDayDu());
        nv.setEmail(nhanVien.getEmail());
        nv.setNgaySinh(nhanVien.getNgaySinh());
//        nv.setAnh(nhanVien.getAnh());
        nv.setGt(nhanVien.getGt());
        nv.setDiaChi(nhanVien.getDiaChi());




        return  nhanVienRepo.save(nv);

    }
    @GetMapping("nv/view-update/{id}")
    public NhanVien viewUpdate(@PathVariable UUID id){

        return nhanVienRepo.findById(id).orElse(null);
    }
}
