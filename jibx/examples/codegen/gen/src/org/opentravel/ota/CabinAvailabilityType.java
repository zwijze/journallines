
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Construct for holding cabin class information, such as seat availability or meal codes. Can be up to three of these per flight segment or air leg - First, Business and Economy.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CabinAvailabilityType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="Meal" minOccurs="0" maxOccurs="5">
 *       &lt;!-- Reference to inner class Meal -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="BaggageAllowance" minOccurs="0">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:UnitsOfMeasureGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="ns:CabinType" use="required" name="CabinType"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CabinAvailabilityType
{
    private List<Meal> mealList = new ArrayList<Meal>();
    private UnitsOfMeasureGroup baggageAllowance;
    private CabinType cabinType;

    /** 
     * Get the list of 'Meal' element items.
     * 
     * @return list
     */
    public List<Meal> getMealList() {
        return mealList;
    }

    /** 
     * Set the list of 'Meal' element items.
     * 
     * @param list
     */
    public void setMealList(List<Meal> list) {
        mealList = list;
    }

    /** 
     * Get the 'UnitsOfMeasureGroup' attributeGroup value. Provides the maximum weight of checked-in bags per passenger in this cabin.
     * 
     * @return value
     */
    public UnitsOfMeasureGroup getBaggageAllowance() {
        return baggageAllowance;
    }

    /** 
     * Set the 'UnitsOfMeasureGroup' attributeGroup value. Provides the maximum weight of checked-in bags per passenger in this cabin.
     * 
     * @param baggageAllowance
     */
    public void setBaggageAllowance(UnitsOfMeasureGroup baggageAllowance) {
        this.baggageAllowance = baggageAllowance;
    }

    /** 
     * Get the 'CabinType' attribute value. A section of an aircraft identified by the service level (e.g., First, Business, Economy)
     * 
     * @return value
     */
    public CabinType getCabinType() {
        return cabinType;
    }

    /** 
     * Set the 'CabinType' attribute value. A section of an aircraft identified by the service level (e.g., First, Business, Economy)
     * 
     * @param cabinType
     */
    public void setCabinType(CabinType cabinType) {
        this.cabinType = cabinType;
    }
    /** 
     *  Identifies any meal and/or beverage services that are provided.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Meal" minOccurs="0" maxOccurs="5">
     *   &lt;xs:complexType>
     *     &lt;xs:attribute type="xs:string" use="required" name="MealCode"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Meal
    {
        private String mealCode;

        /** 
         * Get the 'MealCode' attribute value.  Used to designate a meal or beverage service.
         * 
         * @return value
         */
        public String getMealCode() {
            return mealCode;
        }

        /** 
         * Set the 'MealCode' attribute value.  Used to designate a meal or beverage service.
         * 
         * @param mealCode
         */
        public void setMealCode(String mealCode) {
            this.mealCode = mealCode;
        }
    }
}
