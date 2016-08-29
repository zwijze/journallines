
package org.opentravel.ota;

/** 
 * Attribute collection used to describe a price request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PriceRequestAttributes">
 *   &lt;xs:attribute type="xs:string" use="optional" name="FareQualifier"/>
 *   &lt;xs:attribute type="xs:boolean" name="NegotiatedFaresOnly"/>
 *   &lt;xs:attribute type="xs:string" name="CurrencyCode"/>
 *   &lt;xs:attribute type="ns:PricingSourceType" use="optional" name="PricingSource"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="Reprice"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class PriceRequestAttributes
{
    private String fareQualifier;
    private Boolean negotiatedFaresOnly;
    private String currencyCode;
    private PricingSourceType pricingSource;
    private Boolean reprice;

    /** 
     * Get the 'FareQualifier' attribute value. Fare Type is specific to a specific fare and this is a request for a set of fares based on these qualifiers. Refer to OTA Code List 'Fare Qualifier' (FAQ).
     * 
     * @return value
     */
    public String getFareQualifier() {
        return fareQualifier;
    }

    /** 
     * Set the 'FareQualifier' attribute value. Fare Type is specific to a specific fare and this is a request for a set of fares based on these qualifiers. Refer to OTA Code List 'Fare Qualifier' (FAQ).
     * 
     * @param fareQualifier
     */
    public void setFareQualifier(String fareQualifier) {
        this.fareQualifier = fareQualifier;
    }

    /** 
     * Get the 'NegotiatedFaresOnly' attribute value. Indicator to identify whether or not the price is applicable only to private fares.
     * 
     * @return value
     */
    public Boolean getNegotiatedFaresOnly() {
        return negotiatedFaresOnly;
    }

    /** 
     * Set the 'NegotiatedFaresOnly' attribute value. Indicator to identify whether or not the price is applicable only to private fares.
     * 
     * @param negotiatedFaresOnly
     */
    public void setNegotiatedFaresOnly(Boolean negotiatedFaresOnly) {
        this.negotiatedFaresOnly = negotiatedFaresOnly;
    }

    /** 
     * Get the 'CurrencyCode' attribute value. Type of funds preferred for reviewing monetary values, in ISO 4217 codes.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' attribute value. Type of funds preferred for reviewing monetary values, in ISO 4217 codes.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'PricingSource' attribute value. 
    	It can be used to indicate whether the fare is public or private. 
    	
     * 
     * @return value
     */
    public PricingSourceType getPricingSource() {
        return pricingSource;
    }

    /** 
     * Set the 'PricingSource' attribute value. 
    	It can be used to indicate whether the fare is public or private. 
    	
     * 
     * @param pricingSource
     */
    public void setPricingSource(PricingSourceType pricingSource) {
        this.pricingSource = pricingSource;
    }

    /** 
     * Get the 'Reprice' attribute value.  If true repricing is requested.
     * 
     * @return value
     */
    public Boolean getReprice() {
        return reprice;
    }

    /** 
     * Set the 'Reprice' attribute value.  If true repricing is requested.
     * 
     * @param reprice
     */
    public void setReprice(Boolean reprice) {
        this.reprice = reprice;
    }
}
