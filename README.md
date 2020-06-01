# Some terminology

Rule Base : It contains the information about the resources where rules are found

Facts: It is the Data that is input to the Rules.

Working Memory: Place where facts are stored. Facts can be inserted/updated/removed from working memory.

Inference Engine: It matches the Rules in Rule Base with the Facts in Working Memory . Drool uses Rete Algorithm to perform this matching.

Salience: Salience is used to define the priority of the rules in the order they are fired.

Stateful: Any change in the facts in working memory will trigger all the rules associated with that particular fact.

Stateless: Any changes in the facts while executing rules is not made aware to the rule engine and will not trigger all rules by default.

Forward Chaining: Forward chaining is data-driven. Facts in working memory is applied to rules, which results in one or more rules being concurrently true and scheduled for execution by the Agenda.

Backward chaining: Backward Chaining is goal-driven. means we start with a result which the engine tries to satisfy. There can be more than 1 possible solution in case of backward chaining.

![Architecture](https://github.cloud.capitalone.com/lym752/drools/blob/master/images/architecture%20high%20level.png)

This Project is divided into 3 sessions:

- Chapter 1 -> https://github.cloud.capitalone.com/lym752/drools/tree/master/droolbasicUnderstanding
- Chapter 2 -> https://github.cloud.capitalone.com/lym752/drools/tree/master/droolkieSessionUnderstanding
- Chapter 3 -> https://github.cloud.capitalone.com/lym752/drools/tree/master/droolDecisionTable
