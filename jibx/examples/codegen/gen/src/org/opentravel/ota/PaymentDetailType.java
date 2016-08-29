
package org.opentravel.ota;

/** 
 * Details of payment.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PaymentDetailType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:PaymentFormType">
 *       &lt;xs:sequence>
 *         &lt;xs:element name="PaymentAmount" minOccurs="0">
 *           &lt;!-- Reference to inner class PaymentAmount -->
 *         &lt;/xs:element>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PaymentDetailType extends PaymentFormType
{
    private PaymentAmount paymentAmount;

    /** 
     * Get the 'PaymentAmount' element value.
     * 
     * @return value
     */
    public PaymentAmount getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value.
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(PaymentAmount paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PaymentAmount" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="ApprovalCode"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class PaymentAmount
    {
        private CurrencyAmountGroup currencyAmountGroup;
        private String approvalCode;

        /** 
         * Get the 'CurrencyAmountGroup' attributeGroup value.
         * 
         * @return value
         */
        public CurrencyAmountGroup getCurrencyAmountGroup() {
            return currencyAmountGroup;
        }

        /** 
         * Set the 'CurrencyAmountGroup' attributeGroup value.
         * 
         * @param currencyAmountGroup
         */
        public void setCurrencyAmountGroup(
                CurrencyAmountGroup currencyAmountGroup) {
            this.currencyAmountGroup = currencyAmountGroup;
        }

        /** 
         * Get the 'ApprovalCode' attribute value. The approval code returned as part of an authorization process.
         * 
         * @return value
         */
        public String getApprovalCode() {
            return approvalCode;
        }

        /** 
         * Set the 'ApprovalCode' attribute value. The approval code returned as part of an authorization process.
         * 
         * @param approvalCode
         */
        public void setApprovalCode(String approvalCode) {
            this.approvalCode = approvalCode;
        }
    }
}
