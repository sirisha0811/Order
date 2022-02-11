package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.HotelOrder;



@Repository
public interface HotelOrderRepository extends CrudRepository<HotelOrder, Integer> {

}