
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Collection of operation schedules.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OperationSchedulesType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:OperationScheduleType" name="OperationSchedule" maxOccurs="999"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:DateTimeSpanGroup"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OperationSchedulesType
{
    private List<OperationScheduleType> operationScheduleList = new ArrayList<OperationScheduleType>();
    private DateTimeSpanGroup dateTimeSpanGroup;

    /** 
     * Get the list of 'OperationSchedule' element items. The OperationSchedule class defines the dates and hours of operation. 
     * 
     * @return list
     */
    public List<OperationScheduleType> getOperationScheduleList() {
        return operationScheduleList;
    }

    /** 
     * Set the list of 'OperationSchedule' element items. The OperationSchedule class defines the dates and hours of operation. 
     * 
     * @param list
     */
    public void setOperationScheduleList(List<OperationScheduleType> list) {
        operationScheduleList = list;
    }

    /** 
     * Get the 'DateTimeSpanGroup' attributeGroup value. The date range for which the operation schedule information is valid.
     * 
     * @return value
     */
    public DateTimeSpanGroup getDateTimeSpanGroup() {
        return dateTimeSpanGroup;
    }

    /** 
     * Set the 'DateTimeSpanGroup' attributeGroup value. The date range for which the operation schedule information is valid.
     * 
     * @param dateTimeSpanGroup
     */
    public void setDateTimeSpanGroup(DateTimeSpanGroup dateTimeSpanGroup) {
        this.dateTimeSpanGroup = dateTimeSpanGroup;
    }
}
