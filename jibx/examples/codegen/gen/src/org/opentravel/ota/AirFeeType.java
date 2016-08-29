
package org.opentravel.ota;

/** 
 * 
 Defines the data fields available for the fees.

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirFeeType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attribute type="xs:string" use="required" name="FeeCode"/>
 *       &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AirFeeType
{
    private String string;
    private String feeCode;
    private CurrencyAmountGroup currencyAmountGroup;

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
     * Get the 'FeeCode' attribute value. 
    Identifies the code for the fee.
    
     * 
     * @return value
     */
    public String getFeeCode() {
        return feeCode;
    }

    /** 
     * Set the 'FeeCode' attribute value. 
    Identifies the code for the fee.
    
     * 
     * @param feeCode
     */
    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    /** 
     * Get the 'CurrencyAmountGroup' attributeGroup value. Provides a monetary amount and the currency code to reflect the currency in which this amount is expressed.Defines a fee in terms of its amount, currency and decimal places.
     * 
     * @return value
     */
    public CurrencyAmountGroup getCurrencyAmountGroup() {
        return currencyAmountGroup;
    }

    /** 
     * Set the 'CurrencyAmountGroup' attributeGroup value. Provides a monetary amount and the currency code to reflect the currency in which this amount is expressed.Defines a fee in terms of its amount, currency and decimal places.
     * 
     * @param currencyAmountGroup
     */
    public void setCurrencyAmountGroup(CurrencyAmountGroup currencyAmountGroup) {
        this.currencyAmountGroup = currencyAmountGroup;
    }
}
