package com.gravel.shortcut.controller;

import com.gravel.shortcut.domain.Response;
import com.gravel.shortcut.service.UrlConvertService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName MainController
 * @Description: 主控制器
 * @Author gravel
 * @Date 2020/1/29
 * @Version V1.0
 **/
@RestController
public class MainController {

    @Resource
    private UrlConvertService urlConvertService;

    /**
     * 传入url 返回 转换成功的url
     *
     * @param url
     * @return
     */
    @PostMapping("/convert")
    public Response<String> convertUrl(@RequestParam String url) {
        return urlConvertService.convertUrl(url);
    }

    @PostMapping("/revert")
    public Response<String> revertUrl(@RequestParam String shortUrl) {
        return urlConvertService.revertUrl(shortUrl);
    }

}
