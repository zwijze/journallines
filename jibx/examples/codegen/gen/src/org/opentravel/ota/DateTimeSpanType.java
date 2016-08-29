
package org.opentravel.ota;

/** 
 * Used to specify a time window range by either specifying an earliest and latest date for the start date and end date or by giving a date with a time period that can be applied before and/or after the start date.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DateTimeSpanType">
 *   &lt;xs:choice>
 *     &lt;xs:element type="ns:TimeInstantType" name="DateWindowRange"/>
 *     &lt;xs:sequence>
 *       &lt;!-- Reference to inner class Sequence -->
 *     &lt;/xs:sequence>
 *   &lt;/xs:choice>
 *   &lt;xs:attributeGroup ref="ns:DateTimeSpanGroup"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DateTimeSpanType
{
    private int choiceSelect = -1;
    private static final int DATE_WINDOW_RANGE_CHOICE = 0;
    private static final int SEQUENCE_CHOICE = 1;
    private TimeInstantType dateWindowRange;
    private Sequence sequence;
    private DateTimeSpanGroup dateTimeSpanGroup;

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
     * Check if DateWindowRange is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDateWindowRange() {
        return choiceSelect == DATE_WINDOW_RANGE_CHOICE;
    }

    /** 
     * Get the 'DateWindowRange' element value.
     * 
     * @return value
     */
    public TimeInstantType getDateWindowRange() {
        return dateWindowRange;
    }

    /** 
     * Set the 'DateWindowRange' element value.
     * 
     * @param dateWindowRange
     */
    public void setDateWindowRange(TimeInstantType dateWindowRange) {
        setChoiceSelect(DATE_WINDOW_RANGE_CHOICE);
        this.dateWindowRange = dateWindowRange;
    }

    /** 
     * Check if Sequence is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifSequence() {
        return choiceSelect == SEQUENCE_CHOICE;
    }

    /** 
     * Get the sequence value.
     * 
     * @return value
     */
    public Sequence getSequence() {
        return sequence;
    }

    /** 
     * Set the sequence value.
     * 
     * @param sequence
     */
    public void setSequence(Sequence sequence) {
        setChoiceSelect(SEQUENCE_CHOICE);
        this.sequence = sequence;
    }

    /** 
     * Get the 'DateTimeSpanGroup' attributeGroup value.
     * 
     * @return value
     */
    public DateTimeSpanGroup getDateTimeSpanGroup() {
        return dateTimeSpanGroup;
    }

    /** 
     * Set the 'DateTimeSpanGroup' attributeGroup value.
     * 
     * @param dateTimeSpanGroup
     */
    public void setDateTimeSpanGroup(DateTimeSpanGroup dateTimeSpanGroup) {
        this.dateTimeSpanGroup = dateTimeSpanGroup;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:sequence xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:element name="StartDateWindow" minOccurs="0">
     *     &lt;xs:complexType>
     *       &lt;xs:attributeGroup ref="ns:TimeWindowGroup"/>
     *     &lt;/xs:complexType>
     *   &lt;/xs:element>
     *   &lt;xs:element name="EndDateWindow" minOccurs="0">
     *     &lt;xs:complexType>
     *       &lt;xs:attributeGroup ref="ns:TimeWindowGroup"/>
     *     &lt;/xs:complexType>
     *   &lt;/xs:element>
     * &lt;/xs:sequence>
     * </pre>
     */
    public static class Sequence
    {
        private TimeWindowGroup startDateWindow;
        private TimeWindowGroup endDateWindow;

        /** 
         * Get the 'TimeWindowGroup' attributeGroup value.
         * 
         * @return value
         */
        public TimeWindowGroup getStartDateWindow() {
            return startDateWindow;
        }

        /** 
         * Set the 'TimeWindowGroup' attributeGroup value.
         * 
         * @param startDateWindow
         */
        public void setStartDateWindow(TimeWindowGroup startDateWindow) {
            this.startDateWindow = startDateWindow;
        }

        /** 
         * Get the 'TimeWindowGroup' attributeGroup value.
         * 
         * @return value
         */
        public TimeWindowGroup getEndDateWindow() {
            return endDateWindow;
        }

        /** 
         * Set the 'TimeWindowGroup' attributeGroup value.
         * 
         * @param endDateWindow
         */
        public void setEndDateWindow(TimeWindowGroup endDateWindow) {
            this.endDateWindow = endDateWindow;
        }
    }
}
