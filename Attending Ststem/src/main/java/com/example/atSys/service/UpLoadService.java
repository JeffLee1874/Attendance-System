package com.example.atSys.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

public interface UpLoadService {
	
	//上传excel文件
	public void upLoad(MultipartFile file,HttpServletRequest req, HttpServletResponse res) throws Exception;

}
