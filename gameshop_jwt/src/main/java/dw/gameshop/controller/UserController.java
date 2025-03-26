package dw.gameshop.controller;

import dw.gameshop.dto.UserDTO;
import dw.gameshop.exception.UnauthorizedUserException;
import dw.gameshop.model.User;
import dw.gameshop.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class



UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(
                userService.registerUser(userDTO),
                HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDTO userDTO,
                                        HttpServletRequest request) {
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();

        if (userService.validateUser(username, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            return  new ResponseEntity<>(
                    "Login successful",
                    HttpStatus.OK);
        } else {
            throw new UnauthorizedUserException("Authentication Failed");
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().invalidate(); // 세션 종료
        return new ResponseEntity<>(
                "You have been logged out.",
                HttpStatus.OK);
    }

    //JWT에서는 일반적으로 클라이언트가 현재 유저정보를 확인할 필요는 없음. 하지만
    // 추가적인 사용자 정보나 최신 권한 상태를 확인해야 항 때, 또는 토큰 자체에 덤지 않은 정조를 제공할 필요가 있을 때 사용할 수 있음
    @GetMapping("/current-user")
    public ResponseEntity<UserDTO> getCurrentUser(HttpServletRequest request) {
        User user = userService.getCurrentUser(request);
        return new ResponseEntity<>(user.toDto(), HttpStatus.OK);
    }
}
