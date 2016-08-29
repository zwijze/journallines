
package org.opentravel.ota;

/** 
 * Defines the data fields available for air tax. The element text of this type may contain a description of the tax.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirTaxType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attribute type="xs:string" use="required" name="TaxCode"/>
 *       &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="TaxCountry"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="TaxName"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AirTaxType
{
    private String string;
    private String taxCode;
    private CurrencyAmountGroup currencyAmountGroup;
    private String taxCountry;
    private String taxName;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public String getString() {
        return string;
    }

    /** 
     * Set the extension value.
     * 
     * @param string
     */
    public void setString(String string) {
        this.string = string;
    }

    /** 
     * Get the 'TaxCode' attribute value. 
    Identifies the code for the tax.
    
     * 
     * @return value
     */
    public String getTaxCode() {
        return taxCode;
    }

    /** 
     * Set the 'TaxCode' attribute value. 
    Identifies the code for the tax.
    
     * 
     * @param taxCode
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
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
     * Get the 'TaxCountry' attribute value. Used to identify the country imposing the tax.
     * 
     * @return value
     */
    public String getTaxCountry() {
        return taxCountry;
    }

    /** 
     * Set the 'TaxCountry' attribute value. Used to identify the country imposing the tax.
     * 
     * @param taxCountry
     */
    public void setTaxCountry(String taxCountry) {
        this.taxCountry = taxCountry;
    }

    /** 
     * Get the 'TaxName' attribute value. Identifies the tax code by name. 
     * 
     * @return value
     */
    public String getTaxName() {
        return taxName;
    }

    /** 
     * Set the 'TaxName' attribute value. Identifies the tax code by name. 
     * 
     * @param taxName
     */
    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }
}
