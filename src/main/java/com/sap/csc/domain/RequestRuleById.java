//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.05 at 10:02:27 AM IST 
//


package com.sap.csc.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestRuleById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestRuleById">
 *   &lt;complexContent>
 *     &lt;extension base="{}requestBase">
 *       &lt;sequence>
 *         &lt;element name="ruleId" type="{}requestedString" minOccurs="0"/>
 *         &lt;element name="extendedOptions" type="{}requestedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestRuleById", propOrder = {
    "ruleId",
    "extendedOptions"
})
public class RequestRuleById
    extends RequestBase
{

    protected RequestedString ruleId;
    protected RequestedString extendedOptions;

    /**
     * Gets the value of the ruleId property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedString }
     *     
     */
    public RequestedString getRuleId() {
        return ruleId;
    }

    /**
     * Sets the value of the ruleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedString }
     *     
     */
    public void setRuleId(RequestedString value) {
        this.ruleId = value;
    }

    /**
     * Gets the value of the extendedOptions property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedString }
     *     
     */
    public RequestedString getExtendedOptions() {
        return extendedOptions;
    }

    /**
     * Sets the value of the extendedOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedString }
     *     
     */
    public void setExtendedOptions(RequestedString value) {
        this.extendedOptions = value;
    }

}