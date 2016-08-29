
package org.opentravel.ota;

/** 
 * HotelReference: The hotel reference identifies a specific hotel by using the Chain Code, the Brand Code, and the Hotel Code.  The codes used are agreed upon by trading partners.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HotelReferenceGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="ChainCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="BrandCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="HotelCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="HotelCityCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="HotelName"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="HotelCodeContext"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ChainName"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="BrandName"/>
 *   &lt;xs:attributeGroup ref="ns:AreaID_Group"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AreaID_Group">
 *   &lt;xs:attribute type="xs:string" use="optional" name="AreaID"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class HotelReferenceGroup
{
    private String chainCode;
    private String brandCode;
    private String hotelCode;
    private String hotelCityCode;
    private String hotelName;
    private String hotelCodeContext;
    private String chainName;
    private String brandName;
    private String areaID;

    /** 
     * Get the 'ChainCode' attribute value. The code that identifies a hotel chain or management group. The hotel chain code is decided between vendors.  This attribute is optional if the hotel is an independent property that can be identified by the HotelCode attribute.
     * 
     * @return value
     */
    public String getChainCode() {
        return chainCode;
    }

    /** 
     * Set the 'ChainCode' attribute value. The code that identifies a hotel chain or management group. The hotel chain code is decided between vendors.  This attribute is optional if the hotel is an independent property that can be identified by the HotelCode attribute.
     * 
     * @param chainCode
     */
    public void setChainCode(String chainCode) {
        this.chainCode = chainCode;
    }

    /** 
     * Get the 'BrandCode' attribute value. A code that identifies the brand or flag of a hotel, often used for independently-owned or franchised properties who are known by a specific brand.
     * 
     * @return value
     */
    public String getBrandCode() {
        return brandCode;
    }

    /** 
     * Set the 'BrandCode' attribute value. A code that identifies the brand or flag of a hotel, often used for independently-owned or franchised properties who are known by a specific brand.
     * 
     * @param brandCode
     */
    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    /** 
     * Get the 'HotelCode' attribute value. The code that uniquely identifies a single hotel property. The hotel code is decided between vendors.
     * 
     * @return value
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /** 
     * Set the 'HotelCode' attribute value. The code that uniquely identifies a single hotel property. The hotel code is decided between vendors.
     * 
     * @param hotelCode
     */
    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    /** 
     * Get the 'HotelCityCode' attribute value. The IATA city code; for example DCA, ORD.
     * 
     * @return value
     */
    public String getHotelCityCode() {
        return hotelCityCode;
    }

    /** 
     * Set the 'HotelCityCode' attribute value. The IATA city code; for example DCA, ORD.
     * 
     * @param hotelCityCode
     */
    public void setHotelCityCode(String hotelCityCode) {
        this.hotelCityCode = hotelCityCode;
    }

    /** 
     * Get the 'HotelName' attribute value.  A text field used to communicate the proper name of the hotel.
     * 
     * @return value
     */
    public String getHotelName() {
        return hotelName;
    }

    /** 
     * Set the 'HotelName' attribute value.  A text field used to communicate the proper name of the hotel.
     * 
     * @param hotelName
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    /** 
     * Get the 'HotelCodeContext' attribute value. A text field used to communicate the context (or source of - ex Sabre, Galileo, Worldspan, Amadeus) the HotelReferenceGroup codes.

     * 
     * @return value
     */
    public String getHotelCodeContext() {
        return hotelCodeContext;
    }

    /** 
     * Set the 'HotelCodeContext' attribute value. A text field used to communicate the context (or source of - ex Sabre, Galileo, Worldspan, Amadeus) the HotelReferenceGroup codes.

     * 
     * @param hotelCodeContext
     */
    public void setHotelCodeContext(String hotelCodeContext) {
        this.hotelCodeContext = hotelCodeContext;
    }

    /** 
     * Get the 'ChainName' attribute value.
     * 
     * @return value
     */
    public String getChainName() {
        return chainName;
    }

    /** 
     * Set the 'ChainName' attribute value.
     * 
     * @param chainName
     */
    public void setChainName(String chainName) {
        this.chainName = chainName;
    }

    /** 
     * Get the 'BrandName' attribute value.
     * 
     * @return value
     */
    public String getBrandName() {
        return brandName;
    }

    /** 
     * Set the 'BrandName' attribute value.
     * 
     * @param brandName
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /** 
     * Get the 'AreaID' attribute value. Used in place of a property code to retrieve availability across multiple properties in a hotel reservation system defined area.  This attribute does not map to a code list, it maps to a hotel reservation system defined value.
     * 
     * @return value
     */
    public String getAreaID() {
        return areaID;
    }

    /** 
     * Set the 'AreaID' attribute value. Used in place of a property code to retrieve availability across multiple properties in a hotel reservation system defined area.  This attribute does not map to a code list, it maps to a hotel reservation system defined value.
     * 
     * @param areaID
     */
    public void setAreaID(String areaID) {
        this.areaID = areaID;
    }
}
