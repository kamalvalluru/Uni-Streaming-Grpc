package com.spring.grpc.server;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.service.EmployServiceGrpc.EmployServiceImplBase;
import com.spring.grpc.dto.Employ;
import com.spring.grpc.repository.EmployRepo;
import com.example.service.EmployeRequest;
import com.example.service.EmployeResponse;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class EmployService extends EmployServiceImplBase
{

	@Autowired
	private  EmployRepo repo;
	@Override
	public void getEmployId(EmployeRequest request, StreamObserver<EmployeResponse> responseObserver)
	{
		EmployeResponse employeResponse=EmployeResponse.newBuilder()
				.setMessage("employee detaikls saved of id"+" "+ request.getId())
				.build();
		
		Employ employ=new Employ();
		employ.setId(request.getId());
		employ.setName(request.getName());
		repo.save(employ);
		System.out.println(employ.toString());
		responseObserver.onNext(employeResponse);
		responseObserver.onCompleted();
		
		
		
	}
	

}
