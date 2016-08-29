
package org.opentravel.ota;

/** 
 * Identifies a particular type of flight - Direct, Stopover etc.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FlightTypeType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Nonstop"/>
 *     &lt;xs:enumeration value="Direct"/>
 *     &lt;xs:enumeration value="Connection"/>
 *     &lt;xs:enumeration value="SingleConnection"/>
 *     &lt;xs:enumeration value="DoubleConnection"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum FlightTypeType {
    /** 
     * Indicates the flight does not make any scheduled stops between 2 points.
     */
    NONSTOP("Nonstop"), /** 
                         * Indicates the flight makes a scheduled stop(s) between 2 points.
                         */
    DIRECT("Direct"), /** 
                       * Indicates the flight will require a change of aircraft at a connecting point(s).
                       */
    CONNECTION("Connection"), /** 
                               * A trip with only one connection.
                               */
    SINGLE_CONNECTION("SingleConnection"), /** 
                                            * A trip with only two connections.
                                            */
    DOUBLE_CONNECTION("DoubleConnection");
    private final String value;

    private FlightTypeType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static FlightTypeType convert(String value) {
        for (FlightTypeType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
