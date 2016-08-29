
package org.opentravel.ota;

import java.math.BigInteger;

/** 
 * Indicates preferences for certain types of flights, such as connections or stopovers, when used for a specific travel situation.

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FlightTypePrefGroup">
 *   &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *   &lt;xs:attribute type="ns:FlightTypeType" use="optional" name="FlightType"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="MaxConnections"/>
 *   &lt;xs:attribute use="optional" name="NonScheduledFltInfo">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class NonScheduledFltInfo -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="BackhaulIndicator"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="GroundTransportIndicator"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="DirectAndNonStopOnlyInd"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="NonStopsOnlyInd"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="OnlineConnectionsOnlyInd"/>
 *   &lt;xs:attribute use="optional" name="RoutingType">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class RoutingType -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class FlightTypePrefGroup
{
    private PreferLevelType preferLevel;
    private FlightTypeType flightType;
    private BigInteger maxConnections;
    private NonScheduledFltInfo nonScheduledFltInfo;
    private Boolean backhaulIndicator;
    private Boolean groundTransportIndicator;
    private Boolean directAndNonStopOnlyInd;
    private Boolean nonStopsOnlyInd;
    private Boolean onlineConnectionsOnlyInd;
    private RoutingType routingType;

    /** 
     * Get the 'PreferLevel' attribute value. Used to indicate a level of preference for an associated item.
     * 
     * @return value
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /** 
     * Set the 'PreferLevel' attribute value. Used to indicate a level of preference for an associated item.
     * 
     * @param preferLevel
     */
    public void setPreferLevel(PreferLevelType preferLevel) {
        this.preferLevel = preferLevel;
    }

    /** 
     * Get the 'FlightType' attribute value.  Indicates type of stops preferred (Nonstop, Direct, Connection).
     * 
     * @return value
     */
    public FlightTypeType getFlightType() {
        return flightType;
    }

    /** 
     * Set the 'FlightType' attribute value.  Indicates type of stops preferred (Nonstop, Direct, Connection).
     * 
     * @param flightType
     */
    public void setFlightType(FlightTypeType flightType) {
        this.flightType = flightType;
    }

    /** 
     * Get the 'MaxConnections' attribute value. Indicates that if connection is chosen, then this attribute defines the maximum number of connections preferred.
     * 
     * @return value
     */
    public BigInteger getMaxConnections() {
        return maxConnections;
    }

    /** 
     * Set the 'MaxConnections' attribute value. Indicates that if connection is chosen, then this attribute defines the maximum number of connections preferred.
     * 
     * @param maxConnections
     */
    public void setMaxConnections(BigInteger maxConnections) {
        this.maxConnections = maxConnections;
    }

    /** 
     * Get the 'NonScheduledFltInfo' attribute value. To specify which types of non-scheduled air service should be included.
     * 
     * @return value
     */
    public NonScheduledFltInfo getNonScheduledFltInfo() {
        return nonScheduledFltInfo;
    }

    /** 
     * Set the 'NonScheduledFltInfo' attribute value. To specify which types of non-scheduled air service should be included.
     * 
     * @param nonScheduledFltInfo
     */
    public void setNonScheduledFltInfo(NonScheduledFltInfo nonScheduledFltInfo) {
        this.nonScheduledFltInfo = nonScheduledFltInfo;
    }

    /** 
     * Get the 'BackhaulIndicator' attribute value. If true, include connections where one of the enroute stops is the same as the initial board point or the final off point of the flight.
     * 
     * @return value
     */
    public Boolean getBackhaulIndicator() {
        return backhaulIndicator;
    }

    /** 
     * Set the 'BackhaulIndicator' attribute value. If true, include connections where one of the enroute stops is the same as the initial board point or the final off point of the flight.
     * 
     * @param backhaulIndicator
     */
    public void setBackhaulIndicator(Boolean backhaulIndicator) {
        this.backhaulIndicator = backhaulIndicator;
    }

    /** 
     * Get the 'GroundTransportIndicator' attribute value. If true, include flights that include at least one leg that is ground transportation.
     * 
     * @return value
     */
    public Boolean getGroundTransportIndicator() {
        return groundTransportIndicator;
    }

    /** 
     * Set the 'GroundTransportIndicator' attribute value. If true, include flights that include at least one leg that is ground transportation.
     * 
     * @param groundTransportIndicator
     */
    public void setGroundTransportIndicator(Boolean groundTransportIndicator) {
        this.groundTransportIndicator = groundTransportIndicator;
    }

    /** 
     * Get the 'DirectAndNonStopOnlyInd' attribute value. If true, direct and non-stop flights are requested.
     * 
     * @return value
     */
    public Boolean getDirectAndNonStopOnlyInd() {
        return directAndNonStopOnlyInd;
    }

    /** 
     * Set the 'DirectAndNonStopOnlyInd' attribute value. If true, direct and non-stop flights are requested.
     * 
     * @param directAndNonStopOnlyInd
     */
    public void setDirectAndNonStopOnlyInd(Boolean directAndNonStopOnlyInd) {
        this.directAndNonStopOnlyInd = directAndNonStopOnlyInd;
    }

    /** 
     * Get the 'NonStopsOnlyInd' attribute value. If true, only non-stop flights are requested.
     * 
     * @return value
     */
    public Boolean getNonStopsOnlyInd() {
        return nonStopsOnlyInd;
    }

    /** 
     * Set the 'NonStopsOnlyInd' attribute value. If true, only non-stop flights are requested.
     * 
     * @param nonStopsOnlyInd
     */
    public void setNonStopsOnlyInd(Boolean nonStopsOnlyInd) {
        this.nonStopsOnlyInd = nonStopsOnlyInd;
    }

    /** 
     * Get the 'OnlineConnectionsOnlyInd' attribute value. If true, only online connection flights are requested (i.e., same marketing airline).
     * 
     * @return value
     */
    public Boolean getOnlineConnectionsOnlyInd() {
        return onlineConnectionsOnlyInd;
    }

    /** 
     * Set the 'OnlineConnectionsOnlyInd' attribute value. If true, only online connection flights are requested (i.e., same marketing airline).
     * 
     * @param onlineConnectionsOnlyInd
     */
    public void setOnlineConnectionsOnlyInd(Boolean onlineConnectionsOnlyInd) {
        this.onlineConnectionsOnlyInd = onlineConnectionsOnlyInd;
    }

    /** 
     * Get the 'RoutingType' attribute value. Specifies the travel routing preference.
     * 
     * @return value
     */
    public RoutingType getRoutingType() {
        return routingType;
    }

    /** 
     * Set the 'RoutingType' attribute value. Specifies the travel routing preference.
     * 
     * @param routingType
     */
    public void setRoutingType(RoutingType routingType) {
        this.routingType = routingType;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="ChartersOnly"/>
     *     &lt;xs:enumeration value="ExcludeCharters"/>
     *     &lt;xs:enumeration value="All"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum NonScheduledFltInfo {
        /** 
         * Only include non scheduled flights that are charter flights.
         */
        CHARTERS_ONLY("ChartersOnly"), /** 
                                        * Do not include non scheduled flights that are charters.
                                        */
        EXCLUDE_CHARTERS("ExcludeCharters"), /** 
                                              * Include both charter non scheduled flights and those that are not charters.
                                              */
        ALL("All");
        private final String value;

        private NonScheduledFltInfo(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static NonScheduledFltInfo convert(String value) {
            for (NonScheduledFltInfo inst : values()) {
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
     *     &lt;xs:enumeration value="Mirror"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum RoutingType {
        /** 
         * No special conditions.
         */
        NORMAL("Normal"), /** 
                           * Outbound and inbound route of travel must be the same.
                           */
        MIRROR("Mirror");
        private final String value;

        private RoutingType(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static RoutingType convert(String value) {
            for (RoutingType inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
