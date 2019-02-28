package com.te.controller;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;
@Controller
@RequestMapping(value = "/file")
public class FileSystemController{
	@RequestMapping(value = "/sucsuss")
	public void su()
	{
		System.out.println("chenggong");
	}
	@RequestMapping(value = "/insert")
    public String insertFile(@RequestParam("file") MultipartFile file, HttpServletRequest request, RedirectAttributesModelMap modelMap) throws 
    IllegalStateException, IOException, ParseException {
        String pathName = request.getSession().getServletContext().getRealPath("/upload");
        String fileName = file.getOriginalFilename();
        File file2 = new File(pathName,fileName);
        if (!file2.exists()) {
			file2.mkdir();
		}
        file.transferTo(file2);
        return "redirect:/file/sucsuss";
	}
}