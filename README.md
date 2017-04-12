VWAP Calculator
===============
VWAP Calculator is a small application to calcute the two-way-price for an instrument which has got the latest maket update.

Description
============
Provide a working source code for calculating two-way-price(BID,OFFER) for the instrument that had got the latest market update. On a market update the market along with the instrument,bid-amount,bid-price,offer-amount,offer-price is provdided.For the instrument provided,  other markets latest bid-amount,bid-price,offer-amount,offer-price is taken and the two-way-price is calculated as below.
Bid = Sum(Market Bid Price * Market Bid Amount)/ Sum(Market Bid Amount)
Offer = Sum(Market Offer Price * Market Offer Amount)/ Sum(Market Offer Amount)

Architecture
============
In a Service Oriented Architecture (SOA), a software application is designed by defining components, which provides services to other components in other applications. Typically, those services are available to be consumed using a network through some specifics communication protocols. By definition a service is a self-contained component, which offer a specific functionality and could be designed to perform one or more operations. This make possible reuse code just changing the way the service interoperates with other services.

Following the SOA approach, the solution for the assignment is designed to provide the service Calculator which has a method to calculate the applyMarketValue.The implementation of the solution is written in JAVA language using Apache MAVEN as a software project management tool and Spring Framework.

The implementation of the service is built as java library as a jar artifact named vmap-calculator-0.0.1-SNAPSHOT.jar. Because there are no explicit integration requirements, the simplest decision was to create a java library, which could be integrated in all the JAVA technologies.

Assumptions & Exceptions
========================
+One market will contribute to one instrument
+One instrument will get updates from many markets
+The inputs will be from the spring xml context, only to retain the structure provided sample objects are created and used through the   application context, there by bypassing validations to the datascope.
+As HashMap is used for storing the Market prices, it will always have the latest value for any Market at that given point in time.

To run this application, please execute maven clean install
