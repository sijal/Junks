package com.suman.DependsOn;

import java.io.IOException;

public interface IAccessor {
	String getkey();
	Object getData() throws IOException;
}
