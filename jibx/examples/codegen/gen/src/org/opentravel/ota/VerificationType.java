
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 
 * Collection of data used to ensure the correct reservation is canceled or modified (e.g. in the case of a hotel reservation modification, a CustLoyalty/ MembershipID would be verified as part of the reservation that you plan to modify to ensure the correct reservation is being modified).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VerificationType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="PersonName" minOccurs="0">
 *       &lt;!-- Reference to inner class PersonName -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:EmailType" name="Email" minOccurs="0"/>
 *     &lt;xs:element name="TelephoneInfo" minOccurs="0">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:TelephoneInfoGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:PaymentCardType" name="PaymentCard" minOccurs="0"/>
 *     &lt;xs:element type="ns:AddressInfoType" name="AddressInfo" minOccurs="0"/>
 *     &lt;xs:element name="CustLoyalty" minOccurs="0" maxOccurs="5">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:CustomerLoyaltyGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:CompanyNameType" name="Vendor" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element name="ReservationTimeSpan" minOccurs="0">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:DateTimeSpanGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="AssociatedQuantity" minOccurs="0" maxOccurs="5">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:CodeListGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="StartLocation" minOccurs="0">
 *       &lt;!-- Reference to inner class StartLocation -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="EndLocation" minOccurs="0">
 *       &lt;!-- Reference to inner class EndLocation -->
 *     &lt;/xs:element>
 *     &lt;xs:element ref="ns:TPA_Extensions" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class VerificationType
{
    private PersonName personName;
    private EmailType email;
    private TelephoneInfoGroup telephoneInfo;
    private PaymentCardType paymentCard;
    private AddressInfoType addressInfo;
    private List<CustomerLoyaltyGroup> custLoyaltyList = new ArrayList<CustomerLoyaltyGroup>();
    private List<CompanyNameType> vendorList = new ArrayList<CompanyNameType>();
    private DateTimeSpanGroup reservationTimeSpan;
    private List<CodeListGroup> associatedQuantityList = new ArrayList<CodeListGroup>();
    private StartLocation startLocation;
    private EndLocation endLocation;
    private TPAExtensionsType TPAExtensions;

    /** 
     * Get the 'PersonName' element value.
     * 
     * @return value
     */
    public PersonName getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value.
     * 
     * @param personName
     */
    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'Email' element value.
     * 
     * @return value
     */
    public EmailType getEmail() {
        return email;
    }

    /** 
     * Set the 'Email' element value.
     * 
     * @param email
     */
    public void setEmail(EmailType email) {
        this.email = email;
    }

    /** 
     * Get the 'TelephoneInfoGroup' attributeGroup value.
     * 
     * @return value
     */
    public TelephoneInfoGroup getTelephoneInfo() {
        return telephoneInfo;
    }

    /** 
     * Set the 'TelephoneInfoGroup' attributeGroup value.
     * 
     * @param telephoneInfo
     */
    public void setTelephoneInfo(TelephoneInfoGroup telephoneInfo) {
        this.telephoneInfo = telephoneInfo;
    }

    /** 
     * Get the 'PaymentCard' element value.
     * 
     * @return value
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /** 
     * Set the 'PaymentCard' element value.
     * 
     * @param paymentCard
     */
    public void setPaymentCard(PaymentCardType paymentCard) {
        this.paymentCard = paymentCard;
    }

    /** 
     * Get the 'AddressInfo' element value.
     * 
     * @return value
     */
    public AddressInfoType getAddressInfo() {
        return addressInfo;
    }

    /** 
     * Set the 'AddressInfo' element value.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(AddressInfoType addressInfo) {
        this.addressInfo = addressInfo;
    }

    /** 
     * Get the list of 'CustLoyalty' element items.
     * 
     * @return list
     */
    public List<CustomerLoyaltyGroup> getCustLoyaltyList() {
        return custLoyaltyList;
    }

    /** 
     * Set the list of 'CustLoyalty' element items.
     * 
     * @param list
     */
    public void setCustLoyaltyList(List<CustomerLoyaltyGroup> list) {
        custLoyaltyList = list;
    }

    /** 
     * Get the list of 'Vendor' element items. Vendor or Vendors associated with the Reservation
     * 
     * @return list
     */
    public List<CompanyNameType> getVendorList() {
        return vendorList;
    }

    /** 
     * Set the list of 'Vendor' element items. Vendor or Vendors associated with the Reservation
     * 
     * @param list
     */
    public void setVendorList(List<CompanyNameType> list) {
        vendorList = list;
    }

    /** 
     * Get the 'DateTimeSpanGroup' attributeGroup value. The start and end day of the reservation.
     * 
     * @return value
     */
    public DateTimeSpanGroup getReservationTimeSpan() {
        return reservationTimeSpan;
    }

    /** 
     * Set the 'DateTimeSpanGroup' attributeGroup value. The start and end day of the reservation.
     * 
     * @param reservationTimeSpan
     */
    public void setReservationTimeSpan(DateTimeSpanGroup reservationTimeSpan) {
        this.reservationTimeSpan = reservationTimeSpan;
    }

    /** 
     * Get the list of 'AssociatedQuantity' element items. Quantity or Quantities that are associated with the reservation (e.g. number of seats, number of rooms, number of people, etc.).
     * 
     * @return list
     */
    public List<CodeListGroup> getAssociatedQuantityList() {
        return associatedQuantityList;
    }

    /** 
     * Set the list of 'AssociatedQuantity' element items. Quantity or Quantities that are associated with the reservation (e.g. number of seats, number of rooms, number of people, etc.).
     * 
     * @param list
     */
    public void setAssociatedQuantityList(List<CodeListGroup> list) {
        associatedQuantityList = list;
    }

    /** 
     * Get the 'StartLocation' element value.
     * 
     * @return value
     */
    public StartLocation getStartLocation() {
        return startLocation;
    }

    /** 
     * Set the 'StartLocation' element value.
     * 
     * @param startLocation
     */
    public void setStartLocation(StartLocation startLocation) {
        this.startLocation = startLocation;
    }

    /** 
     * Get the 'EndLocation' element value.
     * 
     * @return value
     */
    public EndLocation getEndLocation() {
        return endLocation;
    }

    /** 
     * Set the 'EndLocation' element value.
     * 
     * @param endLocation
     */
    public void setEndLocation(EndLocation endLocation) {
        this.endLocation = endLocation;
    }

    /** 
     * Get the 'TPA_Extensions' element value.
     * 
     * @return value
     */
    public TPAExtensionsType getTPAExtensions() {
        return TPAExtensions;
    }

    /** 
     * Set the 'TPA_Extensions' element value.
     * 
     * @param TPAExtensions
     */
    public void setTPAExtensions(TPAExtensionsType TPAExtensions) {
        this.TPAExtensions = TPAExtensions;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PersonName" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:PersonNameType">
     *         &lt;xs:attribute type="xs:boolean" use="optional" name="PartialName"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class PersonName extends PersonNameType
    {
        private Boolean partialName;

        /** 
         * Get the 'PartialName' attribute value.
         * 
         * @return value
         */
        public Boolean getPartialName() {
            return partialName;
        }

        /** 
         * Set the 'PartialName' attribute value.
         * 
         * @param partialName
         */
        public void setPartialName(Boolean partialName) {
            this.partialName = partialName;
        }
    }
    /** 
     * Location or Locations associated with the reservation.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StartLocation" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="ns:LocationType">
     *         &lt;xs:attribute type="xs:dateTime" use="optional" name="AssociatedDateTime"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class StartLocation
    {
        private LocationType locationType;
        private Date associatedDateTime;

        /** 
         * Get the extension value.
         * 
         * @return value
         */
        public LocationType getLocationType() {
            return locationType;
        }

        /** 
         * Set the extension value.
         * 
         * @param locationType
         */
        public void setLocationType(LocationType locationType) {
            this.locationType = locationType;
        }

        /** 
         * Get the 'AssociatedDateTime' attribute value.
         * 
         * @return value
         */
        public Date getAssociatedDateTime() {
            return associatedDateTime;
        }

        /** 
         * Set the 'AssociatedDateTime' attribute value.
         * 
         * @param associatedDateTime
         */
        public void setAssociatedDateTime(Date associatedDateTime) {
            this.associatedDateTime = associatedDateTime;
        }
    }
    /** 
     * Location or Locations associated with the reservation.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EndLocation" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="ns:LocationType">
     *         &lt;xs:attribute type="xs:dateTime" use="optional" name="AssociatedDateTime"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class EndLocation
    {
        private LocationType locationType;
        private Date associatedDateTime;

        /** 
         * Get the extension value.
         * 
         * @return value
         */
        public LocationType getLocationType() {
            return locationType;
        }

        /** 
         * Set the extension value.
         * 
         * @param locationType
         */
        public void setLocationType(LocationType locationType) {
            this.locationType = locationType;
        }

        /** 
         * Get the 'AssociatedDateTime' attribute value.
         * 
         * @return value
         */
        public Date getAssociatedDateTime() {
            return associatedDateTime;
        }

        /** 
         * Set the 'AssociatedDateTime' attribute value.
         * 
         * @param associatedDateTime
         */
        public void setAssociatedDateTime(Date associatedDateTime) {
            this.associatedDateTime = associatedDateTime;
        }
    }
}
