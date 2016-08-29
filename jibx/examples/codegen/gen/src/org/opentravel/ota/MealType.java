
package org.opentravel.ota;

/** 
 * Airline meal types.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MealType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="AVML"/>
 *     &lt;xs:enumeration value="BBML"/>
 *     &lt;xs:enumeration value="BLML"/>
 *     &lt;xs:enumeration value="CHML"/>
 *     &lt;xs:enumeration value="DBML"/>
 *     &lt;xs:enumeration value="FPML"/>
 *     &lt;xs:enumeration value="GFML"/>
 *     &lt;xs:enumeration value="HFML"/>
 *     &lt;xs:enumeration value="HNML"/>
 *     &lt;xs:enumeration value="KSML"/>
 *     &lt;xs:enumeration value="LCML"/>
 *     &lt;xs:enumeration value="LFML"/>
 *     &lt;xs:enumeration value="LPML"/>
 *     &lt;xs:enumeration value="LSML"/>
 *     &lt;xs:enumeration value="MOML"/>
 *     &lt;xs:enumeration value="NLML"/>
 *     &lt;xs:enumeration value="ORML"/>
 *     &lt;xs:enumeration value="PRML"/>
 *     &lt;xs:enumeration value="RVML"/>
 *     &lt;xs:enumeration value="SFML"/>
 *     &lt;xs:enumeration value="SPML"/>
 *     &lt;xs:enumeration value="VGML"/>
 *     &lt;xs:enumeration value="VLML"/>
 *     &lt;xs:enumeration value="RGML"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum MealType {
    /** 
     * AVML - Asian Veg
     */
    AVML, /** 
           * BBML - Baby/Infant Food
           */
    BBML, /** 
           * BLML - Bland Meal
           */
    BLML, /** 
           * CHML - Child Meal
           */
    CHML, /** 
           * DBML - Diabetic
           */
    DBML, /** 
           * FPML - Fruit Meal
           */
    FPML, /** 
           * GFML - Gluten Free
           */
    GFML, /** 
           * HFML - High Fiber
           */
    HFML, /** 
           * HNML - Hindu Meal
           */
    HNML, /** 
           * KSML - Kosher
           */
    KSML, /** 
           * LCML - Low Calorie
           */
    LCML, /** 
           * LFML - Low Cholesterol
           */
    LFML, /** 
           * LPML - Low Protein
           */
    LPML, /** 
           * LSML - Low Sodium/No Salt
           */
    LSML, /** 
           * MOML - Moslem
           */
    MOML, /** 
           * NLML - Non-Lactose
           */
    NLML, /** 
           * ORML - Oriental
           */
    ORML, /** 
           * PRML - Low Purin
           */
    PRML, /** 
           * RVML - Raw Vegetarian
           */
    RVML, /** 
           * SFML - Seafood
           */
    SFML, /** 
           * SPML - Special/Specify
           */
    SPML, /** 
           * VGML - Vegetarian/Non Dairy
           */
    VGML, /** 
           * VLML - Vegetarian/Milk/Eggs
           */
    VLML, /** 
           * Designates a regular meal.
           */
    RGML
}
