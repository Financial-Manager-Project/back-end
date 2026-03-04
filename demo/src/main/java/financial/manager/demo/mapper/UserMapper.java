package financial.manager.demo.mapper;

import org.mapstruct.Mapper;

import financial.manager.demo.DTO.update.UserUpdateDTO;
import financial.manager.demo.model.User;

@Mapper(componentModel = "spring")
interface UserMapper {
    User toEntityUpdate(UserUpdateDTO user);
    UserUpdateDTO toDTOUpdate(User user);

    List<UserResponseSummatyDTO>
}
