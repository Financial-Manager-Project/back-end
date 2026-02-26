package financial.manager.demo.DTO.response.bank;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BankResponseSummaryDTO {
    private UUID id;
    private String name;
}   
