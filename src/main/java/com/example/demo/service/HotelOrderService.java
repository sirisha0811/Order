package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HotelOrder;
import com.example.demo.repository.HotelOrderRepository;

@Service
public class HotelOrderService {

	@Autowired
	HotelOrderRepository hotelorderRepository;
	public Iterable<HotelOrder> getHotelOrders() {
		return hotelorderRepository.findAll();
	}

	public Optional<HotelOrder> gethotelorder(Integer id) {
		return hotelorderRepository.findById(id);
	}

	public void saveHotelOrder(@Valid HotelOrder hotelorder) {
		hotelorderRepository.save(hotelorder);
		
	}

}
