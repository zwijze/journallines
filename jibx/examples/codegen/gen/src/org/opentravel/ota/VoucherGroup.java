
package org.opentravel.ota;

/** 
 * A form of payment using a voucher or coupon.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VoucherGroup">
 *   &lt;xs:attributeGroup ref="ns:EffectiveExpireOptionalDateGroup"/>
 *   &lt;xs:attribute type="xs:string" name="SeriesCode"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class VoucherGroup
{
    private EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup;
    private String seriesCode;

    /** 
     * Get the 'EffectiveExpireOptionalDateGroup' attributeGroup value. The date when a voucher becomes valid for use, if applicable, and the the date when a voucher or series of coupons expires and is no longer valid.
     * 
     * @return value
     */
    public EffectiveExpireOptionalDateGroup getEffectiveExpireOptionalDateGroup() {
        return effectiveExpireOptionalDateGroup;
    }

    /** 
     * Set the 'EffectiveExpireOptionalDateGroup' attributeGroup value. The date when a voucher becomes valid for use, if applicable, and the the date when a voucher or series of coupons expires and is no longer valid.
     * 
     * @param effectiveExpireOptionalDateGroup
     */
    public void setEffectiveExpireOptionalDateGroup(
            EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup) {
        this.effectiveExpireOptionalDateGroup = effectiveExpireOptionalDateGroup;
    }

    /** 
     * Get the 'SeriesCode' attribute value. Identification of a series of coupons or vouchers identified by serial number(s).
     * 
     * @return value
     */
    public String getSeriesCode() {
        return seriesCode;
    }

    /** 
     * Set the 'SeriesCode' attribute value. Identification of a series of coupons or vouchers identified by serial number(s).
     * 
     * @param seriesCode
     */
    public void setSeriesCode(String seriesCode) {
        this.seriesCode = seriesCode;
    }
}
