package com.kb.group.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kb.group.entity.User;
import com.kb.group.service.IExcelDataService;
import com.kb.group.service.IFileUploaderService;

@RestController
@RequestMapping("/")
public class MyController {

	@Autowired
	IFileUploaderService fileService;
	
	@Autowired
	IExcelDataService excelservice;

	@PostMapping("/uploadFile")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {

		fileService.uploadFile(file);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<String>("File Uploaded Seccessfully...", HttpStatus.OK); 
	}

	
	  @GetMapping("/saveData") 
	  public ResponseEntity<List<User>> saveExcelData() {
	  List<User> excelDataAsList = excelservice.getExcelDataAsList();
	  int noOfRecords = excelservice.saveExcelData(excelDataAsList);
	  System.out.println(noOfRecords);
	  return ResponseEntity.ok(excelDataAsList);
	  } 
	 
}