
package org.opentravel.ota;

/** 
 * Statuses that exist in a property management system (PMS).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PMS_ResStatusType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Reserved"/>
 *     &lt;xs:enumeration value="Requested"/>
 *     &lt;xs:enumeration value="Request denied"/>
 *     &lt;xs:enumeration value="No-show"/>
 *     &lt;xs:enumeration value="Cancelled"/>
 *     &lt;xs:enumeration value="In-house"/>
 *     &lt;xs:enumeration value="Checked out"/>
 *     &lt;xs:enumeration value="Waitlisted"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum PMSResStatusType {
    RESERVED("Reserved"), REQUESTED("Requested"), REQUESTDENIED(
            "Request denied"), NOSHOW("No-show"), CANCELLED("Cancelled"), INHOUSE(
            "In-house"), CHECKEDOUT("Checked out"), WAITLISTED("Waitlisted");
    private final String value;

    private PMSResStatusType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static PMSResStatusType convert(String value) {
        for (PMSResStatusType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
