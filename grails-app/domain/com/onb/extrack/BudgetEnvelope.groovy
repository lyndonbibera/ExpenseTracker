package com.onb.extrack

class BudgetEnvelope {

    String name
    BigDecimal budget
    BigDecimal runningBalance
    boolean active
    User user

    static hasMany = [transactions: Transaction]

    static belongsTo = [User]

    static constraints = {
    }
}
