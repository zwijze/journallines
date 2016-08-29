
package org.opentravel.ota;

/** 
 * An enumerated type that defines how a service is priced.  Values:  Per stay,  Per person, Per night, Per person per night,  Per use.  
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PricingType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Per stay"/>
 *     &lt;xs:enumeration value="Per person"/>
 *     &lt;xs:enumeration value="Per night"/>
 *     &lt;xs:enumeration value="Per person per night"/>
 *     &lt;xs:enumeration value="Per use"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum PricingType {
    PERSTAY("Per stay"), PERPERSON("Per person"), PERNIGHT("Per night"), PERPERSONPERNIGHT(
            "Per person per night"), PERUSE("Per use");
    private final String value;

    private PricingType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static PricingType convert(String value) {
        for (PricingType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
