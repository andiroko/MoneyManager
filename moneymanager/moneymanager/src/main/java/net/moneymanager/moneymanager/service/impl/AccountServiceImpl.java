package net.moneymanager.moneymanager.service.impl;

import lombok.AllArgsConstructor;
import net.moneymanager.moneymanager.dto.AccountDto;
import net.moneymanager.moneymanager.entity.Account;
import net.moneymanager.moneymanager.exceptions.ResourceNotFoundException;
import net.moneymanager.moneymanager.mapper.AccountMapper;
import net.moneymanager.moneymanager.repository.AccountRepository;
import net.moneymanager.moneymanager.service.AccountServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountServiceInterface {
    private AccountRepository accountRepository;

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.maptoAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.maptoAccountDto(savedAccount);
    }
    @Override
    public AccountDto getAccountbyID(Long accountId) {
       Account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new ResourceNotFoundException("This account doesn't exist"));
        return AccountMapper.maptoAccountDto(account);
    }

    @Override
    public AccountDto getAllAccounts() {
        List<Account> accounts = accountRepository.findAll();
        return (AccountDto) accounts.stream().map((account) -> AccountMapper.maptoAccountDto(account))
                .collect(Collectors.toList());
    }


}
