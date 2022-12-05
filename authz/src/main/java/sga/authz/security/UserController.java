package sga.authz.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@CrossOrigin({"*"})
@RequestMapping("/api/user")
public class UserController {
    
    
    @Autowired UserService userService;

    @PreAuthorize("hasAuthority('USUARIO_LEER')")
    @GetMapping(value="/")
    public List<User> findAll() {
        return userService.findAll();
    }
    
}
