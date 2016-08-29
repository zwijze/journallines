
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * May contain rules associated with canceling a reservation as well as the supplier's cancellation number.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CancelInfoRSType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="CancelRules" minOccurs="0">
 *       &lt;!-- Reference to inner class CancelRules -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:UniqueID_Type" name="UniqueID" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CancelInfoRSType
{
    private CancelRules cancelRules;
    private UniqueIDType uniqueID;

    /** 
     * Get the 'CancelRules' element value.
     * 
     * @return value
     */
    public CancelRules getCancelRules() {
        return cancelRules;
    }

    /** 
     * Set the 'CancelRules' element value.
     * 
     * @param cancelRules
     */
    public void setCancelRules(CancelRules cancelRules) {
        this.cancelRules = cancelRules;
    }

    /** 
     * Get the 'UniqueID' element value. Contains the supplier's cancellation number.
     * 
     * @return value
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /** 
     * Set the 'UniqueID' element value. Contains the supplier's cancellation number.
     * 
     * @param uniqueID
     */
    public void setUniqueID(UniqueIDType uniqueID) {
        this.uniqueID = uniqueID;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CancelRules" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="ns:CancelRuleType" name="CancelRule" maxOccurs="unbounded"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class CancelRules
    {
        private List<CancelRuleType> cancelRuleList = new ArrayList<CancelRuleType>();

        /** 
         * Get the list of 'CancelRule' element items.
         * 
         * @return list
         */
        public List<CancelRuleType> getCancelRuleList() {
            return cancelRuleList;
        }

        /** 
         * Set the list of 'CancelRule' element items.
         * 
         * @param list
         */
        public void setCancelRuleList(List<CancelRuleType> list) {
            cancelRuleList = list;
        }
    }
}
