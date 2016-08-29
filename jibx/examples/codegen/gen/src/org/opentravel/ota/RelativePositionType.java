
package org.opentravel.ota;

/** 
 * The RelativePosition object contains information about the direction, distance and travel time to/from a facility (hotel, car rental location, or airport) or to/from a designated location.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RelativePositionType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:TransportationsType">
 *       &lt;xs:attributeGroup ref="ns:RelativePositionGroup"/>
 *       &lt;xs:attribute type="xs:boolean" use="optional" name="Nearest"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="IndexPointCode"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="Name"/>
 *       &lt;xs:attribute type="xs:boolean" use="optional" name="PrimaryIndicator"/>
 *       &lt;xs:attribute use="optional" name="ToFrom">
 *         &lt;xs:simpleType>
 *           &lt;!-- Reference to inner class ToFrom -->
 *         &lt;/xs:simpleType>
 *       &lt;/xs:attribute>
 *       &lt;xs:attribute type="xs:boolean" use="optional" name="ApproximateDistanceInd"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RelativePositionType extends TransportationsType
{
    private RelativePositionGroup relativePositionGroup;
    private Boolean nearest;
    private String indexPointCode;
    private String name;
    private Boolean primaryIndicator;
    private ToFrom toFrom;
    private Boolean approximateDistanceInd;

    /** 
     * Get the 'RelativePositionGroup' attributeGroup value.
     * 
     * @return value
     */
    public RelativePositionGroup getRelativePositionGroup() {
        return relativePositionGroup;
    }

    /** 
     * Set the 'RelativePositionGroup' attributeGroup value.
     * 
     * @param relativePositionGroup
     */
    public void setRelativePositionGroup(
            RelativePositionGroup relativePositionGroup) {
        this.relativePositionGroup = relativePositionGroup;
    }

    /** 
     * Get the 'Nearest' attribute value. The indicator for whether this location is nearest. 
     * 
     * @return value
     */
    public Boolean getNearest() {
        return nearest;
    }

    /** 
     * Set the 'Nearest' attribute value. The indicator for whether this location is nearest. 
     * 
     * @param nearest
     */
    public void setNearest(Boolean nearest) {
        this.nearest = nearest;
    }

    /** 
     * Get the 'IndexPointCode' attribute value. This is the object referred to by the relative position (e.g. cross street, airport). Refer to OTA Code List Index Point Code (IPC).
     * 
     * @return value
     */
    public String getIndexPointCode() {
        return indexPointCode;
    }

    /** 
     * Set the 'IndexPointCode' attribute value. This is the object referred to by the relative position (e.g. cross street, airport). Refer to OTA Code List Index Point Code (IPC).
     * 
     * @param indexPointCode
     */
    public void setIndexPointCode(String indexPointCode) {
        this.indexPointCode = indexPointCode;
    }

    /** 
     * Get the 'Name' attribute value. This is used to accommodate a city name, rail station name etc. when using the indexPoint attribute.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' attribute value. This is used to accommodate a city name, rail station name etc. when using the indexPoint attribute.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'PrimaryIndicator' attribute value. Indicates whether the reference point is considered the main reference point for the specific type of IndexPointCode (e.g., in Dallas, where IndexPointCode=airport Dallas/Fort Worth airport would be the primary airport even if another airport such as Love Field is closer).
     * 
     * @return value
     */
    public Boolean getPrimaryIndicator() {
        return primaryIndicator;
    }

    /** 
     * Set the 'PrimaryIndicator' attribute value. Indicates whether the reference point is considered the main reference point for the specific type of IndexPointCode (e.g., in Dallas, where IndexPointCode=airport Dallas/Fort Worth airport would be the primary airport even if another airport such as Love Field is closer).
     * 
     * @param primaryIndicator
     */
    public void setPrimaryIndicator(Boolean primaryIndicator) {
        this.primaryIndicator = primaryIndicator;
    }

    /** 
     * Get the 'ToFrom' attribute value. Used to indicate whether the context is to a facility or from a facility.
     * 
     * @return value
     */
    public ToFrom getToFrom() {
        return toFrom;
    }

    /** 
     * Set the 'ToFrom' attribute value. Used to indicate whether the context is to a facility or from a facility.
     * 
     * @param toFrom
     */
    public void setToFrom(ToFrom toFrom) {
        this.toFrom = toFrom;
    }

    /** 
     * Get the 'ApproximateDistanceInd' attribute value. When true, the distance information is approximate.
     * 
     * @return value
     */
    public Boolean getApproximateDistanceInd() {
        return approximateDistanceInd;
    }

    /** 
     * Set the 'ApproximateDistanceInd' attribute value. When true, the distance information is approximate.
     * 
     * @param approximateDistanceInd
     */
    public void setApproximateDistanceInd(Boolean approximateDistanceInd) {
        this.approximateDistanceInd = approximateDistanceInd;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="ToFacility"/>
     *     &lt;xs:enumeration value="FromFacility"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum ToFrom {
        /** 
         * Indicates the direction is to the facility based on use (e.g., hotel, car rental location, airport).
         */
        TO_FACILITY("ToFacility"), /** 
                                    * Indicates the direction is from the facility based on use (e.g., hotel, car rental location, airport).
                                    */
        FROM_FACILITY("FromFacility");
        private final String value;

        private ToFrom(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static ToFrom convert(String value) {
            for (ToFrom inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
