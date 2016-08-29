
package org.opentravel.ota;

/** 
 * 
 Container for all the fare information.
 Pricing information for an itinerary.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BookingPriceInfoType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AirItineraryPricingInfoType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="ns:PriceRequestInformationType" name="PriceRequestInformation" minOccurs="0"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:boolean" default="false" name="RepriceRequired"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BookingPriceInfoType extends AirItineraryPricingInfoType
{
    private PriceRequestInformationType priceRequestInformation;
    private Boolean repriceRequired;

    /** 
     * Get the 'PriceRequestInformation' element value. Identifies pricing source, if negotiated fares are requested and if it is a reprice request.
     * 
     * @return value
     */
    public PriceRequestInformationType getPriceRequestInformation() {
        return priceRequestInformation;
    }

    /** 
     * Set the 'PriceRequestInformation' element value. Identifies pricing source, if negotiated fares are requested and if it is a reprice request.
     * 
     * @param priceRequestInformation
     */
    public void setPriceRequestInformation(
            PriceRequestInformationType priceRequestInformation) {
        this.priceRequestInformation = priceRequestInformation;
    }

    /** 
     * Get the 'RepriceRequired' attribute value.  If true re-pricing of the itinerary is required. 
     * 
     * @return value
     */
    public Boolean getRepriceRequired() {
        return repriceRequired;
    }

    /** 
     * Set the 'RepriceRequired' attribute value.  If true re-pricing of the itinerary is required. 
     * 
     * @param repriceRequired
     */
    public void setRepriceRequired(Boolean repriceRequired) {
        this.repriceRequired = repriceRequired;
    }
}
