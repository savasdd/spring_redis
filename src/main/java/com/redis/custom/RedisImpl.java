package com.redis.custom;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class RedisImpl implements RedisAsync {

	@Cacheable(cacheNames = "BenimCascheMetotum")
	@Override
	public String getData() throws InterruptedException {
		Thread.sleep(5000L);
		return "Metot Çalışıyor!";
	}

	@CacheEvict(cacheNames = "BenimCascheMetotum")
	@Override
	public void clearCashe() {
		System.out.println("Cache Temizlendi");
	}

}
