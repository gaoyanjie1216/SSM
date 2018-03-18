/*
package com.gyj.ssm.Controller;

import com.gyj.ssm.Model.User;
import com.gyj.ssm.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

*/
/**
 * Created by Gao on 2018/1/16.
 *//*

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private IUserService userService;

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String HelloWord() {
        return "666888!";
    }

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserByID(userId);
        //绑定对象到User.jsp
        model.addAttribute("user", user);
        return "User";
    }
}
*/
