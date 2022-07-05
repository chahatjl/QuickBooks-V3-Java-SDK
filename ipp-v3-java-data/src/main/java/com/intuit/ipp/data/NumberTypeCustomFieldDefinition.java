//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.28 at 02:49:33 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: Provides for strong-typing of the NumberType CustomField.
 * 			
 * 
 * <p>Java class for NumberTypeCustomFieldDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberTypeCustomFieldDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}CustomFieldDefinition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberTypeCustomFieldDefinition", propOrder = {
    "defaultValue",
    "minValue",
    "maxValue"
})
public class NumberTypeCustomFieldDefinition
    extends CustomFieldDefinition
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DefaultValue")
    protected BigDecimal defaultValue;
    @XmlElement(name = "MinValue")
    protected BigDecimal minValue;
    @XmlElement(name = "MaxValue")
    protected BigDecimal maxValue;

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultValue(BigDecimal value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinValue(BigDecimal value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxValue(BigDecimal value) {
        this.maxValue = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final NumberTypeCustomFieldDefinition that = ((NumberTypeCustomFieldDefinition) object);
        {
            BigDecimal lhsDefaultValue;
            lhsDefaultValue = this.getDefaultValue();
            BigDecimal rhsDefaultValue;
            rhsDefaultValue = that.getDefaultValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultValue", lhsDefaultValue), LocatorUtils.property(thatLocator, "defaultValue", rhsDefaultValue), lhsDefaultValue, rhsDefaultValue, (this.defaultValue!= null), (that.defaultValue!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMinValue;
            lhsMinValue = this.getMinValue();
            BigDecimal rhsMinValue;
            rhsMinValue = that.getMinValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minValue", lhsMinValue), LocatorUtils.property(thatLocator, "minValue", rhsMinValue), lhsMinValue, rhsMinValue, (this.minValue!= null), (that.minValue!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMaxValue;
            lhsMaxValue = this.getMaxValue();
            BigDecimal rhsMaxValue;
            rhsMaxValue = that.getMaxValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxValue", lhsMaxValue), LocatorUtils.property(thatLocator, "maxValue", rhsMaxValue), lhsMaxValue, rhsMaxValue, (this.maxValue!= null), (that.maxValue!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            BigDecimal theDefaultValue;
            theDefaultValue = this.getDefaultValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultValue", theDefaultValue), currentHashCode, theDefaultValue, (this.defaultValue!= null));
        }
        {
            BigDecimal theMinValue;
            theMinValue = this.getMinValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minValue", theMinValue), currentHashCode, theMinValue, (this.minValue!= null));
        }
        {
            BigDecimal theMaxValue;
            theMaxValue = this.getMaxValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxValue", theMaxValue), currentHashCode, theMaxValue, (this.maxValue!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
