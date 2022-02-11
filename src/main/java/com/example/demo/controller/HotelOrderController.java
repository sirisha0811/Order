 package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.HotelOrder;
import com.example.demo.service.HotelOrderService;


@RestController
public class HotelOrderController {

	@Autowired
	HotelOrderService hotelorderService;
	@GetMapping("/hotelorder")
	Iterable<HotelOrder> getHotelOrders() {
	      return hotelorderService.getHotelOrders();
	 }
	@GetMapping("/hotelorder/{id}")
	Optional<HotelOrder> getHotelOrders(@PathVariable("id")Integer id){
		return hotelorderService.gethotelorder(id);
	}

	@PostMapping("/hotelorder")
	@Transactional
	@ResponseStatus(code = HttpStatus.CREATED)
	void createHotelOrder(@RequestBody @Valid HotelOrder hotelorder) {
		hotelorderService.saveHotelOrder(hotelorder);
	}
}