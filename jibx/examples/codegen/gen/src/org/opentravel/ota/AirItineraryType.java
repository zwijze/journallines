
package org.opentravel.ota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * Specifies the origin and destination of the traveler.
 Attributes:
 DirectionInd - A directional indicator that identifies a type of air booking, either one-way, round-trip, or open-jaw with the enumeration of (OneWay | RT | OpenJaw) respectively.
 ActionCode - Indicates the status of the booking, such as OK or Wait-List.
 NumberInParty - Indicates the traveler count.

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirItineraryType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="OriginDestinationOptions">
 *       &lt;xs:complexType>
 *         &lt;xs:sequence>
 *           &lt;xs:element name="OriginDestinationOption" maxOccurs="99">
 *             &lt;!-- Reference to inner class OriginDestinationOption -->
 *           &lt;/xs:element>
 *         &lt;/xs:sequence>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="ns:AirTripType" use="optional" name="DirectionInd"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AirItineraryType
{
    private List<OriginDestinationOption> originDestinationOptionList = new ArrayList<OriginDestinationOption>();
    private AirTripType directionInd;

    /** 
     * Get the list of 'OriginDestinationOption' element items. A collection of  OriginDestinationOption
     * 
     * @return list
     */
    public List<OriginDestinationOption> getOriginDestinationOptionList() {
        return originDestinationOptionList;
    }

    /** 
     * Set the list of 'OriginDestinationOption' element items. A collection of  OriginDestinationOption
     * 
     * @param list
     */
    public void setOriginDestinationOptionList(
            List<OriginDestinationOption> list) {
        originDestinationOptionList = list;
    }

    /** 
     * Get the 'DirectionInd' attribute value.  Identifies whether travel is: one way, return trip, circle trip, open jaw, other.
     * 
     * @return value
     */
    public AirTripType getDirectionInd() {
        return directionInd;
    }

    /** 
     * Set the 'DirectionInd' attribute value.  Identifies whether travel is: one way, return trip, circle trip, open jaw, other.
     * 
     * @param directionInd
     */
    public void setDirectionInd(AirTripType directionInd) {
        this.directionInd = directionInd;
    }
    /** 
     * A container for OriginDestinationOptionType.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginDestinationOption" maxOccurs="99">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:OriginDestinationOptionType">
     *         &lt;xs:attribute type="xs:integer" use="optional" name="RefNumber"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class OriginDestinationOption
            extends
                OriginDestinationOptionType
    {
        private BigInteger refNumber;

        /** 
         * Get the 'RefNumber' attribute value. When a PricedItinerary element contains multiple solutions and a single price, this attribute identifies the OriginDestinationPair from the request. 
         * 
         * @return value
         */
        public BigInteger getRefNumber() {
            return refNumber;
        }

        /** 
         * Set the 'RefNumber' attribute value. When a PricedItinerary element contains multiple solutions and a single price, this attribute identifies the OriginDestinationPair from the request. 
         * 
         * @param refNumber
         */
        public void setRefNumber(BigInteger refNumber) {
            this.refNumber = refNumber;
        }
    }
}
