package me.dio.santanderbootcamp2023.model;

import java.sql.Timestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity(name = "tb_user_posts")
public class UserPost {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String postContent;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp timeDate;
    @ManyToOne
    private User user;

    public String getPostContent() {
        return postContent;
    }
   
}
