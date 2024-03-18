package com.sample.bankingapi.service.impl;

import com.sample.bankingapi.dto.AccountDto;
import com.sample.bankingapi.entity.Account;
import com.sample.bankingapi.mapper.AccountMapper;
import com.sample.bankingapi.repository.AccountRepository;
import com.sample.bankingapi.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl  implements AccountService {

    private AccountRepository accountRepository;


    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }

    public AccountDto createaccount(AccountDto accountDto){
        Account account = AccountMapper.mapToAccount(accountDto);
        @SuppressWarnings("null")
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);

    }
}
