
package org.opentravel.ota;

/** 
 * A three letter abbreviation for the days of the week (e.g. may be the starting date for the availability requested, days of operation, rate effective day, etc.).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DayOfWeekType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Mon"/>
 *     &lt;xs:enumeration value="Tue"/>
 *     &lt;xs:enumeration value="Wed"/>
 *     &lt;xs:enumeration value="Thu"/>
 *     &lt;xs:enumeration value="Fri"/>
 *     &lt;xs:enumeration value="Sat"/>
 *     &lt;xs:enumeration value="Sun"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum DayOfWeekType {
    MON("Mon"), TUE("Tue"), WED("Wed"), THU("Thu"), FRI("Fri"), SAT("Sat"), SUN(
            "Sun");
    private final String value;

    private DayOfWeekType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static DayOfWeekType convert(String value) {
        for (DayOfWeekType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
