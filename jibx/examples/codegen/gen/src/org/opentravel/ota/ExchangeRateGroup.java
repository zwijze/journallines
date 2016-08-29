
package org.opentravel.ota;

import java.math.BigDecimal;
import java.sql.Date;

/** 
 * Used to specify the rate for exchanging from one currency to another currency.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExchangeRateGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="FromCurrency"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ToCurrency"/>
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="Rate"/>
 *   &lt;xs:attribute type="xs:date" use="optional" name="Date"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class ExchangeRateGroup
{
    private String fromCurrency;
    private String toCurrency;
    private BigDecimal rate;
    private Date date;

    /** 
     * Get the 'FromCurrency' attribute value.
     * 
     * @return value
     */
    public String getFromCurrency() {
        return fromCurrency;
    }

    /** 
     * Set the 'FromCurrency' attribute value.
     * 
     * @param fromCurrency
     */
    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    /** 
     * Get the 'ToCurrency' attribute value.
     * 
     * @return value
     */
    public String getToCurrency() {
        return toCurrency;
    }

    /** 
     * Set the 'ToCurrency' attribute value.
     * 
     * @param toCurrency
     */
    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    /** 
     * Get the 'Rate' attribute value.
     * 
     * @return value
     */
    public BigDecimal getRate() {
        return rate;
    }

    /** 
     * Set the 'Rate' attribute value.
     * 
     * @param rate
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /** 
     * Get the 'Date' attribute value.
     * 
     * @return value
     */
    public Date getDate() {
        return date;
    }

    /** 
     * Set the 'Date' attribute value.
     * 
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
