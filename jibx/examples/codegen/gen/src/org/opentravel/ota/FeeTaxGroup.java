
package org.opentravel.ota;

import java.math.BigDecimal;

/** 
 * Defines the fees and/or taxes associated with a charge (e.g. taxes associated with a hotel rate).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FeeTaxGroup">
 *   &lt;xs:attribute type="ns:AmountDeterminationType" use="optional" name="Type"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Code"/>
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="Percent"/>
 *   &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class FeeTaxGroup
{
    private AmountDeterminationType type;
    private String code;
    private BigDecimal percent;
    private CurrencyAmountGroup currencyAmountGroup;

    /** 
     * Get the 'Type' attribute value. Used to indicate if the amount is inclusive or exclusive of other charges, such as taxes, or is cumulative (amounts have been added to each other).
     * 
     * @return value
     */
    public AmountDeterminationType getType() {
        return type;
    }

    /** 
     * Set the 'Type' attribute value. Used to indicate if the amount is inclusive or exclusive of other charges, such as taxes, or is cumulative (amounts have been added to each other).
     * 
     * @param type
     */
    public void setType(AmountDeterminationType type) {
        this.type = type;
    }

    /** 
     * Get the 'Code' attribute value. Code identifying the fee (e.g.,agency fee, municipality fee). Refer to OTA Code List Fee Tax Type (FTT).
    			
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' attribute value. Code identifying the fee (e.g.,agency fee, municipality fee). Refer to OTA Code List Fee Tax Type (FTT).
    			
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'Percent' attribute value. Fee percentage; if zero, assume use of the Amount attribute (Amount or Percent must be a zero value).
     * 
     * @return value
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /** 
     * Set the 'Percent' attribute value. Fee percentage; if zero, assume use of the Amount attribute (Amount or Percent must be a zero value).
     * 
     * @param percent
     */
    public void setPercent(BigDecimal percent) {
        this.percent = percent;
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
}
