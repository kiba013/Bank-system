package com.java.banksystem.server.service;import com.java.banksystem.server.entity.Transaction;import com.java.banksystem.web.dto.TransactionDto;import java.util.List;public interface TransactionService {    TransactionDto createTransaction(TransactionDto transactionDto);    List<TransactionDto> getAllTransactions();    TransactionDto getTransactionById(Long id);    void deleteTransaction(Long id);}