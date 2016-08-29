
package org.opentravel.ota;

import java.math.BigInteger;

/** 
 * Provides a currency code to reflect the currency in which an amount may be expressed.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CurrencyCodeGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="CurrencyCode"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="DecimalPlaces"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class CurrencyCodeGroup
{
    private String currencyCode;
    private BigInteger decimalPlaces;

    /** 
     * Get the 'CurrencyCode' attribute value. The code specifying a monetary unit. Use ISO 4217, three alpha code.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' attribute value. The code specifying a monetary unit. Use ISO 4217, three alpha code.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'DecimalPlaces' attribute value. Indicates the number of decimal places for a particular currency. This is equivalent to the ISO 4217 standard "minor unit". Typically used when the amount provided includes the minor unit of currency without a decimal point (e.g., USD 8500 needs DecimalPlaces="2" to represent $85).
     * 
     * @return value
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /** 
     * Set the 'DecimalPlaces' attribute value. Indicates the number of decimal places for a particular currency. This is equivalent to the ISO 4217 standard "minor unit". Typically used when the amount provided includes the minor unit of currency without a decimal point (e.g., USD 8500 needs DecimalPlaces="2" to represent $85).
     * 
     * @param decimalPlaces
     */
    public void setDecimalPlaces(BigInteger decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }
}
