
package org.opentravel.ota;

/** 
 * Defines the rate information that is common to all transactions.  Such information may include rate codes, rate type, promotional codes, etc.  This information may be used to determine the rate that is made available.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RateQualifierCoreGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="TravelPurpose"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="RateCategory"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CorpDiscountNmbr"/>
 *   &lt;xs:attributeGroup ref="ns:PromotionCodeGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="RateQualifier"/>
 *   &lt;xs:attribute type="ns:RatePeriodSimpleType" use="optional" name="RatePeriod"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="GuaranteedInd"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class RateQualifierCoreGroup
{
    private String travelPurpose;
    private String rateCategory;
    private String corpDiscountNmbr;
    private PromotionCodeGroup promotionCodeGroup;
    private String rateQualifier;
    private RatePeriodSimpleType ratePeriod;
    private Boolean guaranteedInd;

    /** 
     * Get the 'TravelPurpose' attribute value. Used to indicate the purpose, whether for business, personal or other. Refer to OTA Code List Travel Purpose (TVP).
     * 
     * @return value
     */
    public String getTravelPurpose() {
        return travelPurpose;
    }

    /** 
     * Set the 'TravelPurpose' attribute value. Used to indicate the purpose, whether for business, personal or other. Refer to OTA Code List Travel Purpose (TVP).
     * 
     * @param travelPurpose
     */
    public void setTravelPurpose(String travelPurpose) {
        this.travelPurpose = travelPurpose;
    }

    /** 
     * Get the 'RateCategory' attribute value. The RateCategory attribute defines a set of valid values for the category of a rate.  Typically rates are offered as either Leisure rates or Business (Corporate) rates, with a business rate usually including additional costs such as the cost of insurance, etc.  This set of values defines the rate categories. Refer to OTA Code List Rate Category(RTC).
     * 
     * @return value
     */
    public String getRateCategory() {
        return rateCategory;
    }

    /** 
     * Set the 'RateCategory' attribute value. The RateCategory attribute defines a set of valid values for the category of a rate.  Typically rates are offered as either Leisure rates or Business (Corporate) rates, with a business rate usually including additional costs such as the cost of insurance, etc.  This set of values defines the rate categories. Refer to OTA Code List Rate Category(RTC).
     * 
     * @param rateCategory
     */
    public void setRateCategory(String rateCategory) {
        this.rateCategory = rateCategory;
    }

    /** 
     * Get the 'CorpDiscountNmbr' attribute value. This is the vendor specific code used to identify a special rate associated with a specific organization.
     * 
     * @return value
     */
    public String getCorpDiscountNmbr() {
        return corpDiscountNmbr;
    }

    /** 
     * Set the 'CorpDiscountNmbr' attribute value. This is the vendor specific code used to identify a special rate associated with a specific organization.
     * 
     * @param corpDiscountNmbr
     */
    public void setCorpDiscountNmbr(String corpDiscountNmbr) {
        this.corpDiscountNmbr = corpDiscountNmbr;
    }

    /** 
     * Get the 'PromotionCodeGroup' attributeGroup value. Promotion code is the identifier used by the host to link directly with a specific named advertising campaign. By including the required code, the client is able to gain access to special offers which may have been created for a specifically targeted group via a CRM system or for a wider advertising campaign using Television or press adverts.
     * 
     * @return value
     */
    public PromotionCodeGroup getPromotionCodeGroup() {
        return promotionCodeGroup;
    }

    /** 
     * Set the 'PromotionCodeGroup' attributeGroup value. Promotion code is the identifier used by the host to link directly with a specific named advertising campaign. By including the required code, the client is able to gain access to special offers which may have been created for a specifically targeted group via a CRM system or for a wider advertising campaign using Television or press adverts.
     * 
     * @param promotionCodeGroup
     */
    public void setPromotionCodeGroup(PromotionCodeGroup promotionCodeGroup) {
        this.promotionCodeGroup = promotionCodeGroup;
    }

    /** 
     * Get the 'RateQualifier' attribute value. This is the vendor specific code for rate codes (e.g. WES, 2A, DLY00).
     * 
     * @return value
     */
    public String getRateQualifier() {
        return rateQualifier;
    }

    /** 
     * Set the 'RateQualifier' attribute value. This is the vendor specific code for rate codes (e.g. WES, 2A, DLY00).
     * 
     * @param rateQualifier
     */
    public void setRateQualifier(String rateQualifier) {
        this.rateQualifier = rateQualifier;
    }

    /** 
     * Get the 'RatePeriod' attribute value. The RatePeriod attribute defines the type of rate that may be applied.  For example, typically car rental rates differ based upon the duration of the rental, and the actual rate is then expressed in terms of the period of the rental.
     * 
     * @return value
     */
    public RatePeriodSimpleType getRatePeriod() {
        return ratePeriod;
    }

    /** 
     * Set the 'RatePeriod' attribute value. The RatePeriod attribute defines the type of rate that may be applied.  For example, typically car rental rates differ based upon the duration of the rental, and the actual rate is then expressed in terms of the period of the rental.
     * 
     * @param ratePeriod
     */
    public void setRatePeriod(RatePeriodSimpleType ratePeriod) {
        this.ratePeriod = ratePeriod;
    }

    /** 
     * Get the 'GuaranteedInd' attribute value. When true, only guaranteed rates should be returned.  When false, all rates should be returned
     * 
     * @return value
     */
    public Boolean getGuaranteedInd() {
        return guaranteedInd;
    }

    /** 
     * Set the 'GuaranteedInd' attribute value. When true, only guaranteed rates should be returned.  When false, all rates should be returned
     * 
     * @param guaranteedInd
     */
    public void setGuaranteedInd(Boolean guaranteedInd) {
        this.guaranteedInd = guaranteedInd;
    }
}
