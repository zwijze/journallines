
package org.opentravel.ota;

/** 
 * An enumerated type indicating special conditions with the rate  Valid values: ChangeDuringStay, 	MultipleNights, Exclusive, OnRequest, LimitedAvailability.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RateIndicatorType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="ChangeDuringStay"/>
 *     &lt;xs:enumeration value="MultipleNights"/>
 *     &lt;xs:enumeration value="Exclusive"/>
 *     &lt;xs:enumeration value="OnRequest"/>
 *     &lt;xs:enumeration value="LimitedAvailability"/>
 *     &lt;xs:enumeration value="AvailableForSale"/>
 *     &lt;xs:enumeration value="ClosedOut"/>
 *     &lt;xs:enumeration value="OtherAvailable"/>
 *     &lt;xs:enumeration value="UnableToProcess"/>
 *     &lt;xs:enumeration value="NoAvailability"/>
 *     &lt;xs:enumeration value="RoomTypeClosed"/>
 *     &lt;xs:enumeration value="RatePlanClosed"/>
 *     &lt;xs:enumeration value="LOS_Restricted"/>
 *     &lt;xs:enumeration value="Restricted"/>
 *     &lt;xs:enumeration value="DoesNotExist"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum RateIndicatorType {
    CHANGE_DURING_STAY("ChangeDuringStay"), MULTIPLE_NIGHTS("MultipleNights"), /** 
                                                                                * Availability is limited based on guest qualification criteria e.g. AAA member or Government Employee
                                                                                */
    EXCLUSIVE("Exclusive"), ON_REQUEST("OnRequest"), LIMITED_AVAILABILITY(
            "LimitedAvailability"), AVAILABLE_FOR_SALE("AvailableForSale"), CLOSED_OUT(
            "ClosedOut"), OTHER_AVAILABLE("OtherAvailable"), /** 
                                                              * Indicates an issue that precluded the ability to provide the information.
                                                              */
    UNABLE_TO_PROCESS("UnableToProcess"), NO_AVAILABILITY("NoAvailability"), ROOM_TYPE_CLOSED(
            "RoomTypeClosed"), RATE_PLAN_CLOSED("RatePlanClosed"), LOS_RESTRICTED(
            "LOS_Restricted"), /** 
                                * Availability is limited based on distribution channel qualification criteria (e.g., Expedia or Sabre).
                                */
    RESTRICTED("Restricted"), /** 
                               * The rate plan does not exist.
                               */
    DOES_NOT_EXIST("DoesNotExist");
    private final String value;

    private RateIndicatorType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static RateIndicatorType convert(String value) {
        for (RateIndicatorType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
