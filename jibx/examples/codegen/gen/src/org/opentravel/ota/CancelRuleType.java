
package org.opentravel.ota;

import java.math.BigDecimal;

/** 
 * Provides the cancellation amount due according to the time before the booking date that the cancellation occurs. The amount may be either an amount or a percentage (e.g. 50% within 30 days or $100 outside 30 days). 
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CancelRuleType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:PaymentCardType" name="PaymentCard" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" name="CancelByDate"/>
 *   &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="Percent"/>
 *   &lt;xs:attribute use="optional" name="Type">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class Type -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CancelRuleType
{
    private PaymentCardType paymentCard;
    private String cancelByDate;
    private CurrencyAmountGroup currencyAmountGroup;
    private BigDecimal percent;
    private Type type;

    /** 
     * Get the 'PaymentCard' element value.
     * 
     * @return value
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /** 
     * Set the 'PaymentCard' element value.
     * 
     * @param paymentCard
     */
    public void setPaymentCard(PaymentCardType paymentCard) {
        this.paymentCard = paymentCard;
    }

    /** 
     * Get the 'CancelByDate' attribute value.
     * 
     * @return value
     */
    public String getCancelByDate() {
        return cancelByDate;
    }

    /** 
     * Set the 'CancelByDate' attribute value.
     * 
     * @param cancelByDate
     */
    public void setCancelByDate(String cancelByDate) {
        this.cancelByDate = cancelByDate;
    }

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
    public void setCurrencyAmountGroup(CurrencyAmountGroup currencyAmountGroup) {
        this.currencyAmountGroup = currencyAmountGroup;
    }

    /** 
     * Get the 'Percent' attribute value.
     * 
     * @return value
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /** 
     * Set the 'Percent' attribute value.
     * 
     * @param percent
     */
    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    /** 
     * Get the 'Type' attribute value.
     * 
     * @return value
     */
    public Type getType() {
        return type;
    }

    /** 
     * Set the 'Type' attribute value.
     * 
     * @param type
     */
    public void setType(Type type) {
        this.type = type;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="Refund"/>
     *     &lt;xs:enumeration value="Charge"/>
     *     &lt;xs:enumeration value="Forfeiture"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum Type {
        REFUND("Refund"), CHARGE("Charge"), FORFEITURE("Forfeiture");
        private final String value;

        private Type(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static Type convert(String value) {
            for (Type inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
