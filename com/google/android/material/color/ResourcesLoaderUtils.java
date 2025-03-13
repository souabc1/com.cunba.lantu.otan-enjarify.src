package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import java.util.Map;

final class ResourcesLoaderUtils
{
  public static boolean addResourcesLoaderToContext(Context paramContext, Map paramMap)
  {
    paramMap = ColorResourcesLoaderCreator.create(paramContext, paramMap);
    if (paramMap != null)
    {
      paramContext = paramContext.getResources();
      boolean bool = true;
      ResourcesLoader[] arrayOfResourcesLoader = new ResourcesLoader[bool];
      arrayOfResourcesLoader[0] = paramMap;
      OooOO0.OooO00o(paramContext, arrayOfResourcesLoader);
      return bool;
    }
    return false;
  }
  
  public static boolean isColorResource(int paramInt)
  {
    int i = 28;
    if (i <= paramInt)
    {
      i = 31;
      if (paramInt <= i) {
        return 1;
      }
    }
    paramInt = 0;
    return paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.ResourcesLoaderUtils
 * JD-Core Version:    0.7.0.1
 */