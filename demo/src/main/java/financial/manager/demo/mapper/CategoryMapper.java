package financial.manager.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import financial.manager.demo.DTO.CategoryDTO;
import financial.manager.demo.model.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDTO toDTO(Category category);

    @Mapping(target = "id", ignore = true)
    Category toEntity (CategoryDTO categoryDTO);
}