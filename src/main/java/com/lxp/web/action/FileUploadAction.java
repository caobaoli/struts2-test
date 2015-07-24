package com.lxp.web.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Package com.lxp.web.action
 * @Class com.lxp.web.action.FileUploadAction
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年7月24日 下午6:39:39
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class FileUploadAction extends ActionSupport {
	private String userName;
	private File userHead;
	private String userHeadContentType; //文件类型
	private String userHeadFileName;
	private String uploadFileDir; //文件保存相对路径
	
	
	
	
	public void setUploadFileDir(String uploadFileDir) {
		this.uploadFileDir = uploadFileDir;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public File getUserHead() {
		return userHead;
	}

	public void setUserHead(File userHead) {
		this.userHead = userHead;
	}

	public void setUserHeadContentType(String userHeadContentType) {
		this.userHeadContentType = userHeadContentType;
	}

	public void setUserHeadFileName(String userHeadFileName) {
		this.userHeadFileName = userHeadFileName;
	}
	
	/**
	 * 展示上传表单
	 */
	public String show() {
		return SUCCESS;
	}
	
	/**
	 * 处理上传文件
	 */
	public String upfile() {
		System.out.println("上传者："+userName);
		System.out.println(userHeadContentType);
		System.out.println(userHeadFileName);
		System.out.println(userHead.getAbsolutePath());
		saveFile(userHead);
		return NONE;
	}
	
	/**
	 * 保存文件
	 */
	private void saveFile(File file) {
		// 获取保存文件位置的物理路径
		String uploadFileDirRealPath = ServletActionContext.getServletContext().getRealPath(uploadFileDir);
//		System.out.println("物理路径："+uploadFileDirRealPath);
		/**
		 * 给存放位置建立文件夹
		 */
		File f = new File(uploadFileDirRealPath);
		if(!f.exists()){
			f.mkdir();
		}
		/**
		 * 给建立的文件夹中放入上传的文件
		 */
		File saveFile = new File(f, UUID.randomUUID()+"-"+userHeadFileName);
		
		try {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			FileOutputStream fos = new FileOutputStream(saveFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			byte[] pool = new byte[5*1024];
			int len = -1;
			while((len=bis.read(pool))!=-1) {
				bos.write(pool, 0, len);
			}
			//关闭流
			
			bos.close();
			fos.close();
			bis.close();
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
