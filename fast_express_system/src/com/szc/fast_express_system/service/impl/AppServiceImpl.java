package com.szc.fast_express_system.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.szc.fast_express_system.ExpressSystemApplication;
import com.szc.fast_express_system.common.exception.BusinessException;
import com.szc.fast_express_system.common.exception.ErrorMessage;
import com.szc.fast_express_system.common.net.Request;
import com.szc.fast_express_system.common.util.Config;
import com.szc.fast_express_system.common.util.StringUtil;
import com.szc.fast_express_system.entities.Register;
import com.szc.fast_express_system.entities.json.LoginResp;
import com.szc.fast_express_system.entities.json.RegisterResp;
import com.szc.fast_express_system.service.AppContext;
import com.szc.fast_express_system.service.AppService;

import android.os.Handler;
import android.util.Log;


/******************************************
 * 类描述： 业务实现�? 类名称：ServiceImpl
 * 
 * @version: 1.0
 * @author: why
 * @time: 2014-2-13 下午2:09:22
 ******************************************/
public class AppServiceImpl implements AppService {
	@SuppressWarnings("unused")
	private String TAG = "AppServiceImpl";
	private AppContext context;
	/**
	 * 类的构�?�方�? 创建�?个新的实�? AppServiceImpl.
	 * 
	 * @param
	 * @param context
	 */
	public AppServiceImpl(AppContext context) {
		this.context = context;
	}

	/**
	 * 登录
	 */
	@Override
	public void login(final Handler handler) throws BusinessException {
		String account = (String)context.getBusinessData("user.account");
		String password = (String)context.getBusinessData("user.password");
		Request<LoginResp> request = new Request<LoginResp>();
		List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		
		nameValuePairs.add(new BasicNameValuePair("userlogin", account));
		nameValuePairs.add(new BasicNameValuePair("password", password));
		nameValuePairs.add(new BasicNameValuePair("isdata", "true"));
		request.addParameter(Request.AJAXPARAMS, nameValuePairs);
		request.setUrl(Config.HTTP_USER_LOGIN);
		request.setR_calzz(LoginResp.class);
		final LoginResp resp = ExpressSystemApplication.getAppSocket().shortConnect(request);
		if ("1".equals(resp.getStatus())) {
			handler.sendEmptyMessage(1);
		} else{
			handler.sendEmptyMessage(1);
			throw new BusinessException(new ErrorMessage(resp.getText()));
		}
	}
	
	
	
	
	
	
	
	
	@Override
	public void register() throws BusinessException {
		Register register = (Register)context.getBusinessData("Register.register");
		Request<RegisterResp> request = new Request<RegisterResp>();
		List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		
		nameValuePairs.add(new BasicNameValuePair("nickname", register.getUsername()));
		nameValuePairs.add(new BasicNameValuePair("phone", register.getPhone()));
		nameValuePairs.add(new BasicNameValuePair("password", register.getPassword()));
		nameValuePairs.add(new BasicNameValuePair("birthday", StringUtil.transformDate(register.getBirthday())+""));
		nameValuePairs.add(new BasicNameValuePair("sex", register.getSex()));
		nameValuePairs.add(new BasicNameValuePair("type", register.getType()));
		request.addParameter(Request.AJAXPARAMS, nameValuePairs);
		request.setUrl(Config.HTTP_USER_REGISTER);
		request.setR_calzz(RegisterResp.class);
		RegisterResp resp = ExpressSystemApplication.getAppSocket().shortConnect(request);
		if ("1".equals(resp.getStatus())) {
			context.addBusinessData("Register.user_id", resp.getData().getUser_id());
		} else{
			throw new BusinessException(new ErrorMessage(resp.getText()));
		}
	
	}
	
	
}
