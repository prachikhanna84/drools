Maven Dependencies to be added for Decision Table
        
        <!--        When you have complex rules and wanted to add kie session add below dependencies-->
        <dependency>
            <groupId>org.kie</groupId>
            <artifactId>kie-api</artifactId>
            <!--            <version>6.2.0.Final</version>-->
            <version>6.2.0.Final</version>
        </dependency>
        <dependency>
            <groupId>org.drools</groupId>
            <artifactId>drools-core</artifactId>
            <version>6.2.0.Final</version>
        </dependency>
        <!--        For simple rule can work with below depenedency alone-->
        <dependency>
            <groupId>org.drools</groupId>
            <artifactId>drools-compiler</artifactId>
            <version>6.2.0.Final</version>
        </dependency>
        <!--        Below dependency is for decision table-->
        <dependency>
            <groupId>org.drools</groupId>
            <artifactId>drools-decisiontables</artifactId>
            <version>6.2.0.Final</version>
        </dependency>
        
        
 Payment Pojo consist of two properties:
 channel
 discount
 
 Decision Table set discount to 15% when channel type is google pay. It set discount to 20% when channel type is apple pay 
 Column B is the Condition where channel Types values are paased
 
![DecisionTable](https://github.cloud.capitalone.com/lym752/drools/blob/master/images/Screen%20Shot%202020-06-01%20at%203.55.57%20PM.png)
