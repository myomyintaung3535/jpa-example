package dev.startup.jpaexample;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "credit_card")
public class CreditCard {
    @Id
    private String number;
    private String expireDate;
    private Integer ctrlNumber;
    @Convert(converter = CreditCardTypeConvertor.class)
    private CreditCartType cartType;

}
