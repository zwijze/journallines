
package org.opentravel.ota;

/** 
 * A cabin is either First, Business or Economy 
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CabinType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="First"/>
 *     &lt;xs:enumeration value="Business"/>
 *     &lt;xs:enumeration value="Economy"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum CabinType {
    /** 
     * First class compartment. 
     */
    FIRST("First"), /** 
                     * Business class compartment. 
                     */
    BUSINESS("Business"), /** 
                           * Economy (or sometimes referred to as Coach) class compartment.
                           */
    ECONOMY("Economy");
    private final String value;

    private CabinType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static CabinType convert(String value) {
        for (CabinType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
