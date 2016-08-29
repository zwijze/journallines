
package org.opentravel.ota;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/** 
 * Information about the person traveling. Gender - the gender of the customer, if needed. BirthDate - Date of Birth. Currency - the preferred currency in which monetary amounts should be returned.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirTravelerType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="ProfileRef" minOccurs="0">
 *       &lt;xs:complexType>
 *         &lt;xs:sequence>
 *           &lt;xs:element type="ns:UniqueID_Type" name="UniqueID"/>
 *         &lt;/xs:sequence>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:PersonNameType" name="PersonName" minOccurs="0"/>
 *     &lt;xs:element name="Telephone" minOccurs="0" maxOccurs="20">
 *       &lt;!-- Reference to inner class Telephone -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="Email" minOccurs="0" maxOccurs="3">
 *       &lt;!-- Reference to inner class Email -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="Address" minOccurs="0" maxOccurs="5">
 *       &lt;!-- Reference to inner class Address -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="CustLoyalty" minOccurs="0" maxOccurs="5">
 *       &lt;!-- Reference to inner class CustLoyalty -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="Document" minOccurs="0" maxOccurs="10">
 *       &lt;!-- Reference to inner class Document -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:PassengerTypeQuantityType" name="PassengerTypeQuantity" minOccurs="0"/>
 *     &lt;xs:element name="TravelerRefNumber">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:TravelerRefNumberGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="FlightSegmentRPHs" minOccurs="0">
 *       &lt;!-- Reference to inner class FlightSegmentRPHs -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:GenderGroup"/>
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attribute type="xs:date" name="BirthDate"/>
 *   &lt;xs:attribute type="xs:string" name="CurrencyCode"/>
 *   &lt;xs:attribute type="xs:string" use="required" name="PassengerTypeCode"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="AccompaniedByInfant"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AirTravelerType
{
    private UniqueIDType profileRef;
    private PersonNameType personName;
    private List<Telephone> telephoneList = new ArrayList<Telephone>();
    private List<Email> emailList = new ArrayList<Email>();
    private List<Address> addressList = new ArrayList<Address>();
    private List<CustLoyalty> custLoyaltyList = new ArrayList<CustLoyalty>();
    private List<Document> documentList = new ArrayList<Document>();
    private PassengerTypeQuantityType passengerTypeQuantity;
    private TravelerRefNumberGroup travelerRefNumber;
    private FlightSegmentRPHs flightSegmentRPHs;
    private GenderGroup genderGroup;
    private PrivacyGroup privacyGroup;
    private Date birthDate;
    private String currencyCode;
    private String passengerTypeCode;
    private Boolean accompaniedByInfant;

    /** 
     * Get the 'UniqueID' element value.  An identifier used to uniquely reference a customer profile.
     * 
     * @return value
     */
    public UniqueIDType getProfileRef() {
        return profileRef;
    }

    /** 
     * Set the 'UniqueID' element value.  An identifier used to uniquely reference a customer profile.
     * 
     * @param profileRef
     */
    public void setProfileRef(UniqueIDType profileRef) {
        this.profileRef = profileRef;
    }

    /** 
     * Get the 'PersonName' element value.  Name information of the person traveling.
     * 
     * @return value
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value.  Name information of the person traveling.
     * 
     * @param personName
     */
    public void setPersonName(PersonNameType personName) {
        this.personName = personName;
    }

    /** 
     * Get the list of 'Telephone' element items.
     * 
     * @return list
     */
    public List<Telephone> getTelephoneList() {
        return telephoneList;
    }

    /** 
     * Set the list of 'Telephone' element items.
     * 
     * @param list
     */
    public void setTelephoneList(List<Telephone> list) {
        telephoneList = list;
    }

    /** 
     * Get the list of 'Email' element items.
     * 
     * @return list
     */
    public List<Email> getEmailList() {
        return emailList;
    }

    /** 
     * Set the list of 'Email' element items.
     * 
     * @param list
     */
    public void setEmailList(List<Email> list) {
        emailList = list;
    }

    /** 
     * Get the list of 'Address' element items.
     * 
     * @return list
     */
    public List<Address> getAddressList() {
        return addressList;
    }

    /** 
     * Set the list of 'Address' element items.
     * 
     * @param list
     */
    public void setAddressList(List<Address> list) {
        addressList = list;
    }

    /** 
     * Get the list of 'CustLoyalty' element items.
     * 
     * @return list
     */
    public List<CustLoyalty> getCustLoyaltyList() {
        return custLoyaltyList;
    }

    /** 
     * Set the list of 'CustLoyalty' element items.
     * 
     * @param list
     */
    public void setCustLoyaltyList(List<CustLoyalty> list) {
        custLoyaltyList = list;
    }

    /** 
     * Get the list of 'Document' element items.
     * 
     * @return list
     */
    public List<Document> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Document' element items.
     * 
     * @param list
     */
    public void setDocumentList(List<Document> list) {
        documentList = list;
    }

    /** 
     * Get the 'PassengerTypeQuantity' element value.  Specifies the number of travelers of a given passenger type (e.g., Adult, Child)
     * 
     * @return value
     */
    public PassengerTypeQuantityType getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    /** 
     * Set the 'PassengerTypeQuantity' element value.  Specifies the number of travelers of a given passenger type (e.g., Adult, Child)
     * 
     * @param passengerTypeQuantity
     */
    public void setPassengerTypeQuantity(
            PassengerTypeQuantityType passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }

    /** 
     * Get the 'TravelerRefNumberGroup' attributeGroup value. Direct reference of traveler assigned by requesting system.  Used as a cross reference between data segments.
     * 
     * @return value
     */
    public TravelerRefNumberGroup getTravelerRefNumber() {
        return travelerRefNumber;
    }

    /** 
     * Set the 'TravelerRefNumberGroup' attributeGroup value. Direct reference of traveler assigned by requesting system.  Used as a cross reference between data segments.
     * 
     * @param travelerRefNumber
     */
    public void setTravelerRefNumber(TravelerRefNumberGroup travelerRefNumber) {
        this.travelerRefNumber = travelerRefNumber;
    }

    /** 
     * Get the 'FlightSegmentRPHs' element value.
     * 
     * @return value
     */
    public FlightSegmentRPHs getFlightSegmentRPHs() {
        return flightSegmentRPHs;
    }

    /** 
     * Set the 'FlightSegmentRPHs' element value.
     * 
     * @param flightSegmentRPHs
     */
    public void setFlightSegmentRPHs(FlightSegmentRPHs flightSegmentRPHs) {
        this.flightSegmentRPHs = flightSegmentRPHs;
    }

    /** 
     * Get the 'GenderGroup' attributeGroup value.
     * 
     * @return value
     */
    public GenderGroup getGenderGroup() {
        return genderGroup;
    }

    /** 
     * Set the 'GenderGroup' attributeGroup value.
     * 
     * @param genderGroup
     */
    public void setGenderGroup(GenderGroup genderGroup) {
        this.genderGroup = genderGroup;
    }

    /** 
     * Get the 'PrivacyGroup' attributeGroup value.
     * 
     * @return value
     */
    public PrivacyGroup getPrivacyGroup() {
        return privacyGroup;
    }

    /** 
     * Set the 'PrivacyGroup' attributeGroup value.
     * 
     * @param privacyGroup
     */
    public void setPrivacyGroup(PrivacyGroup privacyGroup) {
        this.privacyGroup = privacyGroup;
    }

    /** 
     * Get the 'BirthDate' attribute value.  Traveler's date of birth.
     * 
     * @return value
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /** 
     * Set the 'BirthDate' attribute value.  Traveler's date of birth.
     * 
     * @param birthDate
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /** 
     * Get the 'CurrencyCode' attribute value.  Specifies the code for the currency units.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' attribute value.  Specifies the code for the currency units.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'PassengerTypeCode' attribute value. Code used to indicate the type of traveler that will be traveling (e.g., ADT, CHD, INF, GRP).
     * 
     * @return value
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /** 
     * Set the 'PassengerTypeCode' attribute value. Code used to indicate the type of traveler that will be traveling (e.g., ADT, CHD, INF, GRP).
     * 
     * @param passengerTypeCode
     */
    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    /** 
     * Get the 'AccompaniedByInfant' attribute value. Indicates if an infant accompanying a traveler is with or without a seat.
     * 
     * @return value
     */
    public Boolean getAccompaniedByInfant() {
        return accompaniedByInfant;
    }

    /** 
     * Set the 'AccompaniedByInfant' attribute value. Indicates if an infant accompanying a traveler is with or without a seat.
     * 
     * @param accompaniedByInfant
     */
    public void setAccompaniedByInfant(Boolean accompaniedByInfant) {
        this.accompaniedByInfant = accompaniedByInfant;
    }
    /** 
     * Telephone number for the person traveling.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Telephone" minOccurs="0" maxOccurs="20">
     *   &lt;xs:complexType>
     *     &lt;xs:attributeGroup ref="ns:TelephoneInfoGroup"/>
     *     &lt;xs:attribute type="ns:ActionType" use="optional" name="Operation"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="LocationCode"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Telephone
    {
        private TelephoneInfoGroup telephoneInfoGroup;
        private ActionType operation;
        private String locationCode;

        /** 
         * Get the 'TelephoneInfoGroup' attributeGroup value.
         * 
         * @return value
         */
        public TelephoneInfoGroup getTelephoneInfoGroup() {
            return telephoneInfoGroup;
        }

        /** 
         * Set the 'TelephoneInfoGroup' attributeGroup value.
         * 
         * @param telephoneInfoGroup
         */
        public void setTelephoneInfoGroup(TelephoneInfoGroup telephoneInfoGroup) {
            this.telephoneInfoGroup = telephoneInfoGroup;
        }

        /** 
         * Get the 'Operation' attribute value. Indicates the required modification to the element.
         * 
         * @return value
         */
        public ActionType getOperation() {
            return operation;
        }

        /** 
         * Set the 'Operation' attribute value. Indicates the required modification to the element.
         * 
         * @param operation
         */
        public void setOperation(ActionType operation) {
            this.operation = operation;
        }

        /** 
         * Get the 'LocationCode' attribute value. A 3 character ATA/IATA city code of telephone location.
         * 
         * @return value
         */
        public String getLocationCode() {
            return locationCode;
        }

        /** 
         * Set the 'LocationCode' attribute value. A 3 character ATA/IATA city code of telephone location.
         * 
         * @param locationCode
         */
        public void setLocationCode(String locationCode) {
            this.locationCode = locationCode;
        }
    }
    /** 
     *  Email address of the person traveling.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Email" minOccurs="0" maxOccurs="3">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="ns:EmailType">
     *         &lt;xs:attribute type="ns:ActionType" use="optional" name="Operation"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Email
    {
        private EmailType emailType;
        private ActionType operation;

        /** 
         * Get the extension value.
         * 
         * @return value
         */
        public EmailType getEmailType() {
            return emailType;
        }

        /** 
         * Set the extension value.
         * 
         * @param emailType
         */
        public void setEmailType(EmailType emailType) {
            this.emailType = emailType;
        }

        /** 
         * Get the 'Operation' attribute value. Indicates the required modification to the element.
         * 
         * @return value
         */
        public ActionType getOperation() {
            return operation;
        }

        /** 
         * Set the 'Operation' attribute value. Indicates the required modification to the element.
         * 
         * @param operation
         */
        public void setOperation(ActionType operation) {
            this.operation = operation;
        }
    }
    /** 
     *  Address information of the person traveling. 
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Address" minOccurs="0" maxOccurs="5">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:AddressType">
     *         &lt;xs:attribute type="ns:ActionType" use="optional" name="Operation"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Address extends AddressType
    {
        private ActionType operation;

        /** 
         * Get the 'Operation' attribute value. Indicates the required modification to the element.
         * 
         * @return value
         */
        public ActionType getOperation() {
            return operation;
        }

        /** 
         * Set the 'Operation' attribute value. Indicates the required modification to the element.
         * 
         * @param operation
         */
        public void setOperation(ActionType operation) {
            this.operation = operation;
        }
    }
    /** 
     *  Identifies the loyalty program(s) that the customer belongs to and associated information.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CustLoyalty" minOccurs="0" maxOccurs="5">
     *   &lt;xs:complexType>
     *     &lt;xs:attributeGroup ref="ns:CustomerLoyaltyGroup"/>
     *     &lt;xs:attribute type="ns:ActionType" use="optional" name="Operation"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class CustLoyalty
    {
        private CustomerLoyaltyGroup customerLoyaltyGroup;
        private ActionType operation;

        /** 
         * Get the 'CustomerLoyaltyGroup' attributeGroup value.
         * 
         * @return value
         */
        public CustomerLoyaltyGroup getCustomerLoyaltyGroup() {
            return customerLoyaltyGroup;
        }

        /** 
         * Set the 'CustomerLoyaltyGroup' attributeGroup value.
         * 
         * @param customerLoyaltyGroup
         */
        public void setCustomerLoyaltyGroup(
                CustomerLoyaltyGroup customerLoyaltyGroup) {
            this.customerLoyaltyGroup = customerLoyaltyGroup;
        }

        /** 
         * Get the 'Operation' attribute value. Indicates the required modification to the element.
         * 
         * @return value
         */
        public ActionType getOperation() {
            return operation;
        }

        /** 
         * Set the 'Operation' attribute value. Indicates the required modification to the element.
         * 
         * @param operation
         */
        public void setOperation(ActionType operation) {
            this.operation = operation;
        }
    }
    /** 
     *  Official travel document information associated with the person traveling.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Document" minOccurs="0" maxOccurs="10">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:DocumentType">
     *         &lt;xs:attribute type="ns:ActionType" use="optional" name="Operation"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Document extends DocumentType
    {
        private ActionType operation;

        /** 
         * Get the 'Operation' attribute value. Indicates the required modification to the element.
         * 
         * @return value
         */
        public ActionType getOperation() {
            return operation;
        }

        /** 
         * Set the 'Operation' attribute value. Indicates the required modification to the element.
         * 
         * @param operation
         */
        public void setOperation(ActionType operation) {
            this.operation = operation;
        }
    }
    /** 
     * Reference pointers to flight segments
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FlightSegmentRPHs" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:string" name="FlightSegmentRPH" maxOccurs="99"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class FlightSegmentRPHs
    {
        private List<String> flightSegmentRPHList = new ArrayList<String>();

        /** 
         * Get the list of 'FlightSegmentRPH' element items. Reference to the flight segments for this traveler
         * 
         * @return list
         */
        public List<String> getFlightSegmentRPHList() {
            return flightSegmentRPHList;
        }

        /** 
         * Set the list of 'FlightSegmentRPH' element items. Reference to the flight segments for this traveler
         * 
         * @param list
         */
        public void setFlightSegmentRPHList(List<String> list) {
            flightSegmentRPHList = list;
        }
    }
}
