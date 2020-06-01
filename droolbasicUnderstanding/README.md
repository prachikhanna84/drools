# Understanding Drools with Simple Examples

Drools is a Open source, Business Logic Integration Platform, written in Java. Drools help us seperate business logic and data when writting code.

Drools consists of two major parts:

1) Create DRL (.drl) files, build package and place them into Rule Base.
2) Facts in Working memory and activate/fire rules

 ![droolflow](https://github.cloud.capitalone.com/lym752/drools/blob/master/images/drools%20Flow.png)
 
Maven Dependency to be added:

        <dependency>
            <groupId>org.drools</groupId>
            <artifactId>drools-compiler</artifactId>
            <version>6.0.1.Final</version>
        </dependency>

Customer POJO has below 4 field:

newCustomer
totalSpending
customerBirthDayToday
discount

Add DRL file under resources

![WorkingFlow](https://github.cloud.capitalone.com/lym752/drools/blob/master/images/rulesbasicunderstanding.png)

        
