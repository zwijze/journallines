
package org.opentravel.ota;

/** 
 * Container used to hold information regarding advance reservation and/or advance ticketing.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdvResTicketingType">
 *   &lt;xs:sequence minOccurs="0">
 *     &lt;!-- Reference to inner class Sequence -->
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:boolean" name="AdvResInd"/>
 *   &lt;xs:attribute type="xs:boolean" name="AdvTicketingInd"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="RequestedTicketingDate"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AdvResTicketingType
{
    private Sequence sequence;
    private Boolean advResInd;
    private Boolean advTicketingInd;
    private String requestedTicketingDate;

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
        this.sequence = sequence;
    }

    /** 
     * Get the 'AdvResInd' attribute value. Indicator for identifying whether or not advance reservation restrictions are involved in the request or response.
     * 
     * @return value
     */
    public Boolean getAdvResInd() {
        return advResInd;
    }

    /** 
     * Set the 'AdvResInd' attribute value. Indicator for identifying whether or not advance reservation restrictions are involved in the request or response.
     * 
     * @param advResInd
     */
    public void setAdvResInd(Boolean advResInd) {
        this.advResInd = advResInd;
    }

    /** 
     * Get the 'AdvTicketingInd' attribute value. Indicator for identifying whether or not advance ticketing restrictions are involved in the request or response.
     * 
     * @return value
     */
    public Boolean getAdvTicketingInd() {
        return advTicketingInd;
    }

    /** 
     * Set the 'AdvTicketingInd' attribute value. Indicator for identifying whether or not advance ticketing restrictions are involved in the request or response.
     * 
     * @param advTicketingInd
     */
    public void setAdvTicketingInd(Boolean advTicketingInd) {
        this.advTicketingInd = advTicketingInd;
    }

    /** 
     * Get the 'RequestedTicketingDate' attribute value. The date a traveller wishes to ticket their reservation.
     * 
     * @return value
     */
    public String getRequestedTicketingDate() {
        return requestedTicketingDate;
    }

    /** 
     * Set the 'RequestedTicketingDate' attribute value. The date a traveller wishes to ticket their reservation.
     * 
     * @param requestedTicketingDate
     */
    public void setRequestedTicketingDate(String requestedTicketingDate) {
        this.requestedTicketingDate = requestedTicketingDate;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:sequence xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0">
     *   &lt;xs:element name="AdvReservation" minOccurs="0">
     *     &lt;!-- Reference to inner class AdvReservation -->
     *   &lt;/xs:element>
     *   &lt;xs:element name="AdvTicketing" minOccurs="0">
     *     &lt;!-- Reference to inner class AdvTicketing -->
     *   &lt;/xs:element>
     * &lt;/xs:sequence>
     * </pre>
     */
    public static class Sequence
    {
        private AdvReservation advReservation;
        private AdvTicketing advTicketing;

        /** 
         * Get the 'AdvReservation' element value.
         * 
         * @return value
         */
        public AdvReservation getAdvReservation() {
            return advReservation;
        }

        /** 
         * Set the 'AdvReservation' element value.
         * 
         * @param advReservation
         */
        public void setAdvReservation(AdvReservation advReservation) {
            this.advReservation = advReservation;
        }

        /** 
         * Get the 'AdvTicketing' element value.
         * 
         * @return value
         */
        public AdvTicketing getAdvTicketing() {
            return advTicketing;
        }

        /** 
         * Set the 'AdvTicketing' element value.
         * 
         * @param advTicketing
         */
        public void setAdvTicketing(AdvTicketing advTicketing) {
            this.advTicketing = advTicketing;
        }
        /** 
         * Specifies constraints on when advance reservations can be made.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdvReservation" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:attribute type="xs:string" use="optional" name="LatestTimeOfDay"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="LatestPeriod"/>
         *     &lt;xs:attribute type="ns:StayUnitType" use="optional" name="LatestUnit"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class AdvReservation
        {
            private String latestTimeOfDay;
            private String latestPeriod;
            private StayUnitType latestUnit;

            /** 
             * Get the 'LatestTimeOfDay' attribute value. The time of day by which reservations must be made on the last day that advance reservations can be made.
             * 
             * @return value
             */
            public String getLatestTimeOfDay() {
                return latestTimeOfDay;
            }

            /** 
             * Set the 'LatestTimeOfDay' attribute value. The time of day by which reservations must be made on the last day that advance reservations can be made.
             * 
             * @param latestTimeOfDay
             */
            public void setLatestTimeOfDay(String latestTimeOfDay) {
                this.latestTimeOfDay = latestTimeOfDay;
            }

            /** 
             * Get the 'LatestPeriod' attribute value. The amount of elapsed time or number of occurrences of a day of the week before departure needed to satisfy an advance reservation requirement.
             * 
             * @return value
             */
            public String getLatestPeriod() {
                return latestPeriod;
            }

            /** 
             * Set the 'LatestPeriod' attribute value. The amount of elapsed time or number of occurrences of a day of the week before departure needed to satisfy an advance reservation requirement.
             * 
             * @param latestPeriod
             */
            public void setLatestPeriod(String latestPeriod) {
                this.latestPeriod = latestPeriod;
            }

            /** 
             * Get the 'LatestUnit' attribute value. The unit of elapsed time or the day of the week to be applied to the LatestPeriod value.
             * 
             * @return value
             */
            public StayUnitType getLatestUnit() {
                return latestUnit;
            }

            /** 
             * Set the 'LatestUnit' attribute value. The unit of elapsed time or the day of the week to be applied to the LatestPeriod value.
             * 
             * @param latestUnit
             */
            public void setLatestUnit(StayUnitType latestUnit) {
                this.latestUnit = latestUnit;
            }
        }
        /** 
         * Specifies advance ticketing restrictions.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdvTicketing" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:attribute type="xs:string" use="optional" name="FromResTimeOfDay"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="FromResPeriod"/>
         *     &lt;xs:attribute type="ns:StayUnitType" use="optional" name="FromResUnit"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="FromDepartTimeOfDay"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="FromDepartPeriod"/>
         *     &lt;xs:attribute type="ns:StayUnitType" use="optional" name="FromDepartUnit"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class AdvTicketing
        {
            private String fromResTimeOfDay;
            private String fromResPeriod;
            private StayUnitType fromResUnit;
            private String fromDepartTimeOfDay;
            private String fromDepartPeriod;
            private StayUnitType fromDepartUnit;

            /** 
             * Get the 'FromResTimeOfDay' attribute value. The time of day after reservations are made by which a ticket must be purchased.
             * 
             * @return value
             */
            public String getFromResTimeOfDay() {
                return fromResTimeOfDay;
            }

            /** 
             * Set the 'FromResTimeOfDay' attribute value. The time of day after reservations are made by which a ticket must be purchased.
             * 
             * @param fromResTimeOfDay
             */
            public void setFromResTimeOfDay(String fromResTimeOfDay) {
                this.fromResTimeOfDay = fromResTimeOfDay;
            }

            /** 
             * Get the 'FromResPeriod' attribute value. A length of time expressed as either an amount of time or the number of occurrences of a day of the week after reservations are made that a ticket must be purchased.
             * 
             * @return value
             */
            public String getFromResPeriod() {
                return fromResPeriod;
            }

            /** 
             * Set the 'FromResPeriod' attribute value. A length of time expressed as either an amount of time or the number of occurrences of a day of the week after reservations are made that a ticket must be purchased.
             * 
             * @param fromResPeriod
             */
            public void setFromResPeriod(String fromResPeriod) {
                this.fromResPeriod = fromResPeriod;
            }

            /** 
             * Get the 'FromResUnit' attribute value. The unit of elapsed time or the day of the week to be applied to the period after reservation are made that a ticket must be purchased.
             * 
             * @return value
             */
            public StayUnitType getFromResUnit() {
                return fromResUnit;
            }

            /** 
             * Set the 'FromResUnit' attribute value. The unit of elapsed time or the day of the week to be applied to the period after reservation are made that a ticket must be purchased.
             * 
             * @param fromResUnit
             */
            public void setFromResUnit(StayUnitType fromResUnit) {
                this.fromResUnit = fromResUnit;
            }

            /** 
             * Get the 'FromDepartTimeOfDay' attribute value. The time of day prior to departure when that a ticket must be purchased.
             * 
             * @return value
             */
            public String getFromDepartTimeOfDay() {
                return fromDepartTimeOfDay;
            }

            /** 
             * Set the 'FromDepartTimeOfDay' attribute value. The time of day prior to departure when that a ticket must be purchased.
             * 
             * @param fromDepartTimeOfDay
             */
            public void setFromDepartTimeOfDay(String fromDepartTimeOfDay) {
                this.fromDepartTimeOfDay = fromDepartTimeOfDay;
            }

            /** 
             * Get the 'FromDepartPeriod' attribute value. A length of time expressed as either an amount of time or the number of occurrences of a day of the week before departure that a ticket must be purchased.
             * 
             * @return value
             */
            public String getFromDepartPeriod() {
                return fromDepartPeriod;
            }

            /** 
             * Set the 'FromDepartPeriod' attribute value. A length of time expressed as either an amount of time or the number of occurrences of a day of the week before departure that a ticket must be purchased.
             * 
             * @param fromDepartPeriod
             */
            public void setFromDepartPeriod(String fromDepartPeriod) {
                this.fromDepartPeriod = fromDepartPeriod;
            }

            /** 
             * Get the 'FromDepartUnit' attribute value. The unit of elapsed time or the day of the week to be applied to the the period before departure that a ticket must be purchased.
             * 
             * @return value
             */
            public StayUnitType getFromDepartUnit() {
                return fromDepartUnit;
            }

            /** 
             * Set the 'FromDepartUnit' attribute value. The unit of elapsed time or the day of the week to be applied to the the period before departure that a ticket must be purchased.
             * 
             * @param fromDepartUnit
             */
            public void setFromDepartUnit(StayUnitType fromDepartUnit) {
                this.fromDepartUnit = fromDepartUnit;
            }
        }
    }
}
