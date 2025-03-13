package com.xuexiang.xpage;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.base.XPageActivity;
import com.xuexiang.xpage.model.PageInfo;
import com.xuexiang.xpage.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import m54207b69;

public class PageConfig
{
  public static PageConfig OooO0Oo;
  public PageConfiguration OooO00o;
  public List OooO0O0;
  public String OooO0OO;
  
  public PageConfig()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO0O0 = ((List)localObject);
    localObject = XPageActivity.class.getCanonicalName();
    this.OooO0OO = ((String)localObject);
  }
  
  public static Page OooO0O0(Class paramClass)
  {
    return (Page)Utils.OooO00o(paramClass.getAnnotation(Page.class), "Page == null，请检测页面是否漏加 @Page 进行修饰！");
  }
  
  public static PageInfo OooO0OO(Class paramClass)
  {
    Page localPage = OooO0O0(paramClass);
    PageInfo localPageInfo = new com/xuexiang/xpage/model/PageInfo;
    String str = localPage.name();
    boolean bool1 = TextUtils.isEmpty(str);
    if (bool1) {
      str = paramClass.getSimpleName();
    } else {
      str = localPage.name();
    }
    localPageInfo.<init>(str, paramClass);
    paramClass = localPage.params();
    bool1 = false;
    str = null;
    paramClass = paramClass[0];
    boolean bool2 = TextUtils.isEmpty(paramClass);
    if (!bool2)
    {
      paramClass = localPage.params();
      localPageInfo.OooO0OO(paramClass);
    }
    paramClass = localPage.anim();
    localPageInfo.OooO00o(paramClass);
    return localPageInfo;
  }
  
  public static String getContainActivityClassName()
  {
    Object[] arrayOfObject = new Object[0];
    return (String)m54207b69.F54207b69_09(1580, arrayOfObject);
  }
  
  public static PageConfig getInstance()
  {
    Object[] arrayOfObject = new Object[0];
    return (PageConfig)m54207b69.F54207b69_09(1581, arrayOfObject);
  }
  
  public PageConfig OooO00o(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (PageConfig)m54207b69.F54207b69_09(1574, arrayOfObject);
  }
  
  public void OooO0Oo(Application paramApplication)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramApplication;
    m54207b69.F54207b69_00(1577, arrayOfObject);
  }
  
  public final PageConfig OooO0o(List paramList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramList;
    return (PageConfig)m54207b69.F54207b69_09(1578, arrayOfObject);
  }
  
  public final void OooO0o0(Context paramContext)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    m54207b69.F54207b69_00(1579, arrayOfObject);
  }
  
  public List getPages()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (List)m54207b69.F54207b69_09(1582, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xpage.PageConfig
 * JD-Core Version:    0.7.0.1
 */