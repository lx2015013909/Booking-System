package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
@CrossOrigin // 需要跨域
public class UserController {

    @Autowired
    private UserService userService;


    @ResponseBody
    @PostMapping("/login")
    public User login(@RequestParam(value = "username") String username,@RequestParam(value = "password") String password) {

        User user=new User();
        user=userService.findByUsername(username,password);
       return  user;
    }

    @ResponseBody
    @PostMapping("/all")
    public List<User> selectAll() {

        List<User> users=userService.selectAll();
        return  users;
    }

    @ResponseBody
    @PostMapping("/add")
    public int insert(@RequestParam(value = "username") String username,
                      @RequestParam(value = "password") String password,
                      @RequestParam(value = "name") String name,
                      @RequestParam(value = "academy") String academy,
                      @RequestParam(value = "flag") String flag) {
        return userService.insert(username, password, name, academy, flag);

    }

    @ResponseBody
    @PostMapping("/delete")
    public int insert(@RequestParam(value = "id") Integer id) {
        return userService.deleteById(id);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateById(@RequestParam(value = "id") Integer id,
                          @RequestParam(value = "password") String password) {
        return userService.updateById(id,password);
    }

}
