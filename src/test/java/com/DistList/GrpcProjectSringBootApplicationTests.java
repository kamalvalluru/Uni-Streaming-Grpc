package com.DistList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
//
//import com.example.service.EmployServiceGrpc;
//import com.example.service.EmployeRequest;
//import com.example.service.EmployeResponse;
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import net.devh.boot.grpc.client.inject.GrpcClient;

@SpringBootTest
class GrpcProjectSringBootApplicationTests {

//	@GrpcClient("EmployService")
//	private EmployServiceGrpc.EmployServiceBlockingStub blockingStub;

	@Test
	void test() {
//		EmployeRequest employeRequest = EmployeRequest.newBuilder().setId(12).setName("virat").build();
//
//		EmployeResponse employeResponse = blockingStub.getEmployId(employeRequest);
//		System.out.println("=============");
//		// Print the response
//		System.out.println("Response: " + employeResponse.getMessage());

	}

//	public static void main(String[] args) 
//	{
//		
//		String address = "10.0.7.7";
//		ManagedChannel channel = ManagedChannelBuilder.forAddress(address, 9090)
//				.usePlaintext()
//				.build();
//		EmployServiceGrpc.EmployServiceBlockingStub blockingStub = EmployServiceGrpc.newBlockingStub(channel);
//		
//		GrpcProjectSringBootApplicationTests GrpcProjectSringBootApplicationTests = new GrpcProjectSringBootApplicationTests();
//		GrpcProjectSringBootApplicationTests.test();
//		// Create a gRPC client stub
//	
//
//		channel.shutdown();
//	}

}
