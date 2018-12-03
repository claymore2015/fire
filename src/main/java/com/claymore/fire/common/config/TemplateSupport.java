package com.claymore.fire.common.config;


import com.claymore.fire.common.enums.TemplateType;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import java.util.Map;

/**
 * @author li.zhuo
 * @create 2018/12/2 10:48 PM
 * @since 1.0.0
 */
@Component
public class TemplateSupport {


    @Autowired
    private Configuration freemarkerConfig;

    public String getTemplateContent(TemplateType templateType, Map<String, Object> params) {
        try {
            Template template = freemarkerConfig.getTemplate(templateType.getTemplateName());
            return FreeMarkerTemplateUtils.processTemplateIntoString(template, params);
        } catch (Exception e) {
            return null;
        }
    }
}
