package com.spring.grpc.server;

import io.grpc.ServerBuilder;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.grpc.dto.Employ;
import com.spring.grpc.repository.EmployRepo;

import io.grpc.*;

public class ServerBody 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Server server=ServerBuilder.
				forPort(8082).
				addService(new EmployService()).build();
		server.start();
		System.out.println("Server is Strated");
		server.awaitTermination();
		
		
	}

}
