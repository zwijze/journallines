
package org.opentravel.ota;

/** 
 * Indicates the start and end date for a payment card.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PaymentCardDateGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="EffectiveDate"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ExpireDate"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class PaymentCardDateGroup
{
    private String effectiveDate;
    private String expireDate;

    /** 
     * Get the 'EffectiveDate' attribute value. Indicates the starting date.
     * 
     * @return value
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /** 
     * Set the 'EffectiveDate' attribute value. Indicates the starting date.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /** 
     * Get the 'ExpireDate' attribute value. Indicates the ending date.
     * 
     * @return value
     */
    public String getExpireDate() {
        return expireDate;
    }

    /** 
     * Set the 'ExpireDate' attribute value. Indicates the ending date.
     * 
     * @param expireDate
     */
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
}
