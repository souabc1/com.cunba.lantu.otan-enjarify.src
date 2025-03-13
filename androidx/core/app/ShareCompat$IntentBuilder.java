package androidx.core.app;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;

public class ShareCompat$IntentBuilder
{
  public final Context OooO00o;
  public final Intent OooO0O0;
  public ArrayList OooO0OO;
  public ArrayList OooO0Oo;
  public ArrayList OooO0o;
  public ArrayList OooO0o0;
  
  public final void OooO00o(String paramString, ArrayList paramArrayList)
  {
    String[] arrayOfString1 = this.OooO0O0.getStringArrayExtra(paramString);
    int i;
    if (arrayOfString1 != null) {
      i = arrayOfString1.length;
    } else {
      i = 0;
    }
    int j = paramArrayList.size() + i;
    String[] arrayOfString2 = new String[j];
    paramArrayList.toArray(arrayOfString2);
    if (arrayOfString1 != null)
    {
      int k = paramArrayList.size();
      System.arraycopy(arrayOfString1, 0, arrayOfString2, k, i);
    }
    this.OooO0O0.putExtra(paramString, arrayOfString2);
  }
  
  public Context getContext()
  {
    return this.OooO00o;
  }
  
  public Intent getIntent()
  {
    Object localObject1 = this.OooO0OO;
    Object localObject2 = null;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject3 = "android.intent.extra.EMAIL";
      OooO00o((String)localObject3, (ArrayList)localObject1);
      this.OooO0OO = null;
    }
    localObject1 = this.OooO0Oo;
    if (localObject1 != null)
    {
      localObject3 = "android.intent.extra.CC";
      OooO00o((String)localObject3, (ArrayList)localObject1);
      this.OooO0Oo = null;
    }
    localObject1 = this.OooO0o0;
    if (localObject1 != null)
    {
      localObject3 = "android.intent.extra.BCC";
      OooO00o((String)localObject3, (ArrayList)localObject1);
      this.OooO0o0 = null;
    }
    localObject1 = this.OooO0o;
    localObject2 = null;
    int j;
    if (localObject1 != null)
    {
      int i = ((ArrayList)localObject1).size();
      j = 1;
      if (i > j) {}
    }
    else
    {
      j = 0;
      localObject3 = null;
    }
    localObject1 = "android.intent.extra.STREAM";
    if (j == 0)
    {
      localObject3 = this.OooO0O0;
      Object localObject4 = "android.intent.action.SEND";
      ((Intent)localObject3).setAction((String)localObject4);
      localObject3 = this.OooO0o;
      if (localObject3 != null)
      {
        boolean bool = ((ArrayList)localObject3).isEmpty();
        if (!bool)
        {
          localObject3 = this.OooO0O0;
          localObject4 = this.OooO0o;
          localObject2 = (Parcelable)((ArrayList)localObject4).get(0);
          ((Intent)localObject3).putExtra((String)localObject1, (Parcelable)localObject2);
          break label230;
        }
      }
      localObject2 = this.OooO0O0;
      ((Intent)localObject2).removeExtra((String)localObject1);
      localObject1 = this.OooO0O0;
      ShareCompat.Api16Impl.OooO0OO((Intent)localObject1);
      break label245;
    }
    else
    {
      this.OooO0O0.setAction("android.intent.action.SEND_MULTIPLE");
      localObject2 = this.OooO0O0;
      localObject3 = this.OooO0o;
      ((Intent)localObject2).putParcelableArrayListExtra((String)localObject1, (ArrayList)localObject3);
    }
    label230:
    localObject1 = this.OooO0O0;
    localObject2 = this.OooO0o;
    ShareCompat.Api16Impl.OooO0O0((Intent)localObject1, (ArrayList)localObject2);
    label245:
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ShareCompat.IntentBuilder
 * JD-Core Version:    0.7.0.1
 */