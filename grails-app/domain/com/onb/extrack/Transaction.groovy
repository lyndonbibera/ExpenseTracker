package com.onb.extrack

class Transaction {
    BigDecimal amount
    String transactedWith
    Date dateOfTransaction
    String note
    TransactionType transactionType
    BudgetEnvelope budgetEnvelope

    static belongsTo = [BudgetEnvelope]

    static constraints = {
        transactionType()
        amount()
        transactedWith()
        dateOfTransaction()
        note()
        budgetEnvelope()
    }
}

enum TransactionType {
    EXPENSE,
    INCOME
}
