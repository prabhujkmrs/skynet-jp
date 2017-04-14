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
In a Service Oriented Architecture (SOA), a software application is designed by defining components, which provides services to other components in other applications. Typically, those services are available to be consumed using a network through some specifics communication protocols. A service is a self-contained component, which offer a specific functionality and could be designed to perform one or more operations. This make possible code reuse just by changing the way the service inter-operates with other services.

Following the SOA approach, the solution for the assignment is designed to provide the service Calculator which has a method to calculate the two-way price for the instrument using the latest market value.The implementation of the solution is written in JAVA language using Apache MAVEN as a software project management tool and Spring Framework.

Below are some of the good practices to ensure high throughput of your system.However, some of these are out of scope of this solution.

1. Classloading is a sequential process that involves IO to disk. Make sure all the classes for your main transaction flows are loaded upfront and that they never get evicted from the perm generation
2. Model the business domain and ensure all your algorithms are O(1) or at least O(log n)
3. OS tuning, appropriate hardware,software and device driver tuning.
4. Keep all in memory
5. Keep the systemunderutilized
6. Keep reads sequential.
7. Batching writes
8. use caching algorithms
9. non blocking
10. asynchronous as much as possible

For this solution i have used ConcurrentHashMap to hold the data in memory as I/O operation will kill the latency. ConcurrentHashMap is a non blocking datastructure that supports full concurrency of retrievals and adjustable expected concurrency for updates.

The implementation of the service is built as java library as a jar artifact named vmap-calculator-0.0.1-SNAPSHOT.jar. Because there are no explicit integration requirements, the simplest decision was to create a java library, which could be integrated in all the JAVA technologies.

Assumptions & Exceptions
========================
1. One market will contribute to one instrument
2. One instrument will get updates from many markets
3. Spring is mainly used as an object container to inject the TWOWAYPRICE/MARKET/INSTRUMENT information which would be used by the application and to configure the data for the unit tests.
4. Using HashMap as the data structure for storing the Market prices will ensure that we always have the latest value for any Market at that given point in time.

Try it Yourself
===============

The source code was built as an intellij project with apache maven as the build manager tool. To compile the source, download vmap-calculator to your desktop and import the project using an IDE(intellij,eclipse etc). Alternatively, you can also run application in the console using the below command, which would compile and execute the unit test.

 maven clean install
