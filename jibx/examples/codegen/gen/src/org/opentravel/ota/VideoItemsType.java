
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Collection of video items.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VideoItemsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="VideoItem" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class VideoItem -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class VideoItemsType
{
    private List<VideoItem> videoItemList = new ArrayList<VideoItem>();

    /** 
     * Get the list of 'VideoItem' element items.
     * 
     * @return list
     */
    public List<VideoItem> getVideoItemList() {
        return videoItemList;
    }

    /** 
     * Set the list of 'VideoItem' element items.
     * 
     * @param list
     */
    public void setVideoItemList(List<VideoItem> list) {
        videoItemList = list;
    }
    /** 
     * Each video item represents a specific category.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VideoItem" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:VideoDescriptionType">
     *         &lt;xs:attribute type="xs:string" use="optional" name="Language"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="Caption"/>
     *         &lt;xs:attributeGroup ref="ns:RemovalGroup"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="Version"/>
     *         &lt;xs:attributeGroup ref="ns:DateTimeStampGroup"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * 
     * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RemovalGroup">
     *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="Removal"/>
     * &lt;/xs:attributeGroup>
     * </pre>
     */
    public static class VideoItem extends VideoDescriptionType
    {
        private String language;
        private String caption;
        private Boolean removal;
        private String version;
        private DateTimeStampGroup dateTimeStampGroup;

        /** 
         * Get the 'Language' attribute value. The language associated with the caption for the video.
         * 
         * @return value
         */
        public String getLanguage() {
            return language;
        }

        /** 
         * Set the 'Language' attribute value. The language associated with the caption for the video.
         * 
         * @param language
         */
        public void setLanguage(String language) {
            this.language = language;
        }

        /** 
         * Get the 'Caption' attribute value. The caption associated to a specific video category which can be provided in different languages.
         * 
         * @return value
         */
        public String getCaption() {
            return caption;
        }

        /** 
         * Set the 'Caption' attribute value. The caption associated to a specific video category which can be provided in different languages.
         * 
         * @param caption
         */
        public void setCaption(String caption) {
            this.caption = caption;
        }

        /** 
         * Get the 'Removal' attribute value. If true, this item is obsolete and should be removed from the receiving system.
         * 
         * @return value
         */
        public Boolean getRemoval() {
            return removal;
        }

        /** 
         * Set the 'Removal' attribute value. If true, this item is obsolete and should be removed from the receiving system.
         * 
         * @param removal
         */
        public void setRemoval(Boolean removal) {
            this.removal = removal;
        }

        /** 
         * Get the 'Version' attribute value. The version of the video item.
         * 
         * @return value
         */
        public String getVersion() {
            return version;
        }

        /** 
         * Set the 'Version' attribute value. The version of the video item.
         * 
         * @param version
         */
        public void setVersion(String version) {
            this.version = version;
        }

        /** 
         * Get the 'DateTimeStampGroup' attributeGroup value. Creation and modification information for this video item.
         * 
         * @return value
         */
        public DateTimeStampGroup getDateTimeStampGroup() {
            return dateTimeStampGroup;
        }

        /** 
         * Set the 'DateTimeStampGroup' attributeGroup value. Creation and modification information for this video item.
         * 
         * @param dateTimeStampGroup
         */
        public void setDateTimeStampGroup(DateTimeStampGroup dateTimeStampGroup) {
            this.dateTimeStampGroup = dateTimeStampGroup;
        }
    }
}
