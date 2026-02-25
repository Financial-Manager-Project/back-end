package financial.manager.demo.service;

import java.util.List;
import java.util.UUID;

import financial.manager.demo.DTO.UserDTO;

interface UserService {
    List<UserDTO> getAllUser();
    UserDTO getUserById(UUID id);
    UserDTO createUser(UserDTO data);
    UserDTO updatedUserById(UUID id, UserDTO data);
    String deletedUserById(UUID id);
}
