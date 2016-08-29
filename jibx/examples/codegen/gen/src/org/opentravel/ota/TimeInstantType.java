
package org.opentravel.ota;

/** 
 * Specifies a time window.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TimeInstantType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attribute type="xs:string" use="optional" name="WindowBefore"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="WindowAfter"/>
 *       &lt;xs:attribute type="xs:boolean" use="optional" name="CrossDateAllowedIndicator"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TimeInstantType
{
    private String string;
    private String windowBefore;
    private String windowAfter;
    private Boolean crossDateAllowedIndicator;

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
     * Get the 'WindowBefore' attribute value.
     * 
     * @return value
     */
    public String getWindowBefore() {
        return windowBefore;
    }

    /** 
     * Set the 'WindowBefore' attribute value.
     * 
     * @param windowBefore
     */
    public void setWindowBefore(String windowBefore) {
        this.windowBefore = windowBefore;
    }

    /** 
     * Get the 'WindowAfter' attribute value.
     * 
     * @return value
     */
    public String getWindowAfter() {
        return windowAfter;
    }

    /** 
     * Set the 'WindowAfter' attribute value.
     * 
     * @param windowAfter
     */
    public void setWindowAfter(String windowAfter) {
        this.windowAfter = windowAfter;
    }

    /** 
     * Get the 'CrossDateAllowedIndicator' attribute value. When true the requested period may extend over the previous or following day. When false, the search period is restricted to the date specified. Normally used when the window duration is in hours.
     * 
     * @return value
     */
    public Boolean getCrossDateAllowedIndicator() {
        return crossDateAllowedIndicator;
    }

    /** 
     * Set the 'CrossDateAllowedIndicator' attribute value. When true the requested period may extend over the previous or following day. When false, the search period is restricted to the date specified. Normally used when the window duration is in hours.
     * 
     * @param crossDateAllowedIndicator
     */
    public void setCrossDateAllowedIndicator(Boolean crossDateAllowedIndicator) {
        this.crossDateAllowedIndicator = crossDateAllowedIndicator;
    }
}
