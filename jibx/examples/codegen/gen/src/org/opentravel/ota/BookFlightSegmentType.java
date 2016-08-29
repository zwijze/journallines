
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Container for the flight segment data plus the MarriageGrp. Construct for holding the booked flight segment information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BookFlightSegmentType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:FlightSegmentType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="MarriageGrp" minOccurs="0"/>
 *         &lt;xs:element name="BookingClassAvails" minOccurs="0">
 *           &lt;!-- Reference to inner class BookingClassAvails -->
 *         &lt;/xs:element>
 *         &lt;xs:element type="ns:FreeTextType" name="Comment" minOccurs="0" maxOccurs="9"/>
 *         &lt;xs:element name="StopLocation" minOccurs="0" maxOccurs="9">
 *           &lt;xs:complexType>
 *             &lt;xs:attributeGroup ref="ns:LocationGroup"/>
 *           &lt;/xs:complexType>
 *         &lt;/xs:element>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="optional" name="ResBookDesigCode"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="NumberInParty"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="Status"/>
 *       &lt;xs:attribute use="optional" name="E_TicketEligibility">
 *         &lt;xs:simpleType>
 *           &lt;!-- Reference to inner class ETicketEligibility -->
 *         &lt;/xs:simpleType>
 *       &lt;/xs:attribute>
 *       &lt;xs:attribute type="xs:string" use="optional" name="MealCode"/>
 *       &lt;xs:attribute type="ns:DayOfWeekType" use="optional" name="DepartureDay"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BookFlightSegmentType extends FlightSegmentType
{
    private String marriageGrp;
    private BookingClassAvails bookingClassAvails;
    private List<FreeTextType> commentList = new ArrayList<FreeTextType>();
    private List<LocationGroup> stopLocationList = new ArrayList<LocationGroup>();
    private String resBookDesigCode;
    private String numberInParty;
    private String status;
    private ETicketEligibility ETicketEligibility1;
    private String mealCode;
    private DayOfWeekType departureDay;

    /** 
     * Get the 'MarriageGrp' element value. Many airlines link connection flights together by terming them married segments.  When two or more segments are married, they must be processed as one unit. The segments must be moved, cancelled, and/or priced together. The value of the marriage group must be the same for all segments.
     * 
     * @return value
     */
    public String getMarriageGrp() {
        return marriageGrp;
    }

    /** 
     * Set the 'MarriageGrp' element value. Many airlines link connection flights together by terming them married segments.  When two or more segments are married, they must be processed as one unit. The segments must be moved, cancelled, and/or priced together. The value of the marriage group must be the same for all segments.
     * 
     * @param marriageGrp
     */
    public void setMarriageGrp(String marriageGrp) {
        this.marriageGrp = marriageGrp;
    }

    /** 
     * Get the 'BookingClassAvails' element value.
     * 
     * @return value
     */
    public BookingClassAvails getBookingClassAvails() {
        return bookingClassAvails;
    }

    /** 
     * Set the 'BookingClassAvails' element value.
     * 
     * @param bookingClassAvails
     */
    public void setBookingClassAvails(BookingClassAvails bookingClassAvails) {
        this.bookingClassAvails = bookingClassAvails;
    }

    /** 
     * Get the list of 'Comment' element items. Free text information that the marketing carrier may send about this flight.
     * 
     * @return list
     */
    public List<FreeTextType> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comment' element items. Free text information that the marketing carrier may send about this flight.
     * 
     * @param list
     */
    public void setCommentList(List<FreeTextType> list) {
        commentList = list;
    }

    /** 
     * Get the list of 'StopLocation' element items. A location where the flight is scheduled to stop en route to its destination for this flight segment.
     * 
     * @return list
     */
    public List<LocationGroup> getStopLocationList() {
        return stopLocationList;
    }

    /** 
     * Set the list of 'StopLocation' element items. A location where the flight is scheduled to stop en route to its destination for this flight segment.
     * 
     * @param list
     */
    public void setStopLocationList(List<LocationGroup> list) {
        stopLocationList = list;
    }

    /** 
     * Get the 'ResBookDesigCode' attribute value. Specific Booking Class for this segment.	
     * 
     * @return value
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /** 
     * Set the 'ResBookDesigCode' attribute value. Specific Booking Class for this segment.	
     * 
     * @param resBookDesigCode
     */
    public void setResBookDesigCode(String resBookDesigCode) {
        this.resBookDesigCode = resBookDesigCode;
    }

    /** 
     * Get the 'NumberInParty' attribute value.  Number of travelers associated with this segment.
     * 
     * @return value
     */
    public String getNumberInParty() {
        return numberInParty;
    }

    /** 
     * Set the 'NumberInParty' attribute value.  Number of travelers associated with this segment.
     * 
     * @param numberInParty
     */
    public void setNumberInParty(String numberInParty) {
        this.numberInParty = numberInParty;
    }

    /** 
     * Get the 'Status' attribute value. Code providing status information for this segment. Refer to OTA Code List 'Status' (STS).
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' attribute value. Code providing status information for this segment. Refer to OTA Code List 'Status' (STS).
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'E_TicketEligibility' attribute value. Specifies whether a flight segment is eligible for electronic ticketing.
     * 
     * @return value
     */
    public ETicketEligibility getETicketEligibility1() {
        return ETicketEligibility1;
    }

    /** 
     * Set the 'E_TicketEligibility' attribute value. Specifies whether a flight segment is eligible for electronic ticketing.
     * 
     * @param ETicketEligibility1
     */
    public void setETicketEligibility1(ETicketEligibility ETicketEligibility1) {
        this.ETicketEligibility1 = ETicketEligibility1;
    }

    /** 
     * Get the 'MealCode' attribute value. The applicable meal service code for this flight.
     * 
     * @return value
     */
    public String getMealCode() {
        return mealCode;
    }

    /** 
     * Set the 'MealCode' attribute value. The applicable meal service code for this flight.
     * 
     * @param mealCode
     */
    public void setMealCode(String mealCode) {
        this.mealCode = mealCode;
    }

    /** 
     * Get the 'DepartureDay' attribute value.
     * 
     * @return value
     */
    public DayOfWeekType getDepartureDay() {
        return departureDay;
    }

    /** 
     * Set the 'DepartureDay' attribute value.
     * 
     * @param departureDay
     */
    public void setDepartureDay(DayOfWeekType departureDay) {
        this.departureDay = departureDay;
    }
    /** 
     * A collection of availability counts per booking class.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BookingClassAvails" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="BookingClassAvail" maxOccurs="26">
     *         &lt;!-- Reference to inner class BookingClassAvail -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class BookingClassAvails
    {
        private List<BookingClassAvail> bookingClassAvailList = new ArrayList<BookingClassAvail>();

        /** 
         * Get the list of 'BookingClassAvail' element items.
         * 
         * @return list
         */
        public List<BookingClassAvail> getBookingClassAvailList() {
            return bookingClassAvailList;
        }

        /** 
         * Set the list of 'BookingClassAvail' element items.
         * 
         * @param list
         */
        public void setBookingClassAvailList(List<BookingClassAvail> list) {
            bookingClassAvailList = list;
        }
        /** 
         * Booking codes available to be sold for a particular flight segment.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BookingClassAvail" maxOccurs="26">
         *   &lt;xs:complexType>
         *     &lt;xs:attributeGroup ref="ns:BookingClassAvailabilityGroup"/>
         *     &lt;xs:attribute type="xs:string" use="required" name="RPH"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class BookingClassAvail
        {
            private BookingClassAvailabilityGroup bookingClassAvailabilityGroup;
            private String RPH;

            /** 
             * Get the 'BookingClassAvailabilityGroup' attributeGroup value.
             * 
             * @return value
             */
            public BookingClassAvailabilityGroup getBookingClassAvailabilityGroup() {
                return bookingClassAvailabilityGroup;
            }

            /** 
             * Set the 'BookingClassAvailabilityGroup' attributeGroup value.
             * 
             * @param bookingClassAvailabilityGroup
             */
            public void setBookingClassAvailabilityGroup(
                    BookingClassAvailabilityGroup bookingClassAvailabilityGroup) {
                this.bookingClassAvailabilityGroup = bookingClassAvailabilityGroup;
            }

            /** 
             * Get the 'RPH' attribute value. RPH refers back to Marketing Cabin Type."
             * 
             * @return value
             */
            public String getRPH() {
                return RPH;
            }

            /** 
             * Set the 'RPH' attribute value. RPH refers back to Marketing Cabin Type."
             * 
             * @param RPH
             */
            public void setRPH(String RPH) {
                this.RPH = RPH;
            }
        }
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="Eligible"/>
     *     &lt;xs:enumeration value="Not Eligible"/>
     *     &lt;xs:enumeration value="Required"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum ETicketEligibility {
        /** 
         * Analogous to the IATA PADIS code: electronic ticket candidate.
         */
        ELIGIBLE("Eligible"), /** 
                               * Analogous to the IATA PADIS code: not an electronic ticket candidate.
                               */
        NOT_ELIGIBLE("Not Eligible"), /** 
                                       * Analogous to the IATA PADIS code: electronic ticketing required.
                                       */
        REQUIRED("Required");
        private final String value;

        private ETicketEligibility(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static ETicketEligibility convert(String value) {
            for (ETicketEligibility inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
