
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 *  Contains all booking response information pertaining to a completed reservation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirReservationType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:AirItineraryType" name="AirItinerary" minOccurs="0"/>
 *     &lt;xs:element type="ns:BookingPriceInfoType" name="PriceInfo" minOccurs="0"/>
 *     &lt;xs:element type="ns:TravelerInfoType" name="TravelerInfo" minOccurs="0"/>
 *     &lt;xs:element name="Fulfillment" minOccurs="0">
 *       &lt;!-- Reference to inner class Fulfillment -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:TicketingInfoType" name="Ticketing" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element name="Queues" minOccurs="0">
 *       &lt;!-- Reference to inner class Queues -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:UniqueID_Type" name="BookingReferenceID" minOccurs="0" maxOccurs="9"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="optional" name="LastModified"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AirReservationType
{
    private AirItineraryType airItinerary;
    private BookingPriceInfoType priceInfo;
    private TravelerInfoType travelerInfo;
    private Fulfillment fulfillment;
    private List<TicketingInfoType> ticketingList = new ArrayList<TicketingInfoType>();
    private Queues queues;
    private List<UniqueIDType> bookingReferenceIDList = new ArrayList<UniqueIDType>();
    private String lastModified;

    /** 
     * Get the 'AirItinerary' element value. A collection of all flight segments requested for booking.
     * 
     * @return value
     */
    public AirItineraryType getAirItinerary() {
        return airItinerary;
    }

    /** 
     * Set the 'AirItinerary' element value. A collection of all flight segments requested for booking.
     * 
     * @param airItinerary
     */
    public void setAirItinerary(AirItineraryType airItinerary) {
        this.airItinerary = airItinerary;
    }

    /** 
     * Get the 'PriceInfo' element value. Pricing information for the air itinerary to be booked e.g. this data could come from the OTA_AirPriceRS data.
     * 
     * @return value
     */
    public BookingPriceInfoType getPriceInfo() {
        return priceInfo;
    }

    /** 
     * Set the 'PriceInfo' element value. Pricing information for the air itinerary to be booked e.g. this data could come from the OTA_AirPriceRS data.
     * 
     * @param priceInfo
     */
    public void setPriceInfo(BookingPriceInfoType priceInfo) {
        this.priceInfo = priceInfo;
    }

    /** 
     * Get the 'TravelerInfo' element value. All traveler information relevant to a booking request.
     * 
     * @return value
     */
    public TravelerInfoType getTravelerInfo() {
        return travelerInfo;
    }

    /** 
     * Set the 'TravelerInfo' element value. All traveler information relevant to a booking request.
     * 
     * @param travelerInfo
     */
    public void setTravelerInfo(TravelerInfoType travelerInfo) {
        this.travelerInfo = travelerInfo;
    }

    /** 
     * Get the 'Fulfillment' element value.
     * 
     * @return value
     */
    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    /** 
     * Set the 'Fulfillment' element value.
     * 
     * @param fulfillment
     */
    public void setFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    /** 
     * Get the list of 'Ticketing' element items. Information used to specify the ticketing arrangement.
     * 
     * @return list
     */
    public List<TicketingInfoType> getTicketingList() {
        return ticketingList;
    }

    /** 
     * Set the list of 'Ticketing' element items. Information used to specify the ticketing arrangement.
     * 
     * @param list
     */
    public void setTicketingList(List<TicketingInfoType> list) {
        ticketingList = list;
    }

    /** 
     * Get the 'Queues' element value.
     * 
     * @return value
     */
    public Queues getQueues() {
        return queues;
    }

    /** 
     * Set the 'Queues' element value.
     * 
     * @param queues
     */
    public void setQueues(Queues queues) {
        this.queues = queues;
    }

    /** 
     * Get the list of 'BookingReferenceID' element items. Optional field available for use by trading partners as determined by their needs.
     * 
     * @return list
     */
    public List<UniqueIDType> getBookingReferenceIDList() {
        return bookingReferenceIDList;
    }

    /** 
     * Set the list of 'BookingReferenceID' element items. Optional field available for use by trading partners as determined by their needs.
     * 
     * @param list
     */
    public void setBookingReferenceIDList(List<UniqueIDType> list) {
        bookingReferenceIDList = list;
    }

    /** 
     * Get the 'LastModified' attribute value.
     * 
     * @return value
     */
    public String getLastModified() {
        return lastModified;
    }

    /** 
     * Set the 'LastModified' attribute value.
     * 
     * @param lastModified
     */
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }
    /** 
     * All payment information relevant to a booking request.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Fulfillment" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="PaymentDetails" minOccurs="0">
     *         &lt;!-- Reference to inner class PaymentDetails -->
     *       &lt;/xs:element>
     *       &lt;xs:element type="ns:AddressType" name="DeliveryAddress" minOccurs="0"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Fulfillment
    {
        private PaymentDetails paymentDetails;
        private AddressType deliveryAddress;

        /** 
         * Get the 'PaymentDetails' element value.
         * 
         * @return value
         */
        public PaymentDetails getPaymentDetails() {
            return paymentDetails;
        }

        /** 
         * Set the 'PaymentDetails' element value.
         * 
         * @param paymentDetails
         */
        public void setPaymentDetails(PaymentDetails paymentDetails) {
            this.paymentDetails = paymentDetails;
        }

        /** 
         * Get the 'DeliveryAddress' element value.  The postal address where the ticketing fulfillment (i.e., ticket, receipt) will be sent.
         * 
         * @return value
         */
        public AddressType getDeliveryAddress() {
            return deliveryAddress;
        }

        /** 
         * Set the 'DeliveryAddress' element value.  The postal address where the ticketing fulfillment (i.e., ticket, receipt) will be sent.
         * 
         * @param deliveryAddress
         */
        public void setDeliveryAddress(AddressType deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
        }
        /** 
         * Container for payment detail
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PaymentDetails" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:sequence>
         *       &lt;xs:element type="ns:PaymentDetailType" name="PaymentDetail" maxOccurs="99"/>
         *     &lt;/xs:sequence>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class PaymentDetails
        {
            private List<PaymentDetailType> paymentDetailList = new ArrayList<PaymentDetailType>();

            /** 
             * Get the list of 'PaymentDetail' element items.  The form of payment that was specified in the booking request message.
             * 
             * @return list
             */
            public List<PaymentDetailType> getPaymentDetailList() {
                return paymentDetailList;
            }

            /** 
             * Set the list of 'PaymentDetail' element items.  The form of payment that was specified in the booking request message.
             * 
             * @param list
             */
            public void setPaymentDetailList(List<PaymentDetailType> list) {
                paymentDetailList = list;
            }
        }
    }
    /** 
     * A container for queue information.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Queues" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="Queue" maxOccurs="10">
     *         &lt;!-- Reference to inner class Queue -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Queues
    {
        private List<Queue> queueList = new ArrayList<Queue>();

        /** 
         * Get the list of 'Queue' element items.
         * 
         * @return list
         */
        public List<Queue> getQueueList() {
            return queueList;
        }

        /** 
         * Set the list of 'Queue' element items.
         * 
         * @param list
         */
        public void setQueueList(List<Queue> list) {
            queueList = list;
        }
        /** 
         * Specifies queue information for this booking.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Queue" maxOccurs="10">
         *   &lt;xs:complexType>
         *     &lt;xs:attributeGroup ref="ns:QueueGroup"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="DateTime"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="Text"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="CarrierCode"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class Queue
        {
            private QueueGroup queueGroup;
            private String dateTime;
            private String text;
            private String carrierCode;

            /** 
             * Get the 'QueueGroup' attributeGroup value.
             * 
             * @return value
             */
            public QueueGroup getQueueGroup() {
                return queueGroup;
            }

            /** 
             * Set the 'QueueGroup' attributeGroup value.
             * 
             * @param queueGroup
             */
            public void setQueueGroup(QueueGroup queueGroup) {
                this.queueGroup = queueGroup;
            }

            /** 
             * Get the 'DateTime' attribute value. Date/time when the time initiated queuing should take place.
             * 
             * @return value
             */
            public String getDateTime() {
                return dateTime;
            }

            /** 
             * Set the 'DateTime' attribute value. Date/time when the time initiated queuing should take place.
             * 
             * @param dateTime
             */
            public void setDateTime(String dateTime) {
                this.dateTime = dateTime;
            }

            /** 
             * Get the 'Text' attribute value. Text describing why the queuing takes place.

             * 
             * @return value
             */
            public String getText() {
                return text;
            }

            /** 
             * Set the 'Text' attribute value. Text describing why the queuing takes place.

             * 
             * @param text
             */
            public void setText(String text) {
                this.text = text;
            }

            /** 
             * Get the 'CarrierCode' attribute value. Identifies airline/system on which the reservation is being queued.
             * 
             * @return value
             */
            public String getCarrierCode() {
                return carrierCode;
            }

            /** 
             * Set the 'CarrierCode' attribute value. Identifies airline/system on which the reservation is being queued.
             * 
             * @param carrierCode
             */
            public void setCarrierCode(String carrierCode) {
                this.carrierCode = carrierCode;
            }
        }
    }
}
