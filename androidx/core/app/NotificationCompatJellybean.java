package androidx.core.app;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

class NotificationCompatJellybean
{
  public static final Object OooO00o;
  public static final Object OooO0O0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO00o = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooO0O0 = localObject;
  }
  
  public static Bundle OooO00o(NotificationCompat.Action paramAction)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject1 = paramAction.getIconCompat();
    int i;
    if (localObject1 != null)
    {
      i = ((IconCompat)localObject1).getResId();
    }
    else
    {
      i = 0;
      localObject1 = null;
    }
    localBundle.putInt("icon", i);
    Object localObject2 = paramAction.getTitle();
    localBundle.putCharSequence("title", (CharSequence)localObject2);
    localObject2 = paramAction.getActionIntent();
    localBundle.putParcelable("actionIntent", (Parcelable)localObject2);
    localObject1 = paramAction.getExtras();
    if (localObject1 != null)
    {
      localObject1 = new android/os/Bundle;
      localObject2 = paramAction.getExtras();
      ((Bundle)localObject1).<init>((Bundle)localObject2);
    }
    else
    {
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
    }
    boolean bool1 = paramAction.getAllowGeneratedReplies();
    ((BaseBundle)localObject1).putBoolean("android.support.allowGeneratedReplies", bool1);
    localBundle.putBundle("extras", (Bundle)localObject1);
    localObject1 = OooO0OO(paramAction.getRemoteInputs());
    localBundle.putParcelableArray("remoteInputs", (Parcelable[])localObject1);
    boolean bool2 = paramAction.getShowsUserInterface();
    localBundle.putBoolean("showsUserInterface", bool2);
    int j = paramAction.getSemanticAction();
    localBundle.putInt("semanticAction", j);
    return localBundle;
  }
  
  public static Bundle OooO0O0(RemoteInput paramRemoteInput)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject1 = paramRemoteInput.getResultKey();
    localBundle.putString("resultKey", (String)localObject1);
    Object localObject2 = paramRemoteInput.getLabel();
    localBundle.putCharSequence("label", (CharSequence)localObject2);
    localObject2 = paramRemoteInput.getChoices();
    localBundle.putCharSequenceArray("choices", (CharSequence[])localObject2);
    boolean bool1 = paramRemoteInput.getAllowFreeFormInput();
    localBundle.putBoolean("allowFreeFormInput", bool1);
    localObject1 = "extras";
    localObject2 = paramRemoteInput.getExtras();
    localBundle.putBundle((String)localObject1, (Bundle)localObject2);
    paramRemoteInput = paramRemoteInput.getAllowedDataTypes();
    if (paramRemoteInput != null)
    {
      boolean bool3 = paramRemoteInput.isEmpty();
      if (!bool3)
      {
        localObject1 = new java/util/ArrayList;
        int i = paramRemoteInput.size();
        ((ArrayList)localObject1).<init>(i);
        paramRemoteInput = paramRemoteInput.iterator();
        for (;;)
        {
          boolean bool2 = paramRemoteInput.hasNext();
          if (!bool2) {
            break;
          }
          localObject2 = (String)paramRemoteInput.next();
          ((ArrayList)localObject1).add(localObject2);
        }
        paramRemoteInput = "allowedDataTypes";
        localBundle.putStringArrayList(paramRemoteInput, (ArrayList)localObject1);
      }
    }
    return localBundle;
  }
  
  public static Bundle[] OooO0OO(RemoteInput[] paramArrayOfRemoteInput)
  {
    if (paramArrayOfRemoteInput == null) {
      return null;
    }
    int i = paramArrayOfRemoteInput.length;
    Bundle[] arrayOfBundle = new Bundle[i];
    int j = 0;
    for (;;)
    {
      int k = paramArrayOfRemoteInput.length;
      if (j >= k) {
        break;
      }
      Bundle localBundle = OooO0O0(paramArrayOfRemoteInput[j]);
      arrayOfBundle[j] = localBundle;
      j += 1;
    }
    return arrayOfBundle;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompatJellybean
 * JD-Core Version:    0.7.0.1
 */