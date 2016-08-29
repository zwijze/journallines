
package org.opentravel.ota;

/** 
 * Identifies the position of a seat, e.g. Window, Aisle etc. 
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Window"/>
 *     &lt;xs:enumeration value="Aisle"/>
 *     &lt;xs:enumeration value="Table"/>
 *     &lt;xs:enumeration value="Middle"/>
 *     &lt;xs:enumeration value="Individual"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum SeatType {
    WINDOW("Window"), AISLE("Aisle"), TABLE("Table"), MIDDLE("Middle"), INDIVIDUAL(
            "Individual");
    private final String value;

    private SeatType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static SeatType convert(String value) {
        for (SeatType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
