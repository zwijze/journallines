
package org.opentravel.ota;

/** 
 * If a day(s) of the week is set to true then the associated item is available on that day of the week  (e.g. if Mon="T" then a flight operates on Mondays or a certain rate is available on Mondays).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DOW_PatternGroup">
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="Mon"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="Tue"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="Weds"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="Thur"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="Fri"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="Sat"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="Sun"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class DOWPatternGroup
{
    private Boolean mon;
    private Boolean tue;
    private Boolean weds;
    private Boolean thur;
    private Boolean fri;
    private Boolean sat;
    private Boolean sun;

    /** 
     * Get the 'Mon' attribute value. When true, apply to Monday.
     * 
     * @return value
     */
    public Boolean getMon() {
        return mon;
    }

    /** 
     * Set the 'Mon' attribute value. When true, apply to Monday.
     * 
     * @param mon
     */
    public void setMon(Boolean mon) {
        this.mon = mon;
    }

    /** 
     * Get the 'Tue' attribute value. When true, apply to Tuesday.
     * 
     * @return value
     */
    public Boolean getTue() {
        return tue;
    }

    /** 
     * Set the 'Tue' attribute value. When true, apply to Tuesday.
     * 
     * @param tue
     */
    public void setTue(Boolean tue) {
        this.tue = tue;
    }

    /** 
     * Get the 'Weds' attribute value. When true, apply to Wednesday.
     * 
     * @return value
     */
    public Boolean getWeds() {
        return weds;
    }

    /** 
     * Set the 'Weds' attribute value. When true, apply to Wednesday.
     * 
     * @param weds
     */
    public void setWeds(Boolean weds) {
        this.weds = weds;
    }

    /** 
     * Get the 'Thur' attribute value. When true, apply to Thursday.
     * 
     * @return value
     */
    public Boolean getThur() {
        return thur;
    }

    /** 
     * Set the 'Thur' attribute value. When true, apply to Thursday.
     * 
     * @param thur
     */
    public void setThur(Boolean thur) {
        this.thur = thur;
    }

    /** 
     * Get the 'Fri' attribute value. When true, apply to Friday.
     * 
     * @return value
     */
    public Boolean getFri() {
        return fri;
    }

    /** 
     * Set the 'Fri' attribute value. When true, apply to Friday.
     * 
     * @param fri
     */
    public void setFri(Boolean fri) {
        this.fri = fri;
    }

    /** 
     * Get the 'Sat' attribute value. When true, apply to Saturday.
     * 
     * @return value
     */
    public Boolean getSat() {
        return sat;
    }

    /** 
     * Set the 'Sat' attribute value. When true, apply to Saturday.
     * 
     * @param sat
     */
    public void setSat(Boolean sat) {
        this.sat = sat;
    }

    /** 
     * Get the 'Sun' attribute value. When true, apply to Sunday.
     * 
     * @return value
     */
    public Boolean getSun() {
        return sun;
    }

    /** 
     * Set the 'Sun' attribute value. When true, apply to Sunday.
     * 
     * @param sun
     */
    public void setSun(Boolean sun) {
        this.sun = sun;
    }
}
