package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Intent;
import android.net.Uri;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityResultContracts$GetMultipleContents$Companion
{
  public final List OooO00o(Intent paramIntent)
  {
    Intrinsics.OooO0o(paramIntent, "<this>");
    LinkedHashSet localLinkedHashSet = new java/util/LinkedHashSet;
    localLinkedHashSet.<init>();
    Uri localUri1 = paramIntent.getData();
    if (localUri1 != null) {
      localLinkedHashSet.add(localUri1);
    }
    paramIntent = paramIntent.getClipData();
    if (paramIntent == null)
    {
      boolean bool = localLinkedHashSet.isEmpty();
      if (bool) {
        return CollectionsKt.OooO0oo();
      }
    }
    if (paramIntent != null)
    {
      int i = paramIntent.getItemCount();
      int j = 0;
      while (j < i)
      {
        Uri localUri2 = paramIntent.getItemAt(j).getUri();
        if (localUri2 != null) {
          localLinkedHashSet.add(localUri2);
        }
        j += 1;
      }
    }
    paramIntent = new java/util/ArrayList;
    paramIntent.<init>(localLinkedHashSet);
    return paramIntent;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion
 * JD-Core Version:    0.7.0.1
 */