package com.xuexiang.xhttp2.annotation;

import java.lang.annotation.Annotation;

public @interface ThreadType
{
  public static final String IN_THREAD = "executeInThread";
  public static final String TO_IO = "executeToIO";
  public static final String TO_MAIN = "executeToMain";
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.annotation.ThreadType
 * JD-Core Version:    0.7.0.1
 */