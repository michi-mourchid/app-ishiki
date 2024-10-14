package com.example.ishiki.service;

import com.example.ishiki.dao.UserDAO;
import com.example.ishiki.dto.UserDTO;
import com.example.ishiki.mapper.UserMapper;
import com.example.ishiki.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public List<User> getAllUsers() {
        return userDAO.findAll();
    }
    public User getUserById(Long id) {
        return  userDAO.findById(id).orElseThrow();
    }

    @Transactional
    public void deleteUserById(Long id) {
        userDAO.deleteById(id);
    }

    @Transactional
    public void saveUser(UserDTO userDTO) {
        User user;
        try {
            user = UserMapper.fromUserDTO(userDTO,null);
            userDAO.save(user);
        } catch (Exception e){
            throw new RuntimeException("Error while saving user");
        }
    }

    public User saveUser(User user){
        try {
            return userDAO.save(user);
        } catch (Exception e){
            throw new RuntimeException("Error while saving user");
        }
    }

    @Transactional
    public void updateUser(UserDTO userDTO, Long id) {
        userDAO.findById(id).orElseThrow(()->new RuntimeException("User not found"));
        User user;
        try {
            user = UserMapper.fromUserDTO(userDTO,null);
            userDAO.save(user);
        } catch (Exception e){
            throw new RuntimeException("Error while updating user");
        }
    }
}