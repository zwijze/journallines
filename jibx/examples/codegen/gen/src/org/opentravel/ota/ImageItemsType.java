
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Collection of image items.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ImageItemsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="ImageItem" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class ImageItem -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ImageItemsType
{
    private List<ImageItem> imageItemList = new ArrayList<ImageItem>();

    /** 
     * Get the list of 'ImageItem' element items.
     * 
     * @return list
     */
    public List<ImageItem> getImageItemList() {
        return imageItemList;
    }

    /** 
     * Set the list of 'ImageItem' element items.
     * 
     * @param list
     */
    public void setImageItemList(List<ImageItem> list) {
        imageItemList = list;
    }
    /** 
     * Image of a given category.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ImageItem" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:ImageDescriptionType">
     *         &lt;xs:attributeGroup ref="ns:DateTimeStampGroup"/>
     *         &lt;xs:attributeGroup ref="ns:RemovalGroup"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="Version"/>
     *         &lt;xs:attributeGroup ref="ns:ID_OptionalGroup"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * 
     * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RemovalGroup">
     *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="Removal"/>
     * &lt;/xs:attributeGroup>
     * 
     * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ID_OptionalGroup">
     *   &lt;xs:attribute type="xs:string" use="optional" name="ID"/>
     * &lt;/xs:attributeGroup>
     * </pre>
     */
    public static class ImageItem extends ImageDescriptionType
    {
        private DateTimeStampGroup dateTimeStampGroup;
        private Boolean removal;
        private String version;
        private String ID;

        /** 
         * Get the 'DateTimeStampGroup' attributeGroup value. Creation and modification information for this image item.
         * 
         * @return value
         */
        public DateTimeStampGroup getDateTimeStampGroup() {
            return dateTimeStampGroup;
        }

        /** 
         * Set the 'DateTimeStampGroup' attributeGroup value. Creation and modification information for this image item.
         * 
         * @param dateTimeStampGroup
         */
        public void setDateTimeStampGroup(DateTimeStampGroup dateTimeStampGroup) {
            this.dateTimeStampGroup = dateTimeStampGroup;
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
         * Get the 'Version' attribute value. The version of the image item.
         * 
         * @return value
         */
        public String getVersion() {
            return version;
        }

        /** 
         * Set the 'Version' attribute value. The version of the image item.
         * 
         * @param version
         */
        public void setVersion(String version) {
            this.version = version;
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
