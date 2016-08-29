
package org.opentravel.ota;

/** 
 * Indicates main office, field office, or division of the organization.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OfficeLocationType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Main"/>
 *     &lt;xs:enumeration value="Field"/>
 *     &lt;xs:enumeration value="Division"/>
 *     &lt;xs:enumeration value="Regional"/>
 *     &lt;xs:enumeration value="Remote"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum OfficeLocationType {
    MAIN("Main"), FIELD("Field"), DIVISION("Division"), REGIONAL("Regional"), REMOTE(
            "Remote");
    private final String value;

    private OfficeLocationType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static OfficeLocationType convert(String value) {
        for (OfficeLocationType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
