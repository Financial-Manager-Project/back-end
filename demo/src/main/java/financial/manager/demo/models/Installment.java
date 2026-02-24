package financial.manager.demo.models;

import java.util.UUID;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "installment")
public class Installment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "installment_id")
    private UUID id;

    @Column(name = "installment_value", nullable = false)
    private double totalInstallmentValue;

    @Column(name = "amount_installment", nullable = false)
    private int amountInstallment;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category categoryId;

    @ManyToOne
    @JoinColumn(name = "credit_card_id", nullable = false)
    private CreditCard creditCard;
}
