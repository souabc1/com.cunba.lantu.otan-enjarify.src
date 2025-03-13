package androidx.core.view;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.core.util.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class ContentInfoCompat
{
  public final ContentInfoCompat.Compat OooO00o;
  
  public ContentInfoCompat(ContentInfoCompat.Compat paramCompat)
  {
    this.OooO00o = paramCompat;
  }
  
  public static ClipData OooO00o(ClipDescription paramClipDescription, List paramList)
  {
    ClipData localClipData = new android/content/ClipData;
    Object localObject = new android/content/ClipDescription;
    ((ClipDescription)localObject).<init>(paramClipDescription);
    paramClipDescription = (ClipData.Item)paramList.get(0);
    localClipData.<init>((ClipDescription)localObject, paramClipDescription);
    int i = 1;
    for (;;)
    {
      int j = paramList.size();
      if (i >= j) {
        break;
      }
      localObject = (ClipData.Item)paramList.get(i);
      localClipData.addItem((ClipData.Item)localObject);
      i += 1;
    }
    return localClipData;
  }
  
  public static String OooO0O0(int paramInt)
  {
    int i = paramInt & 0x1;
    if (i != 0) {
      return "FLAG_CONVERT_TO_PLAIN_TEXT";
    }
    return String.valueOf(paramInt);
  }
  
  public static Pair OooO0OO(ClipData paramClipData, Predicate paramPredicate)
  {
    int i = 0;
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = null;
    for (;;)
    {
      int j = paramClipData.getItemCount();
      if (i >= j) {
        break;
      }
      ClipData.Item localItem = paramClipData.getItemAt(i);
      boolean bool = paramPredicate.test(localItem);
      if (bool)
      {
        if (localArrayList1 == null)
        {
          localArrayList1 = new java/util/ArrayList;
          localArrayList1.<init>();
        }
        localArrayList1.add(localItem);
      }
      else
      {
        if (localArrayList2 == null)
        {
          localArrayList2 = new java/util/ArrayList;
          localArrayList2.<init>();
        }
        localArrayList2.add(localItem);
      }
      i += 1;
    }
    if (localArrayList1 == null) {
      return Pair.create(null, paramClipData);
    }
    if (localArrayList2 == null) {
      return Pair.create(paramClipData, null);
    }
    paramPredicate = OooO00o(paramClipData.getDescription(), localArrayList1);
    paramClipData = OooO00o(paramClipData.getDescription(), localArrayList2);
    return Pair.create(paramPredicate, paramClipData);
  }
  
  public static String OooO0Oo(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        i = 2;
        if (paramInt != i)
        {
          i = 3;
          if (paramInt != i)
          {
            i = 4;
            if (paramInt != i)
            {
              i = 5;
              if (paramInt != i) {
                return String.valueOf(paramInt);
              }
              return "SOURCE_PROCESS_TEXT";
            }
            return "SOURCE_AUTOFILL";
          }
          return "SOURCE_DRAG_AND_DROP";
        }
        return "SOURCE_INPUT_METHOD";
      }
      return "SOURCE_CLIPBOARD";
    }
    return "SOURCE_APP";
  }
  
  public static ContentInfoCompat OooO0o(ContentInfo paramContentInfo)
  {
    ContentInfoCompat localContentInfoCompat = new androidx/core/view/ContentInfoCompat;
    ContentInfoCompat.Compat31Impl localCompat31Impl = new androidx/core/view/ContentInfoCompat$Compat31Impl;
    localCompat31Impl.<init>(paramContentInfo);
    localContentInfoCompat.<init>(localCompat31Impl);
    return localContentInfoCompat;
  }
  
  public ContentInfo OooO0o0()
  {
    ContentInfo localContentInfo = this.OooO00o.getWrapped();
    Objects.requireNonNull(localContentInfo);
    return OooO00o.OooO00o(localContentInfo);
  }
  
  public ClipData getClip()
  {
    return this.OooO00o.getClip();
  }
  
  public Bundle getExtras()
  {
    return this.OooO00o.getExtras();
  }
  
  public int getFlags()
  {
    return this.OooO00o.getFlags();
  }
  
  public Uri getLinkUri()
  {
    return this.OooO00o.getLinkUri();
  }
  
  public int getSource()
  {
    return this.OooO00o.getSource();
  }
  
  public String toString()
  {
    return this.OooO00o.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ContentInfoCompat
 * JD-Core Version:    0.7.0.1
 */