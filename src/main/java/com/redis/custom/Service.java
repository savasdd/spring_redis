package com.redis.custom;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private RedisAsync async;

	public RedisAsync getAsync() {
		return async;
	}

	public void setAsync(RedisAsync async) {
		this.async = async;
	}

}
