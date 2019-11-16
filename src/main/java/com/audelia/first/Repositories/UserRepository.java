package com.audelia.first.Repositories;

import com.audelia.first.Domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO,Integer> {
}
