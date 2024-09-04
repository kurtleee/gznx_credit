package com.uniview.notification.util;

import com.uniview.notification.pojo.NoticeBorrower;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 * @author ：luosir
 * @modified By：
 */
public class NoticeSuccessUtil {
    private TemplateEngine templateEngine;

    public NoticeSuccessUtil(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public String generateNoticeSuccessHtml(NoticeBorrower noticeBorrower) {

        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix("html/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);

        templateEngine.setTemplateResolver(templateResolver);

        Context context = new Context();
        context.setVariable("borrower",noticeBorrower.getBorrower());
        context.setVariable("startTime",noticeBorrower.getStartTime());
        context.setVariable("expireTime",noticeBorrower.getExpireTime());
        context.setVariable("sendTime",noticeBorrower.getSendTime());
        context.setVariable("productName",noticeBorrower.getProductName());
        context.setVariable("loanPrice",noticeBorrower.getLoanPrice());
        context.setVariable("loanInterest",noticeBorrower.getLoanInterest());


        // 返回html模板
        return templateEngine.process("noticeSuccess", context);
    }
}
