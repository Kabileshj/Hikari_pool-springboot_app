package com.kabilesh.service;

import com.kabilesh.dao.User;
import com.kabilesh.generated.Dto.UserDTO;
import com.kabilesh.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public UserDTO getUserById(@PathVariable("id") long id) throws UserException {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            throw new UserException("No User Found");
        }
        if (user.getIsDeleted()) {
            throw new UserException("User already deleted");
        }
        return UserTranslator.translator(user);
    }

    public List<UserDTO> getUsers() throws UserException {
        List<UserDTO> allusers = new ArrayList<>();
        for (User user : userRepository.findAll()) {
            allusers.add(UserTranslator.translator(user));
        }
        if (allusers.size() < 1) {
            throw new UserException("No Users Found");
        }
        return allusers;
    }

    public UserDTO createUser(UserDTO userdto) {
        User user = new User();
        if (userdto.getFirstName() != null && !userdto.getFirstName().isEmpty()) {
            user.setFirstName(userdto.getFirstName());
        }
        if (userdto.getLastName() != null && !userdto.getLastName().isEmpty()) {
            user.setLastName(userdto.getLastName());
        }
        if (userdto.getAge() != null && userdto.getAge() > 0) {
            user.setAge(userdto.getAge());
        }
        user.setCreatedOn(new Date());
        user.setIsDeleted(false);
        user.setUpdatedOn(null);
        return UserTranslator.translator(userRepository.save(user));
    }

    public UserDTO deleteUser(long id) throws UserException {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            throw new UserException("No User Found");
        }
        if (user.getIsDeleted()) {
            throw new UserException("User already deleted");
        }
        user.setIsDeleted(true);
        return UserTranslator.translator(userRepository.save(user));
    }

    public UserDTO updateUser(long id, UserDTO userdto) throws UserException {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            throw new UserException("No User Found");
        }
        if (user.getIsDeleted()) {
            throw new UserException("User already deleted can't update");
        }
        if (userdto.getFirstName() != null && !userdto.getFirstName().isEmpty()) {
            user.setFirstName(userdto.getFirstName());
        }
        if (userdto.getLastName() != null && !userdto.getLastName().isEmpty()) {
            user.setLastName(userdto.getLastName());
        }
        if (userdto.getAge() != null && userdto.getAge() > 0) {
            user.setAge(userdto.getAge());
        }
        user.setUpdatedOn(new Date());
        return UserTranslator.translator(userRepository.save(user));
    }
}