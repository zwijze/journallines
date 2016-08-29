
package org.opentravel.ota;

/** 
 * Identifies the trip type - one way, return, circle trip, open jaw
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirTripType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="OneWay"/>
 *     &lt;xs:enumeration value="OneWayOnly"/>
 *     &lt;xs:enumeration value="Return"/>
 *     &lt;xs:enumeration value="Circle"/>
 *     &lt;xs:enumeration value="OpenJaw"/>
 *     &lt;xs:enumeration value="Other"/>
 *     &lt;xs:enumeration value="Outbound"/>
 *     &lt;xs:enumeration value="OutboundSeasonRoundtrip"/>
 *     &lt;xs:enumeration value="Non-directional"/>
 *     &lt;xs:enumeration value="Inbound"/>
 *     &lt;xs:enumeration value="Roundtrip"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum AirTripType {
    /** 
     * Identifies a one way trip type.
     */
    ONE_WAY("OneWay"), /** 
                        * Cannot be doubled to create a roundtrip. 
                        */
    ONE_WAY_ONLY("OneWayOnly"), /** 
                                 * Identifies a return trip type.
                                 */
    RETURN("Return"), /** 
                       *  Identifies a circle trip type.
                       */
    CIRCLE("Circle"), /** 
                       *  Identifies an open jaw trip type.
                       */
    OPEN_JAW("OpenJaw"), /** 
                          *  Identifies an other trip type.
                          */
    OTHER("Other"), /** 
                     * The direction for the fare is outbound.
                     */
    OUTBOUND("Outbound"), /** 
                           * The direction for the fare is outbound seasonal roundtrip.
                           */
    OUTBOUND_SEASON_ROUNDTRIP("OutboundSeasonRoundtrip"), /** 
                                                           * There is no direction specified for the fare.
                                                           */
    NONDIRECTIONAL("Non-directional"), /** 
                                        * The direction for the fare is inbound.
                                        */
    INBOUND("Inbound"), /** 
                         * Identifies travel from one point to another point and return to the original point.  (The outbound fare shall be used also for the inbound fare component for the purpose of determing if the pricing unit is a round trip).  
                         */
    ROUNDTRIP("Roundtrip");
    private final String value;

    private AirTripType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static AirTripType convert(String value) {
        for (AirTripType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
