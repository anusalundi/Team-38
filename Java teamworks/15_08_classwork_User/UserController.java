package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.DTOs.UpdateUserDTO;
import com.datorium.Datorium.API.DTOs.User;
import com.datorium.Datorium.API.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    public UserController(){
        userService = new UserService();
    }
    //CRUD
    //AddUser
    //UpdateUser
    //GetUser
    //DeleteUser

    @PostMapping("/add") //localhost:8080/user/add
    public int add(@RequestBody User user){
        return userService.add(user);
    }

    @GetMapping("/get") //localhost:8080/user/add
    public ArrayList<User> get() {
        return userService.get();
    }

    @PostMapping("/update")
    public User update(@RequestBody UpdateUserDTO updateUserDTO){
       return userService.update(updateUserDTO.userIndex,updateUserDTO.user);
    }
}
