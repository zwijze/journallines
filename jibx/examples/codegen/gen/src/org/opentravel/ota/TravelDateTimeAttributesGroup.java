
package org.opentravel.ota;

import java.util.Date;

/** 
 * Provides times related to a travel segment.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelDateTimeAttributesGroup">
 *   &lt;xs:attribute type="ns:DayOfWeekType" use="optional" name="DayofWeek"/>
 *   &lt;xs:attribute type="xs:dateTime" use="optional" name="CheckInTime"/>
 *   &lt;xs:attribute type="xs:dateTime" use="optional" name="DepartureDateTime"/>
 *   &lt;xs:attribute type="xs:dateTime" use="optional" name="ArrivalDateTime"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class TravelDateTimeAttributesGroup
{
    private DayOfWeekType dayofWeek;
    private Date checkInTime;
    private Date departureDateTime;
    private Date arrivalDateTime;

    /** 
     * Get the 'DayofWeek' attribute value. The day of week of travel segment.
     * 
     * @return value
     */
    public DayOfWeekType getDayofWeek() {
        return dayofWeek;
    }

    /** 
     * Set the 'DayofWeek' attribute value. The day of week of travel segment.
     * 
     * @param dayofWeek
     */
    public void setDayofWeek(DayOfWeekType dayofWeek) {
        this.dayofWeek = dayofWeek;
    }

    /** 
     * Get the 'CheckInTime' attribute value. The check in time and date of travel segment.
     * 
     * @return value
     */
    public Date getCheckInTime() {
        return checkInTime;
    }

    /** 
     * Set the 'CheckInTime' attribute value. The check in time and date of travel segment.
     * 
     * @param checkInTime
     */
    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    /** 
     * Get the 'DepartureDateTime' attribute value. The departure time and date of the travel segment
     * 
     * @return value
     */
    public Date getDepartureDateTime() {
        return departureDateTime;
    }

    /** 
     * Set the 'DepartureDateTime' attribute value. The departure time and date of the travel segment
     * 
     * @param departureDateTime
     */
    public void setDepartureDateTime(Date departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    /** 
     * Get the 'ArrivalDateTime' attribute value. The arrival time and date of the travel segment.
     * 
     * @return value
     */
    public Date getArrivalDateTime() {
        return arrivalDateTime;
    }

    /** 
     * Set the 'ArrivalDateTime' attribute value. The arrival time and date of the travel segment.
     * 
     * @param arrivalDateTime
     */
    public void setArrivalDateTime(Date arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }
}
