
package org.opentravel.ota;

/** 
 * Identification about a specific credit card
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PaymentCardType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="CardHolderName" minOccurs="0"/>
 *     &lt;xs:element name="CardIssuerName" minOccurs="0">
 *       &lt;!-- Reference to inner class CardIssuerName -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:AddressType" name="Address" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CardType"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CardCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CardNumber"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="SeriesCode"/>
 *   &lt;xs:attributeGroup ref="ns:PaymentCardDateGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="MaskedCardNumber"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CardHolderRPH"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="ExtendPaymentIndicator"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PaymentCardType
{
    private String cardHolderName;
    private CardIssuerName cardIssuerName;
    private AddressType address;
    private PrivacyGroup privacyGroup;
    private String cardType;
    private String cardCode;
    private String cardNumber;
    private String seriesCode;
    private PaymentCardDateGroup paymentCardDateGroup;
    private String maskedCardNumber;
    private String cardHolderRPH;
    private Boolean extendPaymentIndicator;

    /** 
     * Get the 'CardHolderName' element value.
     * 
     * @return value
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /** 
     * Set the 'CardHolderName' element value.
     * 
     * @param cardHolderName
     */
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    /** 
     * Get the 'CardIssuerName' element value.
     * 
     * @return value
     */
    public CardIssuerName getCardIssuerName() {
        return cardIssuerName;
    }

    /** 
     * Set the 'CardIssuerName' element value.
     * 
     * @param cardIssuerName
     */
    public void setCardIssuerName(CardIssuerName cardIssuerName) {
        this.cardIssuerName = cardIssuerName;
    }

    /** 
     * Get the 'Address' element value.
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value.
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
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
     * Get the 'CardType' attribute value. Indicates the type of magnetic striped card. Refer to OTA Code ListCard Type (CDT).
     * 
     * @return value
     */
    public String getCardType() {
        return cardType;
    }

    /** 
     * Set the 'CardType' attribute value. Indicates the type of magnetic striped card. Refer to OTA Code ListCard Type (CDT).
     * 
     * @param cardType
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /** 
     * Get the 'CardCode' attribute value. The 2 character code of the credit card issuer.
     * 
     * @return value
     */
    public String getCardCode() {
        return cardCode;
    }

    /** 
     * Set the 'CardCode' attribute value. The 2 character code of the credit card issuer.
     * 
     * @param cardCode
     */
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    /** 
     * Get the 'CardNumber' attribute value. Credit card number embossed on the card.
     * 
     * @return value
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /** 
     * Set the 'CardNumber' attribute value. Credit card number embossed on the card.
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /** 
     * Get the 'SeriesCode' attribute value. Verification digits printed on the card following the embossed number. This may also accommodate the customer identification/batch number (CID), card verification value (CVV2 ), card validation code number (CVC2) on credit card.
     * 
     * @return value
     */
    public String getSeriesCode() {
        return seriesCode;
    }

    /** 
     * Set the 'SeriesCode' attribute value. Verification digits printed on the card following the embossed number. This may also accommodate the customer identification/batch number (CID), card verification value (CVV2 ), card validation code number (CVC2) on credit card.
     * 
     * @param seriesCode
     */
    public void setSeriesCode(String seriesCode) {
        this.seriesCode = seriesCode;
    }

    /** 
     * Get the 'PaymentCardDateGroup' attributeGroup value. Date the card becomes valid for use (optional) and the date the card expires (required) in ISO 8601 prescribed format.
     * 
     * @return value
     */
    public PaymentCardDateGroup getPaymentCardDateGroup() {
        return paymentCardDateGroup;
    }

    /** 
     * Set the 'PaymentCardDateGroup' attributeGroup value. Date the card becomes valid for use (optional) and the date the card expires (required) in ISO 8601 prescribed format.
     * 
     * @param paymentCardDateGroup
     */
    public void setPaymentCardDateGroup(
            PaymentCardDateGroup paymentCardDateGroup) {
        this.paymentCardDateGroup = paymentCardDateGroup;
    }

    /** 
     * Get the 'MaskedCardNumber' attribute value. May be used to send a concealed credit card number (e.g., xxxxxxxxxxxx9922).
     * 
     * @return value
     */
    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    /** 
     * Set the 'MaskedCardNumber' attribute value. May be used to send a concealed credit card number (e.g., xxxxxxxxxxxx9922).
     * 
     * @param maskedCardNumber
     */
    public void setMaskedCardNumber(String maskedCardNumber) {
        this.maskedCardNumber = maskedCardNumber;
    }

    /** 
     * Get the 'CardHolderRPH' attribute value. Provides a reference pointer that links the payment card to the payment card holder.
     * 
     * @return value
     */
    public String getCardHolderRPH() {
        return cardHolderRPH;
    }

    /** 
     * Set the 'CardHolderRPH' attribute value. Provides a reference pointer that links the payment card to the payment card holder.
     * 
     * @param cardHolderRPH
     */
    public void setCardHolderRPH(String cardHolderRPH) {
        this.cardHolderRPH = cardHolderRPH;
    }

    /** 
     * Get the 'ExtendPaymentIndicator' attribute value. When true, the credit card company is requested to delay the date on which the amount of this transaction is applied to the customer's account.
     * 
     * @return value
     */
    public Boolean getExtendPaymentIndicator() {
        return extendPaymentIndicator;
    }

    /** 
     * Set the 'ExtendPaymentIndicator' attribute value. When true, the credit card company is requested to delay the date on which the amount of this transaction is applied to the customer's account.
     * 
     * @param extendPaymentIndicator
     */
    public void setExtendPaymentIndicator(Boolean extendPaymentIndicator) {
        this.extendPaymentIndicator = extendPaymentIndicator;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CardIssuerName" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:attributeGroup ref="ns:IssuerNameGroup"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * 
     * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IssuerNameGroup">
     *   &lt;xs:attribute type="xs:string" name="BankID"/>
     * &lt;/xs:attributeGroup>
     * </pre>
     */
    public static class CardIssuerName
    {
        private String bankID;

        /** 
         * Get the 'BankID' attribute value. Code of bank issuing the card.
         * 
         * @return value
         */
        public String getBankID() {
            return bankID;
        }

        /** 
         * Set the 'BankID' attribute value. Code of bank issuing the card.
         * 
         * @param bankID
         */
        public void setBankID(String bankID) {
            this.bankID = bankID;
        }
    }
}
