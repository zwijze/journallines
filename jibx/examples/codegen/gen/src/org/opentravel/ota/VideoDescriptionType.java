
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Describes a video item.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VideoDescriptionType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="VideoFormat" minOccurs="0" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class VideoFormat -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Category"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class VideoDescriptionType
{
    private List<VideoFormat> videoFormatList = new ArrayList<VideoFormat>();
    private String category;

    /** 
     * Get the list of 'VideoFormat' element items.
     * 
     * @return list
     */
    public List<VideoFormat> getVideoFormatList() {
        return videoFormatList;
    }

    /** 
     * Set the list of 'VideoFormat' element items.
     * 
     * @param list
     */
    public void setVideoFormatList(List<VideoFormat> list) {
        videoFormatList = list;
    }

    /** 
     * Get the 'Category' attribute value. Specifies the video category. Refer to OTA code list Picture Category Code (PIC). 
     * 
     * @return value
     */
    public String getCategory() {
        return category;
    }

    /** 
     * Set the 'Category' attribute value. Specifies the video category. Refer to OTA code list Picture Category Code (PIC). 
     * 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }
    /** 
     * A set of video of a given category can be provided in different Format , each format will be described in this element  
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VideoFormat" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:VideoItemType">
     *         &lt;xs:attributeGroup ref="ns:MultimediaDescriptionGroup"/>
     *         &lt;xs:attributeGroup ref="ns:ID_OptionalGroup"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * 
     * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ID_OptionalGroup">
     *   &lt;xs:attribute type="xs:string" use="optional" name="ID"/>
     * &lt;/xs:attributeGroup>
     * </pre>
     */
    public static class VideoFormat extends VideoItemType
    {
        private MultimediaDescriptionGroup multimediaDescriptionGroup;
        private String ID;

        /** 
         * Get the 'MultimediaDescriptionGroup' attributeGroup value. Multimedia information for the video file.
         * 
         * @return value
         */
        public MultimediaDescriptionGroup getMultimediaDescriptionGroup() {
            return multimediaDescriptionGroup;
        }

        /** 
         * Set the 'MultimediaDescriptionGroup' attributeGroup value. Multimedia information for the video file.
         * 
         * @param multimediaDescriptionGroup
         */
        public void setMultimediaDescriptionGroup(
                MultimediaDescriptionGroup multimediaDescriptionGroup) {
            this.multimediaDescriptionGroup = multimediaDescriptionGroup;
        }

        /** 
         * Get the 'ID' attribute value. A unique identifying value assigned by the creating system.  The ID attribute may be used to reference a primary-key value within a database or in a particular implementation.
         * 
         * @return value
         */
        public String getID() {
            return ID;
        }

        /** 
         * Set the 'ID' attribute value. A unique identifying value assigned by the creating system.  The ID attribute may be used to reference a primary-key value within a database or in a particular implementation.
         * 
         * @param ID
         */
        public void setID(String ID) {
            this.ID = ID;
        }
    }
}
