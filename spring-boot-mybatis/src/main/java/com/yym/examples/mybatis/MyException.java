package com.yym.examples.mybatis;

/**
 * Created by yaoyimin on 2017/12/11
 */
public class MyException extends RuntimeException {

	private int id;

	private String message;

	/**
	 * id 异常编号
	 * message  异常详细信息
	 */
	public MyException(int id,String message) {
		super(message);
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
