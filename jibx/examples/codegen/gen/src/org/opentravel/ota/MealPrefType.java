
package org.opentravel.ota;

/** 
 * Food and beverage preferences to be used with this collection.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MealPrefType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *       &lt;xs:attribute type="ns:MealType" name="MealType"/>
 *       &lt;xs:attribute type="xs:string" name="FavoriteFood"/>
 *       &lt;xs:attribute type="xs:string" name="Beverage"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class MealPrefType
{
    private String string;
    private PreferLevelType preferLevel;
    private MealType mealType;
    private String favoriteFood;
    private String beverage;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public String getString() {
        return string;
    }

    /** 
     * Set the extension value.
     * 
     * @param string
     */
    public void setString(String string) {
        this.string = string;
    }

    /** 
     * Get the 'PreferLevel' attribute value. Used to indicate a level of preference for an associated item.
     * 
     * @return value
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /** 
     * Set the 'PreferLevel' attribute value. Used to indicate a level of preference for an associated item.
     * 
     * @param preferLevel
     */
    public void setPreferLevel(PreferLevelType preferLevel) {
        this.preferLevel = preferLevel;
    }

    /** 
     * Get the 'MealType' attribute value. Type of meal required (e.g.,vegetarian, Kosher, low fat, etc.)
     * 
     * @return value
     */
    public MealType getMealType() {
        return mealType;
    }

    /** 
     * Set the 'MealType' attribute value. Type of meal required (e.g.,vegetarian, Kosher, low fat, etc.)
     * 
     * @param mealType
     */
    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    /** 
     * Get the 'FavoriteFood' attribute value. Dining preferences used with this collection.
     * 
     * @return value
     */
    public String getFavoriteFood() {
        return favoriteFood;
    }

    /** 
     * Set the 'FavoriteFood' attribute value. Dining preferences used with this collection.
     * 
     * @param favoriteFood
     */
    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    /** 
     * Get the 'Beverage' attribute value. Type of drink(s) preferred.
     * 
     * @return value
     */
    public String getBeverage() {
        return beverage;
    }

    /** 
     * Set the 'Beverage' attribute value. Type of drink(s) preferred.
     * 
     * @param beverage
     */
    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }
}
