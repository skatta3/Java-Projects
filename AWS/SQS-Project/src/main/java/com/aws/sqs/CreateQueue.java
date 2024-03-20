package com.aws.sqs;

import java.util.Date;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.AmazonSQSException;
import com.amazonaws.services.sqs.model.CreateQueueRequest;
import com.amazonaws.services.sqs.model.ListQueuesResult;

public class CreateQueue {
	
    private static final String QUEUE_NAME = "testQueue3Aug21" + new Date().getTime();

	public static void main(String[] args) {
		AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
		CreateQueueRequest create_request = new CreateQueueRequest(QUEUE_NAME)
				.addAttributesEntry("DelaySeconds", "60")
				.addAttributesEntry("MessageRetentionPeriod", "86400");
		try {
			sqs.createQueue(create_request);
		} catch (AmazonSQSException e) {
			if (!e.getErrorCode().equals("QueueAlreadyExists")) {
				throw e;
			}
		}
		
	    // Get the URL for a queue
        String queue_url = sqs.getQueueUrl(QUEUE_NAME).getQueueUrl();

      System.out.println(queue_url);

//        // Delete the Queue
//        sqs.deleteQueue(queue_url);
//
//        sqs.createQueue("Queue1" + new Date().getTime());
//        sqs.createQueue("Queue2" + new Date().getTime());
//        sqs.createQueue("MyQueue" + new Date().getTime());

        // List your queues
        ListQueuesResult lq_result = sqs.listQueues();
        System.out.println("Your SQS Queue URLs:");
        for (String url : lq_result.getQueueUrls()) {
            System.out.println(url);
        }

	}
}
