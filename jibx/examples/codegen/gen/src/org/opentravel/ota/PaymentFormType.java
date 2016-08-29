
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Ways of providing funds for travel by the individual.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PaymentFormType">
 *   &lt;xs:choice minOccurs="0">
 *     &lt;!-- Reference to inner class Choice -->
 *   &lt;/xs:choice>
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CostCenterID"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="RPH"/>
 *   &lt;xs:attribute use="optional" name="PaymentTransactionTypeCode">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class PaymentTransactionTypeCode -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PaymentFormType
{
    private Choice choice;
    private PrivacyGroup privacyGroup;
    private String costCenterID;
    private String RPH;
    private PaymentTransactionTypeCode paymentTransactionTypeCode;

    /** 
     * Get the choice value.
     * 
     * @return value
     */
    public Choice getChoice() {
        return choice;
    }

    /** 
     * Set the choice value.
     * 
     * @param choice
     */
    public void setChoice(Choice choice) {
        this.choice = choice;
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
     * Get the 'CostCenterID' attribute value. A reference to identify the billing department for allocating cost of travel to company account.
     * 
     * @return value
     */
    public String getCostCenterID() {
        return costCenterID;
    }

    /** 
     * Set the 'CostCenterID' attribute value. A reference to identify the billing department for allocating cost of travel to company account.
     * 
     * @param costCenterID
     */
    public void setCostCenterID(String costCenterID) {
        this.costCenterID = costCenterID;
    }

    /** 
     * Get the 'RPH' attribute value. Provides a reference to a specific form of payment.
     * 
     * @return value
     */
    public String getRPH() {
        return RPH;
    }

    /** 
     * Set the 'RPH' attribute value. Provides a reference to a specific form of payment.
     * 
     * @param RPH
     */
    public void setRPH(String RPH) {
        this.RPH = RPH;
    }

    /** 
     * Get the 'PaymentTransactionTypeCode' attribute value. This is used to indicate either a charge or reserve (deposit).
     * 
     * @return value
     */
    public PaymentTransactionTypeCode getPaymentTransactionTypeCode() {
        return paymentTransactionTypeCode;
    }

    /** 
     * Set the 'PaymentTransactionTypeCode' attribute value. This is used to indicate either a charge or reserve (deposit).
     * 
     * @param paymentTransactionTypeCode
     */
    public void setPaymentTransactionTypeCode(
            PaymentTransactionTypeCode paymentTransactionTypeCode) {
        this.paymentTransactionTypeCode = paymentTransactionTypeCode;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0">
     *   &lt;xs:element type="ns:PaymentCardType" name="PaymentCard"/>
     *   &lt;xs:element type="ns:BankAcctType" name="BankAcct"/>
     *   &lt;xs:element type="ns:DirectBillType" name="DirectBill"/>
     *   &lt;xs:element name="Voucher">
     *     &lt;xs:complexType>
     *       &lt;xs:attributeGroup ref="ns:VoucherGroup"/>
     *       &lt;xs:attribute type="xs:string" use="optional" name="BillingNumber"/>
     *       &lt;xs:attribute type="xs:string" use="optional" name="SupplierIdentifier"/>
     *       &lt;xs:attribute type="xs:string" use="optional" name="Identifier"/>
     *       &lt;xs:attribute type="xs:string" use="optional" name="ValueType"/>
     *       &lt;xs:attribute type="xs:boolean" use="optional" name="ElectronicIndicator"/>
     *     &lt;/xs:complexType>
     *   &lt;/xs:element>
     *   &lt;xs:element name="LoyaltyRedemption">
     *     &lt;!-- Reference to inner class LoyaltyRedemption -->
     *   &lt;/xs:element>
     *   &lt;xs:element name="MiscChargeOrder">
     *     &lt;xs:complexType>
     *       &lt;xs:attribute type="xs:string" name="TicketNumber"/>
     *     &lt;/xs:complexType>
     *   &lt;/xs:element>
     *   &lt;xs:element name="Cash">
     *     &lt;xs:complexType>
     *       &lt;xs:attribute type="xs:boolean" use="optional" default="true" name="CashIndicator"/>
     *     &lt;/xs:complexType>
     *   &lt;/xs:element>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choiceSelect = -1;
        private static final int PAYMENT_CARD_CHOICE = 0;
        private static final int BANK_ACCT_CHOICE = 1;
        private static final int DIRECT_BILL_CHOICE = 2;
        private static final int VOUCHER_CHOICE = 3;
        private static final int LOYALTY_REDEMPTION_CHOICE = 4;
        private static final int MISC_CHARGE_ORDER_CHOICE = 5;
        private static final int CASH_CHOICE = 6;
        private PaymentCardType paymentCard;
        private BankAcctType bankAcct;
        private DirectBillType directBill;
        private VoucherGroup voucherVoucherGroup;
        private String voucherBillingNumber;
        private String voucherSupplierIdentifier;
        private String voucherIdentifier;
        private String voucherValueType;
        private Boolean voucherElectronicIndicator;
        private LoyaltyRedemption loyaltyRedemption;
        private String miscChargeOrder;
        private Boolean cash;

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
         * Check if PaymentCard is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifPaymentCard() {
            return choiceSelect == PAYMENT_CARD_CHOICE;
        }

        /** 
         * Get the 'PaymentCard' element value. Details of a debit or credit card.
         * 
         * @return value
         */
        public PaymentCardType getPaymentCard() {
            return paymentCard;
        }

        /** 
         * Set the 'PaymentCard' element value. Details of a debit or credit card.
         * 
         * @param paymentCard
         */
        public void setPaymentCard(PaymentCardType paymentCard) {
            setChoiceSelect(PAYMENT_CARD_CHOICE);
            this.paymentCard = paymentCard;
        }

        /** 
         * Check if BankAcct is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifBankAcct() {
            return choiceSelect == BANK_ACCT_CHOICE;
        }

        /** 
         * Get the 'BankAcct' element value. Details of a bank account. 
         * 
         * @return value
         */
        public BankAcctType getBankAcct() {
            return bankAcct;
        }

        /** 
         * Set the 'BankAcct' element value. Details of a bank account. 
         * 
         * @param bankAcct
         */
        public void setBankAcct(BankAcctType bankAcct) {
            setChoiceSelect(BANK_ACCT_CHOICE);
            this.bankAcct = bankAcct;
        }

        /** 
         * Check if DirectBill is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifDirectBill() {
            return choiceSelect == DIRECT_BILL_CHOICE;
        }

        /** 
         * Get the 'DirectBill' element value. Details of a direct billing arrangement.
         * 
         * @return value
         */
        public DirectBillType getDirectBill() {
            return directBill;
        }

        /** 
         * Set the 'DirectBill' element value. Details of a direct billing arrangement.
         * 
         * @param directBill
         */
        public void setDirectBill(DirectBillType directBill) {
            setChoiceSelect(DIRECT_BILL_CHOICE);
            this.directBill = directBill;
        }

        /** 
         * Check if Voucher is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifVoucher() {
            return choiceSelect == VOUCHER_CHOICE;
        }

        /** 
         * Get the 'VoucherGroup' attributeGroup value.
         * 
         * @return value
         */
        public VoucherGroup getVoucherVoucherGroup() {
            return voucherVoucherGroup;
        }

        /** 
         * Set the 'VoucherGroup' attributeGroup value.
         * 
         * @param voucherVoucherGroup
         */
        public void setVoucherVoucherGroup(VoucherGroup voucherVoucherGroup) {
            setChoiceSelect(VOUCHER_CHOICE);
            this.voucherVoucherGroup = voucherVoucherGroup;
        }

        /** 
         * Get the 'BillingNumber' attribute value. Reference of the billing account which handles the payment transaction.
         * 
         * @return value
         */
        public String getVoucherBillingNumber() {
            return voucherBillingNumber;
        }

        /** 
         * Set the 'BillingNumber' attribute value. Reference of the billing account which handles the payment transaction.
         * 
         * @param voucherBillingNumber
         */
        public void setVoucherBillingNumber(String voucherBillingNumber) {
            setChoiceSelect(VOUCHER_CHOICE);
            this.voucherBillingNumber = voucherBillingNumber;
        }

        /** 
         * Get the 'SupplierIdentifier' attribute value. Unique identifier of the electronic voucher, created by the supplier.
         * 
         * @return value
         */
        public String getVoucherSupplierIdentifier() {
            return voucherSupplierIdentifier;
        }

        /** 
         * Set the 'SupplierIdentifier' attribute value. Unique identifier of the electronic voucher, created by the supplier.
         * 
         * @param voucherSupplierIdentifier
         */
        public void setVoucherSupplierIdentifier(
                String voucherSupplierIdentifier) {
            setChoiceSelect(VOUCHER_CHOICE);
            this.voucherSupplierIdentifier = voucherSupplierIdentifier;
        }

        /** 
         * Get the 'Identifier' attribute value. Unique identifier of the electronic voucher.
         * 
         * @return value
         */
        public String getVoucherIdentifier() {
            return voucherIdentifier;
        }

        /** 
         * Set the 'Identifier' attribute value. Unique identifier of the electronic voucher.
         * 
         * @param voucherIdentifier
         */
        public void setVoucherIdentifier(String voucherIdentifier) {
            setChoiceSelect(VOUCHER_CHOICE);
            this.voucherIdentifier = voucherIdentifier;
        }

        /** 
         * Get the 'ValueType' attribute value. Defines the type of voucher (e.g., full credit or partial credit).
         * 
         * @return value
         */
        public String getVoucherValueType() {
            return voucherValueType;
        }

        /** 
         * Set the 'ValueType' attribute value. Defines the type of voucher (e.g., full credit or partial credit).
         * 
         * @param voucherValueType
         */
        public void setVoucherValueType(String voucherValueType) {
            setChoiceSelect(VOUCHER_CHOICE);
            this.voucherValueType = voucherValueType;
        }

        /** 
         * Get the 'ElectronicIndicator' attribute value. When true, indicates the voucher is electronic.  An E-voucher is a value document issued by the Travel Agent for the customer. The e-voucher can be used as a proof of reservation, but more normally, as a full-payment or partial payment. 
         * 
         * @return value
         */
        public Boolean getVoucherElectronicIndicator() {
            return voucherElectronicIndicator;
        }

        /** 
         * Set the 'ElectronicIndicator' attribute value. When true, indicates the voucher is electronic.  An E-voucher is a value document issued by the Travel Agent for the customer. The e-voucher can be used as a proof of reservation, but more normally, as a full-payment or partial payment. 
         * 
         * @param voucherElectronicIndicator
         */
        public void setVoucherElectronicIndicator(
                Boolean voucherElectronicIndicator) {
            setChoiceSelect(VOUCHER_CHOICE);
            this.voucherElectronicIndicator = voucherElectronicIndicator;
        }

        /** 
         * Check if LoyaltyRedemption is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifLoyaltyRedemption() {
            return choiceSelect == LOYALTY_REDEMPTION_CHOICE;
        }

        /** 
         * Get the 'LoyaltyRedemption' element value.
         * 
         * @return value
         */
        public LoyaltyRedemption getLoyaltyRedemption() {
            return loyaltyRedemption;
        }

        /** 
         * Set the 'LoyaltyRedemption' element value.
         * 
         * @param loyaltyRedemption
         */
        public void setLoyaltyRedemption(LoyaltyRedemption loyaltyRedemption) {
            setChoiceSelect(LOYALTY_REDEMPTION_CHOICE);
            this.loyaltyRedemption = loyaltyRedemption;
        }

        /** 
         * Check if MiscChargeOrder is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifMiscChargeOrder() {
            return choiceSelect == MISC_CHARGE_ORDER_CHOICE;
        }

        /** 
         * Get the 'TicketNumber' attribute value. The ticket number of the miscellaneous charge order (MCO).
         * 
         * @return value
         */
        public String getMiscChargeOrder() {
            return miscChargeOrder;
        }

        /** 
         * Set the 'TicketNumber' attribute value. The ticket number of the miscellaneous charge order (MCO).
         * 
         * @param miscChargeOrder
         */
        public void setMiscChargeOrder(String miscChargeOrder) {
            setChoiceSelect(MISC_CHARGE_ORDER_CHOICE);
            this.miscChargeOrder = miscChargeOrder;
        }

        /** 
         * Check if Cash is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifCash() {
            return choiceSelect == CASH_CHOICE;
        }

        /** 
         * Get the 'CashIndicator' attribute value. If true, this indicates cash is being used.
         * 
         * @return value
         */
        public Boolean getCash() {
            return cash;
        }

        /** 
         * Set the 'CashIndicator' attribute value. If true, this indicates cash is being used.
         * 
         * @param cash
         */
        public void setCash(Boolean cash) {
            setChoiceSelect(CASH_CHOICE);
            this.cash = cash;
        }
        /** 
         * Details of a loyalty redemption arrangement. This is normally miles or points. 
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LoyaltyRedemption">
         *   &lt;xs:complexType>
         *     &lt;xs:sequence>
         *       &lt;xs:element name="LoyaltyCertificate" minOccurs="0" maxOccurs="9">
         *         &lt;xs:complexType>
         *           &lt;xs:attributeGroup ref="ns:LoyaltyCertificateGroup"/>
         *         &lt;/xs:complexType>
         *       &lt;/xs:element>
         *     &lt;/xs:sequence>
         *     &lt;xs:attributeGroup ref="ns:LoyaltyCertificateNumberGroup"/>
         *     &lt;xs:attributeGroup ref="ns:PromotionCodeGroup"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="RedemptionQuantity"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class LoyaltyRedemption
        {
            private List<LoyaltyCertificateGroup> loyaltyCertificateList = new ArrayList<LoyaltyCertificateGroup>();
            private LoyaltyCertificateNumberGroup loyaltyCertificateNumberGroup;
            private PromotionCodeGroup promotionCodeGroup;
            private String redemptionQuantity;

            /** 
             * Get the list of 'LoyaltyCertificate' element items. A certificate may be needed in order to redeem miles or points. Certificates may be used in combination with each other as part of a reservation.
             * 
             * @return list
             */
            public List<LoyaltyCertificateGroup> getLoyaltyCertificateList() {
                return loyaltyCertificateList;
            }

            /** 
             * Set the list of 'LoyaltyCertificate' element items. A certificate may be needed in order to redeem miles or points. Certificates may be used in combination with each other as part of a reservation.
             * 
             * @param list
             */
            public void setLoyaltyCertificateList(
                    List<LoyaltyCertificateGroup> list) {
                loyaltyCertificateList = list;
            }

            /** 
             * Get the 'LoyaltyCertificateNumberGroup' attributeGroup value. Identifies the Loyalty scheme,  programs and promotions within the scheme, membership reference, form factor used by the certificate, the number of nights it can be used for and its current status.
             * 
             * @return value
             */
            public LoyaltyCertificateNumberGroup getLoyaltyCertificateNumberGroup() {
                return loyaltyCertificateNumberGroup;
            }

            /** 
             * Set the 'LoyaltyCertificateNumberGroup' attributeGroup value. Identifies the Loyalty scheme,  programs and promotions within the scheme, membership reference, form factor used by the certificate, the number of nights it can be used for and its current status.
             * 
             * @param loyaltyCertificateNumberGroup
             */
            public void setLoyaltyCertificateNumberGroup(
                    LoyaltyCertificateNumberGroup loyaltyCertificateNumberGroup) {
                this.loyaltyCertificateNumberGroup = loyaltyCertificateNumberGroup;
            }

            /** 
             * Get the 'PromotionCodeGroup' attributeGroup value.
             * 
             * @return value
             */
            public PromotionCodeGroup getPromotionCodeGroup() {
                return promotionCodeGroup;
            }

            /** 
             * Set the 'PromotionCodeGroup' attributeGroup value.
             * 
             * @param promotionCodeGroup
             */
            public void setPromotionCodeGroup(
                    PromotionCodeGroup promotionCodeGroup) {
                this.promotionCodeGroup = promotionCodeGroup;
            }

            /** 
             * Get the 'RedemptionQuantity' attribute value. The quantity of loyalty units being redeemed.
             * 
             * @return value
             */
            public String getRedemptionQuantity() {
                return redemptionQuantity;
            }

            /** 
             * Set the 'RedemptionQuantity' attribute value. The quantity of loyalty units being redeemed.
             * 
             * @param redemptionQuantity
             */
            public void setRedemptionQuantity(String redemptionQuantity) {
                this.redemptionQuantity = redemptionQuantity;
            }
        }
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="charge"/>
     *     &lt;xs:enumeration value="reserve"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum PaymentTransactionTypeCode {
        /** 
         * This indicates that an actual payment has been made.
         */
        CHARGE("charge"), /** 
                           * This indicates that a hold for the indicated amount has been placed on a credit card or that a cash amount has been taken from the customer to guarantee final payment.
                           */
        RESERVE("reserve");
        private final String value;

        private PaymentTransactionTypeCode(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static PaymentTransactionTypeCode convert(String value) {
            for (PaymentTransactionTypeCode inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
