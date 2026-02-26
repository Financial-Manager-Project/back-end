package financial.manager.demo.DTO.response.bank;

import java.util.List;

import financial.manager.demo.model.CreditCard;
import financial.manager.demo.model.Transactions;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BankResponseDetailsDTO {
    private String name;
    private List<CreditCard> creditCardList;
    private List<Transactions> transactionsList;
}
