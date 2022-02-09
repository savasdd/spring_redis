package com.redis.custom;

public interface RedisAsync {

	public String getData() throws InterruptedException;
	
	public void clearCashe();

}
