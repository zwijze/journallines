
package org.opentravel.ota;

/** 
 * Total time span covered by this availability request (from the earliest arrival to the latest departure)
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TimeWindowGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="EarliestDate"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="LatestDate"/>
 *   &lt;xs:attribute type="ns:DayOfWeekType" use="optional" name="DOW"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class TimeWindowGroup
{
    private String earliestDate;
    private String latestDate;
    private DayOfWeekType DOW;

    /** 
     * Get the 'EarliestDate' attribute value. The earliest ending date/time for the availability requested, expressed in dateTime format as prescribed by ISO 8601.
     * 
     * @return value
     */
    public String getEarliestDate() {
        return earliestDate;
    }

    /** 
     * Set the 'EarliestDate' attribute value. The earliest ending date/time for the availability requested, expressed in dateTime format as prescribed by ISO 8601.
     * 
     * @param earliestDate
     */
    public void setEarliestDate(String earliestDate) {
        this.earliestDate = earliestDate;
    }

    /** 
     * Get the 'LatestDate' attribute value. The latest ending date/time for the availability requested, expressed in dateTime format as prescribed by ISO 8601.
     * 
     * @return value
     */
    public String getLatestDate() {
        return latestDate;
    }

    /** 
     * Set the 'LatestDate' attribute value. The latest ending date/time for the availability requested, expressed in dateTime format as prescribed by ISO 8601.
     * 
     * @param latestDate
     */
    public void setLatestDate(String latestDate) {
        this.latestDate = latestDate;
    }

    /** 
     * Get the 'DOW' attribute value. The Day of Week of the starting date for the availability requested. Enumerated values of StartDOW are the seven days of the week: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday.
     * 
     * @return value
     */
    public DayOfWeekType getDOW() {
        return DOW;
    }

    /** 
     * Set the 'DOW' attribute value. The Day of Week of the starting date for the availability requested. Enumerated values of StartDOW are the seven days of the week: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday.
     * 
     * @param DOW
     */
    public void setDOW(DayOfWeekType DOW) {
        this.DOW = DOW;
    }
}
