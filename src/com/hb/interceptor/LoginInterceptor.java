package com.hb.interceptor;


import com.hb.constant.LoginConstant;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

public class LoginInterceptor  implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o ) throws Exception {

        if(httpServletRequest.getAttribute(LoginConstant.dlpz)!=null){

            return true;
        }else{

            httpServletRequest.setAttribute( LoginConstant.message,"你还未登录" );
            httpServletRequest.getRequestDispatcher("/Zc.jsp").forward(httpServletRequest,httpServletResponse);
        }

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("55555555555");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("55555555555");
    }
}
