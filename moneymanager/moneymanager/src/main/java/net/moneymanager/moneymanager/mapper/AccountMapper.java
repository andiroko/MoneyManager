package net.moneymanager.moneymanager.mapper;

import net.moneymanager.moneymanager.dto.AccountDto;
import net.moneymanager.moneymanager.entity.Account;

public class AccountMapper {


public static AccountDto maptoAccountDto(Account account){
    return new AccountDto(
            account.getId(),
            account.getAccountName(),
            account.getAmount(),
            account.getCurrency()
    );
    }

    public static Account maptoAccount(AccountDto accountDto){
        return new Account(
                accountDto.getId(),
                accountDto.getAccountName(),
                accountDto.getAmount(),
                accountDto.getCurrency()
        );
    }

}