package me.dio.santanderbootcamp2023.repository;

import me.dio.santanderbootcamp2023.model.UserPost;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserPostRepository extends JpaRepository<UserPost, Long> {
    
}
