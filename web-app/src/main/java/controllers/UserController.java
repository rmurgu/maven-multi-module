package controllers;


import commands.UserCommand;
import entities.User;
import mappers.UserMapper;

public class UserController {

    User saveUser(UserCommand command) {
        // fake impl
        return UserMapper.INSTANCE.userCommandToUser(command);
    }

}
