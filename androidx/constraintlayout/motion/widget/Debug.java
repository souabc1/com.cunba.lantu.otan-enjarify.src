package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.nio.CharBuffer;

public class Debug
{
  public static String OooO00o(Context paramContext, int paramInt)
  {
    int i = -1;
    if (paramInt != i) {}
    try
    {
      paramContext = paramContext.getResources();
      return paramContext.getResourceEntryName(paramInt);
    }
    catch (Exception localException)
    {
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>();
      paramContext.append("?");
      paramContext.append(paramInt);
    }
    return "UNKNOWN";
    return paramContext.toString();
  }
  
  public static String OooO0O0(View paramView)
  {
    try
    {
      Object localObject = paramView.getContext();
      localObject = ((Context)localObject).getResources();
      int i = paramView.getId();
      return ((Resources)localObject).getResourceEntryName(i);
    }
    catch (Exception localException) {}
    return "UNKNOWN";
  }
  
  public static String OooO0OO(MotionLayout paramMotionLayout, int paramInt)
  {
    return OooO0Oo(paramMotionLayout, paramInt, -1);
  }
  
  public static String OooO0Oo(MotionLayout paramMotionLayout, int paramInt1, int paramInt2)
  {
    int i = -1;
    if (paramInt1 == i) {
      return "UNDEFINED";
    }
    paramMotionLayout = paramMotionLayout.getContext().getResources().getResourceEntryName(paramInt1);
    if (paramInt2 != i)
    {
      paramInt1 = paramMotionLayout.length();
      Object localObject;
      String str1;
      if (paramInt1 > paramInt2)
      {
        localObject = "([^_])[aeiou]+";
        str1 = "$1";
        paramMotionLayout = paramMotionLayout.replaceAll((String)localObject, str1);
      }
      paramInt1 = paramMotionLayout.length();
      if (paramInt1 > paramInt2)
      {
        str1 = "";
        localObject = paramMotionLayout.replaceAll("[^_]", str1);
        paramInt1 = ((String)localObject).length();
        if (paramInt1 > 0)
        {
          i = (paramMotionLayout.length() - paramInt2) / paramInt1;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          String str2 = CharBuffer.allocate(i).toString();
          i = 0;
          str1 = null;
          char c = '.';
          str2 = str2.replace('\000', c);
          ((StringBuilder)localObject).append(str2);
          str2 = "_";
          ((StringBuilder)localObject).append(str2);
          localObject = ((StringBuilder)localObject).toString();
          paramMotionLayout = paramMotionLayout.replaceAll((String)localObject, str2);
        }
      }
    }
    return paramMotionLayout;
  }
  
  public static void OooO0o0(String paramString1, String paramString2, int paramInt)
  {
    paramString1 = new java/lang/Throwable;
    paramString1.<init>();
    paramString1 = paramString1.getStackTrace();
    int i = paramString1.length;
    int j = 1;
    i -= j;
    paramInt = Math.min(paramInt, i);
    String str1 = " ";
    String str2 = str1;
    while (j <= paramInt)
    {
      Object localObject1 = paramString1[j];
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(".(");
      Object localObject2 = paramString1[j].getFileName();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(":");
      int k = paramString1[j].getLineNumber();
      ((StringBuilder)localObject1).append(k);
      ((StringBuilder)localObject1).append(") ");
      localObject2 = paramString1[j].getMethodName();
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(str2);
      ((StringBuilder)localObject2).append(str1);
      str2 = ((StringBuilder)localObject2).toString();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(paramString2);
      ((StringBuilder)localObject2).append(str2);
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(str2);
      j += 1;
    }
  }
  
  public static String getCallFrom(int paramInt)
  {
    Object localObject1 = new java/lang/Throwable;
    ((Throwable)localObject1).<init>();
    localObject1 = ((Throwable)localObject1).getStackTrace();
    paramInt += 2;
    Object localObject2 = localObject1[paramInt];
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(".(");
    String str = localObject2.getFileName();
    ((StringBuilder)localObject1).append(str);
    ((StringBuilder)localObject1).append(":");
    paramInt = localObject2.getLineNumber();
    ((StringBuilder)localObject1).append(paramInt);
    ((StringBuilder)localObject1).append(")");
    return ((StringBuilder)localObject1).toString();
  }
  
  public static String getLoc()
  {
    Object localObject = new java/lang/Throwable;
    ((Throwable)localObject).<init>();
    localObject = localObject.getStackTrace()[1];
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(".(");
    String str = ((StackTraceElement)localObject).getFileName();
    localStringBuilder.append(str);
    localStringBuilder.append(":");
    int i = ((StackTraceElement)localObject).getLineNumber();
    localStringBuilder.append(i);
    localStringBuilder.append(") ");
    localObject = ((StackTraceElement)localObject).getMethodName();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("()");
    return localStringBuilder.toString();
  }
  
  public static String getLocation()
  {
    Object localObject = new java/lang/Throwable;
    ((Throwable)localObject).<init>();
    localObject = localObject.getStackTrace()[1];
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(".(");
    String str = ((StackTraceElement)localObject).getFileName();
    localStringBuilder.append(str);
    localStringBuilder.append(":");
    int i = ((StackTraceElement)localObject).getLineNumber();
    localStringBuilder.append(i);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static String getLocation2()
  {
    Object localObject = new java/lang/Throwable;
    ((Throwable)localObject).<init>();
    localObject = localObject.getStackTrace()[2];
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(".(");
    String str = ((StackTraceElement)localObject).getFileName();
    localStringBuilder.append(str);
    localStringBuilder.append(":");
    int i = ((StackTraceElement)localObject).getLineNumber();
    localStringBuilder.append(i);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.Debug
 * JD-Core Version:    0.7.0.1
 */