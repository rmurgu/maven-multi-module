package mappers;

import commands.UserCommand;
import entities.User;
import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userCommandToUser(UserCommand userCommand);

    UserCommand userToUserCommand(User user);
}
