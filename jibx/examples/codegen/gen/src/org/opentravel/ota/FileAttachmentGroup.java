
package org.opentravel.ota;

/** 
 * Provides information about any files attached (e.g., multimedia objects) at the transport layer (e.g., HTTP/SOAP)
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FileAttachmentGroup">
 *   &lt;xs:attributeGroup ref="ns:CodeInfoGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ContentData"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Description"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="PictureCategoryCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Version"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ContentTitle"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ContentCaption"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CopyrightNotice"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="FileName"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="FileSize"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="MultimediaObjectHeight"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="MultimediaObjectWidth"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="UnitOfMeasureCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ContentID"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ContentCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ContentFormatCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="RecordID"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class FileAttachmentGroup
{
    private CodeInfoGroup codeInfoGroup;
    private String contentData;
    private String description;
    private String pictureCategoryCode;
    private String version;
    private String contentTitle;
    private String contentCaption;
    private String copyrightNotice;
    private String fileName;
    private String fileSize;
    private String multimediaObjectHeight;
    private String multimediaObjectWidth;
    private String unitOfMeasureCode;
    private String contentID;
    private String contentCode;
    private String contentFormatCode;
    private String recordID;

    /** 
     * Get the 'CodeInfoGroup' attributeGroup value. May be used to give further detail on the code or to remove an obsolete item.
    							
     * 
     * @return value
     */
    public CodeInfoGroup getCodeInfoGroup() {
        return codeInfoGroup;
    }

    /** 
     * Set the 'CodeInfoGroup' attributeGroup value. May be used to give further detail on the code or to remove an obsolete item.
    							
     * 
     * @param codeInfoGroup
     */
    public void setCodeInfoGroup(CodeInfoGroup codeInfoGroup) {
        this.codeInfoGroup = codeInfoGroup;
    }

    /** 
     * Get the 'ContentData' attribute value. Vendor-specific format that contains the content data for the multimedia object.  
     * 
     * @return value
     */
    public String getContentData() {
        return contentData;
    }

    /** 
     * Set the 'ContentData' attribute value. Vendor-specific format that contains the content data for the multimedia object.  
     * 
     * @param contentData
     */
    public void setContentData(String contentData) {
        this.contentData = contentData;
    }

    /** 
     * Get the 'Description' attribute value. A short description of the multimedia object.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' attribute value. A short description of the multimedia object.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'PictureCategoryCode' attribute value. A code defining the type of picture (e.g. Exterior, Lobby, Reception area, RoomTypes, Facilities, Dining areas, Meeting Rooms, Logo). Refer to OTA Code List Picture Category Code (PIC).
     * 
     * @return value
     */
    public String getPictureCategoryCode() {
        return pictureCategoryCode;
    }

    /** 
     * Set the 'PictureCategoryCode' attribute value. A code defining the type of picture (e.g. Exterior, Lobby, Reception area, RoomTypes, Facilities, Dining areas, Meeting Rooms, Logo). Refer to OTA Code List Picture Category Code (PIC).
     * 
     * @param pictureCategoryCode
     */
    public void setPictureCategoryCode(String pictureCategoryCode) {
        this.pictureCategoryCode = pictureCategoryCode;
    }

    /** 
     * Get the 'Version' attribute value. The version of the multimedia object. 
     * 
     * @return value
     */
    public String getVersion() {
        return version;
    }

    /** 
     * Set the 'Version' attribute value. The version of the multimedia object. 
     * 
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /** 
     * Get the 'ContentTitle' attribute value. The title for the multimedia object. 
     * 
     * @return value
     */
    public String getContentTitle() {
        return contentTitle;
    }

    /** 
     * Set the 'ContentTitle' attribute value. The title for the multimedia object. 
     * 
     * @param contentTitle
     */
    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }

    /** 
     * Get the 'ContentCaption' attribute value. The caption to be published with the multimedia file. 
     * 
     * @return value
     */
    public String getContentCaption() {
        return contentCaption;
    }

    /** 
     * Set the 'ContentCaption' attribute value. The caption to be published with the multimedia file. 
     * 
     * @param contentCaption
     */
    public void setContentCaption(String contentCaption) {
        this.contentCaption = contentCaption;
    }

    /** 
     * Get the 'CopyrightNotice' attribute value. The information describing the copyright notice for the multimedia object at a hotel facility. If this field is filled in, this copyright notice must be printed with the multimedia object.
     * 
     * @return value
     */
    public String getCopyrightNotice() {
        return copyrightNotice;
    }

    /** 
     * Set the 'CopyrightNotice' attribute value. The information describing the copyright notice for the multimedia object at a hotel facility. If this field is filled in, this copyright notice must be printed with the multimedia object.
     * 
     * @param copyrightNotice
     */
    public void setCopyrightNotice(String copyrightNotice) {
        this.copyrightNotice = copyrightNotice;
    }

    /** 
     * Get the 'FileName' attribute value. Specifies the name of the file being sent.
     * 
     * @return value
     */
    public String getFileName() {
        return fileName;
    }

    /** 
     * Set the 'FileName' attribute value. Specifies the name of the file being sent.
     * 
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /** 
     * Get the 'FileSize' attribute value. The size of the file sent, in bytes.  This may be used to validate that the received file is the correct size.
     * 
     * @return value
     */
    public String getFileSize() {
        return fileSize;
    }

    /** 
     * Set the 'FileSize' attribute value. The size of the file sent, in bytes.  This may be used to validate that the received file is the correct size.
     * 
     * @param fileSize
     */
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    /** 
     * Get the 'MultimediaObjectHeight' attribute value. The height of the image.
     * 
     * @return value
     */
    public String getMultimediaObjectHeight() {
        return multimediaObjectHeight;
    }

    /** 
     * Set the 'MultimediaObjectHeight' attribute value. The height of the image.
     * 
     * @param multimediaObjectHeight
     */
    public void setMultimediaObjectHeight(String multimediaObjectHeight) {
        this.multimediaObjectHeight = multimediaObjectHeight;
    }

    /** 
     * Get the 'MultimediaObjectWidth' attribute value. The width of the image.
     * 
     * @return value
     */
    public String getMultimediaObjectWidth() {
        return multimediaObjectWidth;
    }

    /** 
     * Set the 'MultimediaObjectWidth' attribute value. The width of the image.
     * 
     * @param multimediaObjectWidth
     */
    public void setMultimediaObjectWidth(String multimediaObjectWidth) {
        this.multimediaObjectWidth = multimediaObjectWidth;
    }

    /** 
     * Get the 'UnitOfMeasureCode' attribute value. The unit of measure for the multimedia object (e.g., inches, pixels, centimeters). Refer to OTA Code List Unit of Measure Code (UOM).
     * 
     * @return value
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /** 
     * Set the 'UnitOfMeasureCode' attribute value. The unit of measure for the multimedia object (e.g., inches, pixels, centimeters). Refer to OTA Code List Unit of Measure Code (UOM).
     * 
     * @param unitOfMeasureCode
     */
    public void setUnitOfMeasureCode(String unitOfMeasureCode) {
        this.unitOfMeasureCode = unitOfMeasureCode;
    }

    /** 
     * Get the 'ContentID' attribute value. The content ID of a file attachment with the prefix 'cid:'. The value of this can be used to retrieve the corresponding attachment by the receiving system.
     * 
     * @return value
     */
    public String getContentID() {
        return contentID;
    }

    /** 
     * Set the 'ContentID' attribute value. The content ID of a file attachment with the prefix 'cid:'. The value of this can be used to retrieve the corresponding attachment by the receiving system.
     * 
     * @param contentID
     */
    public void setContentID(String contentID) {
        this.contentID = contentID;
    }

    /** 
     * Get the 'ContentCode' attribute value. Description of the multimedia object or attached file contents. Refer to OTA Code List Content Code (CTT).
     * 
     * @return value
     */
    public String getContentCode() {
        return contentCode;
    }

    /** 
     * Set the 'ContentCode' attribute value. Description of the multimedia object or attached file contents. Refer to OTA Code List Content Code (CTT).
     * 
     * @param contentCode
     */
    public void setContentCode(String contentCode) {
        this.contentCode = contentCode;
    }

    /** 
     * Get the 'ContentFormatCode' attribute value. The specific file format of the multimedia object or attached file (e.g., mpeg, jpg, gif). Refer to OTA Code List Content Format Code (CFC).
     * 
     * @return value
     */
    public String getContentFormatCode() {
        return contentFormatCode;
    }

    /** 
     * Set the 'ContentFormatCode' attribute value. The specific file format of the multimedia object or attached file (e.g., mpeg, jpg, gif). Refer to OTA Code List Content Format Code (CFC).
     * 
     * @param contentFormatCode
     */
    public void setContentFormatCode(String contentFormatCode) {
        this.contentFormatCode = contentFormatCode;
    }

    /** 
     * Get the 'RecordID' attribute value. Uniquely identifies this file in the message.
     * 
     * @return value
     */
    public String getRecordID() {
        return recordID;
    }

    /** 
     * Set the 'RecordID' attribute value. Uniquely identifies this file in the message.
     * 
     * @param recordID
     */
    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }
}
