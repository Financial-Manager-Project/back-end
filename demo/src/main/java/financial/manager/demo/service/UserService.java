package financial.manager.demo.service;

import java.util.List;

import financial.manager.demo.DTO.request.user.UserRequestBasicDTO;
import financial.manager.demo.DTO.request.user.UserRequestDTO;
import financial.manager.demo.DTO.response.user.UserResponseSummaryDTO;

public interface UserService {
    List<UserResponseSummaryDTO> getAllUsers();

    UserResponseSummaryDTO getUserById(UserRequestBasicDTO id);

    UserResponseSummaryDTO createUser(UserRequestDTO data);

    UserResponseSummaryDTO updateUserById(UserRequestBasicDTO id, UserRequestDTO data);

    void deleteUserById(UserRequestBasicDTO id);
}
