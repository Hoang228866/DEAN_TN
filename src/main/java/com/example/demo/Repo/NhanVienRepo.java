package com.example.demo.Repo;

import com.example.demo.Entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.rmi.server.UID;
import java.util.UUID;

public interface NhanVienRepo extends JpaRepository<NhanVien, Long> {
}
