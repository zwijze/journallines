
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Collection of text items. 
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TextItemsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="TextItem" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class TextItem -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TextItemsType
{
    private List<TextItem> textItemList = new ArrayList<TextItem>();

    /** 
     * Get the list of 'TextItem' element items.
     * 
     * @return list
     */
    public List<TextItem> getTextItemList() {
        return textItemList;
    }

    /** 
     * Set the list of 'TextItem' element items.
     * 
     * @param list
     */
    public void setTextItemList(List<TextItem> list) {
        textItemList = list;
    }
    /** 
     * Text description of a given category.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TextItem" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:TextDescriptionType">
     *         &lt;xs:attributeGroup ref="ns:DateTimeStampGroup"/>
     *         &lt;xs:attributeGroup ref="ns:RemovalGroup"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="Version"/>
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
    public static class TextItem extends TextDescriptionType
    {
        private DateTimeStampGroup dateTimeStampGroup;
        private Boolean removal;
        private String version;

        /** 
         * Get the 'DateTimeStampGroup' attributeGroup value. Creation and modification information for this text item.
         * 
         * @return value
         */
        public DateTimeStampGroup getDateTimeStampGroup() {
            return dateTimeStampGroup;
        }

        /** 
         * Set the 'DateTimeStampGroup' attributeGroup value. Creation and modification information for this text item.
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
         * Get the 'Version' attribute value. The version of the text item.
         * 
         * @return value
         */
        public String getVersion() {
            return version;
        }

        /** 
         * Set the 'Version' attribute value. The version of the text item.
         * 
         * @param version
         */
        public void setVersion(String version) {
            this.version = version;
        }
    }
}
