
package org.opentravel.ota;

import java.sql.Date;

/** 
 * Used to send the effective date and/or expiration date.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EffectiveExpireOptionalDateGroup">
 *   &lt;xs:attribute type="xs:date" use="optional" name="EffectiveDate"/>
 *   &lt;xs:attribute type="xs:date" use="optional" name="ExpireDate"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class EffectiveExpireOptionalDateGroup
{
    private Date effectiveDate;
    private Date expireDate;

    /** 
     * Get the 'EffectiveDate' attribute value. Indicates the starting date.
     * 
     * @return value
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /** 
     * Set the 'EffectiveDate' attribute value. Indicates the starting date.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /** 
     * Get the 'ExpireDate' attribute value. Indicates the ending date.
     * 
     * @return value
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /** 
     * Set the 'ExpireDate' attribute value. Indicates the ending date.
     * 
     * @param expireDate
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
}
