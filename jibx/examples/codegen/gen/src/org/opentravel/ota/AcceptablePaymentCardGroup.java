
package org.opentravel.ota;

import java.math.BigDecimal;

/** 
 * This complex type defines the information needed to describe a type of payment card that is acceptable as a form of payment.  A usage fee (amount or percentage) may also be stated for this particular card type.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AcceptablePaymentCardGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="CardType"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CardName"/>
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="UsagePercentage"/>
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="UsageAmount"/>
 *   &lt;xs:attributeGroup ref="ns:CurrencyCodeGroup"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class AcceptablePaymentCardGroup
{
    private String cardType;
    private String cardName;
    private BigDecimal usagePercentage;
    private BigDecimal usageAmount;
    private CurrencyCodeGroup currencyCodeGroup;

    /** 
     * Get the 'CardType' attribute value. A code used to identify this payment card. Refer to OTA Code List Card Type (CDT).
     * 
     * @return value
     */
    public String getCardType() {
        return cardType;
    }

    /** 
     * Set the 'CardType' attribute value. A code used to identify this payment card. Refer to OTA Code List Card Type (CDT).
     * 
     * @param cardType
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /** 
     * Get the 'CardName' attribute value. The name used to describe this type of payment card, for example, American Express
     * 
     * @return value
     */
    public String getCardName() {
        return cardName;
    }

    /** 
     * Set the 'CardName' attribute value. The name used to describe this type of payment card, for example, American Express
     * 
     * @param cardName
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /** 
     * Get the 'UsagePercentage' attribute value. If applicable, defines the percentage of the total amount that is incurred as a usage fee.
     * 
     * @return value
     */
    public BigDecimal getUsagePercentage() {
        return usagePercentage;
    }

    /** 
     * Set the 'UsagePercentage' attribute value. If applicable, defines the percentage of the total amount that is incurred as a usage fee.
     * 
     * @param usagePercentage
     */
    public void setUsagePercentage(BigDecimal usagePercentage) {
        this.usagePercentage = usagePercentage;
    }

    /** 
     * Get the 'UsageAmount' attribute value. If applicable, defines the additonal amount that is incurred as a usage fee.
     * 
     * @return value
     */
    public BigDecimal getUsageAmount() {
        return usageAmount;
    }

    /** 
     * Set the 'UsageAmount' attribute value. If applicable, defines the additonal amount that is incurred as a usage fee.
     * 
     * @param usageAmount
     */
    public void setUsageAmount(BigDecimal usageAmount) {
        this.usageAmount = usageAmount;
    }

    /** 
     * Get the 'CurrencyCodeGroup' attributeGroup value.
     * 
     * @return value
     */
    public CurrencyCodeGroup getCurrencyCodeGroup() {
        return currencyCodeGroup;
    }

    /** 
     * Set the 'CurrencyCodeGroup' attributeGroup value.
     * 
     * @param currencyCodeGroup
     */
    public void setCurrencyCodeGroup(CurrencyCodeGroup currencyCodeGroup) {
        this.currencyCodeGroup = currencyCodeGroup;
    }
}
