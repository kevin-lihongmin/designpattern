package com.kevin.designpattern.other.decorator;

import org.springframework.http.HttpHeaders;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;
import org.springframework.web.util.ContentCachingRequestWrapper;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 *  {@link javax.servlet.ServletRequest} 的装饰器模式
 * @author kevin
 * @date 2019/11/12 17:18
 * @since 1.0.0
 */
public class ServletRequestTest {

    public static void main(String[] args) {

        ServletRequest servletRequest = new ServletRequestWrapper(null);

        // 用于上传文件的能力
        StandardMultipartHttpServletRequest multipartRequest = new StandardMultipartHttpServletRequest(null);
        HttpHeaders httpHeaders = multipartRequest.getMultipartHeaders("myFile");
        MultipartFile multipartFile = multipartRequest.getFile("myFile");
        System.out.println("" + httpHeaders + multipartFile);

        ContentCachingRequestWrapper cacheWrapper = new ContentCachingRequestWrapper(null);
        cacheWrapper.getRequestedSessionId();
    }
}
