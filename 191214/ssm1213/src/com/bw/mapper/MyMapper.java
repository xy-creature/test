package com.bw.mapper;

import java.util.List;

import com.bw.pojo.City;
import com.bw.pojo.Country;
import com.bw.pojo.QueryModel;

public interface MyMapper {
	List<City> allCity();
	int deleteCity(long id);
	List<Country> allCountry();
	int saveCity(City city);
	City getCityById(long id);
	int updateCity(City city);
	List<City> queryCity(QueryModel m);
	int delete(int[] array);
	List<Country> allCountry2();
	List<City> getCityByCountry(long id);
}
