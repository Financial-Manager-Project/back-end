package financial.manager.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import financial.manager.demo.DTO.request.user.UserRequestBasicDTO;
import financial.manager.demo.DTO.response.user.UserResponseSummaryDTO;
import financial.manager.demo.repository.UserRepository;
import financial.manager.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserResponseSummaryDTO> getAllUsers() {

        return userRepository.findAll()
                .stream()
                .map(user -> new UserResponseSummaryDTO(user.getUserName(), user.getEmail()))
                .toList();
    }

    @Override 
    public UserResponseSummaryDTO getUserById(UserRequestBasicDTO request){
        return userRepository.findById(request.getId())
                .map(user -> new UserResponseSummaryDTO(user.getUserName(), user.getEmail()))
                .orElseThrow(() -> new RuntimeException("User not Found"));
                
    }
}
