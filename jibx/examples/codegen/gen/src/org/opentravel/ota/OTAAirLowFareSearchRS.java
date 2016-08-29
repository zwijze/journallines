
package org.opentravel.ota;

/** 
 * 
 The Low Fare Search Response message contains a number of 'Priced Itinerary' options. Each includes:
 - A set of available flights matching the client's request.
 - Pricing information including taxes and full fare breakdown for each passenger type
 - Ticketing information
 - Fare Basis Codes and the information necessary to make a rules entry.
 This message contains similar information to a standard airline CRS or GDS Low Fare Search Response message.

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OTA_AirLowFareSearchRS">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:choice>
 *         &lt;xs:sequence>
 *           &lt;xs:element type="ns:SuccessType" name="Success"/>
 *           &lt;xs:element type="ns:WarningsType" name="Warnings" minOccurs="0"/>
 *           &lt;xs:element type="ns:PricedItinerariesType" name="PricedItineraries"/>
 *         &lt;/xs:sequence>
 *         &lt;xs:element type="ns:ErrorsType" name="Errors"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:sequence>
 *     &lt;xs:attributeGroup ref="ns:OTA_PayloadStdAttributes"/>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class OTAAirLowFareSearchRS
{
    private int choiceSelect = -1;
    private static final int SUCCESS_CHOICE = 0;
    private static final int ERRORS_CHOICE = 1;
    private SuccessType success;
    private WarningsType warnings;
    private PricedItinerariesType pricedItineraries;
    private ErrorsType errors;
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
     * Get the 'Success' element value. Success
    Standard way to indicate successful processing of an OTA message. Returning an empty element of this type indicates success.
     * 
     * @return value
     */
    public SuccessType getSuccess() {
        return success;
    }

    /** 
     * Set the 'Success' element value. Success
    Standard way to indicate successful processing of an OTA message. Returning an empty element of this type indicates success.
     * 
     * @param success
     */
    public void setSuccess(SuccessType success) {
        setChoiceSelect(SUCCESS_CHOICE);
        this.success = success;
    }

    /** 
     * Get the 'Warnings' element value.  Standard way to indicate successful processing of an OTA message, but one in which warnings are generated.

     * 
     * @return value
     */
    public WarningsType getWarnings() {
        return warnings;
    }

    /** 
     * Set the 'Warnings' element value.  Standard way to indicate successful processing of an OTA message, but one in which warnings are generated.

     * 
     * @param warnings
     */
    public void setWarnings(WarningsType warnings) {
        setChoiceSelect(SUCCESS_CHOICE);
        this.warnings = warnings;
    }

    /** 
     * Get the 'PricedItineraries' element value. Successfull Low Fare priced itineraries in response to a Low Fare Search request.
     * 
     * @return value
     */
    public PricedItinerariesType getPricedItineraries() {
        return pricedItineraries;
    }

    /** 
     * Set the 'PricedItineraries' element value. Successfull Low Fare priced itineraries in response to a Low Fare Search request.
     * 
     * @param pricedItineraries
     */
    public void setPricedItineraries(PricedItinerariesType pricedItineraries) {
        setChoiceSelect(SUCCESS_CHOICE);
        this.pricedItineraries = pricedItineraries;
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
     * Get the 'Errors' element value.  A collection of errors that occurred during the processing of a message.
     * 
     * @return value
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /** 
     * Set the 'Errors' element value.  A collection of errors that occurred during the processing of a message.
     * 
     * @param errors
     */
    public void setErrors(ErrorsType errors) {
        setChoiceSelect(ERRORS_CHOICE);
        this.errors = errors;
    }

    /** 
     * Get the 'OTA_PayloadStdAttributes' attributeGroup value.  The OTA_PayloadStdAttributes defines the standard attributes that appear on the root element for all OTA payloads.
     * 
     * @return value
     */
    public OTAPayloadStdAttributes getOTAPayloadStdAttributes() {
        return OTAPayloadStdAttributes;
    }

    /** 
     * Set the 'OTA_PayloadStdAttributes' attributeGroup value.  The OTA_PayloadStdAttributes defines the standard attributes that appear on the root element for all OTA payloads.
     * 
     * @param OTAPayloadStdAttributes
     */
    public void setOTAPayloadStdAttributes(
            OTAPayloadStdAttributes OTAPayloadStdAttributes) {
        this.OTAPayloadStdAttributes = OTAPayloadStdAttributes;
    }
}
