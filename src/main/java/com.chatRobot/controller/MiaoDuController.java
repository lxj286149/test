package com.chatRobot.controller;

import com.chatRobot.dao.MiaoDu;
import com.chatRobot.model.indexImage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 空字符-null
 * @version 1.0
 * @Time 2019-07-27 22:59
 */

@CrossOrigin(origins = "*", maxAge = 3600)    /*跨域*/
@Controller
@RequestMapping(value = "miao")
public class MiaoDuController {
    @Resource
    private MiaoDu miaoDu;

    @RequestMapping("/getAllIndexImages")
    @ResponseBody
    public List<indexImage> getAllIndexImages(HttpServletRequest request, HttpServletResponse response
//            , @RequestParam(value = "issueid") int issueId
    ) throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        List<indexImage> indexImages = new ArrayList<>();
        try {
            indexImages = miaoDu.getAllIndexImages();
            System.out.println(indexImages);
        } catch (Exception e) {
        }
        return indexImages;
    }
}
