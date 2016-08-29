
package org.opentravel.ota;

/** 
 * Used to define a period of time using either actual dates or a day and month.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DatePeriodGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="StartPeriod"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Duration"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="EndPeriod"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class DatePeriodGroup
{
    private String startPeriod;
    private String duration;
    private String endPeriod;

    /** 
     * Get the 'StartPeriod' attribute value. Defines the start of a period either the day and month or the actual date.
     * 
     * @return value
     */
    public String getStartPeriod() {
        return startPeriod;
    }

    /** 
     * Set the 'StartPeriod' attribute value. Defines the start of a period either the day and month or the actual date.
     * 
     * @param startPeriod
     */
    public void setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
    }

    /** 
     * Get the 'Duration' attribute value. Defines the duration of a period.
     * 
     * @return value
     */
    public String getDuration() {
        return duration;
    }

    /** 
     * Set the 'Duration' attribute value. Defines the duration of a period.
     * 
     * @param duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /** 
     * Get the 'EndPeriod' attribute value. Defines the end of a period either the day and month or the actual date.
     * 
     * @return value
     */
    public String getEndPeriod() {
        return endPeriod;
    }

    /** 
     * Set the 'EndPeriod' attribute value. Defines the end of a period either the day and month or the actual date.
     * 
     * @param endPeriod
     */
    public void setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
    }
}
