package net.moneymanager.moneymanager.controller;

import net.moneymanager.moneymanager.dto.AccountDto;
import net.moneymanager.moneymanager.service.AccountServiceInterface;
import net.moneymanager.moneymanager.service.impl.AccountServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")

public class AccountController {
    private AccountServiceInterface accountService;

    public AccountController(AccountServiceInterface accountService){
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@RequestBody AccountDto accountDto){
        AccountDto savedAccount = accountService.createAccount(accountDto);
        return new ResponseEntity<>(savedAccount, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable("id") Long accountId){
        AccountDto accountDto = accountService.getAccountbyID(accountId);
        return ResponseEntity.ok(accountDto);
    }
    public ResponseEntity<List<AccountDto>> getAllAccounts(){
       List<AccountDto>  = accountService.getAllAccounts();

    }
}
