package com.java.banksystem.web.dto;import com.java.banksystem.server.entity.User;import lombok.Data;import java.math.BigDecimal;@Datapublic class AccountDto {    private Long id;    private String accountNumber;    private BigDecimal balance;    private User user;}