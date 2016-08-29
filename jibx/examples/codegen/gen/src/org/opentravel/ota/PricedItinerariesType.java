
package org.opentravel.ota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * Container for priced itineraries.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PricedItinerariesType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="PricedItinerary" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class PricedItinerary -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PricedItinerariesType
{
    private List<PricedItinerary> pricedItineraryList = new ArrayList<PricedItinerary>();

    /** 
     * Get the list of 'PricedItinerary' element items.
     * 
     * @return list
     */
    public List<PricedItinerary> getPricedItineraryList() {
        return pricedItineraryList;
    }

    /** 
     * Set the list of 'PricedItinerary' element items.
     * 
     * @param list
     */
    public void setPricedItineraryList(List<PricedItinerary> list) {
        pricedItineraryList = list;
    }
    /** 
     *  Itinerary with pricing information.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PricedItinerary" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:PricedItineraryType">
     *         &lt;xs:attribute type="xs:integer" use="optional" name="OriginDestinationRefNumber"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class PricedItinerary extends PricedItineraryType
    {
        private BigInteger originDestinationRefNumber;

        /** 
         * Get the 'OriginDestinationRefNumber' attribute value. This attribute refers back to origin destination information in the OTA_AirLowFareSearchRQ message.
         * 
         * @return value
         */
        public BigInteger getOriginDestinationRefNumber() {
            return originDestinationRefNumber;
        }

        /** 
         * Set the 'OriginDestinationRefNumber' attribute value. This attribute refers back to origin destination information in the OTA_AirLowFareSearchRQ message.
         * 
         * @param originDestinationRefNumber
         */
        public void setOriginDestinationRefNumber(
                BigInteger originDestinationRefNumber) {
            this.originDestinationRefNumber = originDestinationRefNumber;
        }
    }
}
