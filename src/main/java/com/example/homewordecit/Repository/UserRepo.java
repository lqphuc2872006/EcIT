package com.example.homewordecit.Repository;

import com.example.homewordecit.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
