
package org.opentravel.ota;

/** 
 * Specifies the type of ticket document.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="eTicket"/>
 *     &lt;xs:enumeration value="Paper"/>
 *     &lt;xs:enumeration value="MCO"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum TicketType {
    /** 
     * An electronic ticket
     */
    E_TICKET("eTicket"), /** 
                          * A paper ticket
                          */
    PAPER("Paper"), /** 
                     * A miscellaneous charge order
                     */
    MCO("MCO");
    private final String value;

    private TicketType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static TicketType convert(String value) {
        for (TicketType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
