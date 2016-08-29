
package org.opentravel.ota;

/** 
 * Customer bank accounts for payments, either for paper checks or electronic funds transfer.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BankAcctType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="BankAcctName" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="BankID"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="AcctType"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="BankAcctNumber"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="ChecksAcceptedInd"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BankAcctType
{
    private String bankAcctName;
    private PrivacyGroup privacyGroup;
    private String bankID;
    private String acctType;
    private String bankAcctNumber;
    private Boolean checksAcceptedInd;

    /** 
     * Get the 'BankAcctName' element value. The name the account is held under.
     * 
     * @return value
     */
    public String getBankAcctName() {
        return bankAcctName;
    }

    /** 
     * Set the 'BankAcctName' element value. The name the account is held under.
     * 
     * @param bankAcctName
     */
    public void setBankAcctName(String bankAcctName) {
        this.bankAcctName = bankAcctName;
    }

    /** 
     * Get the 'PrivacyGroup' attributeGroup value.
     * 
     * @return value
     */
    public PrivacyGroup getPrivacyGroup() {
        return privacyGroup;
    }

    /** 
     * Set the 'PrivacyGroup' attributeGroup value.
     * 
     * @param privacyGroup
     */
    public void setPrivacyGroup(PrivacyGroup privacyGroup) {
        this.privacyGroup = privacyGroup;
    }

    /** 
     * Get the 'BankID' attribute value. Code assigned by authorities to financial institutions; sometimes called bank routing number.
     * 
     * @return value
     */
    public String getBankID() {
        return bankID;
    }

    /** 
     * Set the 'BankID' attribute value. Code assigned by authorities to financial institutions; sometimes called bank routing number.
     * 
     * @param bankID
     */
    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    /** 
     * Get the 'AcctType' attribute value. Describes the bank account used for financing travel (e.g., checking, savings, investment).
    				
     * 
     * @return value
     */
    public String getAcctType() {
        return acctType;
    }

    /** 
     * Set the 'AcctType' attribute value. Describes the bank account used for financing travel (e.g., checking, savings, investment).
    				
     * 
     * @param acctType
     */
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    /** 
     * Get the 'BankAcctNumber' attribute value. Identifier for the account assigned by the bank.
     * 
     * @return value
     */
    public String getBankAcctNumber() {
        return bankAcctNumber;
    }

    /** 
     * Set the 'BankAcctNumber' attribute value. Identifier for the account assigned by the bank.
     * 
     * @param bankAcctNumber
     */
    public void setBankAcctNumber(String bankAcctNumber) {
        this.bankAcctNumber = bankAcctNumber;
    }

    /** 
     * Get the 'ChecksAcceptedInd' attribute value. If true, checks are accepted. If false, checks are not accepted.
     * 
     * @return value
     */
    public Boolean getChecksAcceptedInd() {
        return checksAcceptedInd;
    }

    /** 
     * Set the 'ChecksAcceptedInd' attribute value. If true, checks are accepted. If false, checks are not accepted.
     * 
     * @param checksAcceptedInd
     */
    public void setChecksAcceptedInd(Boolean checksAcceptedInd) {
        this.checksAcceptedInd = checksAcceptedInd;
    }
}
