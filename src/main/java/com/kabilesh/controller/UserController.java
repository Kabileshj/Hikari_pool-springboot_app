package com.kabilesh.controller;

import com.kabilesh.generated.Dto.Error;
import com.kabilesh.generated.Dto.UserDTO;
import com.kabilesh.service.UserException;
import com.kabilesh.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable("id") long id) {
        try {
            return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
        } catch (UserException ex) {
            Error err = new Error();
            if (ex.getMessage().equals("No User Found")) {
                err.setMessage(ex.getMessage());
                err.setCode(404);
                return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
            } else if (ex.getMessage().equals("User already deleted")) {
                err.setMessage(ex.getMessage());
                err.setCode(400);
                return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
            } else {
                err.setMessage(ex.getMessage());
                err.setCode(500);
                return new ResponseEntity<>(err, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @GetMapping("/userall")
    public ResponseEntity<List<UserDTO>> getUsers() {
        try {
            return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
        } catch (UserException ex) {
            Error err = new Error();
            if (ex.getMessage().equals("No Users Found")) {
                err.setMessage(ex.getMessage());
                err.setCode(404);
                return new ResponseEntity(err, HttpStatus.NOT_FOUND);
            } else {
                err.setMessage(ex.getMessage());
                err.setCode(500);
                return new ResponseEntity(err, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PostMapping(value = "/user", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userdto) {
        return new ResponseEntity<>(userService.createUser(userdto), HttpStatus.OK);
    }

    @DeleteMapping("user/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") long id) {
        try {
            return new ResponseEntity<>(userService.deleteUser(id), HttpStatus.OK);
        } catch (UserException ex) {
            Error err = new Error();
            if (ex.getMessage().equals("No User Found")) {
                err.setMessage(ex.getMessage());
                err.setCode(404);
                return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
            } else if (ex.getMessage().equals("User already deleted")) {
                err.setMessage(ex.getMessage());
                err.setCode(400);
                return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
            } else {
                err.setMessage(ex.getMessage());
                err.setCode(500);
                return new ResponseEntity<>(err, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping(value = "/user/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity updateUser(@PathVariable("id") long id, @RequestBody UserDTO userdto) {
        try {
            return new ResponseEntity(userService.updateUser(id, userdto), HttpStatus.OK);
        } catch (UserException ex) {
            Error err = new Error();
            if (ex.getMessage().equals("No User Found")) {
                err.setMessage(ex.getMessage());
                err.setCode(404);
                return new ResponseEntity(err, HttpStatus.NOT_FOUND);
            } else if (ex.getMessage().equals("User already deleted can't update")) {
                err.setMessage(ex.getMessage());
                err.setCode(400);
                return new ResponseEntity(err, HttpStatus.BAD_REQUEST);
            } else {
                err.setMessage(ex.getMessage());
                err.setCode(500);
                return new ResponseEntity(err, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}