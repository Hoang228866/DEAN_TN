package com.example.demo.Repo;


import com.example.demo.Entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface KhachHangRepo extends JpaRepository<KhachHang, UUID> {

}
