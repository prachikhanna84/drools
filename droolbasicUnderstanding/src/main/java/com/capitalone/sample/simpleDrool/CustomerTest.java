package com.capitalone.sample.simpleDrool;

import org.drools.compiler.compiler.DroolsParserException;
import org.drools.compiler.compiler.PackageBuilder;
import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import org.drools.core.WorkingMemory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class CustomerTest {

    public static void main(String args[]) throws IOException, DroolsParserException {

        CustomerTest paymentTest = new CustomerTest();
        paymentTest.executeDrool();

    }

    public void executeDrool() throws IOException, DroolsParserException {

        PackageBuilder builder = new PackageBuilder();
        String ruleFile = "/discount.drl";
        InputStream inputStream = getClass().getResourceAsStream(ruleFile);

        Reader ruleReader = new InputStreamReader(inputStream);
        builder.addPackageFromDrl(ruleReader);
        org.drools.core.rule.Package rulePackage = builder.getPackage();
        RuleBase ruleBase = RuleBaseFactory.newRuleBase();
        ruleBase.addPackage(rulePackage);

        WorkingMemory workingMemory = ruleBase.newStatefulSession();

        Customer customer = new Customer();

        customer.setCustomerBirthDayToday(true);
        customer.setNewCustomer(true);
        customer.setTotalSpending(200);
        workingMemory.insert(customer);

        workingMemory.fireAllRules();
        System.out.println("Discount is " + customer.getDiscount());

    }

}
