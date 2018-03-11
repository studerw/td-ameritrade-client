From an XML response file, generate the XSD, and then the POJO:

Choose 'Global Elements, Local Types', Set Enumerations Limit to 0.

Delete generated ObjectFactory

Remove the various 'required' JAXB annotation properties.

Extends BaseTda.class

Might have to change the complexType -> Sequence (e.g OrderResponse:
  * remove minOccurs and maxOccurs
  * change sequence to choice
  * add a minOccurs=0|1 and maxOccurs=1 for each element

Change any Strings to correct Java types (Calendar, DateTime, Integer, BigDecimal, Boolean, etc);

