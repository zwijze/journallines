
package org.opentravel.ota;

import java.math.BigDecimal;

/** 
 * The total amount charged for the service including additional amounts and fees.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TotalType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:TaxesType" name="Taxes" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="AmountBeforeTax"/>
 *   &lt;xs:attribute type="xs:decimal" use="optional" name="AmountAfterTax"/>
 *   &lt;xs:attributeGroup ref="ns:CurrencyCodeGroup"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="AdditionalFeesExcludedIndicator"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TotalType
{
    private TaxesType taxes;
    private BigDecimal amountBeforeTax;
    private BigDecimal amountAfterTax;
    private CurrencyCodeGroup currencyCodeGroup;
    private Boolean additionalFeesExcludedIndicator;

    /** 
     * Get the 'Taxes' element value.
     * 
     * @return value
     */
    public TaxesType getTaxes() {
        return taxes;
    }

    /** 
     * Set the 'Taxes' element value.
     * 
     * @param taxes
     */
    public void setTaxes(TaxesType taxes) {
        this.taxes = taxes;
    }

    /** 
     * Get the 'AmountBeforeTax' attribute value.
     * 
     * @return value
     */
    public BigDecimal getAmountBeforeTax() {
        return amountBeforeTax;
    }

    /** 
     * Set the 'AmountBeforeTax' attribute value.
     * 
     * @param amountBeforeTax
     */
    public void setAmountBeforeTax(BigDecimal amountBeforeTax) {
        this.amountBeforeTax = amountBeforeTax;
    }

    /** 
     * Get the 'AmountAfterTax' attribute value.
     * 
     * @return value
     */
    public BigDecimal getAmountAfterTax() {
        return amountAfterTax;
    }

    /** 
     * Set the 'AmountAfterTax' attribute value.
     * 
     * @param amountAfterTax
     */
    public void setAmountAfterTax(BigDecimal amountAfterTax) {
        this.amountAfterTax = amountAfterTax;
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

    /** 
     * Get the 'AdditionalFeesExcludedIndicator' attribute value. When true, amounts do not contain additional fees or charges. 
     * 
     * @return value
     */
    public Boolean getAdditionalFeesExcludedIndicator() {
        return additionalFeesExcludedIndicator;
    }

    /** 
     * Set the 'AdditionalFeesExcludedIndicator' attribute value. When true, amounts do not contain additional fees or charges. 
     * 
     * @param additionalFeesExcludedIndicator
     */
    public void setAdditionalFeesExcludedIndicator(
            Boolean additionalFeesExcludedIndicator) {
        this.additionalFeesExcludedIndicator = additionalFeesExcludedIndicator;
    }
}
