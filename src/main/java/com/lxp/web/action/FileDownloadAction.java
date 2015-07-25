package com.lxp.web.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @Package com.lxp.web.action
 * @Class com.lxp.web.action.FileDownloadAction
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月25日 上午9:19:14
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class FileDownloadAction extends ActionSupport {

	private String fileName;
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public InputStream getInputStream() {
		String filePath;
		try {
			filePath = ServletActionContext.getServletContext().getRealPath("/download/"+fileName);
		
			return new FileInputStream(filePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 展示下载页
	 */
	public String showDownload() {
		return SUCCESS;
	}
	
	/**
	 * 下载文件
	 */
	public String download() {
		return SUCCESS;
	}
}
