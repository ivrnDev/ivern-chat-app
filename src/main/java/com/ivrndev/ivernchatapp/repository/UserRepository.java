package com.ivrndev.ivernchatapp.repository;

import com.ivrndev.ivernchatapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
