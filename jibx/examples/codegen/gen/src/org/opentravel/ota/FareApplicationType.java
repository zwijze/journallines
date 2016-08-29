
package org.opentravel.ota;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareApplicationType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="OneWay"/>
 *     &lt;xs:enumeration value="Return"/>
 *     &lt;xs:enumeration value="HalfReturn"/>
 *     &lt;xs:enumeration value="Roundtrip"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum FareApplicationType {
    ONE_WAY("OneWay"), RETURN("Return"), HALF_RETURN("HalfReturn"), /** 
                                                                     * Specifies that the fare is for a roundtrip.
                                                                     */
    ROUNDTRIP("Roundtrip");
    private final String value;

    private FareApplicationType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static FareApplicationType convert(String value) {
        for (FareApplicationType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
