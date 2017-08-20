package com.rickbao.controller;

import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 登录控制
 * <p>
 *     说明：
 *     当你编写代码时，请多写点注释内容。
 *     对于非商业性代码，多写注释有助于快速理解代码逻辑。
 * </p>
 * @version v1.0
 * 2017-08-20
 */
@Controller
@RequestMapping("/login/user/")
public class LoginController {

    /**
     * 日志记录
     */
    private Logger logger = Logger.getLogger(LoginController.class);

    /**
     * 进入首页
     * @return
     */
    @RequestMapping("index")
    public String index(){
        return "index";
    }

    /**
     * 登录页控制
     * @param username
     * @param password
     * @param request
     * @return
     */
    @RequestMapping("find/user")
    @ResponseBody
    public Map<String,Object> find(String username,String password, HttpServletRequest request){
        Map<String,Object> map = new HashedMap();
        System.out.println("你已通过springMVC进入controller方法。。。。");
        logger.info("你已通过springMVC进入controller方法。。。。");
        if(StringUtils.isNotEmpty(username)){
            map.put("result","success");
        }else {
            map.put("result","fail");
        }
        return map;
    }

    /**
     * 登录成功页面
     * @return
     */
    @RequestMapping("success")
    public String success(){
        System.out.println("登录成功。。。。");
        logger.info("登录成功。。。。");

        return "success";
    }

}
