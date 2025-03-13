package androidx.appcompat.widget;

import android.os.Build.VERSION;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

class SearchView$PreQAutoCompleteTextViewReflector
{
  public Method OooO00o = null;
  public Method OooO0O0 = null;
  public Method OooO0OO = null;
  
  public SearchView$PreQAutoCompleteTextViewReflector()
  {
    OooO0Oo();
    bool = true;
    localObject2 = "doBeforeTextChanged";
    try
    {
      arrayOfClass = new Class[0];
      localObject2 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      this.OooO00o = ((Method)localObject2);
      ((AccessibleObject)localObject2).setAccessible(bool);
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      for (;;)
      {
        try
        {
          label81:
          Class[] arrayOfClass = new Class[bool];
          localClass = Boolean.TYPE;
          arrayOfClass[0] = localClass;
          localObject1 = ((Class)localObject1).getMethod((String)localObject2, arrayOfClass);
          this.OooO0OO = ((Method)localObject1);
          ((AccessibleObject)localObject1).setAccessible(bool);
          return;
        }
        catch (NoSuchMethodException localNoSuchMethodException3)
        {
          continue;
        }
        localNoSuchMethodException1;
      }
    }
    localObject2 = "doAfterTextChanged";
    try
    {
      arrayOfClass = new Class[0];
      localObject2 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      this.OooO0O0 = ((Method)localObject2);
      ((AccessibleObject)localObject2).setAccessible(bool);
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
      Class localClass;
      break label81;
    }
    localObject2 = "ensureImeVisible";
  }
  
  public static void OooO0Oo()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i < j) {
      return;
    }
    UnsupportedClassVersionError localUnsupportedClassVersionError = new java/lang/UnsupportedClassVersionError;
    localUnsupportedClassVersionError.<init>("This function can only be used for API Level < 29.");
    throw localUnsupportedClassVersionError;
  }
  
  public void OooO00o(AutoCompleteTextView paramAutoCompleteTextView)
  {
    OooO0Oo();
    Method localMethod = this.OooO0O0;
    Object[] arrayOfObject;
    if (localMethod != null) {
      arrayOfObject = null;
    }
    try
    {
      arrayOfObject = new Object[0];
      localMethod.invoke(paramAutoCompleteTextView, arrayOfObject);
      label26:
      return;
    }
    catch (Exception localException)
    {
      break label26;
    }
  }
  
  public void OooO0O0(AutoCompleteTextView paramAutoCompleteTextView)
  {
    OooO0Oo();
    Method localMethod = this.OooO00o;
    Object[] arrayOfObject;
    if (localMethod != null) {
      arrayOfObject = null;
    }
    try
    {
      arrayOfObject = new Object[0];
      localMethod.invoke(paramAutoCompleteTextView, arrayOfObject);
      label26:
      return;
    }
    catch (Exception localException)
    {
      break label26;
    }
  }
  
  public void OooO0OO(AutoCompleteTextView paramAutoCompleteTextView)
  {
    OooO0Oo();
    Method localMethod = this.OooO0OO;
    int i;
    if (localMethod != null) {
      i = 1;
    }
    try
    {
      Object[] arrayOfObject = new Object[i];
      Boolean localBoolean = Boolean.TRUE;
      arrayOfObject[0] = localBoolean;
      localMethod.invoke(paramAutoCompleteTextView, arrayOfObject);
      label39:
      return;
    }
    catch (Exception localException)
    {
      break label39;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.SearchView.PreQAutoCompleteTextViewReflector
 * JD-Core Version:    0.7.0.1
 */