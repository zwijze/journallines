
package org.opentravel.ota;

import java.math.BigDecimal;

/** 
 * Provides a monetary amount and the currency code to reflect the currency in which this amount is expressed.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CurrencyAmountGroup">
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="Amount"/>
 *   &lt;xs:attributeGroup ref="ns:CurrencyCodeGroup"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class CurrencyAmountGroup
{
    private BigDecimal amount;
    private CurrencyCodeGroup currencyCodeGroup;

    /** 
     * Get the 'Amount' attribute value.
     * 
     * @return value
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' attribute value.
     * 
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'CurrencyCodeGroup' attributeGroup value. Provides a currency code to reflect the currency in which an amount may be expressed as well as the number of decimal places of that currency.
     * 
     * @return value
     */
    public CurrencyCodeGroup getCurrencyCodeGroup() {
        return currencyCodeGroup;
    }

    /** 
     * Set the 'CurrencyCodeGroup' attributeGroup value. Provides a currency code to reflect the currency in which an amount may be expressed as well as the number of decimal places of that currency.
     * 
     * @param currencyCodeGroup
     */
    public void setCurrencyCodeGroup(CurrencyCodeGroup currencyCodeGroup) {
        this.currencyCodeGroup = currencyCodeGroup;
    }
}
