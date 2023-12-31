package me.dio.santanderbootcamp2023.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_user_posts")
public class UserPost {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String postContent;
    @ManyToOne
    @JoinColumn(name="poster_id", referencedColumnName = "id")
    private User user;

    public Long getId() {
        return id;
    }
    public String getPostContent() {
        return postContent;
    }
   
}
