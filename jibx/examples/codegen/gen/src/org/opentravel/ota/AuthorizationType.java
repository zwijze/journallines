
package org.opentravel.ota;

/** 
 * Information with which a traveller's identification is verified and/or charges are authorized.ToDo - this types should be moved to OTA_CommonTypes. It's required in a common types file, since the both AuthRQ/RS use it.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AuthorizationType">
 *   &lt;xs:sequence>
 *     &lt;xs:choice>
 *       &lt;xs:element name="CheckAuthorization" minOccurs="0">
 *         &lt;!-- Reference to inner class CheckAuthorization -->
 *       &lt;/xs:element>
 *       &lt;xs:element name="CreditCardAuthorization" minOccurs="0">
 *         &lt;!-- Reference to inner class CreditCardAuthorization -->
 *       &lt;/xs:element>
 *     &lt;/xs:choice>
 *     &lt;xs:element type="ns:DocumentType" name="DriversLicenseAuthorization" minOccurs="0"/>
 *     &lt;xs:element type="ns:UniqueID_Type" name="BookingReferenceID" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="optional" name="PrincipalCompanyCode"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AuthorizationType
{
    private int choiceSelect = -1;
    private static final int CHECK_AUTHORIZATION_CHOICE = 0;
    private static final int CREDIT_CARD_AUTHORIZATION_CHOICE = 1;
    private CheckAuthorization checkAuthorization;
    private CreditCardAuthorization creditCardAuthorization;
    private DocumentType driversLicenseAuthorization;
    private UniqueIDType bookingReferenceID;
    private String principalCompanyCode;

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if CheckAuthorization is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifCheckAuthorization() {
        return choiceSelect == CHECK_AUTHORIZATION_CHOICE;
    }

    /** 
     * Get the 'CheckAuthorization' element value.
     * 
     * @return value
     */
    public CheckAuthorization getCheckAuthorization() {
        return checkAuthorization;
    }

    /** 
     * Set the 'CheckAuthorization' element value.
     * 
     * @param checkAuthorization
     */
    public void setCheckAuthorization(CheckAuthorization checkAuthorization) {
        setChoiceSelect(CHECK_AUTHORIZATION_CHOICE);
        this.checkAuthorization = checkAuthorization;
    }

    /** 
     * Check if CreditCardAuthorization is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifCreditCardAuthorization() {
        return choiceSelect == CREDIT_CARD_AUTHORIZATION_CHOICE;
    }

    /** 
     * Get the 'CreditCardAuthorization' element value.
     * 
     * @return value
     */
    public CreditCardAuthorization getCreditCardAuthorization() {
        return creditCardAuthorization;
    }

    /** 
     * Set the 'CreditCardAuthorization' element value.
     * 
     * @param creditCardAuthorization
     */
    public void setCreditCardAuthorization(
            CreditCardAuthorization creditCardAuthorization) {
        setChoiceSelect(CREDIT_CARD_AUTHORIZATION_CHOICE);
        this.creditCardAuthorization = creditCardAuthorization;
    }

    /** 
     * Get the 'DriversLicenseAuthorization' element value. Information used for validating a drivers license or for supporting a check or credit card authorization request.
     * 
     * @return value
     */
    public DocumentType getDriversLicenseAuthorization() {
        return driversLicenseAuthorization;
    }

    /** 
     * Set the 'DriversLicenseAuthorization' element value. Information used for validating a drivers license or for supporting a check or credit card authorization request.
     * 
     * @param driversLicenseAuthorization
     */
    public void setDriversLicenseAuthorization(
            DocumentType driversLicenseAuthorization) {
        this.driversLicenseAuthorization = driversLicenseAuthorization;
    }

    /** 
     * Get the 'BookingReferenceID' element value. The booking or confirmation number for which charges are being authorized.
     * 
     * @return value
     */
    public UniqueIDType getBookingReferenceID() {
        return bookingReferenceID;
    }

    /** 
     * Set the 'BookingReferenceID' element value. The booking or confirmation number for which charges are being authorized.
     * 
     * @param bookingReferenceID
     */
    public void setBookingReferenceID(UniqueIDType bookingReferenceID) {
        this.bookingReferenceID = bookingReferenceID;
    }

    /** 
     * Get the 'PrincipalCompanyCode' attribute value. The code associated with the company (e.g., two to three character airline designator) submitting a request to an authorization vendor system.
     * 
     * @return value
     */
    public String getPrincipalCompanyCode() {
        return principalCompanyCode;
    }

    /** 
     * Set the 'PrincipalCompanyCode' attribute value. The code associated with the company (e.g., two to three character airline designator) submitting a request to an authorization vendor system.
     * 
     * @param principalCompanyCode
     */
    public void setPrincipalCompanyCode(String principalCompanyCode) {
        this.principalCompanyCode = principalCompanyCode;
    }
    /** 
     * Specifies check information about the customer seeking authorization.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CheckAuthorization" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="ns:BankAcctType" name="BankAcct"/>
     *     &lt;/xs:sequence>
     *     &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class CheckAuthorization
    {
        private BankAcctType bankAcct;
        private CurrencyAmountGroup currencyAmountGroup;

        /** 
         * Get the 'BankAcct' element value. Specifies bank account information about the customer seeking authorization.
         * 
         * @return value
         */
        public BankAcctType getBankAcct() {
            return bankAcct;
        }

        /** 
         * Set the 'BankAcct' element value. Specifies bank account information about the customer seeking authorization.
         * 
         * @param bankAcct
         */
        public void setBankAcct(BankAcctType bankAcct) {
            this.bankAcct = bankAcct;
        }

        /** 
         * Get the 'CurrencyAmountGroup' attributeGroup value. The amount of money for which the the requester is seeking authorization.
         * 
         * @return value
         */
        public CurrencyAmountGroup getCurrencyAmountGroup() {
            return currencyAmountGroup;
        }

        /** 
         * Set the 'CurrencyAmountGroup' attributeGroup value. The amount of money for which the the requester is seeking authorization.
         * 
         * @param currencyAmountGroup
         */
        public void setCurrencyAmountGroup(
                CurrencyAmountGroup currencyAmountGroup) {
            this.currencyAmountGroup = currencyAmountGroup;
        }
    }
    /** 
     * Specifies credit card information about the customer seeking authorization.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CreditCardAuthorization" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="ns:PaymentCardType" name="CreditCard"/>
     *     &lt;/xs:sequence>
     *     &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
     *     &lt;xs:attribute use="optional" name="SourceType">
     *       &lt;xs:simpleType>
     *         &lt;!-- Reference to inner class SourceType -->
     *       &lt;/xs:simpleType>
     *     &lt;/xs:attribute>
     *     &lt;xs:attribute type="xs:boolean" use="optional" name="ExtendedPaymentInd"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="AuthorizationCode"/>
     *     &lt;xs:attribute type="xs:boolean" use="optional" name="ReversalIndicator"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class CreditCardAuthorization
    {
        private PaymentCardType creditCard;
        private CurrencyAmountGroup currencyAmountGroup;
        private SourceType sourceType;
        private Boolean extendedPaymentInd;
        private String authorizationCode;
        private Boolean reversalIndicator;

        /** 
         * Get the 'CreditCard' element value. Specifies the credit card information for which authorization is required. 
         * 
         * @return value
         */
        public PaymentCardType getCreditCard() {
            return creditCard;
        }

        /** 
         * Set the 'CreditCard' element value. Specifies the credit card information for which authorization is required. 
         * 
         * @param creditCard
         */
        public void setCreditCard(PaymentCardType creditCard) {
            this.creditCard = creditCard;
        }

        /** 
         * Get the 'CurrencyAmountGroup' attributeGroup value. Specifies the amount of money for which the the requester is seeking authorization.
         * 
         * @return value
         */
        public CurrencyAmountGroup getCurrencyAmountGroup() {
            return currencyAmountGroup;
        }

        /** 
         * Set the 'CurrencyAmountGroup' attributeGroup value. Specifies the amount of money for which the the requester is seeking authorization.
         * 
         * @param currencyAmountGroup
         */
        public void setCurrencyAmountGroup(
                CurrencyAmountGroup currencyAmountGroup) {
            this.currencyAmountGroup = currencyAmountGroup;
        }

        /** 
         * Get the 'SourceType' attribute value. Information describing the point of sale.
         * 
         * @return value
         */
        public SourceType getSourceType() {
            return sourceType;
        }

        /** 
         * Set the 'SourceType' attribute value. Information describing the point of sale.
         * 
         * @param sourceType
         */
        public void setSourceType(SourceType sourceType) {
            this.sourceType = sourceType;
        }

        /** 
         * Get the 'ExtendedPaymentInd' attribute value. If true, the requester would like to apply extended payment conditions to this authorization.
         * 
         * @return value
         */
        public Boolean getExtendedPaymentInd() {
            return extendedPaymentInd;
        }

        /** 
         * Set the 'ExtendedPaymentInd' attribute value. If true, the requester would like to apply extended payment conditions to this authorization.
         * 
         * @param extendedPaymentInd
         */
        public void setExtendedPaymentInd(Boolean extendedPaymentInd) {
            this.extendedPaymentInd = extendedPaymentInd;
        }

        /** 
         * Get the 'AuthorizationCode' attribute value. This is the approval code received on the original authorization request. Only used in the case where the requested transaction is to reverse the authorization. 
         * 
         * @return value
         */
        public String getAuthorizationCode() {
            return authorizationCode;
        }

        /** 
         * Set the 'AuthorizationCode' attribute value. This is the approval code received on the original authorization request. Only used in the case where the requested transaction is to reverse the authorization. 
         * 
         * @param authorizationCode
         */
        public void setAuthorizationCode(String authorizationCode) {
            this.authorizationCode = authorizationCode;
        }

        /** 
         * Get the 'ReversalIndicator' attribute value. If true, indicates a request to reverse a credit authorization.
         * 
         * @return value
         */
        public Boolean getReversalIndicator() {
            return reversalIndicator;
        }

        /** 
         * Set the 'ReversalIndicator' attribute value. If true, indicates a request to reverse a credit authorization.
         * 
         * @param reversalIndicator
         */
        public void setReversalIndicator(Boolean reversalIndicator) {
            this.reversalIndicator = reversalIndicator;
        }
        /** 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
         *   &lt;xs:restriction base="xs:string">
         *     &lt;xs:enumeration value="NormalTransaction"/>
         *     &lt;xs:enumeration value="MailOrPhoneOrder"/>
         *     &lt;xs:enumeration value="UnattendedTerminal"/>
         *     &lt;xs:enumeration value="MerchantIsSuspicious"/>
         *     &lt;xs:enumeration value="eCommerceSecuredTransaction"/>
         *     &lt;xs:enumeration value="eCommerceUnsecuredTransaction"/>
         *     &lt;xs:enumeration value="InFlightAirPhone"/>
         *   &lt;/xs:restriction>
         * &lt;/xs:simpleType>
         * </pre>
         */
        public static enum SourceType {
            /** 
             * Agent representation (for example, a ticket office).
             */
            NORMAL_TRANSACTION("NormalTransaction"), /** 
                                                      * The source of the purchase request is a mail or phone order.
                                                      */
            MAIL_OR_PHONE_ORDER("MailOrPhoneOrder"), /** 
                                                      * The source of the purchase request is an unattended terminal such as a kiosk or ATM.
                                                      */
            UNATTENDED_TERMINAL("UnattendedTerminal"), /** 
                                                        * Indicates that the merchant requesting the credit seems to be suspicious or fraudulent.
                                                        */
            MERCHANT_IS_SUSPICIOUS("MerchantIsSuspicious"), /** 
                                                             * Indicates an e-comerce transaction provided over a secure channel. For example, SSL (secure sockets layer).
                                                             */
            E_COMMERCE_SECURED_TRANSACTION("eCommerceSecuredTransaction"), /** 
                                                                            * Indicates an e-comerce transaction provided over an unsecured channel. For example HTTP.
                                                                            */
            E_COMMERCE_UNSECURED_TRANSACTION("eCommerceUnsecuredTransaction"), /** 
                                                                                * The purchase request is made from an in flight air phone.
                                                                                */
            IN_FLIGHT_AIR_PHONE("InFlightAirPhone");
            private final String value;

            private SourceType(String value) {
                this.value = value;
            }

            public String xmlValue() {
                return value;
            }

            public static SourceType convert(String value) {
                for (SourceType inst : values()) {
                    if (inst.xmlValue().equals(value)) {
                        return inst;
                    }
                }
                return null;
            }
        }
    }
}
