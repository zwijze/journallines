
package org.opentravel.ota;

import java.math.BigInteger;

/** 
 * The absolute deadline or amount of offset time before a deadline for a payment of cancel goes into effect.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DeadlineGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="AbsoluteDeadline"/>
 *   &lt;xs:attribute type="ns:TimeUnitType" use="optional" name="OffsetTimeUnit"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="OffsetUnitMultiplier"/>
 *   &lt;xs:attribute use="optional" name="OffsetDropTime">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class OffsetDropTime -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class DeadlineGroup
{
    private String absoluteDeadline;
    private TimeUnitType offsetTimeUnit;
    private BigInteger offsetUnitMultiplier;
    private OffsetDropTime offsetDropTime;

    /** 
     * Get the 'AbsoluteDeadline' attribute value. Defines the absolute deadline.  Either this or the offset attributes may be used.
     * 
     * @return value
     */
    public String getAbsoluteDeadline() {
        return absoluteDeadline;
    }

    /** 
     * Set the 'AbsoluteDeadline' attribute value. Defines the absolute deadline.  Either this or the offset attributes may be used.
     * 
     * @param absoluteDeadline
     */
    public void setAbsoluteDeadline(String absoluteDeadline) {
        this.absoluteDeadline = absoluteDeadline;
    }

    /** 
     * Get the 'OffsetTimeUnit' attribute value. The units of time, e.g.: days, hours, etc., that apply to the deadline.
     * 
     * @return value
     */
    public TimeUnitType getOffsetTimeUnit() {
        return offsetTimeUnit;
    }

    /** 
     * Set the 'OffsetTimeUnit' attribute value. The units of time, e.g.: days, hours, etc., that apply to the deadline.
     * 
     * @param offsetTimeUnit
     */
    public void setOffsetTimeUnit(TimeUnitType offsetTimeUnit) {
        this.offsetTimeUnit = offsetTimeUnit;
    }

    /** 
     * Get the 'OffsetUnitMultiplier' attribute value. The number of units of DeadlineTimeUnit.
     * 
     * @return value
     */
    public BigInteger getOffsetUnitMultiplier() {
        return offsetUnitMultiplier;
    }

    /** 
     * Set the 'OffsetUnitMultiplier' attribute value. The number of units of DeadlineTimeUnit.
     * 
     * @param offsetUnitMultiplier
     */
    public void setOffsetUnitMultiplier(BigInteger offsetUnitMultiplier) {
        this.offsetUnitMultiplier = offsetUnitMultiplier;
    }

    /** 
     * Get the 'OffsetDropTime' attribute value. An enumerated type indicating when the deadline drop time goes into effect.
     * 
     * @return value
     */
    public OffsetDropTime getOffsetDropTime() {
        return offsetDropTime;
    }

    /** 
     * Set the 'OffsetDropTime' attribute value. An enumerated type indicating when the deadline drop time goes into effect.
     * 
     * @param offsetDropTime
     */
    public void setOffsetDropTime(OffsetDropTime offsetDropTime) {
        this.offsetDropTime = offsetDropTime;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="BeforeArrival"/>
     *     &lt;xs:enumeration value="AfterBooking"/>
     *     &lt;xs:enumeration value="AfterConfirmation"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum OffsetDropTime {
        BEFORE_ARRIVAL("BeforeArrival"), AFTER_BOOKING("AfterBooking"), /** 
                                                                         * The deadline information applies from when the reservation was confirmed.  In some systems the confirmation time will differ from the booking time.
                                                                         */
        AFTER_CONFIRMATION("AfterConfirmation");
        private final String value;

        private OffsetDropTime(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static OffsetDropTime convert(String value) {
            for (OffsetDropTime inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
