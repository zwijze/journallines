
package org.opentravel.ota;

/** 
 * This defines a set of valid status values, allowing the selection of a specific group based on availability, or allowing the reservation status to be made known.  Examples of such values include Available, OnRequest, Confirmed, etc. 
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InventoryStatusType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Available"/>
 *     &lt;xs:enumeration value="Unavailable"/>
 *     &lt;xs:enumeration value="OnRequest"/>
 *     &lt;xs:enumeration value="Confirmed"/>
 *     &lt;xs:enumeration value="All"/>
 *     &lt;xs:enumeration value="Waitlist"/>
 *     &lt;xs:enumeration value="SupplierBooked"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum InventoryStatusType {
    AVAILABLE("Available"), UNAVAILABLE("Unavailable"), ON_REQUEST("OnRequest"), CONFIRMED(
            "Confirmed"), ALL("All"), WAITLIST("Waitlist"), /** 
                                                             * The booking has already been made directly through the supplier.
                                                             */
    SUPPLIER_BOOKED("SupplierBooked");
    private final String value;

    private InventoryStatusType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static InventoryStatusType convert(String value) {
        for (InventoryStatusType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
