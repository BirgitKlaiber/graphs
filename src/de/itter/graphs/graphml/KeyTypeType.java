//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.08.02 um 03:51:44 AM CEST 
//


package de.itter.graphs.graphml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r key.type.type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="key.type.type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="int"/>
 *     &lt;enumeration value="long"/>
 *     &lt;enumeration value="float"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="string"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "key.type.type")
@XmlEnum
public enum KeyTypeType {

    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("int")
    INT("int"),
    @XmlEnumValue("long")
    LONG("long"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("string")
    STRING("string");
    private final String value;

    KeyTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeyTypeType fromValue(String v) {
        for (KeyTypeType c: KeyTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
