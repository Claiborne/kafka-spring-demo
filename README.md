```
bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties
kafka_2.13-3.2.0 % bin/kafka-console-consumer.sh --topic wikimedia_recent_change --from-beginning --bootstrap-server localhost:9092
```