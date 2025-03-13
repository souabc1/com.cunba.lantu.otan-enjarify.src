package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import java.util.ArrayList;

public class ShareCompat$IntentReader
{
  public final Context OooO00o;
  public final Intent OooO0O0;
  public final String OooO0OO;
  public final ComponentName OooO0Oo;
  public ArrayList OooO0o0;
  
  public ComponentName getCallingActivity()
  {
    return this.OooO0Oo;
  }
  
  public Drawable getCallingActivityIcon()
  {
    Object localObject = this.OooO0Oo;
    if (localObject == null) {
      return null;
    }
    localObject = this.OooO00o.getPackageManager();
    try
    {
      ComponentName localComponentName = this.OooO0Oo;
      return ((PackageManager)localObject).getActivityIcon(localComponentName);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
  
  public Drawable getCallingApplicationIcon()
  {
    Object localObject = this.OooO0OO;
    if (localObject == null) {
      return null;
    }
    localObject = this.OooO00o.getPackageManager();
    try
    {
      String str = this.OooO0OO;
      return ((PackageManager)localObject).getApplicationIcon(str);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
  
  public CharSequence getCallingApplicationLabel()
  {
    Object localObject1 = this.OooO0OO;
    if (localObject1 == null) {
      return null;
    }
    localObject1 = this.OooO00o.getPackageManager();
    try
    {
      Object localObject2 = this.OooO0OO;
      localObject2 = ((PackageManager)localObject1).getApplicationInfo((String)localObject2, 0);
      return ((PackageManager)localObject1).getApplicationLabel((ApplicationInfo)localObject2);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
  
  public String getCallingPackage()
  {
    return this.OooO0OO;
  }
  
  public String[] getEmailBcc()
  {
    return this.OooO0O0.getStringArrayExtra("android.intent.extra.BCC");
  }
  
  public String[] getEmailCc()
  {
    return this.OooO0O0.getStringArrayExtra("android.intent.extra.CC");
  }
  
  public String[] getEmailTo()
  {
    return this.OooO0O0.getStringArrayExtra("android.intent.extra.EMAIL");
  }
  
  public String getHtmlText()
  {
    Object localObject1 = this.OooO0O0;
    Object localObject2 = "android.intent.extra.HTML_TEXT";
    localObject1 = ((Intent)localObject1).getStringExtra((String)localObject2);
    if (localObject1 == null)
    {
      localObject2 = getText();
      boolean bool = localObject2 instanceof Spanned;
      if (bool)
      {
        localObject2 = (Spanned)localObject2;
        localObject1 = Html.toHtml((Spanned)localObject2);
      }
      else if (localObject2 != null)
      {
        localObject1 = ShareCompat.Api16Impl.OooO00o((CharSequence)localObject2);
      }
    }
    return localObject1;
  }
  
  public Uri getStream()
  {
    return (Uri)this.OooO0O0.getParcelableExtra("android.intent.extra.STREAM");
  }
  
  public Uri getStream(int paramInt)
  {
    Object localObject1 = this.OooO0o0;
    Object localObject2 = "android.intent.extra.STREAM";
    if (localObject1 == null)
    {
      boolean bool = isMultipleShare();
      if (bool)
      {
        localObject1 = this.OooO0O0.getParcelableArrayListExtra((String)localObject2);
        this.OooO0o0 = ((ArrayList)localObject1);
      }
    }
    localObject1 = this.OooO0o0;
    if (localObject1 != null) {}
    for (Object localObject3 = ((ArrayList)localObject1).get(paramInt);; localObject3 = this.OooO0O0.getParcelableExtra((String)localObject2))
    {
      return (Uri)localObject3;
      if (paramInt != 0) {
        break;
      }
    }
    localObject1 = new java/lang/IndexOutOfBoundsException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Stream items available: ");
    int i = getStreamCount();
    ((StringBuilder)localObject2).append(i);
    ((StringBuilder)localObject2).append(" index requested: ");
    ((StringBuilder)localObject2).append(paramInt);
    localObject3 = ((StringBuilder)localObject2).toString();
    ((IndexOutOfBoundsException)localObject1).<init>((String)localObject3);
    throw ((Throwable)localObject1);
  }
  
  public int getStreamCount()
  {
    ArrayList localArrayList = this.OooO0o0;
    String str = "android.intent.extra.STREAM";
    if (localArrayList == null)
    {
      boolean bool = isMultipleShare();
      if (bool)
      {
        localArrayList = this.OooO0O0.getParcelableArrayListExtra(str);
        this.OooO0o0 = localArrayList;
      }
    }
    localArrayList = this.OooO0o0;
    if (localArrayList != null) {
      return localArrayList.size();
    }
    return this.OooO0O0.hasExtra(str);
  }
  
  public String getSubject()
  {
    return this.OooO0O0.getStringExtra("android.intent.extra.SUBJECT");
  }
  
  public CharSequence getText()
  {
    return this.OooO0O0.getCharSequenceExtra("android.intent.extra.TEXT");
  }
  
  public String getType()
  {
    return this.OooO0O0.getType();
  }
  
  public boolean isMultipleShare()
  {
    String str = this.OooO0O0.getAction();
    return "android.intent.action.SEND_MULTIPLE".equals(str);
  }
  
  public boolean isShareIntent()
  {
    String str1 = this.OooO0O0.getAction();
    String str2 = "android.intent.action.SEND";
    boolean bool1 = str2.equals(str1);
    if (!bool1)
    {
      str2 = "android.intent.action.SEND_MULTIPLE";
      bool2 = str2.equals(str1);
      if (!bool2)
      {
        bool2 = false;
        str1 = null;
        break label50;
      }
    }
    boolean bool2 = true;
    label50:
    return bool2;
  }
  
  public boolean isSingleShare()
  {
    String str = this.OooO0O0.getAction();
    return "android.intent.action.SEND".equals(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ShareCompat.IntentReader
 * JD-Core Version:    0.7.0.1
 */