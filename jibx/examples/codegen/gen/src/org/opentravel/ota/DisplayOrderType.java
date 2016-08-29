
package org.opentravel.ota;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DisplayOrderType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="ByDepartureTime"/>
 *     &lt;xs:enumeration value="ByArrivalTime"/>
 *     &lt;xs:enumeration value="ByJourneyTime"/>
 *     &lt;xs:enumeration value="ByPriceHighToLow"/>
 *     &lt;xs:enumeration value="ByPriceLowToHigh"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum DisplayOrderType {
    /** 
     * Display products by departure time
     */
    BY_DEPARTURE_TIME("ByDepartureTime"), /** 
                                           * Display products by arrival time
                                           */
    BY_ARRIVAL_TIME("ByArrivalTime"), /** 
                                       * Display products by journey time
                                       */
    BY_JOURNEY_TIME("ByJourneyTime"), /** 
                                       * AWG ToDo
                                       */
    BY_PRICE_HIGH_TO_LOW("ByPriceHighToLow"), /** 
                                               * AWG ToDo
                                               */
    BY_PRICE_LOW_TO_HIGH("ByPriceLowToHigh");
    private final String value;

    private DisplayOrderType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static DisplayOrderType convert(String value) {
        for (DisplayOrderType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
