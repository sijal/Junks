package com.suman.DependsOn;

import java.io.IOException;
import java.util.List;

public class CacheManager {
	List<IAccessor> listOfAccessors;
	Cache cache;
	public CacheManager(List<IAccessor> listOfAccessors, Cache cache) throws IOException {
		this.listOfAccessors = listOfAccessors;
		this.cache = cache;
		loadCahe();
	}
	private void loadCahe() throws IOException {
		for(IAccessor accessor : listOfAccessors) {
			cache.put(accessor.getkey(), accessor.getData());
		}
	}
}
