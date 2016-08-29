
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * The OperationSchedule class defines the dates and hours of operation in addition the charges that may apply.

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OperationSchedulesPlusChargeType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="OperationSchedule" minOccurs="0" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class OperationSchedule -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OperationSchedulesPlusChargeType
{
    private List<OperationSchedule> operationScheduleList = new ArrayList<OperationSchedule>();

    /** 
     * Get the list of 'OperationSchedule' element items.
     * 
     * @return list
     */
    public List<OperationSchedule> getOperationScheduleList() {
        return operationScheduleList;
    }

    /** 
     * Set the list of 'OperationSchedule' element items.
     * 
     * @param list
     */
    public void setOperationScheduleList(List<OperationSchedule> list) {
        operationScheduleList = list;
    }
    /** 
     * The OperationSchedule class defines details the dates and hours of operation. 
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OperationSchedule" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:OperationSchedulePlusChargeType">
     *         &lt;xs:attribute type="xs:string" use="optional" name="Name"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class OperationSchedule
            extends
                OperationSchedulePlusChargeType
    {
        private String name;

        /** 
         * Get the 'Name' attribute value. Used to provide a name for a sub-operation (e.g. an activity or event).
         * 
         * @return value
         */
        public String getName() {
            return name;
        }

        /** 
         * Set the 'Name' attribute value. Used to provide a name for a sub-operation (e.g. an activity or event).
         * 
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }
    }
}
