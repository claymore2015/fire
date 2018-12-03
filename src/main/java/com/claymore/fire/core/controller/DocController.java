package com.claymore.fire.core.controller;

import com.claymore.fire.common.config.TemplateSupport;
import com.claymore.fire.common.enums.TemplateType;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author li.zhuo
 * @create 2018/12/2 10:37 PM
 * @since 1.0.0
 */
@RestController
public class DocController {

    @Autowired
    TemplateSupport templateSupport;

    @RequestMapping(path = "/download", method = RequestMethod.POST)
    public ResponseEntity<Resource> download(String content) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("content", content);
        String templateContent = templateSupport.getTemplateContent(TemplateType.DOC_TEMPLATE, param);
        ByteArrayResource resource = new ByteArrayResource(templateContent.getBytes());
        HttpHeaders headers = new HttpHeaders(); headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=doc.mht");
        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(resource.contentLength())
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(resource);
    }
}
