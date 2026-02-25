package financial.manager.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import financial.manager.demo.DTO.UserDTO;
import financial.manager.demo.model.User;

@Mapper(componentModel = "spring")
interface UserMapper {
    UserDTO toDTO(User user);

    @Mapping(target = "id", ignore = true)
    User toEntity(UserDTO userDTO);
}
