package com.appbank.bank.model;

import java.time.LocalDateTime;

public class Transaction {
 private String type;
 private String amount;
 private Money accountId;
 private LocalDateTime Timestamp;
 
 
 public Transaction(LocalDateTime timestamp) {
    Timestamp = timestamp;
 }


 public Transaction(String type, String amount, Money accountId) {
    this.type = type;
    this.amount = amount;
    this.accountId = accountId;
 }


 public String getType() {
    return type;
 }


 public void setType(String type) {
    this.type = type;
 }


 public String getAmount() {
    return amount;
 }


 public void setAmount(String amount) {
    this.amount = amount;
 }


 public Money getAccountId() {
    return accountId;
 }


 public void setAccountId(Money accountId) {
    this.accountId = accountId;
 }


 public LocalDateTime getTimestamp() {
    return Timestamp;
 }


 public void setTimestamp(LocalDateTime timestamp) {
    Timestamp = timestamp;
 }

 
}
