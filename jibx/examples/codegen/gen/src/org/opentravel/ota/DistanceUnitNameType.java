
package org.opentravel.ota;

/** 
 * This simple type defines a set of valid values for the units in which distance is measured (i.e. mile or kilometer).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DistanceUnitNameType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Mile"/>
 *     &lt;xs:enumeration value="Km"/>
 *     &lt;xs:enumeration value="Block"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum DistanceUnitNameType {
    MILE("Mile"), KM("Km"), BLOCK("Block");
    private final String value;

    private DistanceUnitNameType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static DistanceUnitNameType convert(String value) {
        for (DistanceUnitNameType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
