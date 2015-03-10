package com.szc.fast_express_system.common.util;

import java.io.File;

import android.os.Environment;

/**
 * **************************************** 
 * 类描述： 配置信息�? 类名称：Config
 * @version: 1.0
 * @author: why
 * @time: 2014-2-14 下午3:32:29
 ***************************************** 
 */
public class Config {
	public static String DOWNLOADPATH = "/sdcard/timetalent/";
	public static String IMAGEPATH = "/sdcard/timetalent/image/";

	/** 是否调试. */
	public final static boolean DEBUG = true;
	
	// 后台 测试
	public final static String MY_SERVICE = "http://118.144.74.24/xingtan/index.php";
	/** 临时文件保存路径. */
	// 项目路径
	public static final String PATH_SDCARD = Environment.getExternalStorageDirectory()
			.getAbsolutePath() + File.separator + "TimeTalent";
	
////缩略�?
	public static final String PATH_PIC_THUMB = PATH_SDCARD + File.separator +"thumb";

	//图片保存路径
	public static final String PIC_PATH = "/mnt/sdcard/TimeTalent/picture/";
	
	//登录
	public final static String HTTP_USER_LOGIN = MY_SERVICE+ "/Login/login"; // 登录接口
	public final static String HTTP_USER_REGISTER = MY_SERVICE+ "/Reg/index"; // 注册接口
	public final static String HTTP_USER_LOGOUT = MY_SERVICE+ "/Login/logout"; // 注册接口
	public final static String HTTP_USER_HUANXIN_REG = MY_SERVICE+ "/User/huanxin_reg"; // 环信注册接口
	public final static String HTTP_USER_REGISTER_AVATAR = MY_SERVICE+ "/Reg/avatar_upload"; // 注册接口 上传图片
	public final static String HTTP_USER_RESET_PWD = MY_SERVICE+ "/System/password_reset"; // 修改密码
	
	//获取验证�?
	public final static String HTTP_USER_PHONE_CODE = MY_SERVICE+ "/Sms/send_verify"; //获取验证�?
	public final static String HTTP_USER_CODE_VERIFY = MY_SERVICE+ "/Sms/verify"; //验证验证�?
	
	// 机会
	public final static String HTTP_USER_CHANCE_ADD = MY_SERVICE+ "/Task/add"; // 添加机会
	public final static String HTTP_USER_CHANCE_LIST = MY_SERVICE+ "/Task/lists"; //机会列表
	public final static String HTTP_USER_CHANCE_DETAIL = MY_SERVICE+ "/Task/show"; // 机会详情
	public final static String HTTP_USER_CHANCE_APPLY = MY_SERVICE+ "/Task/apply"; // 机会报名

	// 动�??
	public final static String HTTP_USER_DYNAMIC_INDEX = MY_SERVICE+ "/Feed/index"; // 获取�?�? 用户的最新动�?
	public final static String HTTP_USER_DYNAMIC_WHO = MY_SERVICE+ "/Feed/whofeed"; // 获取某个用户的动态列�?
	public final static String HTTP_USER_DYNAMIC_MY = MY_SERVICE+ "/Feed/myfeed"; // 获取当前用户自己的动态列�?
	public final static String HTTP_USER_DYNAMIC_ADD = MY_SERVICE+ "/Feed/addfeed"; //发布动�?�Feed/addfeed
	public final static String HTTP_USER_DYNAMIC_ADD_PIC = MY_SERVICE+ "/Feed/add_photo"; //发布动�?? 图片
	public final static String HTTP_USER_DYNAMIC_REPALY = MY_SERVICE+ "/Feed/add_reply"; // 评论某动态Feed/add_reply
	public final static String HTTP_USER_DYNAMIC_FAVOUR = MY_SERVICE+ "/Feed/favour"; // 点赞Feed/favour
	public final static String HTTP_USER_DYNAMIC_UNFAVOUR = MY_SERVICE+ "/Feed/unfavour"; // 取消点赞Feed/unfavour
	public final static String HTTP_USER_CHAT_ACCESS= MY_SERVICE+ "/Message/access"; // 是否可以聊天Message/access
	public final static String HTTP_USER_CHAT_PAY = MY_SERVICE+ "/Message/chat_pay"; // 支付聊天费用/Message/chat_pay

	
	
	//附近
	public final static String HTTP_NEAR_ZONE_SEARCH = MY_SERVICE+ "/Zone/search"; // 搜索用户Zone/search
	public final static String HTTP_NEAR_ZONE_NEAR = MY_SERVICE+ "/Zone/near"; // 附近的人Zone/near
	public final static String HTTP_NEAR_ZONE_USERINFO = MY_SERVICE+ "/Zone/userinfo";//某个用户的资�?
	//我的
	public final static String HTTP_MY_BASEINFO = MY_SERVICE+ "/User/baseinfo";
	public final static String HTTP_MY_LOCATION_UPDATE = MY_SERVICE+ "/User/location_update";//更新坐标
	public final static String HTTP_MY_MOREINFO = MY_SERVICE+ "/User/moreinfo";//更新坐标
	public final static String HTTP_MY_MOREINFO_UPDATE = MY_SERVICE+ "/User/moreinfo_update";//
	public final static String HTTP_MY_DO_SOCIAL = MY_SERVICE+ "/User/do_social";//更新坐标
	public final static String HTTP_MY_REPORT = MY_SERVICE+ "/User/report";//更新坐标
	public final static String HTTP_MY_PHOTO = MY_SERVICE+ "/User/photo";//更新坐标
	public final static String HTTP_MY_PHOTO_UPDATE = MY_SERVICE+ "/User/photo_upload";//更新坐标
	
	public final static String HTTP_MY_PHOTO_DEL = MY_SERVICE+ "/User/photo_del";//更新坐标
	public final static String HTTP_MY_AVATAR_UPDATE = MY_SERVICE+ "/User/avatar_upload";//更新坐标
	public final static String HTTP_MY_AVATAR_DEL = MY_SERVICE+ "/User/avatar_del";//更新坐标

	public final static String HTTP_MY_ZONE_FRIEND = MY_SERVICE+ "/Zone/friend"; // 获取我的好友列表Zone/friend
	public final static String HTTP_MY_ZONE_FOLLOWING = MY_SERVICE+ "/Zone/following"; // 获取我的关注列表Zone/following
	public final static String HTTP_MY_ZONE_FOLLOWED = MY_SERVICE+ "/Zone/followed"; // 获取关注我的人列�?,即粉丝Zone/followed
	public final static String HTTP_MY_ZONE_PUSHUSER = MY_SERVICE+ "/Zone/pushuser"; // 获取推荐用户列表Zone/pushuser
	public final static String HTTP_MY_ZONE_BLACK = MY_SERVICE+ "/Zone/black"; // 获取黑名单列表Zone/black
	public final static String HTTP_MY_WALLET_CHARGEORDER = MY_SERVICE+ "/Wallet/charge_order"; // 充�?�订单Wallet/charge_order
	public final static String HTTP_MY_WALLET_COMPLETEORDER = MY_SERVICE+ "/Wallet/complete_order"; // 充�?�完成Wallet/complete_order
	public final static String HTTP_MY_WALLET_CANCELORDER = MY_SERVICE+ "/Wallet/cancel_order"; // 取消订单Wallet/cancel_order
	public final static String HTTP_MY_WALLET_WITHDRAW = MY_SERVICE+ "/Wallet/withdraw"; // 提现Wallet/withdraw
	public final static String HTTP_MY_WALLET_WITHDRAWLISTS = MY_SERVICE+ "/Wallet/withdraw_lists"; // 提现记录Wallet/withdraw_lists
	public final static String HTTP_MY_WALLET_ORDERLISTS = MY_SERVICE+ "/Wallet/charge_order_lists";//充�?�记录接�?

	public final static String HTTP_MY_INVITE_ADD = MY_SERVICE+ "/Invite/add"; // 星探、粉丝邀约某明星Invite/add
	public final static String HTTP_MY_INVITE_APPOINT = MY_SERVICE+ "/Invite/appoint"; // 我的�?约记�? 星探或粉丝邀约明星的记录Invite/appoint
	public final static String HTTP_MY_INVITE_OFFER = MY_SERVICE+ "/Invite/offer"; // �?约我的记�? 明星被邀约的记录Invite/offer
	public final static String HTTP_MY_INVITE_ACCEPT = MY_SERVICE+ "/Invite/accept"; // 接受�?约Invite/accept
	public final static String HTTP_MY_INVITE_PAYMENT = MY_SERVICE+ "/Invite/payment"; // 支付�?约费�? 确定支付�?约费用，发生在发起邀约方Invite/payment
	public final static String HTTP_MY_USER_SERVICE = MY_SERVICE+ "/User/service"; // 支付�?约费�? 确定支付�?约费用，发生在发起邀约方Invite/payment
	public final static String HTTP_MY_USER_ADDSERVICE = MY_SERVICE+ "/User/add_service"; // 支付�?约费�? 确定支付�?约费用，发生在发起邀约方Invite/payment
	public final static String HTTP_MY_USER_SERVICE_LIST = MY_SERVICE+ "/System/service_list";
	public final static String HTTP_MY_USER_DELSERVICE = MY_SERVICE+ "/User/del_service";
	public final static String HTTP_MY_WORKS_ADD = MY_SERVICE+ "/Works/add";
	
	public final static String HTTP_MY_USER_LOYAL = MY_SERVICE+ "/User/loyal";
	public final static String HTTP_MY_USER_LOYAL_ITEM = MY_SERVICE+ "/User/loyal_item";
	public final static String HTTP_MY_TASK_LISTS = MY_SERVICE+ "/Task/publish_task_lists";
	public final static String HTTP_MY_TASK_APPLY_LISTS = MY_SERVICE+ "/Task/my_apply_lists";
	
	
	
	public final static String HTTP_MY_APP_VERSION = MY_SERVICE+ "/App/version";
	public final static String HTTP_MY_APP_CONFIG = MY_SERVICE+ "/App/get_config";
	
	public final static String HTTP_MY_BASEINFOUPDATE = MY_SERVICE+ "/User/baseinfo_update";
	
	// 充�?? 支付
	public final static String HTTP_USER_WALLET_ORDER= MY_SERVICE+ "/Wallet/charge_order"; // 充�?�订�?
	public final static String HTTP_USER_WALLET_ORDER_OK= MY_SERVICE+ "/Wallet/complete_order"; // 确认支付
	public final static String HTTP_USER_WALLET_WITHDRAW= MY_SERVICE+ "/Wallet/withdraw"; // 提现
	public final static String HTTP_USER_WALLET_WITHDRAW_LIST= MY_SERVICE+ "/Wallet/withdraw_lists"; // 提现记录
	public final static String HTTP_YSYTEM_DICTIONARY= MY_SERVICE+ "/System/dictionary_list"; //字典列表
	
	
	
}
