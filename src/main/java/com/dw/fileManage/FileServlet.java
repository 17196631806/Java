package com.dw.fileManage;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.UUID;

/**
 * @program: StudentManagerWeb
 * @description:
 * @author: liu yan
 * @create: 2018-09-04 14:57
 */
public class FileServlet extends HttpServlet {

    /**
     * 上传文件
     * @param request
     */
    @RequestMapping("upload")
    public void upload(HttpServletRequest request){
        try {
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            //设置单个文件大小
            upload.setFileSizeMax(10*1024*1024);
            //设置总文件大小
            upload.setSizeMax(50*1024*1024);
            upload.setHeaderEncoding("UTF-8");
            if (upload.isMultipartContent(request)){
                List<FileItem> list = upload.parseRequest(request);
                for (FileItem item: list) {
                    if (item.isFormField()){
                        String name = item.getFieldName();
                        String value = item.getString();
                    }else {
                        String name = item.getName();
                        String id = UUID.randomUUID().toString();
                        name = id+"#"+name;
                        String basePath = getServletContext().getRealPath("/upload");
                        File file = new File(basePath,name);
                        item.write(file);
                        item.delete();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping("down")
    public void down(HttpServletRequest request, HttpServletResponse response)throws Exception{
        String fileName = request.getParameter("fileName");
        fileName = new String(fileName.getBytes("ISO8859-1"),"UTF-8");


        String basePath = getServletContext().getRealPath("/upload");

        InputStream in = new FileInputStream(new File(basePath,fileName));


        fileName = URLEncoder.encode(fileName, "UTF-8");

        response.setHeader("content-disposition", "attachment;fileName=" + fileName);


        OutputStream out = response.getOutputStream();
        byte[] b = new byte[1024];
        int len = -1;
        while ((len = in.read(b)) != -1){
            out.write(b, 0, len);
        }

        out.close();
        in.close();
    }

}
