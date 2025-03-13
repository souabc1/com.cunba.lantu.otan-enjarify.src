package androidx.core.content;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.core.util.Consumer;
import androidx.core.util.Predicate;

class IntentSanitizer$Api16Impl
{
  public static void OooO00o(int paramInt, ClipData.Item paramItem, Consumer paramConsumer)
  {
    Object localObject = paramItem.getHtmlText();
    if (localObject == null)
    {
      localObject = paramItem.getIntent();
      if (localObject == null) {}
    }
    else
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str1 = "ClipData item at position ";
      ((StringBuilder)localObject).append(str1);
      ((StringBuilder)localObject).append(paramInt);
      ((StringBuilder)localObject).append(" contains htmlText, textLinks or intent: ");
      ((StringBuilder)localObject).append(paramItem);
      String str2 = ((StringBuilder)localObject).toString();
      paramConsumer.accept(str2);
    }
  }
  
  public static void OooO0O0(Intent paramIntent1, Intent paramIntent2, Predicate paramPredicate1, boolean paramBoolean, Predicate paramPredicate2, Consumer paramConsumer)
  {
    paramIntent1 = paramIntent1.getClipData();
    if (paramIntent1 == null) {
      return;
    }
    if (paramPredicate1 != null)
    {
      bool1 = paramPredicate1.test(paramIntent1);
      if (bool1)
      {
        paramIntent2.setClipData(paramIntent1);
        return;
      }
    }
    boolean bool1 = false;
    paramPredicate1 = null;
    int i = 0;
    ClipData localClipData = null;
    for (;;)
    {
      int j = paramIntent1.getItemCount();
      if (i >= j) {
        break;
      }
      Object localObject1 = paramIntent1.getItemAt(i);
      int k = Build.VERSION.SDK_INT;
      int m = 31;
      if (k >= m) {
        IntentSanitizer.Api16Impl.Api31Impl.OooO00o(i, (ClipData.Item)localObject1, paramConsumer);
      } else {
        OooO00o(i, (ClipData.Item)localObject1, paramConsumer);
      }
      Object localObject2 = ((ClipData.Item)localObject1).getText();
      if (!paramBoolean)
      {
        if (localObject2 != null)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("Item text cannot contain value. Item position: ");
          ((StringBuilder)localObject2).append(i);
          ((StringBuilder)localObject2).append(". Text: ");
          localObject3 = ((ClipData.Item)localObject1).getText();
          ((StringBuilder)localObject2).append(localObject3);
          localObject2 = ((StringBuilder)localObject2).toString();
          paramConsumer.accept(localObject2);
        }
        k = 0;
        localObject2 = null;
      }
      Object localObject3 = ". URI: ";
      Object localObject4 = "Item URI is not allowed. Item position: ";
      Object localObject5 = ((ClipData.Item)localObject1).getUri();
      if (paramPredicate2 == null)
      {
        if (localObject5 != null)
        {
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
        }
      }
      else {
        for (;;)
        {
          ((StringBuilder)localObject5).append((String)localObject4);
          ((StringBuilder)localObject5).append(i);
          ((StringBuilder)localObject5).append((String)localObject3);
          localObject1 = ((ClipData.Item)localObject1).getUri();
          ((StringBuilder)localObject5).append(localObject1);
          localObject1 = ((StringBuilder)localObject5).toString();
          paramConsumer.accept(localObject1);
          break;
          if (localObject5 == null) {
            break label341;
          }
          localObject5 = ((ClipData.Item)localObject1).getUri();
          boolean bool2 = paramPredicate2.test(localObject5);
          if (bool2) {
            break label341;
          }
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
        }
      }
      j = 0;
      localObject1 = null;
      break label348;
      label341:
      localObject1 = ((ClipData.Item)localObject1).getUri();
      label348:
      if ((localObject2 != null) || (localObject1 != null)) {
        if (localClipData == null)
        {
          localClipData = new android/content/ClipData;
          localObject3 = paramIntent1.getDescription();
          localObject4 = new android/content/ClipData$Item;
          ((ClipData.Item)localObject4).<init>((CharSequence)localObject2, null, (Uri)localObject1);
          localClipData.<init>((ClipDescription)localObject3, (ClipData.Item)localObject4);
        }
        else
        {
          localObject3 = new android/content/ClipData$Item;
          ((ClipData.Item)localObject3).<init>((CharSequence)localObject2, null, (Uri)localObject1);
          localClipData.addItem((ClipData.Item)localObject3);
        }
      }
      i += 1;
    }
    if (localClipData != null) {
      paramIntent2.setClipData(localClipData);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.IntentSanitizer.Api16Impl
 * JD-Core Version:    0.7.0.1
 */