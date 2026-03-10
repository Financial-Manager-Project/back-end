package financial.manager.demo.service.impl;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import financial.manager.demo.DTO.request.user.UserRequestBasicDTO;
import financial.manager.demo.DTO.request.user.UserRequestDTO;
import financial.manager.demo.DTO.response.user.UserResponseSummaryDTO;
import financial.manager.demo.DTO.update.UserUpdateDTO;
import financial.manager.demo.mapper.UserMapper;
import financial.manager.demo.repository.UserRepository;
import financial.manager.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper; 
    }

    @Override
    public List<UserResponseSummaryDTO> getAllUsers() {
        return userMapper.toUserListDTO(userRepository.findAll());
    }

    @Override 
    public UserResponseSummaryDTO getUserById(UserRequestBasicDTO request){
        return userMapper.toUserDTO(userRepository.findById(request.getId())
                         .orElseThrow(() -> new RuntimeException("User not Found")));
    }

    @Override
    public void deleteUserById(UUID id){
        if(!userRepository.existsById(id)) {
            throw new RuntimeException("User not Found");
        }
        userRepository.deleteById(id);
    }
}
