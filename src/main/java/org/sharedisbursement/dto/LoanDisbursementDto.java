package org.sharedisbursement.dto;

/*This dto represents the request body of loan disbursement api */
public class LoanDisbursementDto {
    private String tracerId;
    private String userId; //mandatory
    private String businessDate; //mandatory - Date Format: dd-MM-yyyy
    private String branchId; //mandatory
    private String loanProposalId; //mandatory
    private String actualDisbursedAmount; //mandatory
    private String modeOfPayment; //mandatory
    private String modeOfPaymentSubTypeId; //mandatory If modeOfPayment MODE_OF_PAYMENT_CHEQUE = 2
    private String bankAccountNo; //mandatory If modeOfPayment MODE_OF_PAYMENT_CHEQUE = 2
    private String chequeNumber; //mandatory If modeOfPayment MODE_OF_PAYMENT_CHEQUE = 2
    private String chequeDate; //mandatory If modeOfPayment MODE_OF_PAYMENT_CHEQUE = 2 -Date Format: dd-MM-yyyy
    private String moneyTransactionNo; //mandatory If modeOfPayment MODE_OF_PAYMENT_MOBILE_MONEY = 5
    private String moneyTransactionDate; //mandatory If modeOfPayment MODE_OF_PAYMENT_MOBILE_MONEY = 5
    private String ageType;
    private String insurerDateOfBirth; // Date Format: dd-MM-yyyy
    private String premiumModeOfPaymentId;
    private String walletNo;
    private String walletType;



    public String getTracerId() {
        return tracerId;
    }

    public void setTracerId(String tracerId) {
        this.tracerId = tracerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getLoanProposalId() {
        return loanProposalId;
    }

    public void setLoanProposalId(String loanProposalId) {
        this.loanProposalId = loanProposalId;
    }

    public String getActualDisbursedAmount() {
        return actualDisbursedAmount;
    }

    public void setActualDisbursedAmount(String actualDisbursedAmount) {
        this.actualDisbursedAmount = actualDisbursedAmount;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public String getModeOfPaymentSubTypeId() {
        return modeOfPaymentSubTypeId;
    }

    public void setModeOfPaymentSubTypeId(String modeOfPaymentSubTypeId) {
        this.modeOfPaymentSubTypeId = modeOfPaymentSubTypeId;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public String getChequeDate() {
        return chequeDate;
    }

    public void setChequeDate(String chequeDate) {
        this.chequeDate = chequeDate;
    }

    public String getMoneyTransactionNo() {
        return moneyTransactionNo;
    }

    public void setMoneyTransactionNo(String moneyTransactionNo) {
        this.moneyTransactionNo = moneyTransactionNo;
    }

    public String getMoneyTransactionDate() {
        return moneyTransactionDate;
    }

    public void setMoneyTransactionDate(String moneyTransactionDate) {
        this.moneyTransactionDate = moneyTransactionDate;
    }

    public String getAgeType() {
        return ageType;
    }

    public void setAgeType(String ageType) {
        this.ageType = ageType;
    }

    public String getInsurerDateOfBirth() {
        return insurerDateOfBirth;
    }

    public void setInsurerDateOfBirth(String insurerDateOfBirth) {
        this.insurerDateOfBirth = insurerDateOfBirth;
    }

    public String getPremiumModeOfPaymentId() {
        return premiumModeOfPaymentId;
    }

    public void setPremiumModeOfPaymentId(String premiumModeOfPaymentId) {
        this.premiumModeOfPaymentId = premiumModeOfPaymentId;
    }

    public String getWalletNo() {
        return walletNo;
    }

    public void setWalletNo(String walletNo) {
        this.walletNo = walletNo;
    }

    public String getWalletType() {
        return walletType;
    }

    public void setWalletType(String walletType) {
        this.walletType = walletType;
    }


    public String getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(String businessDate) {
        this.businessDate = businessDate;
    }

    @Override
    public String toString() {
        return "LoanDisbursementDto{" +
                "tracerId='" + tracerId + '\'' +
                ", userId='" + userId + '\'' +
                ", businessDate='" + businessDate + '\'' +
                ", branchId='" + branchId + '\'' +
                ", loanProposalId='" + loanProposalId + '\'' +
                ", actualDisbursedAmount='" + actualDisbursedAmount + '\'' +
                ", modeOfPayment='" + modeOfPayment + '\'' +
                ", modeOfPaymentSubTypeId='" + modeOfPaymentSubTypeId + '\'' +
                ", bankAccountNo='" + bankAccountNo + '\'' +
                ", chequeNumber='" + chequeNumber + '\'' +
                ", chequeDate='" + chequeDate + '\'' +
                ", moneyTransactionNo='" + moneyTransactionNo + '\'' +
                ", moneyTransactionDate='" + moneyTransactionDate + '\'' +
                ", ageType='" + ageType + '\'' +
                ", insurerDateOfBirth='" + insurerDateOfBirth + '\'' +
                ", premiumModeOfPaymentId='" + premiumModeOfPaymentId + '\'' +
                ", walletNo='" + walletNo + '\'' +
                ", walletType='" + walletType + '\'' +
                '}';
    }
}
