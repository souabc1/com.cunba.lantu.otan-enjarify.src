package androidx.navigation;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public class ActivityNavigator$Destination
  extends NavDestination
{
  public Intent o00Ooooo;
  public String o00o0000;
  
  public ActivityNavigator$Destination(Navigator paramNavigator)
  {
    super(paramNavigator);
  }
  
  public void OooOO0o(Context paramContext, AttributeSet paramAttributeSet)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramAttributeSet, "attrs");
    super.OooOO0o(paramContext, paramAttributeSet);
    Object localObject1 = paramContext.getResources();
    Object localObject2 = R.styleable.ActivityNavigator;
    paramAttributeSet = ((Resources)localObject1).obtainAttributes(paramAttributeSet, (int[])localObject2);
    Intrinsics.OooO0o0(paramAttributeSet, "context.resources.obtain…tyNavigator\n            )");
    int i = R.styleable.ActivityNavigator_targetPackage;
    localObject1 = paramAttributeSet.getString(i);
    localObject1 = OooOOOO(paramContext, (String)localObject1);
    OooOo00((String)localObject1);
    i = R.styleable.ActivityNavigator_android_name;
    localObject1 = paramAttributeSet.getString(i);
    if (localObject1 != null)
    {
      localObject2 = null;
      int j = ((String)localObject1).charAt(0);
      int k = 46;
      if (j == k)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = paramContext.getPackageName();
        ((StringBuilder)localObject2).append(str);
        ((StringBuilder)localObject2).append((String)localObject1);
        localObject1 = ((StringBuilder)localObject2).toString();
      }
      localObject2 = new android/content/ComponentName;
      ((ComponentName)localObject2).<init>(paramContext, (String)localObject1);
      OooOOo0((ComponentName)localObject2);
    }
    i = R.styleable.ActivityNavigator_action;
    localObject1 = paramAttributeSet.getString(i);
    OooOOOo((String)localObject1);
    i = R.styleable.ActivityNavigator_data;
    localObject1 = paramAttributeSet.getString(i);
    localObject1 = OooOOOO(paramContext, (String)localObject1);
    if (localObject1 != null)
    {
      localObject1 = Uri.parse((String)localObject1);
      OooOOo((Uri)localObject1);
    }
    i = R.styleable.ActivityNavigator_dataPattern;
    localObject1 = paramAttributeSet.getString(i);
    paramContext = OooOOOO(paramContext, (String)localObject1);
    OooOOoo(paramContext);
    paramAttributeSet.recycle();
  }
  
  public boolean OooOOO()
  {
    return false;
  }
  
  public final String OooOOOO(Context paramContext, String paramString)
  {
    if (paramString != null)
    {
      String str1 = "${applicationId}";
      String str2 = paramContext.getPackageName();
      Intrinsics.OooO0o0(str2, "context.packageName");
      int i = 4;
      paramContext = StringsKt.OooOOOO(paramString, str1, str2, false, i, null);
    }
    else
    {
      paramContext = null;
    }
    return paramContext;
  }
  
  public final Destination OooOOOo(String paramString)
  {
    Intent localIntent = this.o00Ooooo;
    if (localIntent == null)
    {
      localIntent = new android/content/Intent;
      localIntent.<init>();
      this.o00Ooooo = localIntent;
    }
    localIntent = this.o00Ooooo;
    Intrinsics.OooO0OO(localIntent);
    localIntent.setAction(paramString);
    return this;
  }
  
  public final Destination OooOOo(Uri paramUri)
  {
    Intent localIntent = this.o00Ooooo;
    if (localIntent == null)
    {
      localIntent = new android/content/Intent;
      localIntent.<init>();
      this.o00Ooooo = localIntent;
    }
    localIntent = this.o00Ooooo;
    Intrinsics.OooO0OO(localIntent);
    localIntent.setData(paramUri);
    return this;
  }
  
  public final Destination OooOOo0(ComponentName paramComponentName)
  {
    Intent localIntent = this.o00Ooooo;
    if (localIntent == null)
    {
      localIntent = new android/content/Intent;
      localIntent.<init>();
      this.o00Ooooo = localIntent;
    }
    localIntent = this.o00Ooooo;
    Intrinsics.OooO0OO(localIntent);
    localIntent.setComponent(paramComponentName);
    return this;
  }
  
  public final Destination OooOOoo(String paramString)
  {
    this.o00o0000 = paramString;
    return this;
  }
  
  public final Destination OooOo00(String paramString)
  {
    Intent localIntent = this.o00Ooooo;
    if (localIntent == null)
    {
      localIntent = new android/content/Intent;
      localIntent.<init>();
      this.o00Ooooo = localIntent;
    }
    localIntent = this.o00Ooooo;
    Intrinsics.OooO0OO(localIntent);
    localIntent.setPackage(paramString);
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject != null)
    {
      boolean bool2 = paramObject instanceof Destination;
      if (bool2)
      {
        bool2 = super.equals(paramObject);
        if (bool2)
        {
          Object localObject1 = this.o00Ooooo;
          boolean bool3 = true;
          if (localObject1 != null)
          {
            Object localObject2 = paramObject;
            localObject2 = ((Destination)paramObject).o00Ooooo;
            bool2 = ((Intent)localObject1).filterEquals((Intent)localObject2);
          }
          else
          {
            localObject1 = paramObject;
            localObject1 = ((Destination)paramObject).o00Ooooo;
            if (localObject1 == null)
            {
              bool2 = bool3;
            }
            else
            {
              bool2 = false;
              localObject1 = null;
            }
          }
          if (bool2)
          {
            localObject1 = this.o00o0000;
            paramObject = ((Destination)paramObject).o00o0000;
            boolean bool4 = Intrinsics.OooO00o(localObject1, paramObject);
            if (bool4) {
              bool1 = bool3;
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public final String getAction()
  {
    Object localObject = this.o00Ooooo;
    if (localObject != null) {
      localObject = ((Intent)localObject).getAction();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public final ComponentName getComponent()
  {
    Object localObject = this.o00Ooooo;
    if (localObject != null) {
      localObject = ((Intent)localObject).getComponent();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public final Uri getData()
  {
    Object localObject = this.o00Ooooo;
    if (localObject != null) {
      localObject = ((Intent)localObject).getData();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public final String getDataPattern()
  {
    return this.o00o0000;
  }
  
  public final Intent getIntent()
  {
    return this.o00Ooooo;
  }
  
  public final String getTargetPackage()
  {
    Object localObject = this.o00Ooooo;
    if (localObject != null) {
      localObject = ((Intent)localObject).getPackage();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public int hashCode()
  {
    int i = super.hashCode() * 31;
    Object localObject = this.o00Ooooo;
    int j = 0;
    int k;
    if (localObject != null)
    {
      k = ((Intent)localObject).filterHashCode();
    }
    else
    {
      k = 0;
      localObject = null;
    }
    i = (i + k) * 31;
    localObject = this.o00o0000;
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return i + j;
  }
  
  public String toString()
  {
    Object localObject = getComponent();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = super.toString();
    localStringBuilder.append(str);
    if (localObject != null)
    {
      str = " class=";
      localStringBuilder.append(str);
      localObject = ((ComponentName)localObject).getClassName();
    }
    for (;;)
    {
      localStringBuilder.append((String)localObject);
      break;
      localObject = getAction();
      if (localObject == null) {
        break;
      }
      str = " action=";
      localStringBuilder.append(str);
    }
    localObject = localStringBuilder.toString();
    Intrinsics.OooO0o0(localObject, "sb.toString()");
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.ActivityNavigator.Destination
 * JD-Core Version:    0.7.0.1
 */