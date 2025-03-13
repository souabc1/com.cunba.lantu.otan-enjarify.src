package androidx.appcompat.view;

import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

class SupportMenuInflater$InflatedOnMenuItemClickListener
  implements MenuItem.OnMenuItemClickListener
{
  public static final Class[] o00Ooo0;
  public Object o00OoOoo;
  public Method o00Ooo00;
  
  static
  {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = MenuItem.class;
    o00Ooo0 = arrayOfClass;
  }
  
  public SupportMenuInflater$InflatedOnMenuItemClickListener(Object paramObject, String paramString)
  {
    this.o00OoOoo = paramObject;
    paramObject = paramObject.getClass();
    try
    {
      Object localObject = o00Ooo0;
      localObject = paramObject.getMethod(paramString, (Class[])localObject);
      this.o00Ooo00 = ((Method)localObject);
      return;
    }
    catch (Exception localException)
    {
      InflateException localInflateException = new android/view/InflateException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Couldn't resolve menu item onClick handler ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(" in class ");
      paramObject = paramObject.getName();
      localStringBuilder.append(paramObject);
      paramObject = localStringBuilder.toString();
      localInflateException.<init>(paramObject);
      localInflateException.initCause(localException);
      throw localInflateException;
    }
  }
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    try
    {
      localObject1 = this.o00Ooo00;
      localObject1 = ((Method)localObject1).getReturnType();
      Object localObject2 = Boolean.TYPE;
      if (localObject1 == localObject2)
      {
        localObject1 = this.o00Ooo00;
        localObject2 = this.o00OoOoo;
        paramMenuItem = new Object[] { paramMenuItem };
        paramMenuItem = ((Method)localObject1).invoke(localObject2, paramMenuItem);
        paramMenuItem = (Boolean)paramMenuItem;
        return paramMenuItem.booleanValue();
      }
      localObject1 = this.o00Ooo00;
      localObject2 = this.o00OoOoo;
      paramMenuItem = new Object[] { paramMenuItem };
      ((Method)localObject1).invoke(localObject2, paramMenuItem);
      return true;
    }
    catch (Exception paramMenuItem)
    {
      Object localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>(paramMenuItem);
      throw ((Throwable)localObject1);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.SupportMenuInflater.InflatedOnMenuItemClickListener
 * JD-Core Version:    0.7.0.1
 */