package com.example.demo.Model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Login")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
    private String username;
    private String password;

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        password = password;
    }
}
