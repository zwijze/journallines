
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Describes an image item.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ImageDescriptionType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="ImageFormat" minOccurs="0" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class ImageFormat -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="Description" minOccurs="0" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class Description -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Category"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ImageDescriptionType
{
    private List<ImageFormat> imageFormatList = new ArrayList<ImageFormat>();
    private List<Description> descriptionList = new ArrayList<Description>();
    private String category;

    /** 
     * Get the list of 'ImageFormat' element items.
     * 
     * @return list
     */
    public List<ImageFormat> getImageFormatList() {
        return imageFormatList;
    }

    /** 
     * Set the list of 'ImageFormat' element items.
     * 
     * @param list
     */
    public void setImageFormatList(List<ImageFormat> list) {
        imageFormatList = list;
    }

    /** 
     * Get the list of 'Description' element items.
     * 
     * @return list
     */
    public List<Description> getDescriptionList() {
        return descriptionList;
    }

    /** 
     * Set the list of 'Description' element items.
     * 
     * @param list
     */
    public void setDescriptionList(List<Description> list) {
        descriptionList = list;
    }

    /** 
     * Get the 'Category' attribute value. Specifies the image category. Refer to OTA code list Picture Category Code (PIC). 
     * 
     * @return value
     */
    public String getCategory() {
        return category;
    }

    /** 
     * Set the 'Category' attribute value. Specifies the image category. Refer to OTA code list Picture Category Code (PIC). 
     * 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }
    /** 
     * A set of Images for a given   category but provided in different format.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ImageFormat" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:ImageItemType">
     *         &lt;xs:attributeGroup ref="ns:MultimediaDescriptionGroup"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="Language"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="Format"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="FileName"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="FileSize"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="DimensionCategory"/>
     *         &lt;xs:attribute type="xs:boolean" use="optional" name="IsOriginalIndicator"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class ImageFormat extends ImageItemType
    {
        private MultimediaDescriptionGroup multimediaDescriptionGroup;
        private String language;
        private String format;
        private String fileName;
        private String fileSize;
        private String dimensionCategory;
        private Boolean isOriginalIndicator;

        /** 
         * Get the 'MultimediaDescriptionGroup' attributeGroup value.
         * 
         * @return value
         */
        public MultimediaDescriptionGroup getMultimediaDescriptionGroup() {
            return multimediaDescriptionGroup;
        }

        /** 
         * Set the 'MultimediaDescriptionGroup' attributeGroup value.
         * 
         * @param multimediaDescriptionGroup
         */
        public void setMultimediaDescriptionGroup(
                MultimediaDescriptionGroup multimediaDescriptionGroup) {
            this.multimediaDescriptionGroup = multimediaDescriptionGroup;
        }

        /** 
         * Get the 'Language' attribute value.
         * 
         * @return value
         */
        public String getLanguage() {
            return language;
        }

        /** 
         * Set the 'Language' attribute value.
         * 
         * @param language
         */
        public void setLanguage(String language) {
            this.language = language;
        }

        /** 
         * Get the 'Format' attribute value. code list to create to identof the different format of an Image 
         * 
         * @return value
         */
        public String getFormat() {
            return format;
        }

        /** 
         * Set the 'Format' attribute value. code list to create to identof the different format of an Image 
         * 
         * @param format
         */
        public void setFormat(String format) {
            this.format = format;
        }

        /** 
         * Get the 'FileName' attribute value.
         * 
         * @return value
         */
        public String getFileName() {
            return fileName;
        }

        /** 
         * Set the 'FileName' attribute value.
         * 
         * @param fileName
         */
        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        /** 
         * Get the 'FileSize' attribute value.
         * 
         * @return value
         */
        public String getFileSize() {
            return fileSize;
        }

        /** 
         * Set the 'FileSize' attribute value.
         * 
         * @param fileSize
         */
        public void setFileSize(String fileSize) {
            this.fileSize = fileSize;
        }

        /** 
         * Get the 'DimensionCategory' attribute value. Associates the image size to a given category (e.g., 70x70, 100x100, 480x480). For example, if an image with a dimension of 72x73 is sent, it may be categorized as a 70x70 image.
         * 
         * @return value
         */
        public String getDimensionCategory() {
            return dimensionCategory;
        }

        /** 
         * Set the 'DimensionCategory' attribute value. Associates the image size to a given category (e.g., 70x70, 100x100, 480x480). For example, if an image with a dimension of 72x73 is sent, it may be categorized as a 70x70 image.
         * 
         * @param dimensionCategory
         */
        public void setDimensionCategory(String dimensionCategory) {
            this.dimensionCategory = dimensionCategory;
        }

        /** 
         * Get the 'IsOriginalIndicator' attribute value. When true, the image is the original file and format. When false, the image is not the original file and format.
         * 
         * @return value
         */
        public Boolean getIsOriginalIndicator() {
            return isOriginalIndicator;
        }

        /** 
         * Set the 'IsOriginalIndicator' attribute value. When true, the image is the original file and format. When false, the image is not the original file and format.
         * 
         * @param isOriginalIndicator
         */
        public void setIsOriginalIndicator(Boolean isOriginalIndicator) {
            this.isOriginalIndicator = isOriginalIndicator;
        }
    }
    /** 
     * The description associated with the image in a specific language.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Description" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="ns:FormattedTextTextType">
     *         &lt;xs:attribute type="xs:string" use="optional" name="Caption"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Description
    {
        private FormattedTextTextType formattedTextTextType;
        private String caption;

        /** 
         * Get the extension value.
         * 
         * @return value
         */
        public FormattedTextTextType getFormattedTextTextType() {
            return formattedTextTextType;
        }

        /** 
         * Set the extension value.
         * 
         * @param formattedTextTextType
         */
        public void setFormattedTextTextType(
                FormattedTextTextType formattedTextTextType) {
            this.formattedTextTextType = formattedTextTextType;
        }

        /** 
         * Get the 'Caption' attribute value. The caption associated to a specific image category which can be provided in different languages.
         * 
         * @return value
         */
        public String getCaption() {
            return caption;
        }

        /** 
         * Set the 'Caption' attribute value. The caption associated to a specific image category which can be provided in different languages.
         * 
         * @param caption
         */
        public void setCaption(String caption) {
            this.caption = caption;
        }
    }
}
