package com.Rythmix.Project.Service;

import com.Rythmix.Project.model.Users;
import com.Rythmix.Project.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    public Optional<Users> getUserById(Long id) {
        return usersRepository.findById(id);
    }

    public Users createUser(Users user) {
        return usersRepository.save(user);
    }

    public Users updateUser(Long id, Users updatedUser) {
        return usersRepository.findById(id).map(user -> {
            user.setUsername(updatedUser.getUsername());
            user.setEmail(updatedUser.getEmail());
            user.setPassword(updatedUser.getPassword());
            user.setPlan(updatedUser.getPlan());
            user.setCountry(updatedUser.getCountry());
            user.setAge(updatedUser.getAge());
            return usersRepository.save(user);
        }).orElse(null);
    }

    public void deleteUser(Long id) {
        usersRepository.deleteById(id);
    }
}
