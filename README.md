# spring-boot-with-kafka
Spring Boot with kafka

```https://cwiki.apache.org/confluence/display/KAFKA/KIP-975%3A+Docker+Image+for+Apache+Kafka```

```https://medium.com/@jackie.trang18/kafka-for-dummies-and-with-practical-failure-experiments-4a1ac6cd78d0```


**Replication Factor** : The topic is split into three partitions, evenly distributed into three brokers. Each partition has two other replicas, also distributed across all brokers, but this is from a different setting called replication factor.
![img.png](img.png)

**Offset** : Each message in a topic has a unique identifier called offset.

**Kafka Consumer Group** : 
Scenerio 1 : A consumer group contains only one consumer
    If a sender sents the 3 messages to kafka Topic, all the 3 messages proceed by only one consumer.
Scenerio 2 : A cosumer group contains multiple consumers here in case 3 consumers.
    If a sender sents the 3 messages to kafka topic, all the 3 messages proceed by three consumers where each consumer can process only one messgage.

for more details read below article.
```https://medium.com/javarevisited/kafka-partitions-and-consumer-groups-in-6-mins-9e0e336c6c00```

![img_1.png](img_1.png)