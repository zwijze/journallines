
package org.opentravel.ota;

import java.math.BigDecimal;

/** 
 * A range of monetary values within which the cost of the available products are requested.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RateRangeGroup">
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="MinRate"/>
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="MaxRate"/>
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="FixedRate"/>
 *   &lt;xs:attribute type="ns:TimeUnitType" use="optional" name="RateTimeUnit"/>
 *   &lt;xs:attributeGroup ref="ns:CurrencyCodeGroup"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class RateRangeGroup
{
    private BigDecimal minRate;
    private BigDecimal maxRate;
    private BigDecimal fixedRate;
    private TimeUnitType rateTimeUnit;
    private CurrencyCodeGroup currencyCodeGroup;

    /** 
     * Get the 'MinRate' attribute value. A decimal value that indicates the minimum monetary value to be considered in a request for an available product.
     * 
     * @return value
     */
    public BigDecimal getMinRate() {
        return minRate;
    }

    /** 
     * Set the 'MinRate' attribute value. A decimal value that indicates the minimum monetary value to be considered in a request for an available product.
     * 
     * @param minRate
     */
    public void setMinRate(BigDecimal minRate) {
        this.minRate = minRate;
    }

    /** 
     * Get the 'MaxRate' attribute value. A decimal value that indicates the maximum monetary value to be considered in a request for an available product.
     * 
     * @return value
     */
    public BigDecimal getMaxRate() {
        return maxRate;
    }

    /** 
     * Set the 'MaxRate' attribute value. A decimal value that indicates the maximum monetary value to be considered in a request for an available product.
     * 
     * @param maxRate
     */
    public void setMaxRate(BigDecimal maxRate) {
        this.maxRate = maxRate;
    }

    /** 
     * Get the 'FixedRate' attribute value. The rate amount used in place of MinRate and MaxRate when a specific rate is being requested.
     * 
     * @return value
     */
    public BigDecimal getFixedRate() {
        return fixedRate;
    }

    /** 
     * Set the 'FixedRate' attribute value. The rate amount used in place of MinRate and MaxRate when a specific rate is being requested.
     * 
     * @param fixedRate
     */
    public void setFixedRate(BigDecimal fixedRate) {
        this.fixedRate = fixedRate;
    }

    /** 
     * Get the 'RateTimeUnit' attribute value. Used to specify the period of time to which the rates apply.
     * 
     * @return value
     */
    public TimeUnitType getRateTimeUnit() {
        return rateTimeUnit;
    }

    /** 
     * Set the 'RateTimeUnit' attribute value. Used to specify the period of time to which the rates apply.
     * 
     * @param rateTimeUnit
     */
    public void setRateTimeUnit(TimeUnitType rateTimeUnit) {
        this.rateTimeUnit = rateTimeUnit;
    }

    /** 
     * Get the 'CurrencyCodeGroup' attributeGroup value. Used to provide currency code and decimal places for the rate attributes.
     * 
     * @return value
     */
    public CurrencyCodeGroup getCurrencyCodeGroup() {
        return currencyCodeGroup;
    }

    /** 
     * Set the 'CurrencyCodeGroup' attributeGroup value. Used to provide currency code and decimal places for the rate attributes.
     * 
     * @param currencyCodeGroup
     */
    public void setCurrencyCodeGroup(CurrencyCodeGroup currencyCodeGroup) {
        this.currencyCodeGroup = currencyCodeGroup;
    }
}
