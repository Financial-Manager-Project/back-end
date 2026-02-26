package financial.manager.demo.DTO.response.category;


import java.util.List;

import financial.manager.demo.model.CreditCard;
import financial.manager.demo.model.Installment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryResponseDetailsDTO {
    private List<CreditCard> creditCardList;
    private List<Installment> installmentList;
}
