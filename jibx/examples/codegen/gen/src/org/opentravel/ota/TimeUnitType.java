
package org.opentravel.ota;

/** 
 * An enumerated type defining the unit in which the time is expressed.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TimeUnitType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Year"/>
 *     &lt;xs:enumeration value="Month"/>
 *     &lt;xs:enumeration value="Week"/>
 *     &lt;xs:enumeration value="Day"/>
 *     &lt;xs:enumeration value="Hour"/>
 *     &lt;xs:enumeration value="Second"/>
 *     &lt;xs:enumeration value="FullDuration"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum TimeUnitType {
    YEAR("Year"), MONTH("Month"), WEEK("Week"), DAY("Day"), HOUR("Hour"), SECOND(
            "Second"), FULL_DURATION("FullDuration");
    private final String value;

    private TimeUnitType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static TimeUnitType convert(String value) {
        for (TimeUnitType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
