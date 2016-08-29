
package org.opentravel.ota;

/** 
 * Holds booking class and available seats quantity.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BookingClassAvailabilityGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="ResBookDesigCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ResBookDesigQuantity"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ResBookDesigStatusCode"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class BookingClassAvailabilityGroup
{
    private String resBookDesigCode;
    private String resBookDesigQuantity;
    private String resBookDesigStatusCode;

    /** 
     * Get the 'ResBookDesigCode' attribute value. Reservation Booking Designator (RBD) code (e.g. Y).
     * 
     * @return value
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /** 
     * Set the 'ResBookDesigCode' attribute value. Reservation Booking Designator (RBD) code (e.g. Y).
     * 
     * @param resBookDesigCode
     */
    public void setResBookDesigCode(String resBookDesigCode) {
        this.resBookDesigCode = resBookDesigCode;
    }

    /** 
     * Get the 'ResBookDesigQuantity' attribute value. Seat quantity available for this Reservation Booking Designator (RBD).
     * 
     * @return value
     */
    public String getResBookDesigQuantity() {
        return resBookDesigQuantity;
    }

    /** 
     * Set the 'ResBookDesigQuantity' attribute value. Seat quantity available for this Reservation Booking Designator (RBD).
     * 
     * @param resBookDesigQuantity
     */
    public void setResBookDesigQuantity(String resBookDesigQuantity) {
        this.resBookDesigQuantity = resBookDesigQuantity;
    }

    /** 
     * Get the 'ResBookDesigStatusCode' attribute value. Refer to OTA Code List Res Book Designator Status Code (RBD).  This provides the status (e.g. waitlist open, available, available by direct request to supplier only).
     * 
     * @return value
     */
    public String getResBookDesigStatusCode() {
        return resBookDesigStatusCode;
    }

    /** 
     * Set the 'ResBookDesigStatusCode' attribute value. Refer to OTA Code List Res Book Designator Status Code (RBD).  This provides the status (e.g. waitlist open, available, available by direct request to supplier only).
     * 
     * @param resBookDesigStatusCode
     */
    public void setResBookDesigStatusCode(String resBookDesigStatusCode) {
        this.resBookDesigStatusCode = resBookDesigStatusCode;
    }
}
