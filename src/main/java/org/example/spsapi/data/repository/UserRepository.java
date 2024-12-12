package org.example.spsapi.data.repository;
import org.example.spsapi.data.entity.T_userEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<T_userEntity, String > {
}
