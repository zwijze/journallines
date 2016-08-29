
package org.opentravel.ota;

/** 
 * Used to indicate a positive or negative choice. Not recommended for use, use xs:boolean.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="YesNoType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Yes"/>
 *     &lt;xs:enumeration value="No"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum YesNoType {
    YES("Yes"), NO("No");
    private final String value;

    private YesNoType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static YesNoType convert(String value) {
        for (YesNoType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
