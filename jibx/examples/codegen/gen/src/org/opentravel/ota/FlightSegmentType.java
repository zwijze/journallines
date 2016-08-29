
package org.opentravel.ota;

/** 
 * 
 FlightSegmentType extends FlightSegmentBaseType to provide additional functionality. 

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FlightSegmentType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:FlightSegmentBaseType">
 *       &lt;xs:sequence>
 *         &lt;xs:element name="MarketingAirline" minOccurs="0">
 *           &lt;!-- Reference to inner class MarketingAirline -->
 *         &lt;/xs:element>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="optional" name="FlightNumber"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="TourOperatorFlightID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FlightSegmentType extends FlightSegmentBaseType
{
    private MarketingAirline marketingAirline;
    private String flightNumber;
    private String tourOperatorFlightID;

    /** 
     * Get the 'MarketingAirline' element value.
     * 
     * @return value
     */
    public MarketingAirline getMarketingAirline() {
        return marketingAirline;
    }

    /** 
     * Set the 'MarketingAirline' element value.
     * 
     * @param marketingAirline
     */
    public void setMarketingAirline(MarketingAirline marketingAirline) {
        this.marketingAirline = marketingAirline;
    }

    /** 
     * Get the 'FlightNumber' attribute value. The flight number of the flight. This is required for use with scheduled airline messages but may be omitted for requests by tour operators. 
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'FlightNumber' attribute value. The flight number of the flight. This is required for use with scheduled airline messages but may be omitted for requests by tour operators. 
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'TourOperatorFlightID' attribute value. ID of a flight in the Tour Operator's inventory. This flight is not necessarily in the inventory of an airline. Rather, it is a code created by tour operators.  
     * 
     * @return value
     */
    public String getTourOperatorFlightID() {
        return tourOperatorFlightID;
    }

    /** 
     * Set the 'TourOperatorFlightID' attribute value. ID of a flight in the Tour Operator's inventory. This flight is not necessarily in the inventory of an airline. Rather, it is a code created by tour operators.  
     * 
     * @param tourOperatorFlightID
     */
    public void setTourOperatorFlightID(String tourOperatorFlightID) {
        this.tourOperatorFlightID = tourOperatorFlightID;
    }
    /** 
     * The marketing airline. This is required for use with scheduled airline messages but may be omitted for requests by tour operators. 
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MarketingAirline" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="ns:CompanyNameType">
     *         &lt;xs:attributeGroup ref="ns:SingleVendorIndGroup"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class MarketingAirline
    {
        private CompanyNameType companyNameType;
        private SingleVendorIndGroup singleVendorIndGroup;

        /** 
         * Get the extension value.
         * 
         * @return value
         */
        public CompanyNameType getCompanyNameType() {
            return companyNameType;
        }

        /** 
         * Set the extension value.
         * 
         * @param companyNameType
         */
        public void setCompanyNameType(CompanyNameType companyNameType) {
            this.companyNameType = companyNameType;
        }

        /** 
         * Get the 'SingleVendorIndGroup' attributeGroup value. To specifiy if an airline is a member of an alliance.
         * 
         * @return value
         */
        public SingleVendorIndGroup getSingleVendorIndGroup() {
            return singleVendorIndGroup;
        }

        /** 
         * Set the 'SingleVendorIndGroup' attributeGroup value. To specifiy if an airline is a member of an alliance.
         * 
         * @param singleVendorIndGroup
         */
        public void setSingleVendorIndGroup(
                SingleVendorIndGroup singleVendorIndGroup) {
            this.singleVendorIndGroup = singleVendorIndGroup;
        }
    }
}
