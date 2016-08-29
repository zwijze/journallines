
package org.opentravel.ota;

/** 
 * Details for a video of a given category. 
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VideoItemType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="URL" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="optional" name="UnitOfMeasureCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Width"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Height"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="BitRate"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Length"/>
 *   &lt;xs:attributeGroup ref="ns:MultimediaItemGroup"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class VideoItemType
{
    private String URL;
    private String unitOfMeasureCode;
    private String width;
    private String height;
    private String bitRate;
    private String length;
    private MultimediaItemGroup multimediaItemGroup;

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
     * Get the 'UnitOfMeasureCode' attribute value. The unit of measure associated with all the dimensions of the multimedia item. Refer to OTA code list Unit of Measure (UOM).
     * 
     * @return value
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /** 
     * Set the 'UnitOfMeasureCode' attribute value. The unit of measure associated with all the dimensions of the multimedia item. Refer to OTA code list Unit of Measure (UOM).
     * 
     * @param unitOfMeasureCode
     */
    public void setUnitOfMeasureCode(String unitOfMeasureCode) {
        this.unitOfMeasureCode = unitOfMeasureCode;
    }

    /** 
     * Get the 'Width' attribute value. The width of the video item (unit specified by unit of measure).
     * 
     * @return value
     */
    public String getWidth() {
        return width;
    }

    /** 
     * Set the 'Width' attribute value. The width of the video item (unit specified by unit of measure).
     * 
     * @param width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /** 
     * Get the 'Height' attribute value. The height of the video item (unit specified by unit of measure).
     * 
     * @return value
     */
    public String getHeight() {
        return height;
    }

    /** 
     * Set the 'Height' attribute value. The height of the video item (unit specified by unit of measure).
     * 
     * @param height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /** 
     * Get the 'BitRate' attribute value. The bit rate of the video item.
     * 
     * @return value
     */
    public String getBitRate() {
        return bitRate;
    }

    /** 
     * Set the 'BitRate' attribute value. The bit rate of the video item.
     * 
     * @param bitRate
     */
    public void setBitRate(String bitRate) {
        this.bitRate = bitRate;
    }

    /** 
     * Get the 'Length' attribute value. The length of the video item (unit specified by unit of measure).
     * 
     * @return value
     */
    public String getLength() {
        return length;
    }

    /** 
     * Set the 'Length' attribute value. The length of the video item (unit specified by unit of measure).
     * 
     * @param length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /** 
     * Get the 'MultimediaItemGroup' attributeGroup value. Multimedia information for the video item.
     * 
     * @return value
     */
    public MultimediaItemGroup getMultimediaItemGroup() {
        return multimediaItemGroup;
    }

    /** 
     * Set the 'MultimediaItemGroup' attributeGroup value. Multimedia information for the video item.
     * 
     * @param multimediaItemGroup
     */
    public void setMultimediaItemGroup(MultimediaItemGroup multimediaItemGroup) {
        this.multimediaItemGroup = multimediaItemGroup;
    }
}
