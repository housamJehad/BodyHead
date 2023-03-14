package org.innsys.models.db;

import javax.persistence.*;

@Entity
@Table(name = "user_function")
public class UserFunction {

    @Id
    @SequenceGenerator(
            name = "function_sequence",
            sequenceName = "function_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "function_sequence"
    )
    private Long userFunctionId;
    @Column(length = 6)
    private String functionCode;
    @Column(length = 20)
    private String functionEnglishName;
    @Column(length = 20)
    private String functionArabicName;

    @Column(length = 1)
    private String functionActivationStatus;

    @Column(length = 1)
    private String accountRequiredForDebiting;

    @Column(length = 1)
    private String accountRequiredForCrediting;

    @Column(length = 1)
    private String accountRequiredForViewing;

    @Column(length = 1)
    private String accessFlag;

    @Column(length = 1)
    private String viewAccessFlag;

    @Column(length = 1)
    private String debitAccessFlag;

    @Column(length = 1)
    private String dimmedFlag;


    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public void setFunctionEnglishName(String functionEnglishName) {
        this.functionEnglishName = functionEnglishName;
    }

    public void setFunctionArabicName(String functionArabicName) {
        this.functionArabicName = functionArabicName;
    }

    public void setFunctionActivationStatus(String functionActivationStatus) {
        this.functionActivationStatus = functionActivationStatus;
    }

    public void setAccountRequiredForDebiting(String accountRequiredForDebiting) {
        this.accountRequiredForDebiting = accountRequiredForDebiting;
    }

    public void setAccountRequiredForCrediting(String accountRequiredForCrediting) {
        this.accountRequiredForCrediting = accountRequiredForCrediting;
    }

    public void setAccountRequiredForViewing(String accountRequiredForViewing) {
        this.accountRequiredForViewing = accountRequiredForViewing;
    }

    public void setAccessFlag(String accessFlag) {
        this.accessFlag = accessFlag;
    }

    public void setViewAccessFlag(String viewAccessFlag) {
        this.viewAccessFlag = viewAccessFlag;
    }

    public void setDebitAccessFlag(String debitAccessFlag) {
        this.debitAccessFlag = debitAccessFlag;
    }

    public void setDimmedFlag(String dimmedFlag) {
        this.dimmedFlag = dimmedFlag;
    }


    public Long getUserFunctionId() {
        return userFunctionId;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public String getFunctionEnglishName() {
        return functionEnglishName;
    }

    public String getFunctionArabicName() {
        return functionArabicName;
    }

    public String getFunctionActivationStatus() {
        return functionActivationStatus;
    }

    public String getAccountRequiredForDebiting() {
        return accountRequiredForDebiting;
    }

    public String getAccountRequiredForCrediting() {
        return accountRequiredForCrediting;
    }

    public String getAccountRequiredForViewing() {
        return accountRequiredForViewing;
    }

    public String getAccessFlag() {
        return accessFlag;
    }

    public String getViewAccessFlag() {
        return viewAccessFlag;
    }

    public String getDebitAccessFlag() {
        return debitAccessFlag;
    }

    public String getDimmedFlag() {
        return dimmedFlag;
    }
}
