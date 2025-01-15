package com.dw.dynamic.controller;

import com.dw.dynamic.DTO.UserDTO;
import com.dw.dynamic.exception.UnauthorizedUserException;
import com.dw.dynamic.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public ResponseEntity<UserDTO> register(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(
                userService.getAllUsers(userDTO),
                HttpStatus.CREATED);
    }

@PostMapping("user/login")
public ResponseEntity<String> login(@RequestBody UserDTO userDTO,
                                    HttpServletRequest request) {
    String username = userDTO.getUserName();
    String password = userDTO.getPassword();

    if(userService.validateUser(usename, password)) {
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        return new ResponseEntity<>(
                "Login successful",
                HttpStatus.OK);
    }else {
        throw new UnauthorizedUserException("Authentication Failed");
    }
}

@PostMapping("/logout")
    public ResponseEntity<String> logout(HttpServletRequest request, HttpServletRequest response) {
        request.getSession().invalidate();
        return new ResponseEntity<>(
                "정상 로그아웃 되었습니다.",
                HttpStatus.OK);
}

@GetMapping("/user/exist-business-operator/{exist-business-operator}")
    public ResponseEntity<UserDTO>getUserByExistBusinessOperator (@PathVariable boolean existBusinessOperator ) {
        return new ResponseEntity<>(
                userService.getUserByExistBusinessOperator,
                HttpStatus.OK);
}

@GetMapping("user/realname/{realname}")
    public ResponseEntity<UserDTO>getUserByRealName (@PathVariable UserDTO userDTO) {
        return new ResponseEntity<>(
                userService.getUserByRealName,
                HttpStatus.OK);
}
}
