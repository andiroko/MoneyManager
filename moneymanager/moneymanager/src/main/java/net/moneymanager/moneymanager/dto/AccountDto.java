package net.moneymanager.moneymanager.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data

public class AccountDto {
    private Long id;
    private String accountName;
    private Double amount;
    private String currency;
}
