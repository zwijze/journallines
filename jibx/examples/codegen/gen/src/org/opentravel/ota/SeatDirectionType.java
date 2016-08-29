
package org.opentravel.ota;

/** 
 * Identifies the orientation of a seat relative to the direction of  travel.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatDirectionType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Facing"/>
 *     &lt;xs:enumeration value="Back"/>
 *     &lt;xs:enumeration value="Airline"/>
 *     &lt;xs:enumeration value="Lateral"/>
 *     &lt;xs:enumeration value="Unknown"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum SeatDirectionType {
    FACING("Facing"), BACK("Back"), AIRLINE("Airline"), LATERAL("Lateral"), UNKNOWN(
            "Unknown");
    private final String value;

    private SeatDirectionType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static SeatDirectionType convert(String value) {
        for (SeatDirectionType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
