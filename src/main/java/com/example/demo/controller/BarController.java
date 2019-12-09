package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Movie;
import com.example.demo.service.MovieService;

@RestController
public class BarController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping("/data")
	public List<Movie> getAll(@RequestHeader HttpHeaders headers) {
		System.out.println("/data request in bar");
		System.out.println(headers);
		return movieService.getAllMovies();
	}
}
