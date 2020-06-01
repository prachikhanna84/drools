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
