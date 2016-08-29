
package org.opentravel.ota;

/** 
 * Identifies whether the fare was constructed, published, created, etc.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareStatusType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="constructed"/>
 *     &lt;xs:enumeration value="published"/>
 *     &lt;xs:enumeration value="created"/>
 *     &lt;xs:enumeration value="fareByRule"/>
 *     &lt;xs:enumeration value="fareByRulePrivate"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum FareStatusType {
    CONSTRUCTED("constructed"), PUBLISHED("published"), CREATED("created"), /** 
                                                                             * Specifies that the fare was built based on rules.

                                                                             */
    FARE_BY_RULE("fareByRule"), /** 
                                 * The private fare was built by rules.
                                 */
    FARE_BY_RULE_PRIVATE("fareByRulePrivate");
    private final String value;

    private FareStatusType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static FareStatusType convert(String value) {
        for (FareStatusType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
