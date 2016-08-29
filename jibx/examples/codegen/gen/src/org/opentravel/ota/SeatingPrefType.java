
package org.opentravel.ota;

/** 
 * Seating preferences to be used with this collection of preferences.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatingPrefType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="SeatDirection"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="SeatLocation"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="SeatPosition"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="SeatRow"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class SeatingPrefType
{
    private String string;
    private PreferLevelType preferLevel;
    private String seatDirection;
    private String seatLocation;
    private String seatPosition;
    private String seatRow;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public String getString() {
        return string;
    }

    /** 
     * Set the extension value.
     * 
     * @param string
     */
    public void setString(String string) {
        this.string = string;
    }

    /** 
     * Get the 'PreferLevel' attribute value. Used to indicate a level of preference for an associated item.
     * 
     * @return value
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /** 
     * Set the 'PreferLevel' attribute value. Used to indicate a level of preference for an associated item.
     * 
     * @param preferLevel
     */
    public void setPreferLevel(PreferLevelType preferLevel) {
        this.preferLevel = preferLevel;
    }

    /** 
     * Get the 'SeatDirection' attribute value. Direction seat faces during travel, when conveyance allows.
     * 
     * @return value
     */
    public String getSeatDirection() {
        return seatDirection;
    }

    /** 
     * Set the 'SeatDirection' attribute value. Direction seat faces during travel, when conveyance allows.
     * 
     * @param seatDirection
     */
    public void setSeatDirection(String seatDirection) {
        this.seatDirection = seatDirection;
    }

    /** 
     * Get the 'SeatLocation' attribute value. Location of seat in cabin of conveyance.  Suggested values include: Forward, Middle, Aft, ExitRow, Bulkhead, Right or Left Side, etc.
     * 
     * @return value
     */
    public String getSeatLocation() {
        return seatLocation;
    }

    /** 
     * Set the 'SeatLocation' attribute value. Location of seat in cabin of conveyance.  Suggested values include: Forward, Middle, Aft, ExitRow, Bulkhead, Right or Left Side, etc.
     * 
     * @param seatLocation
     */
    public void setSeatLocation(String seatLocation) {
        this.seatLocation = seatLocation;
    }

    /** 
     * Get the 'SeatPosition' attribute value. Preferred position of seat in a row, such as Aisle, Middle, Center, Window, etc.
     * 
     * @return value
     */
    public String getSeatPosition() {
        return seatPosition;
    }

    /** 
     * Set the 'SeatPosition' attribute value. Preferred position of seat in a row, such as Aisle, Middle, Center, Window, etc.
     * 
     * @param seatPosition
     */
    public void setSeatPosition(String seatPosition) {
        this.seatPosition = seatPosition;
    }

    /** 
     * Get the 'SeatRow' attribute value. Preferred row for seating, indicates specific row number and/or seat identifier.
     * 
     * @return value
     */
    public String getSeatRow() {
        return seatRow;
    }

    /** 
     * Set the 'SeatRow' attribute value. Preferred row for seating, indicates specific row number and/or seat identifier.
     * 
     * @param seatRow
     */
    public void setSeatRow(String seatRow) {
        this.seatRow = seatRow;
    }
}
