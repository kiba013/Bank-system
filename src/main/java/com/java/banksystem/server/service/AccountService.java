package com.java.banksystem.server.service;import com.java.banksystem.web.dto.AccountDto;import com.java.banksystem.web.dto.UserDto;import java.math.BigDecimal;import java.util.List;public interface AccountService {    AccountDto createAccount(Long user_id, AccountDto accountDto);    List<AccountDto> getAllAccounts();    AccountDto getAccountById(Long id);    void deleteAccount(Long id);}