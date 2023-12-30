package com.chm209.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@ToString
@Getter
public class SampleHotel {
	private Chef chef;
	public SampleHotel(Chef chef) {
		this.chef = chef;
	}

}
