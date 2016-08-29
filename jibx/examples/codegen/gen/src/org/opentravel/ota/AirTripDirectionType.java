
package org.opentravel.ota;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirTripDirectionType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Outbound"/>
 *     &lt;xs:enumeration value="Return"/>
 *     &lt;xs:enumeration value="All"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum AirTripDirectionType {
    OUTBOUND("Outbound"), RETURN("Return"), ALL("All");
    private final String value;

    private AirTripDirectionType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static AirTripDirectionType convert(String value) {
        for (AirTripDirectionType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
