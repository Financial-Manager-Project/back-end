package financial.manager.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import financial.manager.demo.DTO.response.user.UserResponseSummaryDTO;
import financial.manager.demo.DTO.update.UserUpdateDTO;
import financial.manager.demo.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntityUpdate(UserUpdateDTO user);
    UserUpdateDTO toDTOUpdate(User user);

    List<UserResponseSummaryDTO> toUserListDTO(List<User> userList);

    UserResponseSummaryDTO toUserDTO(User user);   
}
