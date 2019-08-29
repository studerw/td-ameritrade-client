## How to Implement an API Call

* I have a copy of the API. I cannot post it here for copyright reasons, but it can be requested via email
or found via TDA dev support possibly. Most of the return types are almost exact copies
of the new API here: [Restful API](https://developer.tdameritrade.com/).

* Each call in the API guide gives an example XML response and a table of the XML
schema type (e.g. what each field refers to and its general type).

* Take the example return XML and generate JAXB Pojo with the correct annotations.

* Modify the Pojo which means
  - rename from `amtd` to actual response name, delete the ObjectFactory and any other xml or xsd files not needed
  - extend from `BaseTda` class, determine the error code, check `responseStr` needed
  - modify String types to Java *Integer*, *BigDecimal*, *Double*, *Boolean* and *ZonedDateTime* if it makes sense.

* Create the call within `TdaHttpClient` using the required parameters at a minimum
and write an accompanying integration test to ensure the call is successful with at least my
individual account.

----

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

