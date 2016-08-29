
package org.opentravel.ota;

/** 
 * The attributes of the  OTA DateTimeSpan data type are based on the W3C base data types of timeInstant and timeDuration. The lexical representation for timeDuration is the [ISO 8601] extended format PnYn MnDTnH nMnS, where nY represents the number of years, nM the number of months, nD the number of days, 'T' is the date/time separator, nH the number of hours, nM the number of minutes and nS the number of seconds. The number of seconds can include decimal digits to arbitrary precision. As an example, 7 months, 2 days, 2hours and 30 minutes would be expressed as P0Y7M2DT2H30M0S. Truncated representations are allowed provided they conform to ISO 8601 format. Time periods, i.e. specific durations of time, can be represented by supplying two items of information: a start instant and a duration or a start instant and an end instant or an end instant and a duration. The OTA standards use the XML mapping that provides for two elements to represent the specific period of time; a startInstant and a duration.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DateTimeSpanGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="Start"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Duration"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="End"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class DateTimeSpanGroup
{
    private String start;
    private String duration;
    private String end;

    /** 
     * Get the 'Start' attribute value. The starting value of the time span. 
     * 
     * @return value
     */
    public String getStart() {
        return start;
    }

    /** 
     * Set the 'Start' attribute value. The starting value of the time span. 
     * 
     * @param start
     */
    public void setStart(String start) {
        this.start = start;
    }

    /** 
     * Get the 'Duration' attribute value. The duration datatype represents a combination of year, month, day and time values representing a single duration of time, encoded as a single string. 
     * 
     * @return value
     */
    public String getDuration() {
        return duration;
    }

    /** 
     * Set the 'Duration' attribute value. The duration datatype represents a combination of year, month, day and time values representing a single duration of time, encoded as a single string. 
     * 
     * @param duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /** 
     * Get the 'End' attribute value. The ending value of the time span. 
     * 
     * @return value
     */
    public String getEnd() {
        return end;
    }

    /** 
     * Set the 'End' attribute value. The ending value of the time span. 
     * 
     * @param end
     */
    public void setEnd(String end) {
        this.end = end;
    }
}
