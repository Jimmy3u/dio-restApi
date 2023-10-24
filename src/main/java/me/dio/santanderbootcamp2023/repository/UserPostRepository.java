package me.dio.santanderbootcamp2023.repository;

import me.dio.santanderbootcamp2023.model.UserPost;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface UserPostRepository extends JpaRepository<UserPost, Long> {

    @Query(value = "SELECT * FROM TB_USER_POSTS WHERE POSTER_ID = :POSTER_ID", nativeQuery = true)
    List<UserPost> findByUser(@Param("POSTER_ID") Long userId);
}
