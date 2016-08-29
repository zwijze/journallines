
package org.opentravel.ota;

/** 
 * A collection of information that specifies how the message processing should occur or how the data should be returned.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirProcessingInfoGroup">
 *   &lt;xs:attribute use="optional" name="TargetSource">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class TargetSource -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="FlightSvcInfoIndicator"/>
 *   &lt;xs:attribute type="ns:DisplayOrderType" use="optional" name="DisplayOrder"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="ReducedDataIndicator"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="BaseFaresOnlyIndicator"/>
 *   &lt;xs:attribute use="optional" name="SearchType">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class SearchType -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="AvailabilityIndicator"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class AirProcessingInfoGroup
{
    private TargetSource targetSource;
    private Boolean flightSvcInfoIndicator;
    private DisplayOrderType displayOrder;
    private Boolean reducedDataIndicator;
    private Boolean baseFaresOnlyIndicator;
    private SearchType searchType;
    private Boolean availabilityIndicator;

    /** 
     * Get the 'TargetSource' attribute value. Specifies to whom the request should be targeted for the information that is to be returned.
     * 
     * @return value
     */
    public TargetSource getTargetSource() {
        return targetSource;
    }

    /** 
     * Set the 'TargetSource' attribute value. Specifies to whom the request should be targeted for the information that is to be returned.
     * 
     * @param targetSource
     */
    public void setTargetSource(TargetSource targetSource) {
        this.targetSource = targetSource;
    }

    /** 
     * Get the 'FlightSvcInfoIndicator' attribute value. If true, flight service information should be returned in the response.
     * 
     * @return value
     */
    public Boolean getFlightSvcInfoIndicator() {
        return flightSvcInfoIndicator;
    }

    /** 
     * Set the 'FlightSvcInfoIndicator' attribute value. If true, flight service information should be returned in the response.
     * 
     * @param flightSvcInfoIndicator
     */
    public void setFlightSvcInfoIndicator(Boolean flightSvcInfoIndicator) {
        this.flightSvcInfoIndicator = flightSvcInfoIndicator;
    }

    /** 
     * Get the 'DisplayOrder' attribute value. Specifies the order in which the information should be returned.
     * 
     * @return value
     */
    public DisplayOrderType getDisplayOrder() {
        return displayOrder;
    }

    /** 
     * Set the 'DisplayOrder' attribute value. Specifies the order in which the information should be returned.
     * 
     * @param displayOrder
     */
    public void setDisplayOrder(DisplayOrderType displayOrder) {
        this.displayOrder = displayOrder;
    }

    /** 
     * Get the 'ReducedDataIndicator' attribute value. If true, reduced data should be returned
     * 
     * @return value
     */
    public Boolean getReducedDataIndicator() {
        return reducedDataIndicator;
    }

    /** 
     * Set the 'ReducedDataIndicator' attribute value. If true, reduced data should be returned
     * 
     * @param reducedDataIndicator
     */
    public void setReducedDataIndicator(Boolean reducedDataIndicator) {
        this.reducedDataIndicator = reducedDataIndicator;
    }

    /** 
     * Get the 'BaseFaresOnlyIndicator' attribute value. If true, only base fare information should be returned
     * 
     * @return value
     */
    public Boolean getBaseFaresOnlyIndicator() {
        return baseFaresOnlyIndicator;
    }

    /** 
     * Set the 'BaseFaresOnlyIndicator' attribute value. If true, only base fare information should be returned
     * 
     * @param baseFaresOnlyIndicator
     */
    public void setBaseFaresOnlyIndicator(Boolean baseFaresOnlyIndicator) {
        this.baseFaresOnlyIndicator = baseFaresOnlyIndicator;
    }

    /** 
     * Get the 'SearchType' attribute value. Specifies (at a high level) the type of search criteria for
    this request.
     * 
     * @return value
     */
    public SearchType getSearchType() {
        return searchType;
    }

    /** 
     * Set the 'SearchType' attribute value. Specifies (at a high level) the type of search criteria for
    this request.
     * 
     * @param searchType
     */
    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }

    /** 
     * Get the 'AvailabilityIndicator' attribute value. If true, booking class availability should be returned in the response for each of the flight segments.  
     * 
     * @return value
     */
    public Boolean getAvailabilityIndicator() {
        return availabilityIndicator;
    }

    /** 
     * Set the 'AvailabilityIndicator' attribute value. If true, booking class availability should be returned in the response for each of the flight segments.  
     * 
     * @param availabilityIndicator
     */
    public void setAvailabilityIndicator(Boolean availabilityIndicator) {
        this.availabilityIndicator = availabilityIndicator;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="Core"/>
     *     &lt;xs:enumeration value="Vendor"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum TargetSource {
        /** 
         * Requested information should be based on travel data (availabiltiy, rates) stored inhouse.
         */
        CORE("Core"), /** 
                       * Requested information should taken from the vendor's system.
                       */
        VENDOR("Vendor");
        private final String value;

        private TargetSource(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static TargetSource convert(String value) {
            for (TargetSource inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="Normal"/>
     *     &lt;xs:enumeration value="Window"/>
     *     &lt;xs:enumeration value="ArrivalTime"/>
     *     &lt;xs:enumeration value="PowerFlight"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum SearchType {
        /** 
         * No special conditions (default)
         */
        NORMAL("Normal"), /** 
                           * Search should be done for a window of time.
                           */
        WINDOW("Window"), /** 
                           * Search should be based on arrival time.
                           */
        ARRIVAL_TIME("ArrivalTime"), /** 
                                      * Checks availability and fares by manually entered data.
                                      */
        POWER_FLIGHT("PowerFlight");
        private final String value;

        private SearchType(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static SearchType convert(String value) {
            for (SearchType inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
