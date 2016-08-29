
package org.opentravel.ota;

/** 
 * Date and time of trip, that allows specifying a time window before and after the given date.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelDateTimeType">
 *   &lt;xs:choice>
 *     &lt;xs:element type="ns:TimeInstantType" name="DepartureDateTime"/>
 *     &lt;xs:element type="ns:TimeInstantType" name="ArrivalDateTime"/>
 *   &lt;/xs:choice>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelDateTimeType
{
    private int choiceSelect = -1;
    private static final int DEPARTURE_DATE_TIME_CHOICE = 0;
    private static final int ARRIVAL_DATE_TIME_CHOICE = 1;
    private TimeInstantType departureDateTime;
    private TimeInstantType arrivalDateTime;

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if DepartureDateTime is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDepartureDateTime() {
        return choiceSelect == DEPARTURE_DATE_TIME_CHOICE;
    }

    /** 
     * Get the 'DepartureDateTime' element value.
     * 
     * @return value
     */
    public TimeInstantType getDepartureDateTime() {
        return departureDateTime;
    }

    /** 
     * Set the 'DepartureDateTime' element value.
     * 
     * @param departureDateTime
     */
    public void setDepartureDateTime(TimeInstantType departureDateTime) {
        setChoiceSelect(DEPARTURE_DATE_TIME_CHOICE);
        this.departureDateTime = departureDateTime;
    }

    /** 
     * Check if ArrivalDateTime is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifArrivalDateTime() {
        return choiceSelect == ARRIVAL_DATE_TIME_CHOICE;
    }

    /** 
     * Get the 'ArrivalDateTime' element value.
     * 
     * @return value
     */
    public TimeInstantType getArrivalDateTime() {
        return arrivalDateTime;
    }

    /** 
     * Set the 'ArrivalDateTime' element value.
     * 
     * @param arrivalDateTime
     */
    public void setArrivalDateTime(TimeInstantType arrivalDateTime) {
        setChoiceSelect(ARRIVAL_DATE_TIME_CHOICE);
        this.arrivalDateTime = arrivalDateTime;
    }
}
