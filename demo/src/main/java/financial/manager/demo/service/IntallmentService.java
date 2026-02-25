package financial.manager.demo.service;

import java.util.List;
import java.util.UUID;

import financial.manager.demo.DTO.InstallmentDTO;

interface IntallmentService {
    List<InstallmentDTO> getAllIntallment();
    InstallmentDTO getInstallmentById(UUID id);
    InstallmentDTO createInstallment(InstallmentDTO data);
    InstallmentDTO updateInstallmentById(UUID id, InstallmentDTO data);
    void deleteInstallmentById(UUID id);
}
