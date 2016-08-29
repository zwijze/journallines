
package org.opentravel.ota;

/** 
 * Attributes for seat request. Note: you can choose a specific seat or just a general preference
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatRequestAttributes">
 *   &lt;xs:attribute type="xs:string" use="optional" name="SeatNumber"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="SeatPreference"/>
 *   &lt;xs:attributeGroup ref="ns:SmokingIndicatorGroup"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SmokingIndicatorGroup">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="SmokingAllowed"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class SeatRequestAttributes
{
    private String seatNumber;
    private String seatPreference;
    private Boolean smokingAllowed;

    /** 
     * Get the 'SeatNumber' attribute value. Used to provide the seat number.
     * 
     * @return value
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /** 
     * Set the 'SeatNumber' attribute value. Used to provide the seat number.
     * 
     * @param seatNumber
     */
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    /** 
     * Get the 'SeatPreference' attribute value. Refer to OTA Code List Seat Preference (STP).

     * 
     * @return value
     */
    public String getSeatPreference() {
        return seatPreference;
    }

    /** 
     * Set the 'SeatPreference' attribute value. Refer to OTA Code List Seat Preference (STP).

     * 
     * @param seatPreference
     */
    public void setSeatPreference(String seatPreference) {
        this.seatPreference = seatPreference;
    }

    /** 
     * Get the 'SmokingAllowed' attribute value. Indicates smoking is allowed when true and is not allowed when false.
     * 
     * @return value
     */
    public Boolean getSmokingAllowed() {
        return smokingAllowed;
    }

    /** 
     * Set the 'SmokingAllowed' attribute value. Indicates smoking is allowed when true and is not allowed when false.
     * 
     * @param smokingAllowed
     */
    public void setSmokingAllowed(Boolean smokingAllowed) {
        this.smokingAllowed = smokingAllowed;
    }
}
