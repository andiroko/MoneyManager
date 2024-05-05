package net.moneymanager.moneymanager.service;

import net.moneymanager.moneymanager.dto.AccountDto;
import net.moneymanager.moneymanager.entity.Account;

public interface AccountServiceInterface {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountbyID(Long accountId);
    AccountDto getAllAccounts();

}
