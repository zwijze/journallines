
package org.opentravel.ota;

/** 
 * The RatePeriodSimpleType simple type defines a set of valid values for the type of rate that may be applied.  Typically rates differ based upon the duration, and the actual rate is then expressed in terms of the period of the rental.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RatePeriodSimpleType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Hourly"/>
 *     &lt;xs:enumeration value="Daily"/>
 *     &lt;xs:enumeration value="Weekly"/>
 *     &lt;xs:enumeration value="Monthly"/>
 *     &lt;xs:enumeration value="WeekendDay"/>
 *     &lt;xs:enumeration value="Other"/>
 *     &lt;xs:enumeration value="Package"/>
 *     &lt;xs:enumeration value="Bundle"/>
 *     &lt;xs:enumeration value="Total"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum RatePeriodSimpleType {
    HOURLY("Hourly"), DAILY("Daily"), WEEKLY("Weekly"), MONTHLY("Monthly"), WEEKEND_DAY(
            "WeekendDay"), OTHER("Other"), /** 
                                            * The rate period is based on the package.
                                            */
    PACKAGE("Package"), /** 
                         * The rate is the same regardless of the number of days the vehicle is rented
                         */
    BUNDLE("Bundle"), /** 
                       * The rate is the total, no specific rate period.
                       */
    TOTAL("Total");
    private final String value;

    private RatePeriodSimpleType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static RatePeriodSimpleType convert(String value) {
        for (RatePeriodSimpleType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
