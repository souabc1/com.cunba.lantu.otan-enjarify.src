package com.xuexiang.xpage.annotation;

import com.xuexiang.xpage.enums.CoreAnim;
import java.lang.annotation.Annotation;

public @interface Page
{
  CoreAnim anim();
  
  String name();
  
  String[] params();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xpage.annotation.Page
 * JD-Core Version:    0.7.0.1
 */