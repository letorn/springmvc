package controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.UserService;

@Controller
@RequestMapping("user/")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("page.do")
	@ResponseBody
	public Map<String, Object> page(Integer start, Integer limit) {
		return userService.page(start, limit);
	}

}
