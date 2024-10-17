package com.example.demo.Repository;

import com.example.demo.Model.UserDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDetailsRepository extends MongoRepository<UserDetails ,String> {
//    @Query(fields="{username : 0}")
    List<UserDetails> findByUsernameContaining(String username);

}
