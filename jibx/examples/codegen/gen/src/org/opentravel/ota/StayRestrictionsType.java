
package org.opentravel.ota;

import java.math.BigInteger;

/** 
 * Type defining Min and Max Stay Restrictions
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StayRestrictionsType">
 *   &lt;xs:sequence minOccurs="0">
 *     &lt;!-- Reference to inner class Sequence -->
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:boolean" use="optional" name="StayRestrictionsInd"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StayRestrictionsType
{
    private Sequence sequence;
    private Boolean stayRestrictionsInd;

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
     * Get the 'StayRestrictionsInd' attribute value. True indicates that Stay Restrictions exist. 
     * 
     * @return value
     */
    public Boolean getStayRestrictionsInd() {
        return stayRestrictionsInd;
    }

    /** 
     * Set the 'StayRestrictionsInd' attribute value. True indicates that Stay Restrictions exist. 
     * 
     * @param stayRestrictionsInd
     */
    public void setStayRestrictionsInd(Boolean stayRestrictionsInd) {
        this.stayRestrictionsInd = stayRestrictionsInd;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:sequence xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0">
     *   &lt;xs:element name="MinimumStay" minOccurs="0">
     *     &lt;!-- Reference to inner class MinimumStay -->
     *   &lt;/xs:element>
     *   &lt;xs:element name="MaximumStay" minOccurs="0">
     *     &lt;!-- Reference to inner class MaximumStay -->
     *   &lt;/xs:element>
     * &lt;/xs:sequence>
     * </pre>
     */
    public static class Sequence
    {
        private MinimumStay minimumStay;
        private MaximumStay maximumStay;

        /** 
         * Get the 'MinimumStay' element value.
         * 
         * @return value
         */
        public MinimumStay getMinimumStay() {
            return minimumStay;
        }

        /** 
         * Set the 'MinimumStay' element value.
         * 
         * @param minimumStay
         */
        public void setMinimumStay(MinimumStay minimumStay) {
            this.minimumStay = minimumStay;
        }

        /** 
         * Get the 'MaximumStay' element value.
         * 
         * @return value
         */
        public MaximumStay getMaximumStay() {
            return maximumStay;
        }

        /** 
         * Set the 'MaximumStay' element value.
         * 
         * @param maximumStay
         */
        public void setMaximumStay(MaximumStay maximumStay) {
            this.maximumStay = maximumStay;
        }
        /** 
         * Specifies restrictions for the shortest length/period of time or earliest day return travel can commence or be completed.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MinimumStay" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:attribute type="xs:string" use="optional" name="ReturnTimeOfDay"/>
         *     &lt;xs:attribute type="xs:integer" use="optional" name="MinStay"/>
         *     &lt;xs:attribute type="ns:StayUnitType" use="optional" name="StayUnit"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="MinStayDate"/>
         *     &lt;xs:attribute type="xs:boolean" use="optional" name="ComplicatedRulesInd"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class MinimumStay
        {
            private String returnTimeOfDay;
            private BigInteger minStay;
            private StayUnitType stayUnit;
            private String minStayDate;
            private Boolean complicatedRulesInd;

            /** 
             * Get the 'ReturnTimeOfDay' attribute value.  The time of day when return travel may commence.
             * 
             * @return value
             */
            public String getReturnTimeOfDay() {
                return returnTimeOfDay;
            }

            /** 
             * Set the 'ReturnTimeOfDay' attribute value.  The time of day when return travel may commence.
             * 
             * @param returnTimeOfDay
             */
            public void setReturnTimeOfDay(String returnTimeOfDay) {
                this.returnTimeOfDay = returnTimeOfDay;
            }

            /** 
             * Get the 'MinStay' attribute value. The amount of elapsed time or number of occurrences of a day of the week needed to satisfy a minimum stay requirement.
             * 
             * @return value
             */
            public BigInteger getMinStay() {
                return minStay;
            }

            /** 
             * Set the 'MinStay' attribute value. The amount of elapsed time or number of occurrences of a day of the week needed to satisfy a minimum stay requirement.
             * 
             * @param minStay
             */
            public void setMinStay(BigInteger minStay) {
                this.minStay = minStay;
            }

            /** 
             * Get the 'StayUnit' attribute value. The unit of elapsed time or the day of the week applied to the MinStay value. 
             * 
             * @return value
             */
            public StayUnitType getStayUnit() {
                return stayUnit;
            }

            /** 
             * Set the 'StayUnit' attribute value. The unit of elapsed time or the day of the week applied to the MinStay value. 
             * 
             * @param stayUnit
             */
            public void setStayUnit(StayUnitType stayUnit) {
                this.stayUnit = stayUnit;
            }

            /** 
             * Get the 'MinStayDate' attribute value. The specific date for the minimum stay requirement.
             * 
             * @return value
             */
            public String getMinStayDate() {
                return minStayDate;
            }

            /** 
             * Set the 'MinStayDate' attribute value. The specific date for the minimum stay requirement.
             * 
             * @param minStayDate
             */
            public void setMinStayDate(String minStayDate) {
                this.minStayDate = minStayDate;
            }

            /** 
             * Get the 'ComplicatedRulesInd' attribute value. If true, there are complicated rules for the minimum stay requirement.

             * 
             * @return value
             */
            public Boolean getComplicatedRulesInd() {
                return complicatedRulesInd;
            }

            /** 
             * Set the 'ComplicatedRulesInd' attribute value. If true, there are complicated rules for the minimum stay requirement.

             * 
             * @param complicatedRulesInd
             */
            public void setComplicatedRulesInd(Boolean complicatedRulesInd) {
                this.complicatedRulesInd = complicatedRulesInd;
            }
        }
        /** 
         * Specifies restrictions for the  longest length/period of time or last day to begin or complete the return.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MaximumStay" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:attribute use="optional" name="ReturnType">
         *       &lt;xs:simpleType>
         *         &lt;!-- Reference to inner class ReturnType -->
         *       &lt;/xs:simpleType>
         *     &lt;/xs:attribute>
         *     &lt;xs:attribute type="xs:string" use="optional" name="ReturnTimeOfDay"/>
         *     &lt;xs:attribute type="xs:integer" use="optional" name="MaxStay"/>
         *     &lt;xs:attribute type="ns:StayUnitType" use="optional" name="StayUnit"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="MaxStayDate"/>
         *     &lt;xs:attribute type="xs:boolean" use="optional" name="ComplicatedRulesInd"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class MaximumStay
        {
            private ReturnType returnType;
            private String returnTimeOfDay;
            private BigInteger maxStay;
            private StayUnitType stayUnit;
            private String maxStayDate;
            private Boolean complicatedRulesInd;

            /** 
             * Get the 'ReturnType' attribute value. Code indicating whether travel must commence or be completed in order to satisfy the stay restriction.
             * 
             * @return value
             */
            public ReturnType getReturnType() {
                return returnType;
            }

            /** 
             * Set the 'ReturnType' attribute value. Code indicating whether travel must commence or be completed in order to satisfy the stay restriction.
             * 
             * @param returnType
             */
            public void setReturnType(ReturnType returnType) {
                this.returnType = returnType;
            }

            /** 
             * Get the 'ReturnTimeOfDay' attribute value.  The time of day when return travel may commence.
             * 
             * @return value
             */
            public String getReturnTimeOfDay() {
                return returnTimeOfDay;
            }

            /** 
             * Set the 'ReturnTimeOfDay' attribute value.  The time of day when return travel may commence.
             * 
             * @param returnTimeOfDay
             */
            public void setReturnTimeOfDay(String returnTimeOfDay) {
                this.returnTimeOfDay = returnTimeOfDay;
            }

            /** 
             * Get the 'MaxStay' attribute value. The amount of elapsed time or number of occurrences of a day of the week that must occur to satisfy a maximum stay requirement.
             * 
             * @return value
             */
            public BigInteger getMaxStay() {
                return maxStay;
            }

            /** 
             * Set the 'MaxStay' attribute value. The amount of elapsed time or number of occurrences of a day of the week that must occur to satisfy a maximum stay requirement.
             * 
             * @param maxStay
             */
            public void setMaxStay(BigInteger maxStay) {
                this.maxStay = maxStay;
            }

            /** 
             * Get the 'StayUnit' attribute value. The unit of elapsed time or the day of the week applied to the MaxStay value.
             * 
             * @return value
             */
            public StayUnitType getStayUnit() {
                return stayUnit;
            }

            /** 
             * Set the 'StayUnit' attribute value. The unit of elapsed time or the day of the week applied to the MaxStay value.
             * 
             * @param stayUnit
             */
            public void setStayUnit(StayUnitType stayUnit) {
                this.stayUnit = stayUnit;
            }

            /** 
             * Get the 'MaxStayDate' attribute value. The specific date for the maximum stay requirement.
             * 
             * @return value
             */
            public String getMaxStayDate() {
                return maxStayDate;
            }

            /** 
             * Set the 'MaxStayDate' attribute value. The specific date for the maximum stay requirement.
             * 
             * @param maxStayDate
             */
            public void setMaxStayDate(String maxStayDate) {
                this.maxStayDate = maxStayDate;
            }

            /** 
             * Get the 'ComplicatedRulesInd' attribute value. If true, there are complicated rules for the maximum stay requirement.

             * 
             * @return value
             */
            public Boolean getComplicatedRulesInd() {
                return complicatedRulesInd;
            }

            /** 
             * Set the 'ComplicatedRulesInd' attribute value. If true, there are complicated rules for the maximum stay requirement.

             * 
             * @param complicatedRulesInd
             */
            public void setComplicatedRulesInd(Boolean complicatedRulesInd) {
                this.complicatedRulesInd = complicatedRulesInd;
            }
            /** 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
             *   &lt;xs:restriction base="xs:string">
             *     &lt;xs:enumeration value="C"/>
             *     &lt;xs:enumeration value="S"/>
             *   &lt;/xs:restriction>
             * &lt;/xs:simpleType>
             * </pre>
             */
            public static enum ReturnType {
                /** 
                 * Return travel must be Completed.
                 */
                C, /** 
                    * Return travel must be Started.
                    */
                S
            }
        }
    }
}
