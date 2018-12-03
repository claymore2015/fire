package com.claymore.fire.common.enums;

/**
 * @author li.zhuo
 * @create 2018/12/2 11:14 PM
 * @since 1.0.0
 */
public enum TemplateType {

    DOC_TEMPLATE("content.mht"),   //

    ;

    private String templateName;

    TemplateType(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateName() {
        return templateName;
    }

}
