
package org.opentravel.ota;

/** 
 *  Identifies the type of special remark used.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRemarkOptionType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Itinerary"/>
 *     &lt;xs:enumeration value="Invoice"/>
 *     &lt;xs:enumeration value="Endorsement"/>
 *     &lt;xs:enumeration value="Save"/>
 *     &lt;xs:enumeration value="Confidential"/>
 *     &lt;xs:enumeration value="Free"/>
 *     &lt;xs:enumeration value="GRMS"/>
 *     &lt;xs:enumeration value="Split"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum SpecialRemarkOptionType {
    /** 
     *  Remarks apply to the itinerary.
     */
    ITINERARY("Itinerary"), /** 
                             *  Remarks apply to the invoice.
                             */
    INVOICE("Invoice"), /** 
                         *  Remarks apply to the endorsement.
                         */
    ENDORSEMENT("Endorsement"), /** 
                                 * Remarks which can be deleted by the author only.
                                 */
    SAVE("Save"), /** 
                   * Confidential remarks which are visible only to the author and system providers.
                   */
    CONFIDENTIAL("Confidential"), /** 
                                   * Free text remarks which can be sent to specific airlines.
                                   */
    FREE("Free"), /** 
                   * Remarks from or to a specific group revenue management system (GRMS).
                   */
    GRMS("GRMS"), /** 
                   * Remarks containing information about split transaction (Split off PNR address, time, who, etc.).
                   */
    SPLIT("Split");
    private final String value;

    private SpecialRemarkOptionType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static SpecialRemarkOptionType convert(String value) {
        for (SpecialRemarkOptionType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
