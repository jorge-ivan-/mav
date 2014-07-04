/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.soluciones.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author T-10A
 */

public class WeApp extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
         return new Class <?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
      return new Class <?>[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
       return new String[]{"/servicios/*"};
    }
    
}
