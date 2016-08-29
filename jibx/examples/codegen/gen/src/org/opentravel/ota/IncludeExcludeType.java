
package org.opentravel.ota;

/** 
 * Specifies the applicability of the criteria to which it is related.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IncludeExcludeType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Include"/>
 *     &lt;xs:enumeration value="Exclude"/>
 *     &lt;xs:enumeration value="Required"/>
 *     &lt;xs:enumeration value="Allowed"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum IncludeExcludeType {
    INCLUDE("Include"), EXCLUDE("Exclude"), /** 
                                             * The associated item is required.
                                             */
    REQUIRED("Required"), /** 
                           * The associated item is allowed.
                           */
    ALLOWED("Allowed");
    private final String value;

    private IncludeExcludeType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static IncludeExcludeType convert(String value) {
        for (IncludeExcludeType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
