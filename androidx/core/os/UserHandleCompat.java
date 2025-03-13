package androidx.core.os;

import android.os.UserHandle;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class UserHandleCompat
{
  public static Method OooO00o;
  public static Constructor OooO0O0;
  
  private static Method getGetUserIdMethod()
  {
    Method localMethod = OooO00o;
    if (localMethod == null)
    {
      boolean bool = true;
      Object localObject1 = new Class[bool];
      Object localObject2 = Integer.TYPE;
      localObject1[0] = localObject2;
      UserHandle localUserHandle = UserHandle.class;
      localObject2 = "getUserId";
      localObject1 = localUserHandle.getDeclaredMethod((String)localObject2, (Class[])localObject1);
      OooO00o = (Method)localObject1;
      ((AccessibleObject)localObject1).setAccessible(bool);
    }
    return OooO00o;
  }
  
  private static Constructor getUserHandleConstructor()
  {
    Constructor localConstructor = OooO0O0;
    if (localConstructor == null)
    {
      boolean bool = true;
      Object localObject = new Class[bool];
      Class localClass = Integer.TYPE;
      localObject[0] = localClass;
      UserHandle localUserHandle = UserHandle.class;
      localObject = localUserHandle.getDeclaredConstructor((Class[])localObject);
      OooO0O0 = (Constructor)localObject;
      ((AccessibleObject)localObject).setAccessible(bool);
    }
    return OooO0O0;
  }
  
  public static UserHandle getUserHandleForUid(int paramInt)
  {
    return UserHandleCompat.Api24Impl.getUserHandleForUid(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.UserHandleCompat
 * JD-Core Version:    0.7.0.1
 */