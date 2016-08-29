
package org.opentravel.ota;

/** 
 * Defines the 'Units' that can be applied to Stay restrictions.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StayUnitType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Minutes"/>
 *     &lt;xs:enumeration value="Hours"/>
 *     &lt;xs:enumeration value="Days"/>
 *     &lt;xs:enumeration value="Months"/>
 *     &lt;xs:enumeration value="MON"/>
 *     &lt;xs:enumeration value="TUES"/>
 *     &lt;xs:enumeration value="WED"/>
 *     &lt;xs:enumeration value="THU"/>
 *     &lt;xs:enumeration value="FRI"/>
 *     &lt;xs:enumeration value="SAT"/>
 *     &lt;xs:enumeration value="SUN"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum StayUnitType {
    /** 
     *  Stay restriction in minutes.
     */
    MINUTES("Minutes"), /** 
                         *  Stay restriction in hours.
                         */
    HOURS("Hours"), /** 
                     *  Stay restriction in days.
                     */
    DAYS("Days"), /** 
                   *  Stay restriction in months.
                   */
    MONTHS("Months"), /** 
                       * Monday
                       */
    MON("MON"), /** 
                 * Tuesday
                 */
    TUES("TUES"), /** 
                   * Wednesday
                   */
    WED("WED"), /** 
                 * Thursday
                 */
    THU("THU"), /** 
                 * Friday
                 */
    FRI("FRI"), /** 
                 * Saturday
                 */
    SAT("SAT"), /** 
                 * Sunday
                 */
    SUN("SUN");
    private final String value;

    private StayUnitType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static StayUnitType convert(String value) {
        for (StayUnitType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
