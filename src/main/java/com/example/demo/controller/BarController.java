package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Movie;
import com.example.demo.service.MovieService;

@RestController
public class BarController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping("/data")
	public List<Movie> getAll() {
		System.out.println("/data request in bar");
		return movieService.getAllMovies();
	}
}
