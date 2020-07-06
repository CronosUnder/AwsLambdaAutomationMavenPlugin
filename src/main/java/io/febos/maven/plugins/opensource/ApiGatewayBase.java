/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.febos.maven.plugins.opensource;

import java.io.File;
import java.util.LinkedHashMap;

/**
 * @author Michel M. <michel@febos.cl>
 */
public class ApiGatewayBase {

    public String headers="";
    private LinkedHashMap<String, String> mapping;

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public LinkedHashMap<String, String> getMapping() {
        return mapping;
    }

    public void setMapping(LinkedHashMap<String, String> mapping) {
        this.mapping = mapping;
    }
}
