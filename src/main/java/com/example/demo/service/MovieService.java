package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.Movie;
import com.example.demo.data.MoviesRepository;

@Service
public class MovieService {
	
	@Autowired
	private MoviesRepository moviesRepository;
	
	public List<Movie> getAllMovies(){
		 return moviesRepository.findAll();
	}
}
