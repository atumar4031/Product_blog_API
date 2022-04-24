package com.productblog.repositories;

import com.productblog.models.Like;
import com.productblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikesRepository extends JpaRepository<Like, Long> {
    Optional<Like> findByUser(User user);

}
