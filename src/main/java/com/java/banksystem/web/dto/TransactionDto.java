package com.java.banksystem.web.dto;import com.java.banksystem.server.entity.Account;import lombok.Data;import java.math.BigDecimal;import java.time.LocalDateTime;@Datapublic class TransactionDto {    private Long id;    private Account senderAccount;    private Account recipientAccount;    private BigDecimal amount;    private LocalDateTime createdAt;}