package com.xuexiang.xaop.util;

import android.app.Activity;
import android.os.Bundle;
import m54207b69;

public class PermissionUtils$PermissionActivity
  extends Activity
{
  public void onCreate(Bundle paramBundle)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramBundle;
    m54207b69.F54207b69_00(979, arrayOfObject);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    arrayOfObject[2] = paramArrayOfString;
    arrayOfObject[3] = paramArrayOfInt;
    m54207b69.F54207b69_00(980, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xaop.util.PermissionUtils.PermissionActivity
 * JD-Core Version:    0.7.0.1
 */