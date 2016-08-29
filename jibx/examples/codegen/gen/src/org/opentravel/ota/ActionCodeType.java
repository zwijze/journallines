
package org.opentravel.ota;

/** 
 * Identifies the action code for a booking - OK, Waitlist etc.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ActionCodeType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="OK"/>
 *     &lt;xs:enumeration value="Waitlist"/>
 *     &lt;xs:enumeration value="Other"/>
 *     &lt;xs:enumeration value="Cancel"/>
 *     &lt;xs:enumeration value="Need"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum ActionCodeType {
    /** 
     * Status is confirmed.
     */
    OK("OK"), /** 
               * Status is waitlisted.
               */
    WAITLIST("Waitlist"), /** 
                           * Status is other.
                           */
    OTHER("Other"), /** 
                     * Status is cancel.
                     */
    CANCEL("Cancel"), /** 
                       *  Status is need.
                       */
    NEED("Need");
    private final String value;

    private ActionCodeType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static ActionCodeType convert(String value) {
        for (ActionCodeType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
