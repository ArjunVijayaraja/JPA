package com.example.springboot_jpa_demo.Service;

import com.example.springboot_jpa_demo.Entity.User;
import com.example.springboot_jpa_demo.Repository.userRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class userServiceImpl implements userService{
    private userRepository userRepository;


    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser =  userRepository.findById(userId);
        //.get() is used to get the value from the optionalUser variable;
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUser() {
        //this return method will return all the user in a list format;
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        //For update first we have to find the user and then only we should update the value
        User existingUser =  userRepository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());

        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);

    }
}
