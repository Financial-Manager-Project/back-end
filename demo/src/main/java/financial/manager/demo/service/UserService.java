package financial.manager.demo.service;

import java.util.List;
import java.util.UUID;

import financial.manager.demo.DTO.request.user.UserRequestBasicDTO;
import financial.manager.demo.DTO.request.user.UserRequestDTO;
import financial.manager.demo.DTO.response.user.UserResponseSummaryDTO;
import financial.manager.demo.DTO.update.UserUpdateDTO;

public interface UserService {
    List<UserResponseSummaryDTO> getAllUsers();

    UserResponseSummaryDTO getUserById(UserRequestBasicDTO id);

    UserResponseSummaryDTO createUser(UserRequestDTO data);

    UserResponseSummaryDTO updateUserById(UserRequestBasicDTO id, UserUpdateDTO data);

    void deleteUserById(UUID id);
}
