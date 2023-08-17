package backend.example.myproj3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.example.myproj3.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
