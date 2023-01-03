package com.kabilesh.service;

import com.kabilesh.dao.User;
import com.kabilesh.generated.Dto.UserDTO;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserTranslator {
    public static User translator(UserDTO userDTO) throws ParseException {
        User user = new User();
        if (userDTO.getFirstName() != null && !userDTO.getFirstName().isEmpty()) {
            user.setFirstName(userDTO.getFirstName());
        }
        if (userDTO.getLastName() != null && !userDTO.getLastName().isEmpty()) {
            user.setLastName(userDTO.getLastName());
        }
        if (userDTO.getAge() != null && userDTO.getAge() > 0) {
            user.setAge(userDTO.getAge());
        }
        if (userDTO.getId() > 0) {
            user.setId(userDTO.getId());
        }
        if (userDTO.getIsDeleted() != null) {
            user.setIsDeleted(userDTO.getIsDeleted());
        }
        if (userDTO.getCreatedOn() != null) {
            user.setCreatedOn(new SimpleDateFormat("dd/MM/yyyy").parse(userDTO.getCreatedOn()));
        }
        if (userDTO.getUpdatedOn() != null) {
            user.setUpdatedOn(new SimpleDateFormat("dd/MM/yyyy").parse(userDTO.getUpdatedOn()));
        }
        return user;
    }

    public static UserDTO translator(User user) {
        UserDTO userDTO = new UserDTO();
        if (user.getFirstName() != null && !user.getFirstName().isEmpty()) {
            userDTO.setFirstName(user.getFirstName());
        }
        if (user.getLastName() != null && !user.getLastName().isEmpty()) {
            userDTO.setLastName(user.getLastName());
        }
        if (user.getAge() != null && user.getAge() > 0) {
            userDTO.setAge(user.getAge());
        }
        if (user.getId() > 0) {
            userDTO.setId(user.getId());
        }
        if (user.getIsDeleted() != null) {
            userDTO.setIsDeleted(user.getIsDeleted());
        }
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        if (user.getCreatedOn() != null) {
            userDTO.setCreatedOn(dateFormat.format(user.getCreatedOn()));
        }
        if (user.getUpdatedOn() != null) {
            userDTO.setUpdatedOn(dateFormat.format(user.getUpdatedOn()));
        }
        return userDTO;
    }
}