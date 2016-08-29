
package org.opentravel.ota;

/** 
 * Details for an image of a given category. 
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ImageItemType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="URL" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="optional" name="UnitOfMeasureCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Width"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Height"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ImageItemType
{
    private String URL;
    private String unitOfMeasureCode;
    private String width;
    private String height;

    /** 
     * Get the 'URL' element value. URL of the multimedia item for a specific format. 
     * 
     * @return value
     */
    public String getURL() {
        return URL;
    }

    /** 
     * Set the 'URL' element value. URL of the multimedia item for a specific format. 
     * 
     * @param URL
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /** 
     * Get the 'UnitOfMeasureCode' attribute value. The unit of measure for the image item. Refer to OTA code list Unit of Measure (UOM).
     * 
     * @return value
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /** 
     * Set the 'UnitOfMeasureCode' attribute value. The unit of measure for the image item. Refer to OTA code list Unit of Measure (UOM).
     * 
     * @param unitOfMeasureCode
     */
    public void setUnitOfMeasureCode(String unitOfMeasureCode) {
        this.unitOfMeasureCode = unitOfMeasureCode;
    }

    /** 
     * Get the 'Width' attribute value. The width of the image item (unit specified by unit of measure).
     * 
     * @return value
     */
    public String getWidth() {
        return width;
    }

    /** 
     * Set the 'Width' attribute value. The width of the image item (unit specified by unit of measure).
     * 
     * @param width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /** 
     * Get the 'Height' attribute value. The height of the image item (unit specified by unit of measure).
     * 
     * @return value
     */
    public String getHeight() {
        return height;
    }

    /** 
     * Set the 'Height' attribute value. The height of the image item (unit specified by unit of measure).
     * 
     * @param height
     */
    public void setHeight(String height) {
        this.height = height;
    }
}
