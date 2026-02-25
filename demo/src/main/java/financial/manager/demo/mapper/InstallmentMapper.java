package financial.manager.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import financial.manager.demo.DTO.InstallmentDTO;
import financial.manager.demo.model.Installment;

@Mapper(componentModel = "spring")
public interface InstallmentMapper {
    InstallmentDTO toDTO(Installment installment);

    @Mapping(target = "id", ignore = true)
    Installment toEntity(InstallmentDTO installmentDTO);
}