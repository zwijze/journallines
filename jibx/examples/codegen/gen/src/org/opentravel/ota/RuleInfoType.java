
package org.opentravel.ota;

/** 
 * Contains summary fare rule information as well as detailed Rule Information for Fare Basis Codes.  Information may be actual rules data or the results returned from a rules-based inquiry.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RuleInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="ResTicketingRules" minOccurs="0">
 *       &lt;!-- Reference to inner class ResTicketingRules -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:StayRestrictionsType" name="LengthOfStayRules" minOccurs="0"/>
 *     &lt;xs:element name="ChargesRules" minOccurs="0">
 *       &lt;!-- Reference to inner class ChargesRules -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RuleInfoType
{
    private ResTicketingRules resTicketingRules;
    private StayRestrictionsType lengthOfStayRules;
    private ChargesRules chargesRules;

    /** 
     * Get the 'ResTicketingRules' element value.
     * 
     * @return value
     */
    public ResTicketingRules getResTicketingRules() {
        return resTicketingRules;
    }

    /** 
     * Set the 'ResTicketingRules' element value.
     * 
     * @param resTicketingRules
     */
    public void setResTicketingRules(ResTicketingRules resTicketingRules) {
        this.resTicketingRules = resTicketingRules;
    }

    /** 
     * Get the 'LengthOfStayRules' element value. Rules providing minimum or maximum stay restrictions.
     * 
     * @return value
     */
    public StayRestrictionsType getLengthOfStayRules() {
        return lengthOfStayRules;
    }

    /** 
     * Set the 'LengthOfStayRules' element value. Rules providing minimum or maximum stay restrictions.
     * 
     * @param lengthOfStayRules
     */
    public void setLengthOfStayRules(StayRestrictionsType lengthOfStayRules) {
        this.lengthOfStayRules = lengthOfStayRules;
    }

    /** 
     * Get the 'ChargesRules' element value.
     * 
     * @return value
     */
    public ChargesRules getChargesRules() {
        return chargesRules;
    }

    /** 
     * Set the 'ChargesRules' element value.
     * 
     * @param chargesRules
     */
    public void setChargesRules(ChargesRules chargesRules) {
        this.chargesRules = chargesRules;
    }
    /** 
     * General container for rules regarding fare reservation,  ticketing and sale restrictions
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ResTicketingRules" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="AdvResTicketing" minOccurs="0">
     *         &lt;!-- Reference to inner class AdvResTicketing -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class ResTicketingRules
    {
        private AdvResTicketing advResTicketing;

        /** 
         * Get the 'AdvResTicketing' element value.
         * 
         * @return value
         */
        public AdvResTicketing getAdvResTicketing() {
            return advResTicketing;
        }

        /** 
         * Set the 'AdvResTicketing' element value.
         * 
         * @param advResTicketing
         */
        public void setAdvResTicketing(AdvResTicketing advResTicketing) {
            this.advResTicketing = advResTicketing;
        }
        /** 
         * Container for holding rules regarding advance reservation or ticketing restrictions. 
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdvResTicketing" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:complexContent>
         *       &lt;xs:extension base="ns:AdvResTicketingType">
         *         &lt;xs:attribute type="xs:string" use="optional" name="FirstTicketDate"/>
         *         &lt;xs:attribute type="xs:string" use="optional" name="LastTicketDate"/>
         *       &lt;/xs:extension>
         *     &lt;/xs:complexContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class AdvResTicketing extends AdvResTicketingType
        {
            private String firstTicketDate;
            private String lastTicketDate;

            /** 
             * Get the 'FirstTicketDate' attribute value. The first date that a ticket may be issued for this fare.
             * 
             * @return value
             */
            public String getFirstTicketDate() {
                return firstTicketDate;
            }

            /** 
             * Set the 'FirstTicketDate' attribute value. The first date that a ticket may be issued for this fare.
             * 
             * @param firstTicketDate
             */
            public void setFirstTicketDate(String firstTicketDate) {
                this.firstTicketDate = firstTicketDate;
            }

            /** 
             * Get the 'LastTicketDate' attribute value. The last date that a ticket may be issued for this fare.

             * 
             * @return value
             */
            public String getLastTicketDate() {
                return lastTicketDate;
            }

            /** 
             * Set the 'LastTicketDate' attribute value. The last date that a ticket may be issued for this fare.

             * 
             * @param lastTicketDate
             */
            public void setLastTicketDate(String lastTicketDate) {
                this.lastTicketDate = lastTicketDate;
            }
        }
    }
    /** 
     * General container for rules specifying amounts for such things as: surcharges, deposits, change penalties, cancellation penalties, etc.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ChargesRules" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="ns:VoluntaryChangesType" name="VoluntaryChanges" minOccurs="0"/>
     *       &lt;xs:element type="ns:VoluntaryChangesType" name="VoluntaryRefunds" minOccurs="0"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class ChargesRules
    {
        private VoluntaryChangesType voluntaryChanges;
        private VoluntaryChangesType voluntaryRefunds;

        /** 
         * Get the 'VoluntaryChanges' element value. Specifies a voluntary change charge.
         * 
         * @return value
         */
        public VoluntaryChangesType getVoluntaryChanges() {
            return voluntaryChanges;
        }

        /** 
         * Set the 'VoluntaryChanges' element value. Specifies a voluntary change charge.
         * 
         * @param voluntaryChanges
         */
        public void setVoluntaryChanges(VoluntaryChangesType voluntaryChanges) {
            this.voluntaryChanges = voluntaryChanges;
        }

        /** 
         * Get the 'VoluntaryRefunds' element value. Specifies a Voluntary Refund (cancellation) charge.
         * 
         * @return value
         */
        public VoluntaryChangesType getVoluntaryRefunds() {
            return voluntaryRefunds;
        }

        /** 
         * Set the 'VoluntaryRefunds' element value. Specifies a Voluntary Refund (cancellation) charge.
         * 
         * @param voluntaryRefunds
         */
        public void setVoluntaryRefunds(VoluntaryChangesType voluntaryRefunds) {
            this.voluntaryRefunds = voluntaryRefunds;
        }
    }
}
