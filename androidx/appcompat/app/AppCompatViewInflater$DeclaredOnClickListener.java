package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class AppCompatViewInflater$DeclaredOnClickListener
  implements View.OnClickListener
{
  public final View o00OoOoo;
  public Method o00Ooo0;
  public final String o00Ooo00;
  public Context o00Ooo0O;
  
  public AppCompatViewInflater$DeclaredOnClickListener(View paramView, String paramString)
  {
    this.o00OoOoo = paramView;
    this.o00Ooo00 = paramString;
  }
  
  public final void OooO00o(Context paramContext)
  {
    while (paramContext != null) {
      try
      {
        bool = paramContext.isRestricted();
        if (!bool)
        {
          localObject1 = paramContext.getClass();
          localObject2 = this.o00Ooo00;
          int j = 1;
          localObject3 = new Class[j];
          View localView = View.class;
          localObject3[0] = localView;
          localObject1 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
          if (localObject1 != null)
          {
            this.o00Ooo0 = ((Method)localObject1);
            this.o00Ooo0O = paramContext;
            return;
          }
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        boolean bool = paramContext instanceof ContextWrapper;
        if (bool)
        {
          paramContext = ((ContextWrapper)paramContext).getBaseContext();
        }
        else
        {
          k = 0;
          paramContext = null;
        }
      }
    }
    paramContext = this.o00OoOoo;
    int k = paramContext.getId();
    int i = -1;
    if (k == i)
    {
      paramContext = "";
    }
    else
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(" with id '");
      localObject2 = this.o00OoOoo.getContext().getResources();
      paramContext = ((Resources)localObject2).getResourceEntryName(k);
      ((StringBuilder)localObject1).append(paramContext);
      ((StringBuilder)localObject1).append("'");
      paramContext = ((StringBuilder)localObject1).toString();
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Could not find method ");
    Object localObject3 = this.o00Ooo00;
    ((StringBuilder)localObject2).append((String)localObject3);
    ((StringBuilder)localObject2).append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
    localObject3 = this.o00OoOoo.getClass();
    ((StringBuilder)localObject2).append(localObject3);
    ((StringBuilder)localObject2).append(paramContext);
    paramContext = ((StringBuilder)localObject2).toString();
    ((IllegalStateException)localObject1).<init>(paramContext);
    throw ((Throwable)localObject1);
  }
  
  public void onClick(View paramView)
  {
    Object localObject = this.o00Ooo0;
    if (localObject == null)
    {
      localObject = this.o00OoOoo.getContext();
      OooO00o((Context)localObject);
    }
    try
    {
      localObject = this.o00Ooo0;
      Context localContext = this.o00Ooo0O;
      paramView = new Object[] { paramView };
      ((Method)localObject).invoke(localContext, paramView);
      return;
    }
    catch (InvocationTargetException paramView)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Could not execute method for android:onClick", paramView);
      throw ((Throwable)localObject);
    }
    catch (IllegalAccessException paramView)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Could not execute non-public method for android:onClick", paramView);
      throw ((Throwable)localObject);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatViewInflater.DeclaredOnClickListener
 * JD-Core Version:    0.7.0.1
 */