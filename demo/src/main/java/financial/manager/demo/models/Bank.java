package financial.manager.demo.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "bank")
@Entity
public class Bank {

    @Id
    @Column(name = "bank_id")
    private UUID id;

    @NonNull
    @Column(name = "bank_name")
    private String name;
}
