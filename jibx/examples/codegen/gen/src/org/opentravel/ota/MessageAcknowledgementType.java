
package org.opentravel.ota;

/** 
 * Information to acknowledge the receipt of a message.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MessageAcknowledgementType">
 *   &lt;xs:sequence>
 *     &lt;xs:choice>
 *       &lt;xs:sequence>
 *         &lt;xs:element type="ns:SuccessType" name="Success"/>
 *         &lt;xs:element type="ns:WarningsType" name="Warnings" minOccurs="0"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:element type="ns:ErrorsType" name="Errors"/>
 *     &lt;/xs:choice>
 *     &lt;xs:element type="ns:UniqueID_Type" name="UniqueID" minOccurs="0"/>
 *     &lt;xs:element ref="ns:TPA_Extensions" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:OTA_PayloadStdAttributes"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MessageAcknowledgementType
{
    private int choiceSelect = -1;
    private static final int SUCCESS_CHOICE = 0;
    private static final int ERRORS_CHOICE = 1;
    private SuccessType success;
    private WarningsType warnings;
    private ErrorsType errors;
    private UniqueIDType uniqueID;
    private TPAExtensionsType TPAExtensions;
    private OTAPayloadStdAttributes OTAPayloadStdAttributes;

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if Success is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifSuccess() {
        return choiceSelect == SUCCESS_CHOICE;
    }

    /** 
     * Get the 'Success' element value. The presence of the empty Success element explicitly indicates that the OTA versioned message succeeded. 
     * 
     * @return value
     */
    public SuccessType getSuccess() {
        return success;
    }

    /** 
     * Set the 'Success' element value. The presence of the empty Success element explicitly indicates that the OTA versioned message succeeded. 
     * 
     * @param success
     */
    public void setSuccess(SuccessType success) {
        setChoiceSelect(SUCCESS_CHOICE);
        this.success = success;
    }

    /** 
     * Get the 'Warnings' element value. Used in conjunction with the Success element to define one or more business errors.
     * 
     * @return value
     */
    public WarningsType getWarnings() {
        return warnings;
    }

    /** 
     * Set the 'Warnings' element value. Used in conjunction with the Success element to define one or more business errors.
     * 
     * @param warnings
     */
    public void setWarnings(WarningsType warnings) {
        setChoiceSelect(SUCCESS_CHOICE);
        this.warnings = warnings;
    }

    /** 
     * Check if Errors is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifErrors() {
        return choiceSelect == ERRORS_CHOICE;
    }

    /** 
     * Get the 'Errors' element value. Errors is returned if the request was unable to be processed.
     * 
     * @return value
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /** 
     * Set the 'Errors' element value. Errors is returned if the request was unable to be processed.
     * 
     * @param errors
     */
    public void setErrors(ErrorsType errors) {
        setChoiceSelect(ERRORS_CHOICE);
        this.errors = errors;
    }

    /** 
     * Get the 'UniqueID' element value. May be used to return the unique id from the request message.
     * 
     * @return value
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /** 
     * Set the 'UniqueID' element value. May be used to return the unique id from the request message.
     * 
     * @param uniqueID
     */
    public void setUniqueID(UniqueIDType uniqueID) {
        this.uniqueID = uniqueID;
    }

    /** 
     * Get the 'TPA_Extensions' element value.
     * 
     * @return value
     */
    public TPAExtensionsType getTPAExtensions() {
        return TPAExtensions;
    }

    /** 
     * Set the 'TPA_Extensions' element value.
     * 
     * @param TPAExtensions
     */
    public void setTPAExtensions(TPAExtensionsType TPAExtensions) {
        this.TPAExtensions = TPAExtensions;
    }

    /** 
     * Get the 'OTA_PayloadStdAttributes' attributeGroup value.
     * 
     * @return value
     */
    public OTAPayloadStdAttributes getOTAPayloadStdAttributes() {
        return OTAPayloadStdAttributes;
    }

    /** 
     * Set the 'OTA_PayloadStdAttributes' attributeGroup value.
     * 
     * @param OTAPayloadStdAttributes
     */
    public void setOTAPayloadStdAttributes(
            OTAPayloadStdAttributes OTAPayloadStdAttributes) {
        this.OTAPayloadStdAttributes = OTAPayloadStdAttributes;
    }
}
