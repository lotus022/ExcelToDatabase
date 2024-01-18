package com.kb.group.service;

import java.util.List;

import com.kb.group.entity.User;

public interface IExcelDataService {

	List<User> getExcelDataAsList();
	int saveExcelData(List<User> invoices);
}