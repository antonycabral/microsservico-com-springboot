package springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
