package com.szc.fast_express_system.ui.fragment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import m.framework.ui.widget.pulltorefresh.PullToRefreshView;

import com.szc.fast_express_system.R;
import com.szc.fast_express_system.common.util.IntentUtil;
import com.szc.fast_express_system.entities.LoginData;
import com.szc.fast_express_system.service.AppController;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.TextView;


/**
 * **************************************** 类描述： 附近 类名称：NearFragment
 * 
 * @version: 1.0
 * @author: why
 * @time: 2014-10-10 下午6:30:07
 ***************************************** 
 */
public class NearFragment extends Fragment implements OnClickListener {
	private View view;
	private Context mContext;
	private AppController controller;
	private ListView list;
	private TextView btshaixuan;
	private TextView tvtitle;
	private TextView btsearch;
	private ImageButton btback;
	
	
	private PullToRefreshView main_pull_refresh_view;
	private int pageNum = 1;
	private int  tolalPage = -1;
	private boolean refresh = false;

	public String search = "";
	public String lat = "116.287128";
	public String lng = "39.830486";
	public String sex = "";
	public String age_min = "0";
	public String age_max = "80";
	public String type = "star";
	public String major = "";
	LoginData user;
	int r = 0;
	boolean showupdate = false;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		controller = AppController.getController(getActivity());
		view = inflater.inflate(R.layout.main_layout, container, false);
		mContext = getActivity();
		user = (LoginData) controller.getContext().getBusinessData("loginData");
		findView();
		initView();
		return view;
	}

	/**
	 * 方法描述：TODO
	 * 
	 * @author: why
	 * @time: 2014-10-10 下午6:36:02
	 */
	private void initView() {}



	/**
	 * 方法描述：TODO
	 * 
	 * @author: why
	 * @time: 2014-10-10 下午6:36:00
	 */
	private void findView() {}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.main_top_right:
			break;
		default:
			break;
		}
	}

	private Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			// super.handleMessage(msg);
			switch (msg.what) {
			case 1:
				break;
			}
		}
	};
}
