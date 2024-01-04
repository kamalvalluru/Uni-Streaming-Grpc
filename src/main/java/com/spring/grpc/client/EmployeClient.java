package com.spring.grpc.client;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.service.EmployServiceGrpc;
import com.example.service.EmployeRequest;
import com.example.service.EmployeResponse;
import com.spring.grpc.repository.EmployRepo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.devh.boot.grpc.client.inject.GrpcClient;

public class EmployeClient 
{
	@GrpcClient("EmployService")
	private static EmployServiceGrpc.EmployServiceBlockingStub blockingStub;
	
	@Autowired
	private EmployRepo employRepo;

public static void main(String[] args) 
{
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the Id of the Employ");
//		int id=scanner.nextInt();
//		System.out.println("Enter the Employ Name");
//		String name=scanner.next();
	String address ="localhost";
	ManagedChannel channel=ManagedChannelBuilder.forAddress(address, 8082)
			.usePlaintext()
			.build();
	
	EmployeRequest employeRequest = EmployeRequest.newBuilder()
			.setId(14)
			.setName("cdzac")
			.build();
	EmployeResponse employeResponse = EmployServiceGrpc
											.newBlockingStub(channel).getEmployId(employeRequest);

		System.out.println("=============");
		// Print the response
		System.out.println("Response: " + employeResponse.getMessage());
		System.out.println("===========");
		//System.out.println(employeRequest.getId());
}
	
}
