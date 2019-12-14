package com.bw.service;

import java.util.List;

import com.bw.pojo.City;
import com.bw.pojo.Country;
import com.bw.pojo.QueryModel;

public interface MyService {
	List<City> allCity();
	int deleteCity(long id);
	List<Country> allCountry();
	int saveCity(City city);
	City getCityById(long id);
	int updateCity(City city);
	List<City> queryCity(QueryModel m);
	List<City> queryCityPage(QueryModel m);
	int delete(int[] array);
	List<Country> allCountry2();
	List<City> getCityByCountry(long id);
}
