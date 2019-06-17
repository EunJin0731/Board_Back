package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Domain.User;
import kr.hs.dgsw.board_back.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "/users")
    public List findAll() {
        return this.userService.findAll();
    }

    @DeleteMapping(value = "/deleteUser/{id}")
    public int deleteUser(@PathVariable Long id){
        return this.userService.deleteById(id);
    }

    @PutMapping(value = "/updateUser/{id}")
    public int updateUser(@RequestBody User user){
        return this.userService.modify(user);
    }

    @GetMapping(value = "/user/{id}")
    public User findById(@PathVariable Long id){
        return this.userService.findById(id);
    }

    @PostMapping(value = "/addUser")
    public Long addUser(@RequestBody User user){
        return this.userService.add(user);
    }
}
