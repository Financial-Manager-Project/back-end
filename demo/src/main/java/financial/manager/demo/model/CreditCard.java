package financial.manager.demo.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "credit_card")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "credit_card_id")
    private UUID id;

    @Column(name = "credit_card_name", nullable = false)
    private String name;

    @Column(name = "credit_limit", nullable = false)
    private double creditLimit;

    @Column(name = "closing_day", nullable = false)
    private LocalDate closingDay;

    @Column(name = "due_day", nullable = false)
    private LocalDate dueDay;

    @ManyToOne
    @JoinColumn(name = "bank_id", nullable = false)
    private Bank bankId;
}
