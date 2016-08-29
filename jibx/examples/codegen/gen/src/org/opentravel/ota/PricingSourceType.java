
package org.opentravel.ota;

/** 
 * 
 It can be used to indicate whether the fare is public or private. 

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PricingSourceType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Published"/>
 *     &lt;xs:enumeration value="Private"/>
 *     &lt;xs:enumeration value="Both"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum PricingSourceType {
    /** 
     *  Published fare.
     */
    PUBLISHED("Published"), /** 
                             *  Private fare.
                             */
    PRIVATE("Private"), /** 
                         *  Fare is both public and private.
                         */
    BOTH("Both");
    private final String value;

    private PricingSourceType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static PricingSourceType convert(String value) {
        for (PricingSourceType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
