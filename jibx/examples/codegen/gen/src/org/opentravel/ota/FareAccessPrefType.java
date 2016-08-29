
package org.opentravel.ota;

/** 
 * Fare calculation type (e.g. PointToPoint, Through, Joint, Private)
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareAccessPrefType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="PointToPoint"/>
 *     &lt;xs:enumeration value="Through"/>
 *     &lt;xs:enumeration value="Joint"/>
 *     &lt;xs:enumeration value="Private"/>
 *     &lt;xs:enumeration value="Negotiated"/>
 *     &lt;xs:enumeration value="Net"/>
 *     &lt;xs:enumeration value="Historical"/>
 *     &lt;xs:enumeration value="SecurateAir"/>
 *     &lt;xs:enumeration value="Moneysaver"/>
 *     &lt;xs:enumeration value="MoneysaverRoundtrip"/>
 *     &lt;xs:enumeration value="MoneysaverNoOneWay"/>
 *     &lt;xs:enumeration value="MoneysaverOneWayOnly"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum FareAccessPrefType {
    POINT_TO_POINT("PointToPoint"), THROUGH("Through"), JOINT("Joint"), PRIVATE(
            "Private"), NEGOTIATED("Negotiated"), NET("Net"), /** 
                                                               * To request ATPCO historical fare/rule information.



                                                               */
    HISTORICAL("Historical"), /** 
                               * To request fares for a specified agreement.
                               */
    SECURATE_AIR("SecurateAir"), /** 
                                  * To request all airline fares for the specified city pair, lowest to highest.
                                  */
    MONEYSAVER("Moneysaver"), /** 
                               * All roundtrip airline fares for the specified city pair including one way fares.


                               */
    MONEYSAVER_ROUNDTRIP("MoneysaverRoundtrip"), /** 
                                                  * All airline fares for the specified city pair but no one way fares.
                                                  */
    MONEYSAVER_NO_ONE_WAY("MoneysaverNoOneWay"), /** 
                                                  * Only one-way fares for all airlines for the specified city pair.
                                                  */
    MONEYSAVER_ONE_WAY_ONLY("MoneysaverOneWayOnly");
    private final String value;

    private FareAccessPrefType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static FareAccessPrefType convert(String value) {
        for (FareAccessPrefType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
