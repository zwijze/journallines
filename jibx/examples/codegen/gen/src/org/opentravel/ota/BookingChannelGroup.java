
package org.opentravel.ota;

/** 
 * Specifies the booking channel types and whether it is the primary means of connectivity of the source.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BookingChannelGroup">
 *   &lt;xs:attribute type="xs:string" use="required" name="Type"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="Primary"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class BookingChannelGroup
{
    private String type;
    private Boolean primary;

    /** 
     * Get the 'Type' attribute value. The type of booking channel (e.g. Global Distribution System (GDS), Alternative Distribution System (ADS), Sales and Catering System (SCS), Property Management System (PMS), Central Reservation System (CRS), Tour Operator System (TOS), Internet and ALL). Refer to OTA Code List Booking Channel Type (BCT).
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' attribute value. The type of booking channel (e.g. Global Distribution System (GDS), Alternative Distribution System (ADS), Sales and Catering System (SCS), Property Management System (PMS), Central Reservation System (CRS), Tour Operator System (TOS), Internet and ALL). Refer to OTA Code List Booking Channel Type (BCT).
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'Primary' attribute value. Indicates whether the enumerated booking channel is the primary means of connectivity used by the source.
     * 
     * @return value
     */
    public Boolean getPrimary() {
        return primary;
    }

    /** 
     * Set the 'Primary' attribute value. Indicates whether the enumerated booking channel is the primary means of connectivity used by the source.
     * 
     * @param primary
     */
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }
}
