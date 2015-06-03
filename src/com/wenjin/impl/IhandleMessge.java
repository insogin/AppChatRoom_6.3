package com.wenjin.impl;

//接收并处理消息的接口

import com.wenjin.bean.Message;

public interface IhandleMessge {
	public void handleMsg(Message msg);
}
