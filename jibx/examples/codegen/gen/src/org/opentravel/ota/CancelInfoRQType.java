
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Identifies the common, or core, information associated with the request for cancellation of a reservation or other type of record.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CancelInfoRQType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:UniqueID_Type" name="UniqueID" maxOccurs="2"/>
 *     &lt;xs:element type="ns:PersonNameType" name="PersonName" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="ns:TransactionActionType" use="required" name="CancelType"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CancelInfoRQType
{
    private List<UniqueIDType> uniqueIDList = new ArrayList<UniqueIDType>();
    private PersonNameType personName;
    private TransactionActionType cancelType;

    /** 
     * Get the list of 'UniqueID' element items. Sending own UniqueID and partner UniqueID - the receiving system needs to know which one - UniqueID acts as a reference for each system
     * 
     * @return list
     */
    public List<UniqueIDType> getUniqueIDList() {
        return uniqueIDList;
    }

    /** 
     * Set the list of 'UniqueID' element items. Sending own UniqueID and partner UniqueID - the receiving system needs to know which one - UniqueID acts as a reference for each system
     * 
     * @param list
     */
    public void setUniqueIDList(List<UniqueIDType> list) {
        uniqueIDList = list;
    }

    /** 
     * Get the 'PersonName' element value. The person's name in a reservation.
     * 
     * @return value
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. The person's name in a reservation.
     * 
     * @param personName
     */
    public void setPersonName(PersonNameType personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'CancelType' attribute value. Used to specify if this is to initiate a cancellation or to commit the cancellation.
     * 
     * @return value
     */
    public TransactionActionType getCancelType() {
        return cancelType;
    }

    /** 
     * Set the 'CancelType' attribute value. Used to specify if this is to initiate a cancellation or to commit the cancellation.
     * 
     * @param cancelType
     */
    public void setCancelType(TransactionActionType cancelType) {
        this.cancelType = cancelType;
    }
}
