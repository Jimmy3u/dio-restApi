package me.dio.santanderbootcamp2023.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user",cascade = CascadeType.ALL)
    private List<UserPost> posts;
    private String avatarImg;

    public Long getId() {
        return id;
    }
    public List<UserPost> getPosts() {
        return posts;
    }
    public String getUserName() {
        return userName;
    }
    public String getAvatarImg() {
        return avatarImg;
    }
}
